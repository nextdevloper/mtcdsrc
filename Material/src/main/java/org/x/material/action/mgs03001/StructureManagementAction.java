package org.x.material.action.mgs03001;

//import org.seasar.sastruts.example.annotation.Auth;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import org.x.material.action.ActionFrame;
import org.x.material.action.mgs01001.NewsAction;
import org.x.material.common.annotation.Auth;
import org.x.material.common.util.ListUtil;
import org.x.material.condition.MaterialConstants.DefAdminFlg;
import org.x.material.condition.MaterialConstants.MCodeKind;
import org.x.material.entity.MCode;
import org.x.material.entity.MStructAcc;
import org.x.material.form.mgs03001.StructureManagementForm;
import org.x.material.service.CdMstService;
import org.x.material.service.mgs03001.StructureManagementService;

/**
 * 組織管理アクションクラス.
 *
 * @author  nakada
 * @since   20141109.00.01
 * @version 20141109.00.01
 */
public class StructureManagementAction extends ActionFrame {
	/** 画面 - GM01. */
	private static final String GM01 = "structureManagement.jsp";
	/** 画面 - GM02. */
	private static final String GM02 = "structureManagement1.jsp";
	/** 画面 - GM03. */
	private static final String GM03 = "structureManagement2.jsp";
	/** 画面 - GM04. */
	private static final String GM04 = "structureManagement3.jsp";


	/** １ページあたりのレコード数. */
	private static final int PER_PAGE = 5;

	/**
	 * デバッグ・ログ出力設定.
	 */
	private static final Logger LOGGER = Logger.getLogger(NewsAction.class);

	/** アクションフォームの設定情報. **/
    @Resource
    @ActionForm
	private StructureManagementForm structureManagementForm;

	/** コードマスタ情報制御サービス. */
	@Resource
	private CdMstService cdMstService;

    /** 組織管理サービス. */
    @Resource
	private StructureManagementService structureManagementService;

	/** ページリンク文字列 組織情報一覧. */
	private String locationLink;

	/** 組織情報一覧取得url. */
	private static final String STRCTLISTURL = "/Material/mgs03001/StructureManagement/strcturn/";

	/** 組織一覧アイテム. */
	private List<MStructAcc> strctListItems;

    /** 組織種別 (http:options). */
    private List<MCode> strctKindList;

    /** 組織ステータス名称. */
    private String strctStatNm;

    /** 組織種別名称. */
    private String strctKindNm;

    /**
	 * 初期表示.
	 *
	 * @return locationManagement.jsp
	 */
	@Auth
    @Execute(validator = false)
	public final String init() {
		LOGGER.debug("StructureManagementAction...");

		/**
		 * 組織情報の取得
		 */
		// 対象ページ番号(pageno)に表示する分のレコードだけ取得
		setStrctListItems(structureManagementService.findByAccIdWithInsideMatching(super.getUserDto().getAccid(), "1", PER_PAGE));

		// レコードの総件数
		int totalRecNum = (int) structureManagementService.getCount();
		LOGGER.debug("totalRecNum:" + Integer.toString(totalRecNum));

		/** ページリンク文字列作成. */
		locationLink = ListUtil.makePagingLink(STRCTLISTURL, Integer.parseInt("1"), totalRecNum, PER_PAGE);
		LOGGER.debug("link:" + locationLink);

		/** 一覧作成. */
		MCode mcode;
		for (MStructAcc item: strctListItems) {
			mcode = cdMstService.find(MCodeKind.STRUCTKIND.getName(), item.getStructKind());
			item.setStructKind(mcode.getCodeNm());
			mcode = cdMstService.find(MCodeKind.STRUCTSTAT.getName(), item.getStructStat());
			item.setStructStat(mcode.getText1());
		}

		structureManagementForm.setStrpageno("1");	//初期ページ番号の設定

		/**
		 * ヘッダ、サイドメニュー設定.
		 */
		super.getheadmenu();

		LOGGER.debug("StructureManagementAction End");

		return GM01;
    }

    /**
	 * 組織登録リンククリック.
	 *
	 * @return locationManagement1.jsp
	 */
	@Auth
    @Execute(validator = false)
	public final String strctInsProc() {
		LOGGER.debug("strctInsProc...");

		/** 組織情報の取得.対象ページ番号(pageno)に表示する分のレコードだけ取得. */
		setStrctListItems(structureManagementService.findByAccIdWithInsideMatching(super.getUserDto().getAccid(), structureManagementForm.getStrpageno(), PER_PAGE));

		/**  レコードの総件数の取得. */
		int totalRecNum = (int) structureManagementService.getCount();
		LOGGER.debug("totalRecNum:" + Integer.toString(totalRecNum));

		/** 画面情報の初期化. */
		structureManagementForm.initialize();

		/** ページリンク文字列作成. */
		locationLink = ListUtil.makePagingLink(STRCTLISTURL, Integer.parseInt(structureManagementForm.getStrpageno()), totalRecNum, PER_PAGE);
		LOGGER.debug("link:" + locationLink);

		/** 一覧作成. */
		MCode mcode;
		for (MStructAcc item: strctListItems) {
			mcode = cdMstService.find(MCodeKind.STRUCTKIND.getName(), item.getStructKind());
			item.setStructKind(mcode.getCodeNm());
			mcode = cdMstService.find(MCodeKind.STRUCTSTAT.getName(), item.getStructStat());
			item.setStructStat(mcode.getText1());
		}

		/**
		 * ヘッダ、サイドメニュー設定.
		 */
		super.getheadmenu();

		/**
		 * 組織種別リストデータの生成
		 */
		strctKindList = cdMstService.find(MCodeKind.STRUCTKIND.getName());

		LOGGER.debug("strctInsProc End");

		return GM02;
	}

    /**
     * 入力エラー時の登録画面表示(組織登録).
	 * @return locationManagement1.jsp
     */
	@Auth
    @Execute(validator = false)
	public final String backToStrctInput() {
		LOGGER.debug("backToStrctInput...");

		/** 組織情報の取得.対象ページ番号(pageno)に表示する分のレコードだけ取得. */
		setStrctListItems(structureManagementService.findByAccIdWithInsideMatching(super.getUserDto().getAccid(), structureManagementForm.getStrpageno(), PER_PAGE));

		/**  レコードの総件数の取得. */
		int totalRecNum = (int) structureManagementService.getCount();
		LOGGER.debug("totalRecNum:" + Integer.toString(totalRecNum));

		/** ページリンク文字列作成. */
		locationLink = ListUtil.makePagingLink(STRCTLISTURL, Integer.parseInt(structureManagementForm.getStrpageno()), totalRecNum, PER_PAGE);
		LOGGER.debug("link:" + locationLink);

		/** 一覧作成. */
		MCode mcode;
		for (MStructAcc item: strctListItems) {
			mcode = cdMstService.find(MCodeKind.STRUCTKIND.getName(), item.getStructKind());
			item.setStructKind(mcode.getCodeNm());
			mcode = cdMstService.find(MCodeKind.STRUCTSTAT.getName(), item.getStructStat());
			item.setStructStat(mcode.getText1());
		}

		/**
		 * 組織種別ラジオボタンのデータの生成
		 */
		strctKindList = cdMstService.find(MCodeKind.STRUCTKIND.getName());

		/**
		 * ヘッダ、サイドメニュー設定.
		 */
		super.getheadmenu();

		LOGGER.debug("backToStrctInput End");

		return GM02;
    }

	/**
	 * 組織登録：登録ボタンクリック.
	 *
	 * @return locationManagement2.jsp
	 */
	@Auth
    @Execute(validate = "strctValidateConfirm", input = "backToStrctInput")
	public final String strctInsCheck() {
		LOGGER.debug("strctInsCheck...");

		/** 組織情報の取得.対象ページ番号(pageno)に表示する分のレコードだけ取得. */
		setStrctListItems(structureManagementService.findByAccIdWithInsideMatching(super.getUserDto().getAccid(), structureManagementForm.getStrpageno(), PER_PAGE));

		/**  レコードの総件数の取得. */
		int totalRecNum = (int) structureManagementService.getCount();
		LOGGER.debug("totalRecNum:" + Integer.toString(totalRecNum));

		/** ページリンク文字列作成. */
		locationLink = ListUtil.makePagingLink(STRCTLISTURL, Integer.parseInt(structureManagementForm.getStrpageno()), totalRecNum, PER_PAGE);
		LOGGER.debug("link:" + locationLink);

		/** 一覧作成. */
		MCode mcode;
		for (MStructAcc item: strctListItems) {
			mcode = cdMstService.find(MCodeKind.STRUCTKIND.getName(), item.getStructKind());
			item.setStructKind(mcode.getCodeNm());
			mcode = cdMstService.find(MCodeKind.STRUCTSTAT.getName(), item.getStructStat());
			item.setStructStat(mcode.getText1());
		}

		/** ヘッダ、サイドメニュー設定. */
		super.getheadmenu();

    	/** 組織ステータスの表示文字列の取得. */
    	MCode strctStatusInfo = cdMstService.find(MCodeKind.STRUCTSTAT.getName(), structureManagementForm.getStrctStatus());
    	setStrctStatNm(strctStatusInfo.getText1());

		/** 組織種別の種別名の取得. */
		MCode strctKindInfo = cdMstService.find(MCodeKind.STRUCTKIND.getName(), structureManagementForm.getStrctKind());
		setStrctKindNm(strctKindInfo.getCodeNm());

		LOGGER.debug("strctInsCheck End");

		return GM03;
	}

	/**
	 * 組織登録：確認ボタンクリック.
	 *
	 * @return locationManagement.jsp
	 */
	@Auth
    @Execute(validator = true, input = "backToStrctInput")
	public final String strctInsReg() {
		LOGGER.debug("strctInsReg...");

		/** 組織情報の取得.対象ページ番号(pageno)に表示する分のレコードだけ取得. */
		setStrctListItems(structureManagementService.findByAccIdWithInsideMatching(super.getUserDto().getAccid(), structureManagementForm.getStrpageno(), PER_PAGE));

		/**  レコードの総件数の取得. */
		int totalRecNum = (int) structureManagementService.getCount();
		LOGGER.debug("totalRecNum:" + Integer.toString(totalRecNum));

		/** ページリンク文字列作成. */
		locationLink = ListUtil.makePagingLink(STRCTLISTURL, Integer.parseInt(structureManagementForm.getStrpageno()), totalRecNum, PER_PAGE);
		LOGGER.debug("link:" + locationLink);

		/** 一覧作成. */
		MCode mcode;
		for (MStructAcc item: strctListItems) {
			mcode = cdMstService.find(MCodeKind.STRUCTKIND.getName(), item.getStructKind());
			item.setStructKind(mcode.getCodeNm());
			mcode = cdMstService.find(MCodeKind.STRUCTSTAT.getName(), item.getStructStat());
			item.setStructStat(mcode.getText1());
		}

		/**
		 * ヘッダ、サイドメニュー設定.
		 */
		super.getheadmenu();

		/** 組織情報登録. */
		structureManagementService.strctInsReg(structureManagementForm, super.getUserDto());

		/** 組織所属情報登録. */
		structureManagementService.rstrctInsReg(structureManagementForm, super.getUserDto(), DefAdminFlg.ADMIN.getVal());

		LOGGER.debug("strctInsReg End");


		return GM01;
	}

    /**
	 * 組織詳細リンククリック.
	 *
	 * @return locationManagement3.jsp
	 */
	@Auth
    @Execute(validator = false)
	public final String strctDetailSearch() {
		LOGGER.debug("strctDetailSearch...");

		/**
		 * ヘッダ、サイドメニュー設定.
		 */
		super.getheadmenu();

		/** 組織情報の取得.対象ページ番号(pageno)に表示する分のレコードだけ取得. */
		setStrctListItems(structureManagementService.findByAccIdWithInsideMatching(super.getUserDto().getAccid(), structureManagementForm.getStrpageno(), PER_PAGE));

		/**  レコードの総件数の取得. */
		int totalRecNum = (int) structureManagementService.getCount();
		LOGGER.debug("totalRecNum:" + Integer.toString(totalRecNum));

		/** 画面情報の初期化. */
		structureManagementForm.initialize();

		/** ページリンク文字列作成. */
		locationLink = ListUtil.makePagingLink(STRCTLISTURL, Integer.parseInt(structureManagementForm.getStrpageno()), totalRecNum, PER_PAGE);
		LOGGER.debug("link:" + locationLink);

		/** 一覧作成. */
		MCode mcode;
		for (MStructAcc item: strctListItems) {
			mcode = cdMstService.find(MCodeKind.STRUCTKIND.getName(), item.getStructKind());
			item.setStructKind(mcode.getCodeNm());
			mcode = cdMstService.find(MCodeKind.STRUCTSTAT.getName(), item.getStructStat());
			item.setStructStat(mcode.getText1());
		}

		/**
		 * 組織種別リストデータの生成
		 */
		strctKindList = cdMstService.find(MCodeKind.STRUCTKIND.getName());

		/** 組織情報取得 */
		MStructAcc rec = structureManagementService.findByStrctIdAndAccId(structureManagementForm.getStrctkey(),
																		   super.getUserDto().getAccid());

		structureManagementForm.setStrctId(rec.getStrctId());
//		structureManagementForm.setStrctId(rec.getStrctId());


		LOGGER.debug("strctInsProc End");

		return GM04;
	}

	/**
     * Returns the locationLink.
     *
	 * @return locationLink
	 */
	public final String getLocationLink() {
		return locationLink;
	}

	/**
     * Sets the locationLink.
	 * @param prmLocationLink セットする locationLink
	 */
	public final void setLocationLink(final String prmLocationLink) {
		this.locationLink = prmLocationLink;
	}

	/**
     * Returns the strctListItems.
     *
	 * @return strctListItems
	 */
	public final List<MStructAcc> getStrctListItems() {
		return strctListItems;
	}


	/**
     * Sets the strctListItems.
	 * @param prmStrctListItems セットする strctListItems
	 */
	public final void setStrctListItems(final List<MStructAcc> prmStrctListItems) {
		this.strctListItems = prmStrctListItems;
	}

	/**
     * Returns the strctKindList.
	 * @return strctKindList
	 */
	public final List<MCode> getStrctKindList() {
		return strctKindList;
	}

	/**
     * Sets the strctKindList.
	 * @param prmStrctKindList セットする strctKindList
	 */
	public final void setStrctKindList(final List<MCode> prmStrctKindList) {
		this.strctKindList = prmStrctKindList;
	}

	/**
     * Returns the strctStatNm.
	 * @return strctStatNm
	 */
	public final String getStrctStatNm() {
		return strctStatNm;
	}

	/**
     * Sets the strctStatNm.
	 * @param prmStrctStatNm セットする strctStatNm
	 */
	public final void setStrctStatNm(final String prmStrctStatNm) {
		this.strctStatNm = prmStrctStatNm;
	}

	/**
     * Returns the strctKindNm.
	 * @return strctKindNm
	 */
	public final String getStrctKindNm() {
		return strctKindNm;
	}

	/**
     * Sets the strctKindNm.
	 * @param prmStrctKindNm 組織種別名称をセットする strctKindNm
	 */
	public final void setStrctKindNm(final String prmStrctKindNm) {
		this.strctKindNm = prmStrctKindNm;
	}

}