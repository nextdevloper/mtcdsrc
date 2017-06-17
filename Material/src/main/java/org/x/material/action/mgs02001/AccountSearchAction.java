package org.x.material.action.mgs02001;

//import org.seasar.sastruts.example.annotation.Auth;
import static org.x.material.condition.MaterialConstants.*;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.seasar.doma.jdbc.NoResultException;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.exception.ActionMessagesException;
import org.x.material.action.ActionFrame;
import org.x.material.common.annotation.Auth;
import org.x.material.condition.MaterialConstants.MCodeKind;
import org.x.material.entity.MAccountAccountBlock;
import org.x.material.entity.MCode;
import org.x.material.form.mgs02001.AccountSearchForm;
import org.x.material.service.CdMstService;
import org.x.material.service.MAccountService;
import org.x.material.service.mgs02001.AccountSearchService;

/**
 * アカウント/組織照会アクション.
 *
 * @author nakada
 * @since   20141016.1.0
 * @version 20141016.0.1
 */
public class AccountSearchAction extends ActionFrame {
	/** 画面 - GM01. */
	private static final String GM01 = "accountsearch.jsp";

	/** １ページあたりのレコード数. */
	private static final int PER_PAGE = 6;


	/** アクションフォームの設定情報. **/
    @Resource
    @ActionForm
	private AccountSearchForm accountSearchForm;

	/** アカウント照会サービス. **/
	@Resource
	private AccountSearchService accountSearchService;

	/** MAccountテーブル情報関連サービス. **/
	@Resource
	private MAccountService mAccountService;

	/** コードマスタテーブル情報関連サービス. **/
	@Resource
	private CdMstService cdMstService;

	/** ログ出力定義. */
	private static final Logger LOGGER = Logger.getLogger(AccountSearchAction.class);

	/** ページリンク文字列. */
	private String link;

	/**
	 *  表示 - GM01.
	 */
    /** アカウント一覧データ. */
    private List<MAccountAccountBlock> listItems;
    /** アカウント明細データ. */
    private List<MAccountAccountBlock> detailItems;

    /**
	 * 初期表示.
	 *
	 * @return accountsearch.jsp
	 */
	@Auth
	@Execute(validator = false)
	public final String init() {
    	//入力初期化
		accountSearchForm.initialize();

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		return GM01;
    }

	/**
	 * 照会表示.
	 * @return accountsearch.jsp
	 */
	@Auth
	@Execute(validator = false, input = GM01)
	public final String regSearch() {

		LOGGER.debug("regSearch...");
		try {

			/**
			 * ヘッダ、サイドメニュー設定
			 */
			getheadmenu();

			/** アカウント検索 */
			// 対象ページ番号(pageno)に表示する分のレコードだけ取得
			listItems = mAccountService.findByAccountWithInsideMatching(accountSearchForm.getSrcUserId(), "1", PER_PAGE);

			// レコードの総件数
			int totalRecNum = (int) mAccountService.getCount();
			LOGGER.debug("totalRecNum:" + Integer.toString(totalRecNum));

			/** ページリンク文字列作成 */
			link = makePagingLink(Integer.parseInt("1"), totalRecNum, PER_PAGE);
			LOGGER.debug("link:" + link);

			/** 一覧作成 */
			for (MAccountAccountBlock item: listItems) {
				if (mAccountService.chkAccountBlock(getUserDto().getAccid(), item.getAccId())) {
					item.setAccStat(ACCBLOCK);
				} else {
					item.setAccStat(ACCNOBLOCK);
				}
			}

			accountSearchForm.setPageno("1");

		} catch (NoResultException e) {
            //エラーメッセージをセットします。
    		throw new ActionMessagesException("errors.noitem");
        }

		return GM01;
	}

	/**
	 * ページング表示.
	 * @return accountsearch.jsp
	 */
	@Auth
	@Execute(validator = false, urlPattern = "turn/{pageno}")
	public final String turn() {

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		// 対象ページ番号(pageno)に表示する分のレコードだけ取得
		listItems = mAccountService.findByAccountWithInsideMatching(accountSearchForm.getSrcUserId(), accountSearchForm.getPageno(), PER_PAGE);

		// レコードの総件数
		int totalRecNum = (int) mAccountService.getCount();

		// ページリンク文字列作成
		link = makePagingLink(Integer.parseInt(accountSearchForm.getPageno()), totalRecNum, PER_PAGE);

		/** 一覧作成 */
		for (MAccountAccountBlock item: listItems) {
			if (mAccountService.chkAccountBlock(getUserDto().getAccid(), item.getAccId())) {
				item.setAccStat(ACCBLOCK);
			} else {
				item.setAccStat(ACCNOBLOCK);
			}
		}

		return GM01;

	}

	/**
	 * アカウント/組織ブロック設定.
	 * @return accountsearch.jsp
	 */
	@Auth
	@Execute(validator = false)
	public final String regBlock() {
		LOGGER.debug("regBlock...");

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		if (accountSearchForm.getMbox().length > 0) {
			for (String item: accountSearchForm.getMbox()) {
				String reqaccid = item;
				LOGGER.debug("reqaccid:" + reqaccid);

				accountSearchService.regAccountBlock(getUserDto().getAccid(), reqaccid);
			}

			/** アカウント検索 */
			// 対象ページ番号(pageno)に表示する分のレコードだけ取得
			listItems = mAccountService.findByAccountWithInsideMatching(accountSearchForm.getSrcUserId(), accountSearchForm.getPageno(), PER_PAGE);

			// レコードの総件数
			int totalRecNum = (int) mAccountService.getCount();

			/** ページリンク文字列作成 */
			link = makePagingLink(Integer.parseInt(accountSearchForm.getPageno()), totalRecNum, PER_PAGE);

			/** 一覧作成 */
			for (MAccountAccountBlock item: listItems) {
				if (mAccountService.chkAccountBlock(getUserDto().getAccid(), item.getAccId())) {
					item.setAccStat(ACCBLOCK);
				} else {
					item.setAccStat(ACCNOBLOCK);
				}
			}
		}

		return GM01;
	}

	/**
	 * アカウント/組織ブロック解除.
	 *
	 * @return accountsearch.jsp
	 */
	@Auth
	@Execute(validator = false)
	public final String regFree() {
		LOGGER.debug("regFree...");

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		if (accountSearchForm.getMbox().length > 0) {
			for (String item: accountSearchForm.getMbox()) {
				String reqaccid = item;
				LOGGER.debug("reqaccid:" + reqaccid);

				accountSearchService.regAccountBlockFree(getUserDto().getAccid(), reqaccid);
			}

			/** アカウント検索 */
			// 対象ページ番号(pageno)に表示する分のレコードだけ取得
			listItems = mAccountService.findByAccountWithInsideMatching(accountSearchForm.getSrcUserId(), accountSearchForm.getPageno(), PER_PAGE);

			// レコードの総件数
			int totalRecNum = (int) mAccountService.getCount();

			/** ページリンク文字列作成 */
			link = makePagingLink(Integer.parseInt(accountSearchForm.getPageno()), totalRecNum, PER_PAGE);

			/** 一覧作成 */
			for (MAccountAccountBlock item: listItems) {
				if (mAccountService.chkAccountBlock(getUserDto().getAccid(), item.getAccId())) {
					item.setAccStat(ACCBLOCK);
				} else {
					item.setAccStat(ACCNOBLOCK);
				}
			}
		}
		return GM01;
	}

	/**
	 * 照会詳細表示.
	 *
	 * @return accountsearch.jsp
	 */
	@Auth
	@Execute(validator = false)
	public final String detailSearch() {
		LOGGER.debug("detailSearch...");

		LOGGER.debug("srckey:" + accountSearchForm.getSrckey());

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		/** アカウント検索 */
		// 対象ページ番号(pageno)に表示する分のレコードだけ取得
		listItems = mAccountService.findByAccountWithInsideMatching(accountSearchForm.getSrcUserId(), accountSearchForm.getPageno(), PER_PAGE);

		// レコードの総件数
		int totalRecNum = (int) mAccountService.getCount();

		/** ページリンク文字列作成 */
		link = makePagingLink(Integer.parseInt(accountSearchForm.getPageno()), totalRecNum, PER_PAGE);

		/** 一覧作成 */
		for (MAccountAccountBlock item: listItems) {
			if (mAccountService.chkAccountBlock(getUserDto().getAccid(), item.getAccId())) {
				item.setAccStat(ACCBLOCK);
			} else {
				item.setAccStat(ACCNOBLOCK);
			}
		}

		// アカウント検索
		detailItems = mAccountService.findByAccount(accountSearchForm.getSrckey());

		// 一覧作成
		for (MAccountAccountBlock item: detailItems) {
	    	MCode userSyubetuList = cdMstService.find(MCodeKind.KIND_ACC.getName() , item.getAccKind());
			item.setAccKind(userSyubetuList.getCodeNm());
		}

		return GM01;
	}

    /**
	 * ページリンク文字列（HTML)を返す.
	 * @param currentPageNo カレントのページ番号
	 * @param totalRecNum 総レコード数
	 * @param perPage １ページあたりのレコード数
	 * @return ページリンク文字列
	 */
	private String makePagingLink(final int currentPageNo, final int totalRecNum, final int perPage) {

		/**
		 *  総ページ数を求める.
		 *  	--総ページ数が、1ページ以内はリンクは表示しない
		 *  		ページ数が、1ページ以下の場合、
		 *  			ページリンクは表示しない
		 *  		総ページ数が1ページで、あまりがない場合
		 *  			ページリンクは表示しない
		 *  	--総件数/1ページあたりの件数にあまりがある場合、商に1ページ加えたものを総ページ数とする）
		 *  		総ページ数が1ページ以上で、あまりがある場合、
		 *  			総ページ数に＋１する
		 */

		int pageNum = totalRecNum / perPage;
		int modNum = totalRecNum % perPage;

		if ((pageNum == 1) && (modNum == 0)) {
			pageNum = 0;
		} else if ((pageNum >= 1) && (modNum > 0)) {
			pageNum = pageNum + 1;
		}
		String[] links = new String[pageNum];

		for (int i = 1; i <= pageNum; i++) {
			if (i == currentPageNo) {
				links[i - 1] = String.format("<span class=\"pagelink-fontsize\"><b>%d</b></span>", currentPageNo);
			} else {
				links[i - 1] = String.format("<a class=\"pagelink-fontsize\" title=\"Page %d\" href=\"/Material/mgs02001/accountSearch/turn/%d\">%d</a>", i, i, i);
			}
		}

		return implobe(" ", links);
	}

    /**
     * 配列要素を文字列により連結する.
     *
     * @param glue 連結文字列
     * @param pieces 連結したい文字列の配列。
     * @return すべての配列要素の順序を変えずに、各要素間に glue  文字列をはさんで 1 つの文字列にして返します。
     */
	private static String implobe(final String glue, final String[] pieces) {
		StringBuffer buf = new StringBuffer();

		if (pieces.length > 0) {
	        for (int i = 0;; i++) {
	            buf.append(pieces[i]);
	            if (i >= pieces.length - 1) {
	                break;
	            }
	            buf.append(glue);
	        }
		} else {
			buf.append(glue);
		}
        return buf.toString();
	}

	/**
     * Returns the listItems.
     *
     * @return the listItems
     */
	public final List<MAccountAccountBlock> getListItems() {
		return listItems;
	}

    /**
     * Sets the listItems.
     *
     * @param prmListItems アカウント一覧データ
     */
	public final void setListItems(final List<MAccountAccountBlock> prmListItems) {
		this.listItems = prmListItems;
	}

	/**
     * Returns the detailItems.
     *
     * @return the detailItems
     */
	public final List<MAccountAccountBlock> getDetailItems() {
		return detailItems;
	}

    /**
     * Sets the detailItems.
     *
     * @param prmDetailItems アカウント一覧データ
     */
	public final void setDetailItems(final List<MAccountAccountBlock> prmDetailItems) {
		this.detailItems = prmDetailItems;
	}

	/**
     * Returns the link.
     *
     * @return the link
     */
	public final String getLink() {
		return link;
	}

    /**
     * Sets the link.
     *
     * @param prmLink ページリンク文字列
     */
	public final void setLink(final String prmLink) {
		this.link = prmLink;
	}

}