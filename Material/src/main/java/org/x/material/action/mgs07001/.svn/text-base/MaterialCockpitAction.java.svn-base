package org.x.material.action.mgs07001;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import org.x.material.action.ActionFrame;
import org.x.material.common.annotation.Auth;
import org.x.material.common.util.ListUtil;
import org.x.material.condition.MaterialConstants.MCodeKind;
import org.x.material.entity.MLocationBoxMaterial;
import org.x.material.form.mgs07001.MaterialCockpitForm;
import org.x.material.service.CdMstService;
import org.x.material.service.mgs07001.MaterialCockpitService;

/**
 * マテリアルコックピットアクションクラス.
 *
 * @author  nakada
 * @since   20151010.00.01
 * @version 20151010.00.01
 */
public class MaterialCockpitAction extends ActionFrame {

	/** １ページあたりのレコード数. */
	private static final int PER_PAGE = 6;

	/** 画面 - GM01. */
	private static final String GM01 = "materialCockpit.jsp";
	/** 画面 (総会結果（ロケーション））- GM02. */
	private static final String GM02 = "materialCockpit2.jsp";

	/** ページリンク文字列. */
	private String link;

	/** 一覧取得url. */
	private static final String LISTURL = "/Material/mgs07001/materialCockpit/locturn/";

	/** ログ出力定義. */
	private static final Logger LOGGER = Logger.getLogger(MaterialCockpitAction.class);

	/** アクションフォームの設定情報. **/
    @Resource
    @ActionForm
	private MaterialCockpitForm materialCockpitForm;

	/** マテリアルコックピットサービスサービス. **/
	@Resource
	private MaterialCockpitService materialCockpitService;

	/** コードマスタテーブル情報関連サービス. **/
	@Resource
	private CdMstService cdMstService;

    /** 一覧データ. */
    private List<MLocationBoxMaterial> listItemsMt;

	@Resource
	protected HttpServletRequest request;

	@Resource
	protected ServletContext application;



    /**
	 * 初期表示.
	 *
	 * @return materialCockpit.jsp
	 */
	@Auth
	@Execute(validator = false)
	public final String init() {

		LOGGER.debug("MaterialCockpitAction/init...");

		//入力初期化
		materialCockpitForm.initialize();

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		LOGGER.debug("MaterialCockpitAction/init...End");

		return GM01;
    }

    /**
	 * 照会表示.
	 *
	 * @return materialCockpit2.jsp
	 */
	@Auth
	@Execute(validator = false)
	public final String regSearch() {

		LOGGER.debug("MaterialCockpitAction/regSearch...");

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		/** 照会検索 */
		LOGGER.debug("SrcKey1:" + materialCockpitForm.getSrcKey1());
		LOGGER.debug("SrcKey2:" + materialCockpitForm.getSrcKey2());
		LOGGER.debug("SrcKey3:" + materialCockpitForm.getSrcKey3());
		// 対象ページ番号(pageno)に表示する分のレコードだけ取得
		listItemsMt = materialCockpitService.findByLocBoxMatWithInsideMatching(
				super.getUserDto().getAccid(),
				materialCockpitForm.getSrcKey1(),
				materialCockpitForm.getSrcKey2(),
				materialCockpitForm.getSrcKey3(),
				"1", PER_PAGE);

		// レコードの総件数
		int totalRecNum = (int) materialCockpitService.getCount();
		LOGGER.debug("totalRecNum:" + Integer.toString(totalRecNum));

		// ページリンク文字列作成
		link = ListUtil.makePagingLink(LISTURL, Integer.parseInt("1"), totalRecNum, PER_PAGE);
		LOGGER.debug("link:" + link);

		/** 一覧作成 */
		for (MLocationBoxMaterial item: listItemsMt) {
			LOGGER.debug("LocationId:" + item.getMrlLocId());
			LOGGER.debug("BoxId:" + item.getMrlBoxId());
			LOGGER.debug("BoxKind:" + item.getBoxBoxKind());
			// ロケーション種別 名称変換
			item.setLocLocKind(cdMstService.find(MCodeKind.LOCKIND.getName(), item.getLocLocKind()).getText1());	// ロケーション種別
			if (item.getMrlBoxId() != null && item.getMrlBoxId().length() > 0) {
				// ボックス種別 名称変換
				item.setLocLocKind(cdMstService.find(MCodeKind.BOXKIND.getName(), item.getBoxBoxKind()).getText1());	// ボックス種別
			}
		}

		materialCockpitForm.setSrcKey1(materialCockpitForm.getSrcKey1());
		materialCockpitForm.setSrcKey2(materialCockpitForm.getSrcKey2());
		materialCockpitForm.setSrcKey3(materialCockpitForm.getSrcKey3());

		LOGGER.debug("MaterialCockpitAction/regSearch...End");

		return GM02;
	}

	/**
	 * ページング表示.
	 * @return materialCockpit2.jsp
	 */
	@Auth
	@Execute(validator = false, urlPattern = "locturn/{locpageno}")
	public final String locturn() {

		LOGGER.debug("MaterialCockpitAction/locturn...");

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		/** 照会検索 */
		LOGGER.debug("SrcKey1:" + materialCockpitForm.getSrcKey1());
		LOGGER.debug("SrcKey2:" + materialCockpitForm.getSrcKey2());
		LOGGER.debug("SrcKey3:" + materialCockpitForm.getSrcKey3());
		// 対象ページ番号(pageno)に表示する分のレコードだけ取得
		listItemsMt = materialCockpitService.findByLocBoxMatWithInsideMatching(
				super.getUserDto().getAccid(),
				materialCockpitForm.getSrcKey1(),
				materialCockpitForm.getSrcKey2(),
				materialCockpitForm.getSrcKey3(),
				materialCockpitForm.getLocpageno(), PER_PAGE);

		// レコードの総件数
		int totalRecNum = (int) materialCockpitService.getCount();
		LOGGER.debug("totalRecNum:" + Integer.toString(totalRecNum));

		// ページリンク文字列作成
		link = ListUtil.makePagingLink(LISTURL, Integer.parseInt(materialCockpitForm.getLocpageno()), totalRecNum, PER_PAGE);
		LOGGER.debug("link:" + link);

		/** 一覧作成 */
		for (MLocationBoxMaterial item: listItemsMt) {
			LOGGER.debug("LocationId:" + item.getMrlLocId());
			LOGGER.debug("BoxId:" + item.getMrlBoxId());
			LOGGER.debug("BoxKind:" + item.getBoxBoxKind());
			// ロケーション種別 名称変換
			item.setLocLocKind(cdMstService.find(MCodeKind.LOCKIND.getName(), item.getLocLocKind()).getText1());	// ロケーション種別
			if (item.getMrlBoxId() != null && item.getMrlBoxId().length() > 0) {
				// ボックス種別 名称変換
				item.setLocLocKind(cdMstService.find(MCodeKind.BOXKIND.getName(), item.getBoxBoxKind()).getText1());	// ボックス種別
			}
		}

		materialCockpitForm.setSrcKey1(materialCockpitForm.getSrcKey1());
		materialCockpitForm.setSrcKey2(materialCockpitForm.getSrcKey2());
		materialCockpitForm.setSrcKey3(materialCockpitForm.getSrcKey3());

		LOGGER.debug("MaterialCockpitAction/locturn...End");

		return GM02;

	}

	/**
	 * Get listItemsMt.
	 *
	 * @return listItemsMt
	 */
	public final List<MLocationBoxMaterial> getListItemsMt() {
		return listItemsMt;
	}

	/**
	 * Get Link.
	 *
	 * @return link
	 */
	public final String getLink() {
		return link;
	}

	/**
	 * Set Link.
	 *
	 * @param prmLink セットする link
	 */
	public final void setLink(final String prmLink) {
		this.link = prmLink;
	}

}
