package org.x.material.action.mgs05001;

import static org.x.material.condition.MaterialConstants.*;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.seasar.doma.jdbc.NoResultException;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.exception.ActionMessagesException;
import org.x.material.action.ActionFrame;
import org.x.material.common.annotation.Auth;
import org.x.material.common.util.CommonUtil;
import org.x.material.common.util.ListUtil;
import org.x.material.condition.MaterialConstants.IdKind;
import org.x.material.condition.MaterialConstants.MCodeKind;
import org.x.material.dto.LocationBoxDto;
import org.x.material.dto.LocationDto;
import org.x.material.entity.MCode;
import org.x.material.entity.MLocation;
import org.x.material.entity.MLocationBox;
import org.x.material.form.mgs05001.LocationManagementForm;
import org.x.material.service.CdMstService;
import org.x.material.service.NumberingService;
import org.x.material.service.mgs05001.LocationManagementService;

/**
 * ロケーション管理_ボックス管理アクションクラス.
 *
 * @author  nakada
 * @since   20141109.00.01
 * @version 20150115.00.01
 */
public class LocationManagementAction extends ActionFrame {

	/** １ページあたりのレコード数. */
	private static final int PER_PAGE = 5;

	/** 検索条件種別（ロケーション）. */
	private static final String SRCKINDLOCATION = "1";

	/** 検索条件種別(ボックス）. */
	private static final String SRCKINDBOX = "2";

	/** ブロック表示. */
	private static final String DISPLAYBLOCK = "block";

	/** ブロック非表示. */
	private static final String DISPLAYNONE = "none";

	/** ロケーション一覧取得url. */
	private static final String LOCLISTURL = "/Material/mgs05001/locationManagement/locturn/";

	/** ボックス一覧取得url. */
	private static final String BOXLISTURL = "/Material/mgs05001/locationManagement/boxturn/";

	/** ページリンク文字列 ロケーション一覧. */
	private String locationLink;

	/** 初期表示画面 - GM01. */
	private static final String GM01 = "locationManagement.jsp";

	/** ロケーション更新画面 - GM02. */
	private static final String GM02 = "locationManagement2.jsp";

	/** ロケーション登録画面 - GM03. */
	private static final String GM03 = "locationManagement3.jsp";

	/** ボックス一覧画面 - GM04. */
	private static final String GM04 = "locationManagement4.jsp";

	/** ボックス登録画面 - GM05. */
	private static final String GM05 = "locationManagement5.jsp";

	/** ボックス登録確認画面 - GM06. */
	private static final String GM06 = "locationManagement6.jsp";

	/** ボックス登録更新画面 - GM07. */
	private static final String GM07 = "locationManagement7.jsp";

	/** ロケーション情報. */
	@Resource
	private LocationDto locationDto;

	/** ロケーションボックス情報. */
	@Resource
	private LocationBoxDto locationBoxDto;

	/** アクションフォームの設定情報. **/
    @Resource
    @ActionForm
	private LocationManagementForm locationManagementForm;

	/** ロケーションボックス管理サービス. **/
	@Resource
	private LocationManagementService locationManagementService;

    /** ロケーション一覧データ. */
    private List<MLocation> locListItems;

    /** ボックス一覧データ. */
    private List<MLocationBox> boxListItems;

    /** ロケーション種別表示. */
    private String locKindStr;

    /** ボックス種別表示. */
    private String boxKindStr;

	/** コードマスタ情報制御サービス. */
	@Resource
	private CdMstService cdMstService;

	/** 採番管理サービス. */
	@Resource
	private NumberingService numberingService;

	/** ロケーション明細画面表示フラグ. */
	private String locDetailDisplay;

	/** ロケーション登録画面表示フラグ. */
	private String locInsDisplay;

	/** ロケーション更新画面表示フラグ. */
	private String locUpdDisplay;

	/** ロケーション更新画面確認表示フラグ. */
	private String locConfirmDisplay;

	/** ボックス明細画面表示フラグ. */
	private String boxDetailDisplay;

	/** ボックス登録画面表示フラグ. */
	private String boxInsDisplay;

	/** ボックス更新画面表示フラグ. */
	private String boxUpdDisplay;

	/** ボックス更新画面確認表示フラグ. */
	private String boxConfirmDisplay;

	/** ロケーション種別チェックボックスvalue値. */
	private String locKindDef;

	/** ボックス種別チェックボックスvalue値. */
	private String boxKindDef;

	/**
	 * デバッグ・ログ出力設定.
	 */
	private static final Logger LOGGER = Logger.getLogger(LocationManagementAction.class);

    /**
	 * 初期表示.
	 *
	 * @return locationManagement.jsp
	 */
	@Auth
    @Execute(validator = false)
	public final String init() {
		LOGGER.debug("LocationManagementAction...");

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		/** ロケーション検索. */
		locationManagementForm.setMaterial(SRCKINDLOCATION);	// 検索条件にロケーションを選択

		// 対象ページ番号(pageno)に表示する分のレコードだけ取得
		setLocListItems(locationManagementService.findByLocationWithInsideMatching(getUserDto().getAccid(), locationManagementForm.getSrcLocBox(), "1", PER_PAGE));

		// レコードの総件数
		int totalRecNum = (int) locationManagementService.getCount();
		LOGGER.debug("totalRecNum:" + Integer.toString(totalRecNum));

		/** ページリンク文字列作成. */
		locationLink = ListUtil.makePagingLink(LOCLISTURL, Integer.parseInt("1"), totalRecNum, PER_PAGE);
		LOGGER.debug("link:" + locationLink);

		/** 一覧作成. */
		MCode locationKind;
		for (MLocation item: locListItems) {
	    	locationKind = cdMstService.find(MCodeKind.LOCKIND.getName(), item.getLocKind());
	    	item.setLocKind(locationKind.getCodeNm());
		}

		locationManagementForm.setLocpageno("1");	//初期ページ番号の設定

		LOGGER.debug("LocationManagementAction End");

		return GM01;
    }

	/**
	 * 照会表示.
	 * @return locationManagement.jsp or locationManagement4.jsp
	 */
	@Auth
	@Execute(validator = false)
	public final String regSearch() {
		String retinfo;

		LOGGER.debug("regSearch...");

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		try {
			if (locationManagementForm.getMaterial().equals(SRCKINDLOCATION)) {
				retinfo = GM01;	// ロケーション一覧指定

				/** ロケーション検索 */
				// 対象ページ番号(pageno)に表示する分のレコードだけ取得
				setLocListItems(locationManagementService.findByLocationWithInsideMatching(getUserDto().getAccid(), locationManagementForm.getSrcLocBox(), "1", PER_PAGE));

				locationManagementForm.setLocpageno("1");	//初期ページ番号の設定

				// レコードの総件数
				int totalRecNum = (int) locationManagementService.getCount();
				LOGGER.debug("totalRecNum:" + Integer.toString(totalRecNum));

				/** ページリンク文字列作成 */
				locationLink = ListUtil.makePagingLink(LOCLISTURL, Integer.parseInt("1"), totalRecNum, PER_PAGE);
				LOGGER.debug("link:" + locationLink);

				/** 一覧作成 */
				MCode locationKind;
				for (MLocation item: locListItems) {
			    	locationKind = cdMstService.find(MCodeKind.LOCKIND.getName(), item.getLocKind());
			    	item.setLocKind(locationKind.getCodeNm());
				}
			} else {
				retinfo = GM04;	// ボックス一覧指定

				locationManagementForm.setSrcboxlockey(null);	// ボックス一覧、ロケーション指定初期化

				locationManagementForm.setBoxpageno("1");	//初期ページ番号の設定

				/** ボックス検索 */
				// 対象ページ番号(pageno)に表示する分のレコードだけ取得
				setBoxListItems(locationManagementService.findByBoxWithInsideMatching(getUserDto().getAccid(), locationManagementForm.getSrcLocBox(), "1", PER_PAGE));

				// レコードの総件数
				int totalRecNum = (int) locationManagementService.getCount();
				LOGGER.debug("totalRecNum:" + Integer.toString(totalRecNum));

				/** ページリンク文字列作成 */
				locationLink = ListUtil.makePagingLink(BOXLISTURL, Integer.parseInt("1"), totalRecNum, PER_PAGE);
				LOGGER.debug("link:" + locationLink);

				/** 一覧作成 */
				for (MLocationBox item: boxListItems) {
					if (item.getLocKind().equals(LOCATIONKINDPUBLIC)) {
						item.setLocKind(LOCPUBLIC);		// ロケーション種別
					} else {
						item.setLocKind(LOCPRIVATE);	// ロケーション種別
					}
					if (item.getBoxKind().equals(BOXKINDPUBLIC)) {
						item.setBoxKind(BOXPUBLIC);		// ボックス種別
					} else {
						item.setBoxKind(BOXPRIVATE);	// ボックス種別
					}
				}
			}
		} catch (NoResultException e) {
			//エラーメッセージをセットします。
			throw new ActionMessagesException("errors.noitem");
		}

		LOGGER.debug("regSearch...End");

		return retinfo;
	}

	/**
	 * ページング表示(ロケーション）.
	 * @return locationManagement.jsp
	 */
	@Auth
	@Execute(validator = false, urlPattern = "locturn/{locpageno}")
	public final String locturn() {

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		/** 対象ページ番号(locpageno)に表示する分のレコードだけ取得. */
		setLocListItems(locationManagementService.findByLocationWithInsideMatching(getUserDto().getAccid(), locationManagementForm.getSrcLocBox(), locationManagementForm.getLocpageno(), PER_PAGE));

		/** レコードの総件数. */
		int totalRecNum = (int) locationManagementService.getCount();

		/** ページリンク文字列作成 */
		locationLink = ListUtil.makePagingLink(LOCLISTURL, Integer.parseInt(locationManagementForm.getLocpageno()), totalRecNum, PER_PAGE);

		/** 一覧作成 */
		MCode locationKind;
		for (MLocation item: locListItems) {
	    	locationKind = cdMstService.find(MCodeKind.LOCKIND.getName(), item.getLocKind());
	    	item.setLocKind(locationKind.getCodeNm());
		}

		return GM01;

	}

	/**
	 * ページング表示(ボックス）.
	 * @return locationManagement4.jsp
	 */
	@Auth
	@Execute(validator = false, urlPattern = "boxturn/{boxpageno}")
	public final String boxturn() {

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		/** ボックス検索 */
		// 対象ページ番号(pageno)に表示する分のレコードだけ取得
		if (locationManagementForm.getSrcboxlockey() == null) {
			setBoxListItems(locationManagementService.findByBoxWithInsideMatching(getUserDto().getAccid(), locationManagementForm.getSrcLocBox(), locationManagementForm.getBoxpageno(), PER_PAGE));
		} else {
			setBoxListItems(locationManagementService.findByLocIdWithInsideMatching(getUserDto().getAccid(), locationManagementForm.getSrcboxlockey(), locationManagementForm.getBoxpageno(), PER_PAGE));
		}

		// レコードの総件数
		int totalRecNum = (int) locationManagementService.getCount();
		LOGGER.debug("totalRecNum:" + Integer.toString(totalRecNum));

		/** ページリンク文字列作成 */
		locationLink = ListUtil.makePagingLink(BOXLISTURL, Integer.parseInt(locationManagementForm.getBoxpageno()), totalRecNum, PER_PAGE);
		LOGGER.debug("link:" + locationLink);

		/** 一覧作成 */
		for (MLocationBox item: boxListItems) {
			if (item.getLocKind().equals(LOCATIONKINDPUBLIC)) {
				item.setLocKind(LOCPUBLIC);		// ロケーション種別
			} else {
				item.setLocKind(LOCPRIVATE);	// ロケーション種別
			}
			if (item.getBoxKind().equals(BOXKINDPUBLIC)) {
				item.setBoxKind(BOXPUBLIC);		// ボックス種別
			} else {
				item.setBoxKind(BOXPRIVATE);	// ボックス種別
			}
		}

		return GM04;

	}

	/**
	 * ボックス設定.
	 * ロケーションに登録されているボックスの一覧表示
	 *
	 * @return locationManagement4.jsp
	 */
	@Auth
	@Execute(validator = false)
	public final String boxSearch() {

		LOGGER.debug("boxSearch...");

		/** ボックス検索 */
		locationManagementForm.setBoxpageno("1");	//初期ページ番号の設定

		// 対象ページ番号(pageno)に表示する分のレコードだけ取得
		setBoxListItems(locationManagementService.findByLocIdWithInsideMatching(getUserDto().getAccid(), locationManagementForm.getSrcboxlockey(), locationManagementForm.getBoxpageno(), PER_PAGE));

		// レコードの総件数
		int totalRecNum = (int) locationManagementService.getCount();
		LOGGER.debug("totalRecNum:" + Integer.toString(totalRecNum));

		/** ページリンク文字列作成 */
		locationLink = ListUtil.makePagingLink(BOXLISTURL, Integer.parseInt(locationManagementForm.getLocpageno()), totalRecNum, PER_PAGE);
		LOGGER.debug("link:" + locationLink);

		/** 一覧作成 */
		for (MLocationBox item: boxListItems) {
			if (item.getLocKind().equals(LOCATIONKINDPUBLIC)) {
				item.setLocKind(LOCPUBLIC);		// ロケーション種別
			} else {
				item.setLocKind(LOCPRIVATE);	// ロケーション種別
			}
			if (item.getBoxKind().equals(BOXKINDPUBLIC)) {
				item.setBoxKind(BOXPUBLIC);		// ボックス種別
			} else {
				item.setBoxKind(BOXPRIVATE);	// ボックス種別
			}
		}

		LOGGER.debug("boxSearch...End");
		return GM04;
	}

	/**
	 * ロケーション明細表示.
	 *
	 * @return locationManagement2.jsp
	 */
	@Auth
	@Execute(validator = false)
	public final String locDetailSearch() {

		LOGGER.debug("locDetailSearch...");

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		/** 対象ページ番号(locpageno)に表示する分のレコードだけ取得. */
		setLocListItems(locationManagementService.findByLocationWithInsideMatching(getUserDto().getAccid(), locationManagementForm.getSrcLocBox(), locationManagementForm.getLocpageno(), PER_PAGE));

		/** レコードの総件数. */
		int totalRecNum = (int) locationManagementService.getCount();

		/** ページリンク文字列作成 */
		locationLink = ListUtil.makePagingLink(LOCLISTURL, Integer.parseInt(locationManagementForm.getLocpageno()), totalRecNum, PER_PAGE);

		/** 一覧作成 */
		MCode locationKind;
		for (MLocation item: locListItems) {
	    	locationKind = cdMstService.find(MCodeKind.LOCKIND.getName(), item.getLocKind());
	    	item.setLocKind(locationKind.getCodeNm());
		}

		/** ロケーション情報取得. */
		MLocation rec = locationManagementService.findByLocId(locationManagementForm.getSrckey());
		locationDto.setLocationInf(rec);
		locationManagementForm.setLocId(rec.getLocId());			// ロケーションID
		if (rec.getLocKind().equals(LOCATIONKINDPUBLIC)) {
			this.setLocKindStr(LOCPUBLIC);							// ロケーション種別
			locationManagementForm.setLocKind(CHECKON);
		} else {
			this.setLocKindStr(LOCPRIVATE);							// ロケーション種別
			locationManagementForm.setLocKind(CHECKOFF);
		}
		locKindDef = LOCATIONKINDPUBLIC;
		locationManagementForm.setPostcd(rec.getPostcd());			// 郵便番号
		locationManagementForm.setAddress(rec.getAddress());		// 住所
		locationManagementForm.setNote(rec.getNote());				// 備考

		locationManagementForm.setLocNm(rec.getLocNm());			// ロケーション名称
		locationManagementForm.setRecipient(rec.getRecipient());	// 送付先名
		locationManagementForm.setTel1(rec.getTel1());				// 電話番号
		locationManagementForm.setNote(rec.getNote());				// 備考
		// 追加タグA
		// 追加タグB

		/** 画面表示設定. */
		setLocDetailDisplay(DISPLAYBLOCK);	// 明細の表示設定
		setLocUpdDisplay(DISPLAYNONE);		// ロケーション登録画面の表示設定
		setLocConfirmDisplay(DISPLAYNONE);	// 確認画面の表示設定

		LOGGER.debug("locDetailSearch...End");

		return GM02;

	}

	/**
	 * ロケーション登録再入力表示.
	 *
	 * @return locationManagement.jsp
	 */
	@Auth
	@Execute(validator = false)
	public final String locUpdreinput() {

		LOGGER.debug("locUpdreinput...");

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		/** 対象ページ番号(locpageno)に表示する分のレコードだけ取得. */
		setLocListItems(locationManagementService.findByLocationWithInsideMatching(getUserDto().getAccid(), locationManagementForm.getSrcLocBox(), locationManagementForm.getLocpageno(), PER_PAGE));

		/** レコードの総件数. */
		int totalRecNum = (int) locationManagementService.getCount();

		/** ページリンク文字列作成 */
		locationLink = ListUtil.makePagingLink(LOCLISTURL, Integer.parseInt(locationManagementForm.getLocpageno()), totalRecNum, PER_PAGE);

		/** 一覧作成 */
		MCode locationKind;
		for (MLocation item: locListItems) {
	    	locationKind = cdMstService.find(MCodeKind.LOCKIND.getName(), item.getLocKind());
	    	item.setLocKind(locationKind.getCodeNm());
		}

		/** 画面表示設定. */
		setLocDetailDisplay(DISPLAYNONE);	// 明細の表示設定
		setLocUpdDisplay(DISPLAYBLOCK);		// ロケーション登録画面の表示設定
		setLocConfirmDisplay(DISPLAYNONE);	// 確認画面の表示設定

		LOGGER.debug("locUpdreinput...End");

		return GM02;
	}

	/**
	 * ロケーション更新登録確認.
	 *
	 * @return locationManagement2.jsp
	 */
	@Auth
	@Execute(validator = true, input = "locUpdreinput")
	public final String locUpdCheck() {

		LOGGER.debug("locUpdCheck...");

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		/** 対象ページ番号(locpageno)に表示する分のレコードだけ取得. */
		setLocListItems(locationManagementService.findByLocationWithInsideMatching(getUserDto().getAccid(), locationManagementForm.getSrcLocBox(), locationManagementForm.getLocpageno(), PER_PAGE));

		/** レコードの総件数. */
		int totalRecNum = (int) locationManagementService.getCount();

		/** ページリンク文字列作成. */
		locationLink = ListUtil.makePagingLink(LOCLISTURL, Integer.parseInt(locationManagementForm.getLocpageno()), totalRecNum, PER_PAGE);

		/** 一覧作成. */
		MCode locationKind;
		for (MLocation item: locListItems) {
	    	locationKind = cdMstService.find(MCodeKind.LOCKIND.getName(), item.getLocKind());
	    	item.setLocKind(locationKind.getCodeNm());
		}

		/** ロケーション種別設定. */
		if (locationManagementForm.getLocKind().equals(LOCATIONKINDPUBLIC)) {
			this.setLocKindStr(LOCPUBLIC);
		} else {
			this.setLocKindStr(LOCPRIVATE);
		}

		/** 画面表示設定. */
		setLocDetailDisplay(DISPLAYNONE);	// 明細の表示設定
		setLocUpdDisplay(DISPLAYNONE);		// ロケーション登録画面の表示設定
		setLocConfirmDisplay(DISPLAYBLOCK);	// 確認画面の表示設定

		LOGGER.debug("locUpdCheck...End");

		return GM02;
	}

	/**
	 * ロケーション更新登録.
	 *
	 * @return locationManagement.jsp
	 */
	@Auth
	@Execute(validator = false)
	public final String locUpdReg() {

		LOGGER.debug("locUpdReg...");

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		/** ロケーション情報更新登録. */
		locationManagementService.locUpdReg(locationManagementForm, getUserDto(), locationDto);


		LOGGER.debug("locUpdReg...End");

		return "locDetailSearch?redirect=true";
	}

	/**
	 * ロケーション登録初期画面.
	 *
	 * @return locationManagement3.jsp
	 */
	@Auth
	@Execute(validator = false)
	public final String locInsProc() {

    	//入力初期化
		locationManagementForm.initialize();

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		/** 対象ページ番号(locpageno)に表示する分のレコードだけ取得. */
		setLocListItems(locationManagementService.findByLocationWithInsideMatching(getUserDto().getAccid(), locationManagementForm.getSrcLocBox(), locationManagementForm.getLocpageno(), PER_PAGE));

		/** レコードの総件数. */
		int totalRecNum = (int) locationManagementService.getCount();

		/** ページリンク文字列作成 */
		locationLink = ListUtil.makePagingLink(LOCLISTURL, Integer.parseInt(locationManagementForm.getLocpageno()), totalRecNum, PER_PAGE);

		/** 一覧作成 */
		MCode locationKind;
		for (MLocation item: locListItems) {
	    	locationKind = cdMstService.find(MCodeKind.LOCKIND.getName(), item.getLocKind());
	    	item.setLocKind(locationKind.getCodeNm());
		}

		/** ロケーションＩＤの発番. */
		locationManagementForm.setLocId(numberingService.getIdNumbering(IdKind.LOCATION.getName()));

		/** 画面表示設定. */
		setLocInsDisplay(DISPLAYBLOCK);		// ロケーション登録画面の表示設定
		setLocConfirmDisplay(DISPLAYNONE);	// 確認画面の表示設定

		return GM03;

	}

	/**
	 * ロケーション登録再入力表示.
	 *
	 * @return locationManagement3.jsp
	 */
	@Auth
	@Execute(validator = false)
	public final String locInsreinput() {

		LOGGER.debug("locInsreinput...");

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		/** 対象ページ番号(locpageno)に表示する分のレコードだけ取得. */
		setLocListItems(locationManagementService.findByLocationWithInsideMatching(getUserDto().getAccid(), locationManagementForm.getSrcLocBox(), locationManagementForm.getLocpageno(), PER_PAGE));

		/** レコードの総件数. */
		int totalRecNum = (int) locationManagementService.getCount();

		/** ページリンク文字列作成 */
		locationLink = ListUtil.makePagingLink(LOCLISTURL, Integer.parseInt(locationManagementForm.getLocpageno()), totalRecNum, PER_PAGE);

		/** 一覧作成 */
		MCode locationKind;
		for (MLocation item: locListItems) {
	    	locationKind = cdMstService.find(MCodeKind.LOCKIND.getName(), item.getLocKind());
	    	item.setLocKind(locationKind.getCodeNm());
		}

		/** 画面表示設定. */
		setLocInsDisplay(DISPLAYBLOCK);		// ロケーション登録画面の表示設定
		setLocConfirmDisplay(DISPLAYNONE);	// 確認画面の表示設定

		LOGGER.debug("locInsreinput...End");

		return GM03;
	}

	/**
	 * ロケーション登録確認.
	 *
	 * @return locationManagement3.jsp
	 */
	@Auth
    @Execute(validate = "locDuplicateValidateConfirm", input = "locInsreinput")
	public final String locInsCheck() {

		LOGGER.debug("locInsCheck...");

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		/** 対象ページ番号(locpageno)に表示する分のレコードだけ取得. */
		setLocListItems(locationManagementService.findByLocationWithInsideMatching(getUserDto().getAccid(), locationManagementForm.getSrcLocBox(), locationManagementForm.getLocpageno(), PER_PAGE));

		/** レコードの総件数. */
		int totalRecNum = (int) locationManagementService.getCount();

		/** ページリンク文字列作成. */
		locationLink = ListUtil.makePagingLink(LOCLISTURL, Integer.parseInt(locationManagementForm.getLocpageno()), totalRecNum, PER_PAGE);

		/** 一覧作成. */
		MCode locationKind;
		for (MLocation item: locListItems) {
			locationKind = cdMstService.find(MCodeKind.LOCKIND.getName(), item.getLocKind());
			item.setLocKind(locationKind.getCodeNm());
		}

		/** ロケーション種別設定. */
		if (locationManagementForm.getLocKind().equals(LOCATIONKINDPUBLIC)) {
			this.setLocKindStr(LOCPUBLIC);
		} else {
			this.setLocKindStr(LOCPRIVATE);
		}

		/** 画面表示設定. */
		setLocInsDisplay(DISPLAYNONE);		// ロケーション登録画面の表示設定
		setLocConfirmDisplay(DISPLAYBLOCK);	// 確認画面の表示設定

		LOGGER.debug("locInsCheck...End");

		return GM03;

	}

	/**
	 * ロケーション登録.
	 *
	 * @return locationManagement.jsp
	 */
	@Auth
	@Execute(validator = false)
	public final String locInsReg() {

		LOGGER.debug("locInsReg...");

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		/** ロケーション情報登録. */
		locationManagementService.locInsReg(locationManagementForm, getUserDto());

		/** 表示明細ロケーションID設定. */
		locationManagementForm.setSrckey(locationManagementForm.getLocId());

		LOGGER.debug("locInsReg...End");

		return "locDetailSearch?redirect=true";

	}

	/**
	 * ロケーション削除.
	 *
	 * @return locationManagement.jsp
	 */
	@Auth
	@Execute(validator = false)
	public final String locDelProc() {

		LOGGER.debug("locDelProc...");

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		LOGGER.debug("lbox:" + locationManagementForm.getLbox().length);
		if (locationManagementForm.getLbox().length > 0) {
			for (String item: locationManagementForm.getLbox()) {
				String reqlecid = item;
				LOGGER.debug("reqaccid:" + reqlecid);

				/** ロケーション情報取得. */
				MLocation rec = locationManagementService.findByLocId(reqlecid);
				locationDto.setLocationInf(rec);

				/** ロケーション削除. */
				locationManagementService.locDelUpdReg(getUserDto(), locationDto);

				/** ロケーションボックス関連マスタ削除. */
				locationManagementService.rlocBoxDelUpdReg(getUserDto(), locationDto.getLocId(), null);
			}

			/** 対象ページ番号(locpageno)に表示する分のレコードだけ取得. */
			setLocListItems(locationManagementService.findByLocationWithInsideMatching(getUserDto().getAccid(), locationManagementForm.getSrcLocBox(), locationManagementForm.getLocpageno(), PER_PAGE));

			/** レコードの総件数. */
			int totalRecNum = (int) locationManagementService.getCount();

			/** ページリンク文字列作成 */
			locationLink = ListUtil.makePagingLink(LOCLISTURL, Integer.parseInt(locationManagementForm.getLocpageno()), totalRecNum, PER_PAGE);

			/** 一覧作成 */
			MCode locationKind;
			for (MLocation item: locListItems) {
		    	locationKind = cdMstService.find(MCodeKind.LOCKIND.getName(), item.getLocKind());
		    	item.setLocKind(locationKind.getCodeNm());
			}
		}

		LOGGER.debug("locDelProc...End");

		return GM01;

	}

	/**
	 * ボックス登録初期画面.
	 *
	 * @return locationManagement5.jsp
	 */
	@Auth
	@Execute(validator = false)
	public final String boxInsProc() {

		LOGGER.debug("boxInsProc...");

    	//入力初期化
		locationManagementForm.initialize();

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		/** 対象ページ番号(locpageno)に表示する分のレコードだけ取得. */
		if (locationManagementForm.getSrcboxlockey() == null) {
			setBoxListItems(locationManagementService.findByBoxWithInsideMatching(getUserDto().getAccid(), locationManagementForm.getSrcLocBox(), locationManagementForm.getBoxpageno(), PER_PAGE));
		} else {
			setBoxListItems(locationManagementService.findByLocIdWithInsideMatching(getUserDto().getAccid(), locationManagementForm.getSrcboxlockey(), locationManagementForm.getBoxpageno(), PER_PAGE));
		}

		/** レコードの総件数. */
		int totalRecNum = (int) locationManagementService.getCount();

		/** ページリンク文字列作成 */
		locationLink = ListUtil.makePagingLink(LOCLISTURL, Integer.parseInt(locationManagementForm.getLocpageno()), totalRecNum, PER_PAGE);

		/** 一覧作成 */
		for (MLocationBox item: boxListItems) {
			if (item.getLocKind().equals(LOCATIONKINDPUBLIC)) {
				item.setLocKind(LOCPUBLIC);		// ロケーション種別
			} else {
				item.setLocKind(LOCPRIVATE);	// ロケーション種別
			}
			if (item.getBoxKind().equals(BOXKINDPUBLIC)) {
				item.setBoxKind(BOXPUBLIC);		// ボックス種別
			} else {
				item.setBoxKind(BOXPRIVATE);	// ボックス種別
			}
		}

		/** ボックスＩＤの発番. */
		locationManagementForm.setBoxId(numberingService.getIdNumbering(IdKind.BOX.getName()));

		/** 画面表示設定. */
		setBoxInsDisplay(DISPLAYBLOCK);		// ボックス登録画面の表示設定
		setBoxConfirmDisplay(DISPLAYNONE);	// 確認画面の表示設定

		LOGGER.debug("boxInsProc...End");

		return GM05;

	}

	/**
	 * ボックス明細表示.
	 *
	 * @return locationManagement7.jsp
	 */
	@Auth
	@Execute(validator = false)
	public final String boxDetailSearch() {

		LOGGER.debug("boxDetailSearch...");

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		/** ボックス検索 */
		// 対象ページ番号(pageno)に表示する分のレコードだけ取得
		if (locationManagementForm.getSrcboxlockey() == null) {
			setBoxListItems(locationManagementService.findByBoxWithInsideMatching(getUserDto().getAccid(), locationManagementForm.getSrcLocBox(), locationManagementForm.getBoxpageno(), PER_PAGE));
		} else {
			setBoxListItems(locationManagementService.findByLocIdWithInsideMatching(getUserDto().getAccid(), locationManagementForm.getSrcboxlockey(), locationManagementForm.getBoxpageno(), PER_PAGE));
		}

		// レコードの総件数
		int totalRecNum = (int) locationManagementService.getCount();

		/** ページリンク文字列作成 */
		locationLink = ListUtil.makePagingLink(BOXLISTURL, Integer.parseInt(locationManagementForm.getBoxpageno()), totalRecNum, PER_PAGE);

		/** 一覧作成 */
		for (MLocationBox item: boxListItems) {
			if (item.getLocKind().equals(LOCATIONKINDPUBLIC)) {
				item.setLocKind(LOCPUBLIC);		// ロケーション種別
			} else {
				item.setLocKind(LOCPRIVATE);	// ロケーション種別
			}
			if (item.getBoxKind().equals(BOXKINDPUBLIC)) {
				item.setBoxKind(BOXPUBLIC);		// ボックス種別
			} else {
				item.setBoxKind(BOXPRIVATE);	// ボックス種別
			}
		}

		/** ボックス情報取得. */
		MLocationBox rec = locationManagementService.findByBoxId(locationManagementForm.getSrckey());
		locationBoxDto.setLocationBoxInf(rec);

		locationManagementForm.setLocNm(rec.getLocNm());			// ロケーション名称
		locationManagementForm.setLocId(rec.getLocId());			// ロケーションID
		if (rec.getLocKind().equals(LOCATIONKINDPUBLIC)) {
			this.setLocKindStr(LOCPUBLIC);							// ロケーション種別
			locationManagementForm.setLocKind(CHECKON);
		} else {
			this.setLocKindStr(LOCPRIVATE);							// ロケーション種別
			locationManagementForm.setLocKind(CHECKOFF);
		}
		locKindDef = LOCATIONKINDPUBLIC;							// ロケーション種別チェックボックスvalue値
		boxKindDef = BOXKINDPUBLIC;									// ボックス種別チェックボックスvalue値
		locationManagementForm.setBoxId(rec.getBoxId());			// ボックスID
		locationManagementForm.setBoxOnrId(rec.getBoxOnrId());		// ボックスオーナーID
		locationManagementForm.setBoxNm(rec.getBoxNm());			// ボックス名
		if (rec.getBoxKind().equals(BOXKINDPUBLIC)) {
			this.setBoxKindStr(BOXPUBLIC);							// ボックス種別
			locationManagementForm.setBoxKind(CHECKON);
		} else {
			this.setBoxKindStr(BOXPRIVATE);							// ボックス種別
			locationManagementForm.setBoxKind(CHECKOFF);
		}
		locationManagementForm.setCapaInd(rec.getCapaInd());		// 容量種別
		locationManagementForm.setNote(rec.getNote());				// 備考
		// 追加タグA
		locationManagementForm.setTagA(rec.getTagA());				// 追加タグA
		// 追加タグB
		locationManagementForm.setTagB(rec.getTagB());				// 追加タグB

		/** 画面表示設定. */
		setBoxDetailDisplay(DISPLAYBLOCK);	// 明細の表示設定
		setBoxUpdDisplay(DISPLAYNONE);		// ボックス登録画面の表示設定
		setBoxConfirmDisplay(DISPLAYNONE);	// 確認画面の表示設定

		LOGGER.debug("boxDetailSearch...End");

		return GM07;

	}

	/**
	 * ボックス登録再入力表示.
	 *
	 * @return locationManagement7.jsp
	 */
	@Auth
	@Execute(validator = false)
	public final String boxUpdreinput() {

		LOGGER.debug("boxUpdreinput...");

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		/** 対象ページ番号(locpageno)に表示する分のレコードだけ取得. */
		if (locationManagementForm.getSrcboxlockey() == null) {
			setBoxListItems(locationManagementService.findByBoxWithInsideMatching(getUserDto().getAccid(), locationManagementForm.getSrcLocBox(), locationManagementForm.getBoxpageno(), PER_PAGE));
		} else {
			setBoxListItems(locationManagementService.findByLocIdWithInsideMatching(getUserDto().getAccid(), locationManagementForm.getSrcboxlockey(), locationManagementForm.getBoxpageno(), PER_PAGE));
		}

		/** レコードの総件数. */
		int totalRecNum = (int) locationManagementService.getCount();

		/** ページリンク文字列作成 */
		locationLink = ListUtil.makePagingLink(BOXLISTURL, Integer.parseInt(locationManagementForm.getBoxpageno()), totalRecNum, PER_PAGE);

		/** 一覧作成 */
		for (MLocationBox item: boxListItems) {
			if (item.getLocKind().equals(LOCATIONKINDPUBLIC)) {
				item.setLocKind(LOCPUBLIC);		// ロケーション種別
			} else {
				item.setLocKind(LOCPRIVATE);	// ロケーション種別
			}
			if (item.getBoxKind().equals(BOXKINDPUBLIC)) {
				item.setBoxKind(BOXPUBLIC);		// ボックス種別
			} else {
				item.setBoxKind(BOXPRIVATE);	// ボックス種別
			}
		}

		/** 画面表示設定. */
		setBoxDetailDisplay(DISPLAYNONE);	// 明細の表示設定
		setBoxUpdDisplay(DISPLAYBLOCK);		// ボックス登録画面の表示設定
		setBoxConfirmDisplay(DISPLAYNONE);	// 確認画面の表示設定

		LOGGER.debug("boxUpdreinput...End");

		return GM07;

	}

	/**
	 * ボックス更新登録確認.
	 *
	 * @return locationManagement7.jsp
	 */
	@Auth
	@Execute(validator = true, input = "boxUpdreinput")
	public final String boxUpdCheck() {

		LOGGER.debug("boxUpdCheck...");

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		/** 対象ページ番号(locpageno)に表示する分のレコードだけ取得. */
		if (locationManagementForm.getSrcboxlockey() == null) {
			setBoxListItems(locationManagementService.findByBoxWithInsideMatching(getUserDto().getAccid(), locationManagementForm.getSrcLocBox(), locationManagementForm.getBoxpageno(), PER_PAGE));
		} else {
			setBoxListItems(locationManagementService.findByLocIdWithInsideMatching(getUserDto().getAccid(), locationManagementForm.getSrcboxlockey(), locationManagementForm.getBoxpageno(), PER_PAGE));
		}

		/** レコードの総件数. */
		int totalRecNum = (int) locationManagementService.getCount();

		/** ページリンク文字列作成. */
		locationLink = ListUtil.makePagingLink(BOXLISTURL, Integer.parseInt(locationManagementForm.getBoxpageno()), totalRecNum, PER_PAGE);

		/** 一覧作成 */
		for (MLocationBox item: boxListItems) {
			if (item.getLocKind().equals(BOXKINDPUBLIC)) {
				item.setLocKind(LOCPUBLIC);		// ロケーション種別
			} else {
				item.setLocKind(LOCPRIVATE);	// ロケーション種別
			}
			if (item.getBoxKind().equals(BOXKINDPUBLIC)) {
				item.setBoxKind(BOXPUBLIC);		// ボックス種別
			} else {
				item.setBoxKind(BOXPRIVATE);	// ボックス種別
			}
		}

		/** ボックス種別設定. */
		if (locationManagementForm.getBoxKind().equals(BOXKINDPUBLIC)) {
			this.setBoxKindStr(BOXPUBLIC);
		} else {
			this.setBoxKindStr(BOXPRIVATE);
		}

		/** 画面表示設定. */
		setBoxDetailDisplay(DISPLAYNONE);	// 明細の表示設定
		setBoxUpdDisplay(DISPLAYNONE);		// ボックス登録画面の表示設定
		setBoxConfirmDisplay(DISPLAYBLOCK);	// 確認画面の表示設定

		LOGGER.debug("boxUpdCheck...End");

		return GM07;

	}

	/**
	 * ボックス更新登録.
	 *
	 * @return locationManagement.jsp
	 */
	@Auth
	@Execute(validator = false)
	public final String boxUpdReg() {

		LOGGER.debug("boxUpdReg...");

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		/** ボックス情報更新登録. */
		locationManagementService.boxUpdReg(locationManagementForm, getUserDto(), locationBoxDto);

		LOGGER.debug("boxUpdReg...End");
		return "boxDetailSearch?redirect=true";
	}

	/**
	 * ボックス登録再入力表示.
	 *
	 * @return locationManagement5.jsp
	 */
	@Auth
	@Execute(validator = false)
	public final String boxInsreinput() {

		LOGGER.debug("boxInsreinput...");

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		/** 対象ページ番号(locpageno)に表示する分のレコードだけ取得. */
		if (locationManagementForm.getSrcboxlockey() == null) {
			setBoxListItems(locationManagementService.findByBoxWithInsideMatching(getUserDto().getAccid(), locationManagementForm.getSrcLocBox(), locationManagementForm.getBoxpageno(), PER_PAGE));
		} else {
			setBoxListItems(locationManagementService.findByLocIdWithInsideMatching(getUserDto().getAccid(), locationManagementForm.getSrcboxlockey(), locationManagementForm.getBoxpageno(), PER_PAGE));
		}

		/** レコードの総件数. */
		int totalRecNum = (int) locationManagementService.getCount();

		/** ページリンク文字列作成 */
		locationLink = ListUtil.makePagingLink(BOXLISTURL, Integer.parseInt(locationManagementForm.getBoxpageno()), totalRecNum, PER_PAGE);

		/** 一覧作成 */
		for (MLocationBox item: boxListItems) {
			if (item.getLocKind().equals(LOCATIONKINDPUBLIC)) {
				item.setLocKind(LOCPUBLIC);		// ロケーション種別
			} else {
				item.setLocKind(LOCPRIVATE);	// ロケーション種別
			}
			if (item.getBoxKind().equals(BOXKINDPUBLIC)) {
				item.setBoxKind(BOXPUBLIC);		// ボックス種別
			} else {
				item.setBoxKind(BOXPRIVATE);	// ボックス種別
			}
		}

		/** 画面表示設定. */
		setBoxInsDisplay(DISPLAYBLOCK);		// ボックス登録画面の表示設定
		setBoxConfirmDisplay(DISPLAYNONE);	// 確認画面の表示設定

		LOGGER.debug("boxInsreinput...End");

		return GM05;

	}

	/**
	 * ボックス登録確認.
	 *
	 * @return locationManagement6.jsp
	 */
	@Auth
    @Execute(validate = "boxDuplicateValidateConfirm", input = "boxInsreinput")
	public final String boxInsCheck() {

		LOGGER.debug("boxInsCheck...");

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		/** 対象ページ番号(locpageno)に表示する分のレコードだけ取得. */
		if (locationManagementForm.getSrcboxlockey() == null) {
			setBoxListItems(locationManagementService.findByBoxWithInsideMatching(getUserDto().getAccid(), locationManagementForm.getSrcLocBox(), locationManagementForm.getBoxpageno(), PER_PAGE));
		} else {
			setBoxListItems(locationManagementService.findByLocIdWithInsideMatching(getUserDto().getAccid(), locationManagementForm.getSrcboxlockey(), locationManagementForm.getBoxpageno(), PER_PAGE));
		}

		/** レコードの総件数. */
		int totalRecNum = (int) locationManagementService.getCount();

		/** ページリンク文字列作成 */
		locationLink = ListUtil.makePagingLink(BOXLISTURL, Integer.parseInt(locationManagementForm.getBoxpageno()), totalRecNum, PER_PAGE);

		/** 一覧作成 */
		for (MLocationBox item: boxListItems) {
			if (item.getLocKind().equals(BOXKINDPUBLIC)) {
				item.setLocKind(LOCPUBLIC);		// ロケーション種別
			} else {
				item.setLocKind(LOCPRIVATE);	// ロケーション種別
			}
			if (item.getBoxKind().equals(BOXKINDPUBLIC)) {
				item.setBoxKind(BOXPUBLIC);		// ボックス種別
			} else {
				item.setBoxKind(BOXPRIVATE);	// ボックス種別
			}
		}

		/** ボックス種別設定. */
		if (locationManagementForm.getLocKind().equals(LOCATIONKINDPUBLIC)) {
			this.setBoxKindStr(LOCPUBLIC);
		} else {
			this.setBoxKindStr(LOCPRIVATE);
		}

		/** 画面表示設定. */
		setBoxInsDisplay(DISPLAYNONE);		// ボックス登録画面の表示設定
		setBoxConfirmDisplay(DISPLAYBLOCK);	// 確認画面の表示設定

		LOGGER.debug("boxInsCheck...End");

		return GM06;

	}

	/**
	 * ボックス登録.
	 *
	 * @return locationManagement.jsp
	 */
	@Auth
	@Execute(validator = false)
	public final String boxInsReg() {

		LOGGER.debug("boxInsReg...");

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		/** ボックス情報登録. */
		locationManagementService.boxInsReg(locationManagementForm, getUserDto());

		/** ロケーションボックス関連マスタ情報登録. */
		locationManagementService.rlocBoxInsReg(locationManagementForm, getUserDto());

		/** 表示明細ロケーションID設定. */
		locationManagementForm.setSrckey(locationManagementForm.getBoxId());

		LOGGER.debug("boxInsReg...End");

		return "boxDetailSearch?redirect=true";

	}

	/**
	 * ボックス削除.
	 *
	 * @return locationManagement4.jsp
	 */
	@Auth
	@Execute(validator = false)
	public final String boxDelProc() {

		LOGGER.debug("boxDelProc...");

		String reqboxid;
		MLocationBox rec;

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		LOGGER.debug("bbox:" + locationManagementForm.getBbox().length);
		if (locationManagementForm.getBbox().length > 0) {
			for (String item: locationManagementForm.getBbox()) {
				reqboxid = item;
				LOGGER.debug("reqboxid:" + reqboxid);

				/** ボックス情報取得. */
				rec = locationManagementService.findByBoxId(reqboxid);
				locationBoxDto.setLocationBoxInf(rec);

				/** ボックス削除. */
				locationManagementService.boxDelUpdReg(getUserDto(), locationBoxDto);

				/** ロケーションボックス関連マスタ削除. */
				locationManagementService.rlocBoxDelUpdReg(getUserDto(), null, locationBoxDto.getBoxId());
			}

			/** 対象ページ番号(locpageno)に表示する分のレコードだけ取得. */
			if (locationManagementForm.getSrcboxlockey() == null) {
				setBoxListItems(locationManagementService.findByBoxWithInsideMatching(getUserDto().getAccid(), locationManagementForm.getSrcLocBox(), locationManagementForm.getBoxpageno(), PER_PAGE));
			} else {
				setBoxListItems(locationManagementService.findByLocIdWithInsideMatching(getUserDto().getAccid(), locationManagementForm.getSrcboxlockey(), locationManagementForm.getBoxpageno(), PER_PAGE));
			}

			/** レコードの総件数. */
			int totalRecNum = (int) locationManagementService.getCount();

			/** ページリンク文字列作成 */
			locationLink = ListUtil.makePagingLink(BOXLISTURL, Integer.parseInt(locationManagementForm.getBoxpageno()), totalRecNum, PER_PAGE);

			/** 一覧作成 */
			for (MLocationBox item: boxListItems) {
				if (item.getLocKind().equals(LOCATIONKINDPUBLIC)) {
					item.setLocKind(LOCPUBLIC);		// ロケーション種別
				} else {
					item.setLocKind(LOCPRIVATE);	// ロケーション種別
				}
				if (item.getBoxKind().equals(BOXKINDPUBLIC)) {
					item.setBoxKind(BOXPUBLIC);		// ボックス種別
				} else {
					item.setBoxKind(BOXPRIVATE);	// ボックス種別
				}
			}

		}

		LOGGER.debug("boxDelProc...End");

		return GM04;

	}


	/**
	 * ロケーション情報重複登録チェック.
	 * <p>
	 * ロケーション情報の重複登録のチェックを行います。
	 * </p>
	 * @return ActionMessages エラー情報を返す
	 */
	public final ActionMessages locDuplicateValidateConfirm() {
		ActionMessages errors = new ActionMessages();

    	//ロケーション情報の重複登録チェック
    	if (locationManagementService.locationIdExistCheck(locationManagementForm.getLocId())) {
			errors.add("other_err", new ActionMessage(CommonUtil.prefixError("MGS05001001E")));
    	}

		return errors;
	}

	/**
	 * ボックス情報重複登録チェック.
	 * <p>
	 * ボックス情報の重複登録のチェックを行います。
	 * </p>
	 * @return ActionMessages エラー情報を返す
	 */
	public final ActionMessages boxDuplicateValidateConfirm() {
		ActionMessages errors = new ActionMessages();

    	//ボックス情報の重複登録チェック
    	if (locationManagementService.boxIdExistCheck(locationManagementForm.getBoxId())) {
			errors.add("other_err", new ActionMessage(CommonUtil.prefixError("MGS05001002E")));
    	}

		return errors;
	}

	/**
     * Returns the locListItems.
     *
     * @return the locListItems
     */
	public final List<MLocation> getLocListItems() {
		return locListItems;
	}

    /**
     * Sets the locListItems.
     *
     * @param prmLocListItems ロケーション一覧データ
     */
	public final void setLocListItems(final List<MLocation> prmLocListItems) {
		this.locListItems = prmLocListItems;
	}

	/**
     * Returns the boxListItems.
     *
	 * @return boxListItems
	 */
	public final List<MLocationBox> getBoxListItems() {
		return boxListItems;
	}

	/**
     * Sets the boxListItems.
     *
	 * @param prmBoxListItems ボックス一覧データ
	 */
	public final void setBoxListItems(final List<MLocationBox> prmBoxListItems) {
		this.boxListItems = prmBoxListItems;
	}

	/**
     * Returns the locationLink.
     *
     * @return the locationLink
     */
	public final String getLocationLink() {
		return locationLink;
	}

    /**
     * Sets the locationLink.
     *
     * @param prmLocationLink ページリンク文字列 ロケーション一覧
     */
	public final void setLocationLink(final String prmLocationLink) {
		this.locationLink = prmLocationLink;
	}

	/**
     * Returns the locKindStr.
     *
     * @return the locKindStr
     */
	public final String getLocKindStr() {
		return locKindStr;
	}

    /**
     * Sets the locKindStr.
     *
     * @param prmLocKindStr ロケーション種別表示
     */
	public final void setLocKindStr(final String prmLocKindStr) {
		this.locKindStr = prmLocKindStr;
	}

	/**
     * Returns the boxKindStr.
     *
     * @return the boxKindStr
     */
	public final String getBoxKindStr() {
		return boxKindStr;
	}

    /**
     * Sets the boxKindStr.
     *
     * @param prmBoxKindStr ボックス種別表示
     */
	public final void setBoxKindStr(final String prmBoxKindStr) {
		this.boxKindStr = prmBoxKindStr;
	}

	/**
     * Returns the locDetailDisplay.
     *
     * @return the locDetailDisplay
     */
	public final String getLocDetailDisplay() {
		return locDetailDisplay;
	}

    /**
     * Sets the locDetailDisplay.
     *
     * @param prmLocDetailDisplay ロケーション明細画面表示フラグ
     */
	public final void setLocDetailDisplay(final String prmLocDetailDisplay) {
		this.locDetailDisplay = prmLocDetailDisplay;
	}

	/**
     * Returns the locInsDisplay.
     *
     * @return the locInsDisplay
     */
	public final String getLocInsDisplay() {
		return locInsDisplay;
	}

    /**
     * Sets the locInsDisplay.
     *
     * @param prmLocInsDisplay ロケーション登録画面表示フラグ
     */
	public final void setLocInsDisplay(final String prmLocInsDisplay) {
		this.locInsDisplay = prmLocInsDisplay;
	}

	/**
     * Returns the locUpdDisplay.
     *
     * @return the locUpdDisplay
     */
	public final String getLocUpdDisplay() {
		return locUpdDisplay;
	}

    /**
     * Sets the locUpdDisplay.
     *
     * @param prmLocUpdDisplay ロケーション更新画面表示フラグ
     */
	public final void setLocUpdDisplay(final String prmLocUpdDisplay) {
		this.locUpdDisplay = prmLocUpdDisplay;
	}

	/**
     * Returns the locConfirmDisplay.
     *
     * @return the locConfirmDisplay
     */
	public final String getLocConfirmDisplay() {
		return locConfirmDisplay;
	}

    /**
     * Sets the locConfirmDisplay.
     *
     * @param prmLocConfirmDisplay ロケーション登録確認表示フラグ
     */
	public final void setLocConfirmDisplay(final String prmLocConfirmDisplay) {
		this.locConfirmDisplay = prmLocConfirmDisplay;
	}

	/**
     * Returns the boxDetailDisplay.
     *
	 * @return boxDetailDisplay
	 */
	public final String getBoxDetailDisplay() {
		return boxDetailDisplay;
	}

	/**
     * Sets the boxDetailDisplay.
     *
	 * @param prmBoxDetailDisplay ボックス明細画面表示フラグ
	 */
	public final void setBoxDetailDisplay(final String prmBoxDetailDisplay) {
		this.boxDetailDisplay = prmBoxDetailDisplay;
	}

	/**
     * Returns the boxInsDisplay.
     *
	 * @return boxInsDisplay
	 */
	public final String getBoxInsDisplay() {
		return boxInsDisplay;
	}

	/**
     * Sets the boxInsDisplay.
     *
	 * @param prmBoxInsDisplay ボックス登録画面表示フラグ
	 */
	public final void setBoxInsDisplay(final String prmBoxInsDisplay) {
		this.boxInsDisplay = prmBoxInsDisplay;
	}

	/**
     * Returns the boxUpdDisplay.
     *
	 * @return boxUpdDisplay
	 */
	public final String getBoxUpdDisplay() {
		return boxUpdDisplay;
	}

	/**
     * Sets the boxUpdDisplay.
     *
	 * @param prmBoxUpdDisplay ボックス更新画面表示フラグ
	 */
	public final void setBoxUpdDisplay(final String prmBoxUpdDisplay) {
		this.boxUpdDisplay = prmBoxUpdDisplay;
	}

	/**
     * Returns the boxConfirmDisplay.
     *
	 * @return boxConfirmDisplay
	 */
	public final String getBoxConfirmDisplay() {
		return boxConfirmDisplay;
	}

	/**
     * Sets the boxConfirmDisplay.
     *
	 * @param prmBoxConfirmDisplay ボックス更新画面確認表示フラグ
	 */
	public final void setBoxConfirmDisplay(final String prmBoxConfirmDisplay) {
		this.boxConfirmDisplay = prmBoxConfirmDisplay;
	}

	/**
     * Returns the locKindDef.
     *
     * @return the locKindDef
     */
	public final String getLocKindDef() {
		return locKindDef;
	}

	/**
     * Returns the boxKindDef.
     *
     * @return the boxKindDef
     */
	public final String getBoxKindDef() {
		return boxKindDef;
	}

}
