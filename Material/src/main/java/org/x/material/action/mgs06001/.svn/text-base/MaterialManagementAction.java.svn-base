package org.x.material.action.mgs06001;

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
import org.x.material.common.annotation.Auth;
import org.x.material.common.util.CommonUtil;
import org.x.material.common.util.DateUtil;
import org.x.material.common.util.ListUtil;
import org.x.material.condition.MaterialConstants.IdKind;
import org.x.material.condition.MaterialConstants.MCodeKind;
import org.x.material.dto.BoxMaterialDto;
import org.x.material.dto.LocationBoxDto;
import org.x.material.dto.LocationDto;
import org.x.material.dto.UserDto;
import org.x.material.entity.MAccount;
import org.x.material.entity.MBoxMaterial;
import org.x.material.entity.MCode;
import org.x.material.entity.MLocation;
import org.x.material.entity.MLocationBox;
import org.x.material.entity.TMsgSendNews;
import org.x.material.entity.TMsgSendResult;
import org.x.material.form.mgs06001.MaterialManagementForm;
import org.x.material.service.CdMstService;
import org.x.material.service.LeftSideMenuService;
import org.x.material.service.NumberingService;
import org.x.material.service.mgs06001.MaterialManagementService;

/**
 * マテリアル管理_ボックス管理アクションクラス.
 *
 * @author  hirano.koichi
 * @since   20141109.00.01
 * @version 20150115.00.01
 */
public class MaterialManagementAction {
// TODO
// ページリンクを登録/修正時に表示にする。
// データクリアが正常に終了しない
// マテリアルの削除機能が未実装
// ロケーション複数選択削除時にエラーとなるため、暫定的に削除フラグを見ないように変更
// ロケーションオーナー変更後、非公開でも詳細情報が表示され、更新可能
// 上更新できないようにする。
// ロケーションを公開に変更できない。
// 検索キーの定義がおかしい。
	
	// {{ 000-01 変数定義_画面共通情報
	
	/** １ページあたりのレコード数. */
	private static final int PER_PAGE = 5;

	/** 検索条件種別（ロケーション）. */
	private static final String SRCKINDLOCATION = "1";

	/** 検索条件種別（ボックス）. */
	private static final String SRCKINDBOX = "2";

	/** 検索条件種別（マテリアル）. */
	private static final String SRCKINDMATERIAL = "3";

	/** ブロック表示. */
	private static final String DISPLAYBLOCK = "block";

	/** ブロック非表示. */
	private static final String DISPLAYNONE = "none";

	/** ロケーション種別表示 非公開. */
	private static final String LOCPRIVATE = "非公開";

	/** ロケーション種別表示 公開. */
	private static final String LOCPUBLIC = "公開";

	/** ボックス種別表示 非公開. */
	private static final String BOXPRIVATE = "非公開";

	/** ボックス種別表示 公開. */
	private static final String BOXPUBLIC = "公開";

	/** マテリアル種別表示 非公開. */
	private static final String MATERIALPRIVATE = "非公開";

	/** マテリアル種別表示 公開. */
	private static final String MATERIALPUBLIC = "公開";
	
	/** ロケーション一覧取得url. */
	private static final String LOCLISTURL      = "/Material/mgs06001/materialManagement/locturn/";

	/** ボックス一覧取得url. */
	private static final String BOXLISTURL      = "/Material/mgs06001/materialManagement/boxturn/";

	/** マテリアル一覧取得url. */
	private static final String MATERIALLISTURL = "/Material/mgs06001/materialManagement/materialturn/";

	/** ページリンク文字列 ロケーション一覧. */
	private String locationLink;

//	/** 検索キー. */
//	private String srcKey;

	// }}
	// {{ 000-02 変数定義_初期表示画面
	
	/** 初期表示/ロケーション管理画面 - GM01. */
	private static final String GM01 = "materialManagement.jsp";

	/** ボックス管理画面 - GM02. */
	private static final String GM02 = "materialManagement2.jsp";

	/** マテリアル更新画面 - GM03. */
	private static final String GM03 = "materialManagement3.jsp";


	// }}
	// {{ 000-03 変数定義その他

	/** ユーザ情報. */
	@Resource
	private UserDto userDto;

	/** ロケーション情報. */
	@Resource
	private LocationDto locationDto;

	/** ロケーションボックス情報. */
	@Resource
	private LocationBoxDto locationBoxDto;

	/** ボックスマテリアル情報. */
	@Resource
	private BoxMaterialDto boxMaterialDto;

	/** アクションフォームの設定情報. **/
	@Resource
	@ActionForm
	private MaterialManagementForm materialManagementForm;

	/** マテリアル管理サービス. **/
	@Resource
	private MaterialManagementService materialManagementService;

	/** ロケーション一覧データ. */
	private List<MLocation> locListItems;

	/** ボックス一覧データ. */
	private List<MLocationBox> boxListItems;

	/** マテリアル一覧データ. */
	private List<MBoxMaterial> matListItems;

	/** ロケーション種別表示. */
	private String locKindStr;

	/** ボックス種別表示. */
	private String boxKindStr;

	/** マテリアル種別1表示. */
	private String matKind1Str;

	/** サイドメニュー編集サービス. */
	@Resource
	private LeftSideMenuService leftSideMenuService;

	/** アカウント名. */
	private String userNameKnjLabel;

	/** 結果報告 日付. */
	private String resultMsgDate;
	
	/** 結果報告 一覧. */
	private List<TMsgSendResult> resultItems;

	/** 運営からのお知らせ 日付. */
	private String newsMsgDate;
	
	/** 運営からのお知らせ 一覧. */
	private List<TMsgSendNews> newsItems;

	/** コードマスタ情報制御サービス. */
	@Resource
	private CdMstService cdMstService;
	
	/** 採番管理サービス. */
	@Resource
	private NumberingService numberingService;
	
	/** 結果メッセージ画面表示フラグ. */
	private String resultDisplay;
	
	/** ロケーション明細画面表示フラグ. */
	private String locDetailDisplay;

	/** ロケーション登録画面表示フラグ. */
	private String locInsDisplay;

	/** ロケーション登録画面確認表示フラグ. */
	private String locInsConfirmDisplay;

	/** ロケーション更新画面表示フラグ. */
	private String locUpdDisplay;

	/** ロケーション更新画面確認表示フラグ. */
	private String locUpdConfirmDisplay;

	/** ボックス明細画面表示フラグ. */
	private String boxDetailDisplay;

	/** ボックス登録画面表示フラグ. */
	private String boxInsDisplay;

	/** ボックス登録画面確認表示フラグ. */
	private String boxInsConfirmDisplay;

	/** ボックス更新画面表示フラグ. */
	private String boxUpdDisplay;

	/** ボックス更新画面確認表示フラグ. */
	private String boxUpdConfirmDisplay;

	/** マテリアル明細画面表示フラグ. */
	private String matDetailDisplay;

	/** マテリアル登録画面表示フラグ. */
	private String matInsDisplay;

	/** マテリアル登録画面確認表示フラグ. */
	private String matInsConfirmDisplay;
	
	/** マテリアル更新画面表示フラグ. */
	private String matUpdDisplay;

	/** マテリアル更新画面確認表示フラグ. */
	private String matUpdConfirmDisplay;
	
	/** ページリンク表示フラグ. */
	private String pagelinkDisplay;

	/** ロケーション種別チェックボックスvalue値. */
	private String locKindDef;

	/** ボックス種別チェックボックスvalue値. */
	private String boxKindDef;

	/** マテリアル種別チェックボックスvalue値. */
	private String matKind1Def;
	
	/**
	 * デバッグ・ログ出力設定.
	 */
	private static final Logger LOGGER = Logger.getLogger(MaterialManagementAction.class);
// }}
	// {{ 000.初期表示
    /**
	 * 初期表示.
	 *
	 * @return materialManagement.jsp
	 */
	@Auth
    @Execute(validator = false)
	public final String init() {
		LOGGER.debug("MaterialManagementAction...");
		
		/**
		 * 初期化
		 */
		dataClear();
		materialManagementForm.initialize();
		
		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		/** ロケーション検索. */
		materialManagementForm.setMaterial(SRCKINDLOCATION);	// 検索条件にロケーションを選択

		/** ロケーション検索結果一覧作成 */
		makeLocList();

		materialManagementForm.setLocpageno("1");	//初期ページ番号の設定

		/** 画面表示設定. */
//		setAddDisplay(DISPLAYBLOCK);		// 追加リンクの表示設定
		setLocDetailDisplay(DISPLAYNONE);	// ロケーション明細の表示設定
		setLocInsDisplay(DISPLAYNONE);		// ロケーション更新登録画面の表示設定
		setLocInsConfirmDisplay(DISPLAYNONE);	// ロケーション確認画面の表示設定
		setLocUpdDisplay(DISPLAYNONE);		// ロケーション更新登録画面の表示設定
		setLocUpdConfirmDisplay(DISPLAYNONE);	// ロケーション確認画面の表示設定
		
		LOGGER.debug("MaterialManagementAction End");

		return GM01;
    }
	// }}
	// {{ 100.検索系
	/**
	 * 照会表示.
	 * @return materialManagement1.jsp
	 */
	@Auth
	@Execute(validator = false)
	public final String regSearch() {
		
		/** 返却値定義 */
		String retinfo;
		LOGGER.debug("regSearch...");

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		try {
			if (materialManagementForm.getMaterial().equals(SRCKINDLOCATION)) {
				/** ロケーション検索 */
				/** 検索条件設定 */
				materialManagementForm.setSrcLocKey(materialManagementForm.getSrcKey());
				materialManagementForm.setSrcBoxKey(null);
				materialManagementForm.setSrcMatKey(null);
				/** ロケーション検索結果一覧作成 */
				makeLocList();

				/** 画面表示設定. */
				setLocDetailDisplay(DISPLAYNONE);
				setLocInsDisplay(DISPLAYNONE);
				setLocInsConfirmDisplay(DISPLAYNONE);
				setLocUpdDisplay(DISPLAYNONE);
				setLocUpdConfirmDisplay(DISPLAYNONE);
				retinfo = GM01;	// ロケーション一覧指定
				
			} else if (materialManagementForm.getMaterial().equals(SRCKINDBOX)) {
				/** ロケーション検索 */
				/** 検索条件設定 */
				materialManagementForm.setSrcLocKey(null);
				materialManagementForm.setSrcBoxKey(materialManagementForm.getSrcKey());
				materialManagementForm.setSrcMatKey(null);
				/** ボックス検索結果一覧作成 */
				makeBoxList();
				
				/** 画面表示設定. */
				setBoxDetailDisplay(DISPLAYNONE);
				setBoxInsDisplay(DISPLAYNONE);
				setBoxInsConfirmDisplay(DISPLAYNONE);
				setBoxUpdDisplay(DISPLAYNONE);
				setBoxUpdConfirmDisplay(DISPLAYNONE);
				retinfo = GM02;	// ボックス一覧指定
				
			} else if (materialManagementForm.getMaterial().equals(SRCKINDMATERIAL)) {
				/** マテリアル検索 */
				/** 検索条件設定 */
				materialManagementForm.setSrcLocKey(null);
				materialManagementForm.setSrcBoxKey(null);
				materialManagementForm.setSrcMatKey(materialManagementForm.getSrcKey());
				/** マテリアル検索結果一覧作成 */
				makeMatList();
				/** 画面表示設定. */
				setBoxDetailDisplay(DISPLAYNONE);
				setBoxInsDisplay(DISPLAYNONE);
				setBoxInsConfirmDisplay(DISPLAYNONE);
				setBoxUpdDisplay(DISPLAYNONE);
				setBoxUpdConfirmDisplay(DISPLAYNONE);
				retinfo = GM03;	// マテリアル一覧指定
				
			} else {
				/** 想定外 */
				throw new ActionMessagesException("errors.noitem");
				
			}
		} catch (NoResultException e) {
			//エラーメッセージをセットします。
			throw new ActionMessagesException("errors.noitem");
		}
		
		materialManagementForm.setResultMsg("");		// 結果メッセージクリア
		materialManagementForm.setResultListMsg("");	// 結果メッセージクリア
		materialManagementForm.setResultDelMsg("");		// 結果メッセージクリア
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
		
		LOGGER.debug("locturn...");
		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		/** ロケーション検索結果一覧作成 */
		makeLocList();
		
		/** 画面表示設定. */
		setLocDetailDisplay(DISPLAYNONE);			// ロケーション明細の表示設定
		setLocInsDisplay(DISPLAYNONE);				// ロケーション登録画面の表示設定
		setLocInsConfirmDisplay(DISPLAYNONE);		// ロケーション登録確認画面の表示設定
		setLocUpdDisplay(DISPLAYNONE);				// ロケーション更新登録画面の表示設定
		setLocUpdConfirmDisplay(DISPLAYNONE);		// ロケーション確認画面の表示設定
		materialManagementForm.setResultMsg("");	// 結果メッセージクリア
		materialManagementForm.setResultListMsg("");	// 結果メッセージクリア
		materialManagementForm.setResultDelMsg("");		// 結果メッセージクリア
		
		LOGGER.debug("locturn...End");
		return GM01;
	}

	/**
	 * ページング表示(ボックス）.
	 * @return locationManagement4.jsp
	 */
	@Auth
	@Execute(validator = false, urlPattern = "boxturn/{boxpageno}")
	public final String boxturn() {
		
		LOGGER.debug("boxturn...");
		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		/** ボックス検索結果一覧作成 */
		makeBoxList();
		
		/** 画面表示設定. */
		setBoxDetailDisplay(DISPLAYNONE);			// ボックス明細の表示設定
		setBoxInsDisplay(DISPLAYNONE);				// ボックス登録画面の表示設定
		setBoxInsConfirmDisplay(DISPLAYNONE);		// ボックス登録確認画面の表示設定
		setBoxUpdDisplay(DISPLAYNONE);				// ボックス更新画面の表示設定
		setBoxUpdConfirmDisplay(DISPLAYNONE);		// ボックス更新確認画面の表示設定
		materialManagementForm.setResultMsg("");	// 結果メッセージクリア
		materialManagementForm.setResultListMsg("");	// 結果メッセージクリア
		materialManagementForm.setResultDelMsg("");		// 結果メッセージクリア

		LOGGER.debug("boxturn...End");
		return GM02;

	}

	/**
	 * ページング表示（マテリアル）.
	 * @return locationManagement8.jsp
	 */
	@Auth
	@Execute(validator = false, urlPattern = "matturn/{matpageno}")
	public final String matturn() {
		
		LOGGER.debug("matturn...");
		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		/** マテリアル検索結果一覧作成 */
		makeMatList();
		
		/** 画面表示設定. */
		setMatDetailDisplay(DISPLAYNONE);		// 明細の表示設定
		setMatInsDisplay(DISPLAYNONE);			// 登録画面の表示設定
		setMatInsConfirmDisplay(DISPLAYNONE);	// 登録確認画面の表示設定
		setMatUpdDisplay(DISPLAYNONE);			// 更新画面の表示設定
		setMatUpdConfirmDisplay(DISPLAYNONE);	// 更新確認画面の表示設定
		materialManagementForm.setResultMsg("");	// 結果メッセージクリア
		materialManagementForm.setResultListMsg("");	// 結果メッセージクリア
		materialManagementForm.setResultDelMsg("");		// 結果メッセージクリア
		
		LOGGER.debug("matturn...End");
		
		return GM03;
	}
	

	/**
	 * ボックス検索.
	 * ロケーションに登録されているボックスの一覧表示
	 *
	 * @return locationManagement4.jsp
	 */
	@Auth
	@Execute(validator = false)
	public final String boxSearch() {
		
		LOGGER.debug("boxSearch...");
		
		// ボックス検索結果一覧作成
		makeBoxList();
		
		setBoxDetailDisplay(DISPLAYNONE);		// 明細の表示設定
		setBoxInsDisplay(DISPLAYNONE);			// 登録画面の表示設定
		setBoxInsConfirmDisplay(DISPLAYNONE);	// 登録確認画面の表示設定
		setBoxUpdDisplay(DISPLAYNONE);			// 更新画面の表示設定
		setBoxUpdConfirmDisplay(DISPLAYNONE);	// 更新確認画面の表示設定
		materialManagementForm.setResultMsg("");	// 結果メッセージクリア
		materialManagementForm.setResultListMsg("");	// 結果メッセージクリア
		materialManagementForm.setResultDelMsg("");		// 結果メッセージクリア
		
		LOGGER.debug("boxSearch...End");
		return GM02;
	}
	
	/**
	 * マテリアル検索.
	 * ボックスに登録されているマテリアルの一覧表示
	 *
	 * @return locationManagement9.jsp
	 */
	@Auth
	@Execute(validator = false)
	public final String matSearch() {

		LOGGER.debug("matSearch...");
		
		// マテリアル検索結果一覧作成
		makeMatList();
		
		/** 画面表示設定. */
		setMatDetailDisplay(DISPLAYNONE);		// 明細の表示設定
		setMatInsDisplay(DISPLAYNONE);			// 登録画面の表示設定
		setMatInsConfirmDisplay(DISPLAYNONE);	// 登録確認画面の表示設定
		setMatUpdDisplay(DISPLAYNONE);			// 更新画面の表示設定
		setMatUpdConfirmDisplay(DISPLAYNONE);	// 更新確認画面の表示設定
		materialManagementForm.setResultMsg("");	// 結果メッセージクリア
		materialManagementForm.setResultListMsg("");	// 結果メッセージクリア
		materialManagementForm.setResultDelMsg("");		// 結果メッセージクリア
		
		LOGGER.debug("matSearch...End");
		
		return GM03;
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
		LOGGER.debug("key:" + materialManagementForm.getSrcLocKey());
		materialManagementForm.setResultMsg("");	// 結果メッセージクリア
		materialManagementForm.setResultListMsg("");	// 結果メッセージクリア
		materialManagementForm.setResultDelMsg("");		// 結果メッセージクリア
		
		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		/** ロケーション検索結果一覧作成 */
		makeLocList();
		
		/** 他オーナー非公開ロケーションチェック. */
		if(materialManagementService.otherLocOnrIdPrivateExistCheck(
				userDto, materialManagementForm.getSrcLocKey())){
			/** ロケーション・ボックス詳細検索結果取得. */
			makeLocationDetail(materialManagementForm.getSrcLocKey());
			setLocDetailDisplay(DISPLAYBLOCK);
			
		}else{
			//TODO メッセージ化
			materialManagementForm.setResultListMsg("他オーナー非公開で登録、更新、もしくは存在しないため結果を取得できません");	// 非公開メッセージ
			setLocDetailDisplay(DISPLAYNONE);	// 明細の表示設定
		}

		/** 画面表示設定. */
		setLocInsDisplay(DISPLAYNONE);		// ロケーション登録画面の表示設定
		setLocInsConfirmDisplay(DISPLAYNONE);	// 確認画面の表示設定
		setLocUpdDisplay(DISPLAYNONE);		// ロケーション登録画面の表示設定
		setLocUpdConfirmDisplay(DISPLAYNONE);	// 確認画面の表示設定

		LOGGER.debug("locDetailSearch...End");

		return GM01;

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
		LOGGER.debug("key:" + materialManagementForm.getSrcBoxKey());
		materialManagementForm.setResultMsg("");	// 結果メッセージクリア
		materialManagementForm.setResultListMsg("");	// 結果メッセージクリア
		materialManagementForm.setResultDelMsg("");		// 結果メッセージクリア

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		/** ボックス検索結果一覧作成 */
		makeBoxList();

		/** 他オーナー非公開ロケーションチェック. */
		if(materialManagementService.otherBoxOnrIdPrivateExistCheck(
				userDto, materialManagementForm.getSrcBoxKey())){
			/** ロケーション・ボックス詳細検索結果取得. */
			makeLocationBoxDetail(materialManagementForm.getSrcBoxKey());
			setBoxDetailDisplay(DISPLAYBLOCK);	// 明細の表示設定
			
		}else{
			//TODO メッセージ化
			materialManagementForm.setResultListMsg("他オーナー非公開で登録、更新、もしくは存在しないため結果を取得できません");	// 非公開メッセージ
			setBoxDetailDisplay(DISPLAYNONE);	// 明細の表示設定
		}
		/** 画面表示設定. */
		setBoxInsConfirmDisplay(DISPLAYNONE);		// ボックス登録確認画面の表示設定
		setBoxInsDisplay(DISPLAYNONE);				// ボックス登録画面の表示設定
		setBoxUpdDisplay(DISPLAYNONE);				// ボックス更新登録画面の表示設定
		setBoxUpdConfirmDisplay(DISPLAYNONE);		// ボックス更新確認画面の表示設定

		LOGGER.debug("boxDetailSearch...End");
		
		return GM02;

	}

	/**
	 * マテリアル明細表示.
	 *
	 * @return locationManagement11.jsp
	 */
	@Auth
	@Execute(validator = false)
	public final String matDetailSearch() {
		LOGGER.debug("matDetailSearch...");
		LOGGER.debug("key:" + materialManagementForm.getSrcMatKey());
		materialManagementForm.setResultMsg("");	// 結果メッセージクリア
		materialManagementForm.setResultListMsg("");	// 結果メッセージクリア
		materialManagementForm.setResultDelMsg("");		// 結果メッセージクリア

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();
		
		/** マテリアル検索結果一覧作成 */
		makeMatList();
		
		/** 他オーナー非公開マテリアルチェック. */
		if(materialManagementService.otherMatOnrIdPrivateExistCheck(
				userDto, materialManagementForm.getSrcMatKey())){
			/** ロケーション・ボックス詳細検索結果取得. */
			makeBoxMaterialDetail(materialManagementForm.getSrcMatKey());
			setMatDetailDisplay(DISPLAYBLOCK);	// 明細の表示設定
			
		}else{
			//TODO メッセージ化
			materialManagementForm.setResultListMsg("他オーナー非公開で登録、更新、もしくは存在しないため結果を取得できません");	// 非公開メッセージ
			setMatDetailDisplay(DISPLAYNONE);	// 明細の表示設定
		}
////TODO 後で別のメソッド化
//		/** マテリアル情報取得. */
//		MBoxMaterial rec = materialManagementService.findByMatId(materialManagementForm.getSrcKey());
//
//		boxMaterialDto.setBoxMaterialInf(rec);
//		
//		/** ロケーション・ボックス情報取得. */
//		MLocationBox rec2 = materialManagementService.findByBoxId(rec.getBoxId());
//		locationBoxDto.setLocationBoxInf(rec2);
//
//		//TODO
///*		boxKindDef = BOXKINDPUBLIC;									// ボックス種別チェックボックスvalue値
//		materialManagementForm.setBoxId(rec.getBoxId());			// ボックスID
//		materialManagementForm.setBoxOnrId(rec.getBoxOnrId());		// ボックスオーナーID
//		materialManagementForm.setBoxNm(rec.getBoxNm());			// ボックス名
//		if (rec.getBoxKind().equals(BOXKINDPUBLIC)) {
//			this.setBoxKindStr(BOXPUBLIC);							// ボックス種別
//			materialManagementForm.setBoxKind(CHECKON);
//		} else {
//			this.setBoxKindStr(BOXPRIVATE);							// ボックス種別
//			materialManagementForm.setBoxKind(CHECKOFF);
//		}
//*/
//		//TODO 排他制御
//		
//		materialManagementForm.setMatId(rec.getMtId());			// ボックスID
//		materialManagementForm.setMatNm(rec.getMtNm());			// ボックス名
//		LOGGER.debug("test11"+rec.getMtId());
//		if (rec.getMtKind1().equals(MATERIALKINDPUBLIC)) {
//			this.setMatKind1Str(MATERIALKINDPUBLIC);							// ボックス種別
//			materialManagementForm.setMatKind1(CHECKON);
//		} else {
//			this.setMatKind1Str(MATERIALKINDPUBLIC);							// ボックス種別
//			materialManagementForm.setMatKind1(CHECKOFF);
//		}
//		// 追加タグA
//		materialManagementForm.setTagA(rec.getTagA());				// 追加タグA
//		// 追加タグB
//		materialManagementForm.setTagB(rec.getTagB());				// 追加タグB

		/** 画面表示設定. */
		setMatDetailDisplay(DISPLAYBLOCK);		// 明細の表示設定
		setMatInsDisplay(DISPLAYNONE);			// 登録画面の表示設定
		setMatInsConfirmDisplay(DISPLAYNONE);	// 登録確認画面の表示設定
		setMatUpdDisplay(DISPLAYNONE);			// 更新画面の表示設定
		setMatUpdConfirmDisplay(DISPLAYNONE);	// 更新確認画面の表示設定

		LOGGER.debug("matDetailSearch...End");
		
		return GM03;

	}
	// }}
	// {{ 110.登録系

	/**
	 * ロケーション登録初期画面.
	 *
	 * @return locationManagement3.jsp
	 */
	@Auth
	@Execute(validator = false)
	public final String locInsProc() {
		LOGGER.debug("locInsProc...");
		
    	/** 明細入力初期化 */
		materialManagementForm.detailClear();
    
		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		/** ロケーション検索結果一覧作成 */
		makeLocList();
		
		/** １．ロケーション情報設定*/
		/** ロケーションＩＤの発番 */
		materialManagementForm.setLocId(numberingService.getIdNumbering(IdKind.LOCATION.getName()));
		
		/** ロケーションオーナーＩＤの設定. */
		materialManagementForm.setLocOnrId(userDto.getAccid());
		
		/** 画面表示設定. */
		setLocDetailDisplay(DISPLAYNONE);		// ロケーション詳細画面の表示設定
		setLocInsDisplay(DISPLAYBLOCK);			// ロケーション登録画面の表示設定
		setLocInsConfirmDisplay(DISPLAYNONE);	// 確認画面の表示設定
		setLocUpdDisplay(DISPLAYNONE);			// ロケーション登録画面の表示設定
		setLocUpdConfirmDisplay(DISPLAYNONE);	// 確認画面の表示設定
		
		//TODO メッセージファイル化
		materialManagementForm.setResultMsg("ロケーション情報を入力してください。");	// 結果メッセージ設定
		
		LOGGER.debug("locInsProc...");
		
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

    	/** 明細入力初期化 */
		materialManagementForm.detailClear();

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();
		
		/** ボックス検索結果一覧作成 */
		makeBoxList();
		
		/** １．ロケーション情報設定*/
		/** ロケーション初期値設定（検索キーがない場合は、仮想値を設定） */
		/** ロケーション検索キー. */
		if (materialManagementForm.getSrcLocKey() == null) {
			materialManagementForm.setSrcLocKey("0");
		}
		/** ロケーション情報取得. */
		MLocation rec = materialManagementService.findByLocId(materialManagementForm.getSrcLocKey());
		
		/** ロケーション情報設定. */
		materialManagementForm.setLocId(rec.getLocId());			// ロケーションID
		materialManagementForm.setLocNm(rec.getLocNm());			// ロケーション名称
		/** ロケーション種別. */
		if (rec.getLocKind().equals(LOCATIONKINDPUBLIC)) {
			this.setLocKindStr(LOCPUBLIC);							//ロケーション種別_公開
		} else {
			this.setLocKindStr(LOCPRIVATE);							//ロケーション種別_非公開
		}
		
		/** ２．ボックス情報設定*/
		/** ボックスＩＤの発番. */
		materialManagementForm.setBoxId(numberingService.getIdNumbering(IdKind.BOX.getName()));
		/** ボックスオーナーＩＤの設定. */
		materialManagementForm.setBoxOnrId(userDto.getAccid());		// ボックスオーナーID
		
		/** 画面表示設定. */
		setBoxDetailDisplay(DISPLAYNONE);
		setBoxInsConfirmDisplay(DISPLAYNONE);
		setBoxInsDisplay(DISPLAYBLOCK);
		setBoxUpdDisplay(DISPLAYNONE);
		setBoxUpdConfirmDisplay(DISPLAYNONE);
		//TODO メッセージファイル化
		materialManagementForm.setResultMsg("ボックス情報を入力してください。");	// 結果メッセージ設定
		
		LOGGER.debug("boxInsProc...End");

		return GM02;

	}
	
	/**
	 * マテリアル登録初期画面.
	 *
	 * @return materialManagement9.jsp
	 * @remarks ロケーション、ボックスがないときには、仮想に割り当てる。
	 */
	@Auth
	@Execute(validator = false)
	public final String matInsProc() {

		LOGGER.debug("matInsProc...");
		
    	/** 明細入力初期化 */
		materialManagementForm.detailClear();

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();
		
		/** マテリアル検索結果一覧作成 */
		makeMatList();
		
		
		/** ボックス及び所属ロケーション情報設定*/
		/** ボックス初期値設定（検索キーがない場合は、仮想値を設定） */
		/** ボックス検索キー. */
		if (materialManagementForm.getSrcBoxKey() == null) {
			if(materialManagementForm.getBoxId() == null){
				materialManagementForm.setSrcBoxKey("0");
			}else{
				materialManagementForm.setSrcBoxKey(materialManagementForm.getBoxId());
			}
		}
		/** ボックス及び所属ロケーション情報取得. */
		MLocationBox rec = materialManagementService.findByBoxId(materialManagementForm.getSrcBoxKey());
		
		/** １．ロケーション情報設定*/
		materialManagementForm.setLocId(rec.getLocId());			// ロケーションID
		materialManagementForm.setLocNm(rec.getLocNm());			// ロケーション名称
		/** ２．ボックス情報設定*/
		materialManagementForm.setBoxId(rec.getBoxId());			// ボックスID
		materialManagementForm.setBoxNm(rec.getBoxNm());			// ボックス名称
		materialManagementForm.setBoxOnrId(rec.getBoxOnrId());		// ボックスオーナーID
		/** ３．マテリアル情報設定*/
		/** マテリアルＩＤの発番. */
		materialManagementForm.setMatId(numberingService.getIdNumbering(IdKind.MATERIAL.getName()));
		/** マテリアルオーナーＩＤの設定. */
		materialManagementForm.setMatOnrId(userDto.getAccid());		// マテリアルオーナーID
		
		/** 画面表示設定. */
		setMatDetailDisplay(DISPLAYNONE);
		setMatInsDisplay(DISPLAYBLOCK);
		setMatInsConfirmDisplay(DISPLAYNONE);
		setMatUpdDisplay(DISPLAYNONE);
		setMatUpdConfirmDisplay(DISPLAYNONE);
		
		//TODO メッセージファイル化
		materialManagementForm.setResultMsg("マテリアル情報を入力してください。");	// 結果メッセージ設定

		LOGGER.debug("matInsProc...End");

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

		/** ロケーション検索結果一覧作成 */
		makeLocList();
		
//		/** ロケーションオーナーＩＤの設定. */
//		materialManagementForm.setLocOnrId(userDto.getAccid());
		
		/** 画面表示設定. */
		setLocDetailDisplay(DISPLAYNONE);		// ロケーション詳細画面の表示設定
		setLocInsDisplay(DISPLAYBLOCK);		// ロケーション登録画面の表示設定
		setLocInsConfirmDisplay(DISPLAYNONE);	// 確認画面の表示設定
		setLocUpdDisplay(DISPLAYNONE);		// ロケーション登録画面の表示設定
		setLocUpdConfirmDisplay(DISPLAYNONE);	// 確認画面の表示設定

		LOGGER.debug("locInsreinput...End");

		return GM01;
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

		// ボックス検索結果一覧作成
		makeBoxList();

		/** 画面表示設定. */
		setBoxDetailDisplay(DISPLAYNONE);			// ボックス明細の表示設定
		setBoxInsDisplay(DISPLAYBLOCK);				// ボックス登録画面の表示設定
		setBoxInsConfirmDisplay(DISPLAYNONE);		// ボックス登録確認画面の表示設定
		setBoxUpdDisplay(DISPLAYNONE);				// ボックス更新画面の表示設定
		setBoxUpdConfirmDisplay(DISPLAYNONE);		// ボックス更新確認画面の表示設定

		LOGGER.debug("boxInsreinput...End");

		return GM02;
		
	}

	/**
	 * マテリアル登録再入力表示.
	 *
	 * @return locationManagement9.jsp
	 */
	@Auth
	@Execute(validator = false)
	public final String matInsreinput() {

		LOGGER.debug("matInsreinput...");

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		// マテリアル検索結果一覧作成
		makeMatList();

		/** 画面表示設定. */
		setMatDetailDisplay(DISPLAYNONE);
		setMatInsDisplay(DISPLAYBLOCK);
		setMatInsConfirmDisplay(DISPLAYNONE);
		setMatUpdDisplay(DISPLAYNONE);
		setMatUpdConfirmDisplay(DISPLAYNONE);

		LOGGER.debug("matInsreinput...End");

		return GM03;

	}
	/**
	 * ロケーション登録確認.
	 *
	 * @return locationManagement2.jsp
	 */
	@Auth
    @Execute(validate = "locDuplicateValidateConfirm", input = "locInsreinput")
	public final String locInsCheck() {

		LOGGER.debug("locInsCheck...");

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		/** ロケーション検索結果一覧作成 */
		makeLocList();
		

		/** 画面表示設定. */
		setLocDetailDisplay(DISPLAYNONE);		// ロケーション詳細画面の表示設定
		setLocInsDisplay(DISPLAYNONE);		// ロケーション登録画面の表示設定
		setLocInsConfirmDisplay(DISPLAYBLOCK);	// 確認画面の表示設定
		setLocUpdDisplay(DISPLAYNONE);		// ロケーション登録画面の表示設定
		setLocUpdConfirmDisplay(DISPLAYNONE);	// 確認画面の表示設定

		//TODO メッセージファイル化
		materialManagementForm.setResultMsg("ロケーション情報を下記内容で登録します。よろしいですか");	// 結果メッセージ設定
		
		LOGGER.debug("locInsCheck...End");

		return GM01;

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
		
		/** ボックス検索結果一覧作成 */
		makeBoxList();
		
		/** 画面表示設定. */
		setBoxDetailDisplay(DISPLAYNONE);			// ボックス明細の表示設定
		setBoxInsDisplay(DISPLAYNONE);				// ボックス登録画面の表示設定
		setBoxInsConfirmDisplay(DISPLAYBLOCK);		// ボックス登録確認画面の表示設定
		setBoxUpdDisplay(DISPLAYNONE);				// ボックス更新画面の表示設定
		setBoxUpdConfirmDisplay(DISPLAYNONE);		// ボックス更新確認画面の表示設定
		//TODO メッセージファイル化
		materialManagementForm.setResultMsg("ボックス情報を下記内容で登録します。よろしいですか");	// 結果メッセージ設定

		LOGGER.debug("boxInsCheck...End");

		return GM02;

	}
	/**
	 * マテリアル登録確認.
	 *
	 * @return locationManagement6.jsp
	 */
	@Auth
    @Execute(validate = "matDuplicateValidateConfirm", input = "matInsreinput")
	public final String matInsCheck() {
		LOGGER.debug("matInsCheck...");

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		/** マテリアル検索結果一覧作成 */
		makeMatList();

		/** 画面表示設定. */
		
		setMatDetailDisplay(DISPLAYNONE);
		setMatInsDisplay(DISPLAYNONE);
		setMatInsConfirmDisplay(DISPLAYBLOCK);
		setMatUpdDisplay(DISPLAYNONE);
		setMatUpdConfirmDisplay(DISPLAYNONE);
		
		//TODO メッセージファイル化
		materialManagementForm.setResultMsg("マテリアル情報を下記内容で登録します。よろしいですか");	// 結果メッセージ設定

		LOGGER.debug("matInsCheck...End");

		return GM03;

	}
	/**
	 * ロケーション登録.
	 *
	 * @return locationManagement.jsp
	 */
	@Auth
    @Execute(validate = "locDuplicateValidateConfirm", input = "locInsreinput")
	public final String locInsReg() {

		LOGGER.debug("locInsReg...");
		
		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();
		
		/** チェックボックスをDB格納用の値に変換. */
		if (materialManagementForm.getLocKind().equals(LOCATIONKINDPUBLIC) 
			|| materialManagementForm.getLocKind().equals(CHECKON) ) {
			materialManagementForm.setLocKind(LOCATIONKINDPUBLIC);
		} else {
			materialManagementForm.setLocKind(LOCATIONKINDPRIVATE);
		}

		/** ロケーション情報登録. */
		materialManagementService.locInsReg(materialManagementForm, userDto);

		/** 表示明細ロケーションID設定. */
		materialManagementForm.setSrcLocKey(materialManagementForm.getLocId());

		LOGGER.debug("locInsReg...End");
		
		//TODO メッセージファイル化
		materialManagementForm.setResultMsg("ロケーション情報を下記内容で登録しました。");	// 結果メッセージ設定

		return "locDetailSearch?redirect=true";

	}

	/**
	 * ボックス登録.
	 *
	 * @return locationManagement.jsp
	 */
	@Auth
	@Execute(validate = "boxDuplicateValidateConfirm", input = "boxInsreinput")
	public final String boxInsReg() {

		LOGGER.debug("boxInsReg...");

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();
		
		/** チェックボックスをDB格納用の値に変換. */
		if (materialManagementForm.getLocKind().equals(LOCATIONKINDPUBLIC) 
			|| materialManagementForm.getLocKind().equals(CHECKON) ) {
			materialManagementForm.setLocKind(LOCATIONKINDPUBLIC);
		} else {
			materialManagementForm.setLocKind(LOCATIONKINDPRIVATE);
		}

		/** ボックス情報登録. */
		materialManagementService.boxInsReg(materialManagementForm, userDto);

		/** ロケーションボックス関連マスタ情報登録. */
		materialManagementService.rlocBoxInsReg(materialManagementForm, userDto);

		/** 表示明細ボックスID設定. */
		materialManagementForm.setSrcBoxKey(materialManagementForm.getBoxId());

		LOGGER.debug("boxInsReg...End");
		
		//TODO メッセージファイル化
		materialManagementForm.setResultMsg("ボックス情報を下記内容で登録しました。");	// 結果メッセージ設定

		return "boxDetailSearch?redirect=true";

	}

	/**
	 * マテリアル登録.
	 *
	 * @return locationManagement.jsp
	 */
	@Auth
	@Execute(validate = "matDuplicateValidateConfirm", input = "matInsreinput")
	public final String matInsReg() {

		LOGGER.debug("matInsReg...");

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		/** マテリアル情報登録. */
		materialManagementService.matInsReg(materialManagementForm, userDto);

		/** ボックスマテリアル関連マスタ情報登録. */
		materialManagementService.rboxMatInsReg(materialManagementForm, userDto);

		/** 表示明細ロケーションID設定. */
		materialManagementForm.setSrcMatKey(materialManagementForm.getMatId());

		LOGGER.debug("matInsReg...End");
		
		//TODO メッセージファイル化
		materialManagementForm.setResultMsg("マテリアル情報を下記内容で登録しました。");	// 結果メッセージ設定

		return "matDetailSearch?redirect=true";

	}
	// }}
	// {{ 120.更新系
	/**
	 * ロケーション更新初期画面.
	 *
	 * @return locationManagement3.jsp
	 */
	@Auth
	@Execute(validator = false)
	public final String locUpdProc() {

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		/** ロケーション検索結果一覧作成 */
		makeLocList();
		/** 他オーナーロケーションチェック. */
		if(materialManagementService.otherLocOnrIdExistCheck(
				userDto, materialManagementForm.getSrcLocKey())){
			/** ロケーション・ボックス詳細検索結果取得. */
			makeLocationDetail(materialManagementForm.getSrcLocKey());

			/** 画面表示設定. */
			setLocDetailDisplay(DISPLAYNONE);
			setLocInsDisplay(DISPLAYNONE);
			setLocInsConfirmDisplay(DISPLAYNONE);
			setLocUpdDisplay(DISPLAYBLOCK);
			setLocUpdConfirmDisplay(DISPLAYNONE);
			
			//TODO メッセージファイル化
			materialManagementForm.setResultMsg("ロケーション更新情報を入力してください。");	// 結果メッセージ設定
		}else{
			/** 画面表示設定. */
			setLocDetailDisplay(DISPLAYNONE);
			setLocInsDisplay(DISPLAYNONE);
			setLocInsConfirmDisplay(DISPLAYNONE);
			setLocUpdDisplay(DISPLAYNONE);
			setLocUpdConfirmDisplay(DISPLAYNONE);

			//TODO メッセージ化
			materialManagementForm.setResultListMsg("他オーナ情報または存在しないため、登録、更新、または参照ができません");	// 非公開メッセージ
			return "locDetailSearch?redirect=true";
		}

		return GM01;
	}
	/**
	 * ボックス更新初期画面.
	 *
	 * @return locationManagement3.jsp
	 */
	@Auth
	@Execute(validator = false)
	public final String boxUpdProc() {

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		/** ボックス検索結果一覧作成 */
		makeBoxList();
		/** 他オーナーロケーションチェック. */
		if(materialManagementService.otherBoxOnrIdExistCheck(
				userDto, materialManagementForm.getSrcBoxKey())){
			/** ロケーション・ボックス詳細検索結果取得. */
			makeLocationBoxDetail(materialManagementForm.getSrcBoxKey());

			/** 画面表示設定. */
			setBoxDetailDisplay(DISPLAYNONE);			// ボックス明細の表示設定
			setBoxInsDisplay(DISPLAYNONE);				// ボックス登録画面の表示設定
			setBoxInsConfirmDisplay(DISPLAYNONE);		// ボックス登録確認画面の表示設定
			setBoxUpdDisplay(DISPLAYBLOCK);				// ボックス更新画面の表示設定
			setBoxUpdConfirmDisplay(DISPLAYNONE);		// ボックス更新確認画面の表示設定

			//TODO メッセージファイル化
			materialManagementForm.setResultMsg("ボックス更新情報を入力してください。");	// 結果メッセージ設定
		}else{
			/** 画面表示設定. */
			setBoxDetailDisplay(DISPLAYNONE);			// ボックス明細の表示設定
			setBoxInsDisplay(DISPLAYNONE);				// ボックス登録画面の表示設定
			setBoxInsConfirmDisplay(DISPLAYNONE);		// ボックス登録確認画面の表示設定
			setBoxUpdDisplay(DISPLAYNONE);				// ボックス更新画面の表示設定
			setBoxUpdConfirmDisplay(DISPLAYNONE);		// ボックス更新確認画面の表示設定

			//TODO メッセージ化
			materialManagementForm.setResultMsg("他オーナ情報または存在しないため、登録、更新、または参照ができません");	// 非公開メッセージ
			return "boxDetailSearch?redirect=true";
		}

		return GM02;
	}
	/**
	 * マテリアル更新初期画面.
	 *
	 * @return locationManagement3.jsp
	 */
	@Auth
	@Execute(validator = false)
	public final String matUpdProc() {

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		/** ボックス検索結果一覧作成 */
		makeMatList();
		
		/** 他オーナーロケーションチェック. */
		if(materialManagementService.otherMatOnrIdExistCheck(
				userDto, materialManagementForm.getSrcMatKey())){
			/** ロケーション・ボックス詳細検索結果取得. */
			makeBoxMaterialDetail(materialManagementForm.getSrcMatKey());

			/** 画面表示設定. */
			setMatDetailDisplay(DISPLAYNONE);
			setMatInsDisplay(DISPLAYNONE);
			setMatInsConfirmDisplay(DISPLAYNONE);
			setMatUpdDisplay(DISPLAYBLOCK);	
			setMatUpdConfirmDisplay(DISPLAYNONE);

			//TODO メッセージファイル化
			materialManagementForm.setResultMsg("マテリアル更新情報を入力してください。");	// 結果メッセージ設定
		}else{
			/** 画面表示設定. */
			setMatDetailDisplay(DISPLAYNONE);
			setMatInsDisplay(DISPLAYNONE);
			setMatInsConfirmDisplay(DISPLAYNONE);
			setMatUpdDisplay(DISPLAYNONE);
			setMatUpdConfirmDisplay(DISPLAYNONE);

			//TODO メッセージ化
			materialManagementForm.setResultMsg("他オーナ情報または存在しないため、登録、更新、または参照ができません");	// 非公開メッセージ
			return "matDetailSearch?redirect=true";
		}

		return GM03;
	}


	/**
	 * ロケーション更新再入力表示.
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

		/** ロケーション検索結果一覧作成 */
		makeLocList();
		
		/** 画面表示設定. */
		setLocDetailDisplay(DISPLAYNONE);	// 明細の表示設定
		setLocInsDisplay(DISPLAYNONE);		// ロケーション登録画面の表示設定
		setLocInsConfirmDisplay(DISPLAYNONE);	// 確認画面の表示設定
		setLocUpdDisplay(DISPLAYBLOCK);		// ロケーション登録画面の表示設定
		setLocUpdConfirmDisplay(DISPLAYNONE);	// 確認画面の表示設定

		LOGGER.debug("locUpdreinput...End");

		return GM01;
	}

	/**
	 * ボックス更新再入力表示.
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

		// ボックス検索結果一覧作成
		makeBoxList();

		/** 画面表示設定. */
		setBoxDetailDisplay(DISPLAYNONE);			// ボックス明細の表示設定
		setBoxInsDisplay(DISPLAYNONE);				// ボックス登録画面の表示設定
		setBoxInsConfirmDisplay(DISPLAYNONE);		// ボックス登録確認画面の表示設定
		setBoxUpdDisplay(DISPLAYBLOCK);				// ボックス更新画面の表示設定
		setBoxUpdConfirmDisplay(DISPLAYNONE);		// ボックス更新確認画面の表示設定

		LOGGER.debug("boxUpdreinput...End");

		return GM02;

	}

	/**
	 * マテリアル更新再入力表示.
	 *
	 * @return materialManagement7.jsp
	 */
	@Auth
	@Execute(validator = false)
	public final String matUpdreinput() {

		LOGGER.debug("matUpdreinput...");

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		// マテリアル検索結果一覧作成
		makeMatList();

		/** 画面表示設定. */
		setMatDetailDisplay(DISPLAYNONE);			// ボックス明細の表示設定
		setMatInsDisplay(DISPLAYNONE);				// ボックス登録画面の表示設定
		setMatInsConfirmDisplay(DISPLAYNONE);		// ボックス登録確認画面の表示設定
		setMatUpdDisplay(DISPLAYBLOCK);				// ボックス更新画面の表示設定
		setMatUpdConfirmDisplay(DISPLAYNONE);		// ボックス更新確認画面の表示設定

		LOGGER.debug("matUpdreinput...End");

		return GM03;
	}

	//TODO チェックとして自分がオーナーとなっているロケーションのみ変更可能とする。
	/**
	 * ロケーション更新登録確認.
	 *
	 * @return locationManagement2.jsp
	 */
	@Auth
	@Execute(validator = true, input = "locUpdreinput")
	public final String locUpdCheck() {

		LOGGER.debug("locUpdCheck...");
		LOGGER.debug(materialManagementForm.getLocKind());
		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		/** ロケーション検索結果一覧作成 */
		makeLocList();
		
		/** 表示用のロケーション種別設定. */
		if (materialManagementForm.getLocKind().equals(LOCATIONKINDPUBLIC) 
			|| materialManagementForm.getLocKind().equals(CHECKON)){
			this.setLocKindStr(LOCPUBLIC);
		} else {
			this.setLocKindStr(LOCPRIVATE);
		}
		
		/** ロケーションオーナー情報取得. */
		MAccount recLocOnr 
		  = materialManagementService.selectByIdWithEnsureResult(materialManagementForm.getLocOnrId());
		materialManagementForm.setLocOnrNm(recLocOnr.getAccNm());	// ロケーションオーナー名
		
		/** 画面表示設定. */
		setLocDetailDisplay(DISPLAYNONE);
		setLocInsDisplay(DISPLAYNONE);
		setLocInsConfirmDisplay(DISPLAYNONE);
		setLocUpdDisplay(DISPLAYNONE);
		setLocUpdConfirmDisplay(DISPLAYBLOCK);
		//TODO メッセージファイル化
		materialManagementForm.setResultMsg("ロケーション情報を下記内容で更新します。よろしいですか");	// 結果メッセージ設定

		LOGGER.debug("locUpdCheck...End");

		return GM01;
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
		//ロケーションIDの変更
		materialManagementForm.setSrcLocKey(materialManagementForm.getLocId());
		
		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		/** ボックス検索結果一覧作成 */
		makeBoxList();

		/** 画面表示設定. */
		setBoxDetailDisplay(DISPLAYNONE);			// ボックス明細の表示設定
		setBoxInsDisplay(DISPLAYNONE);				// ボックス登録画面の表示設定
		setBoxInsConfirmDisplay(DISPLAYNONE);		// ボックス登録確認画面の表示設定
		setBoxUpdDisplay(DISPLAYNONE);				// ボックス更新画面の表示設定
		setBoxUpdConfirmDisplay(DISPLAYBLOCK);		// ボックス更新確認画面の表示設定
		//TODO メッセージファイル化
		materialManagementForm.setResultMsg("ボックス情報を下記内容で更新します。よろしいですか");	// 結果メッセージ設定

		LOGGER.debug("boxUpdCheck...End");

		return GM02;

	}
	
	/**
	 * マテリアル更新登録確認.
	 *
	 * @return locationManagement7.jsp
	 */
	@Auth
	@Execute(validator = true, input = "matUpdreinput")
	public final String matUpdCheck() {

		LOGGER.debug("matUpdCheck...");
		
		//ボックスIDの変更
		materialManagementForm.setSrcBoxKey(materialManagementForm.getBoxId());

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		// マテリアル検索結果一覧作成
		makeMatList();

//		/** ボックスオーナー情報取得. */
//		MAccount recMatOnr 
//		  = materialManagementService.selectByIdWithEnsureResult(materialManagementForm.getBoxOnrId());
//		materialManagementForm.setMatOnrNm(recMatOnr.getAccNm());	// ロケーションオーナー名
		
		/** 画面表示設定. */
		setMatDetailDisplay(DISPLAYNONE);		// 明細の表示設定
		setMatInsDisplay(DISPLAYNONE);			// 登録画面の表示設定
		setMatInsConfirmDisplay(DISPLAYNONE);	// 登録確認画面の表示設定
		setMatUpdDisplay(DISPLAYNONE);			// 更新画面の表示設定
		setMatUpdConfirmDisplay(DISPLAYBLOCK);	// 更新確認画面の表示設定
		
		//TODO メッセージファイル化
		materialManagementForm.setResultMsg("マテリアル情報を下記内容で更新します。よろしいですか");	// 結果メッセージ設定
		
		LOGGER.debug("matUpdCheck...End");

		return GM03;

	}


	/**
	 * ロケーション更新登録.
	 *
	 * @return locationManagement.jsp
	 */
	@Auth
	@Execute(validator = true, input = "locUpdreinput")
	public final String locUpdReg() {

		LOGGER.debug("locUpdReg...");

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		/** チェックボックスをDB格納用の値に変換. */
		if (materialManagementForm.getLocKind().equals(LOCATIONKINDPUBLIC) 
			|| materialManagementForm.getLocKind().equals(CHECKON)){
			materialManagementForm.setLocKind(LOCATIONKINDPUBLIC);
		} else {
			materialManagementForm.setLocKind(LOCATIONKINDPRIVATE);
		}
		
		/** 他オーナーロケーションチェック. */
		LOGGER.debug(materialManagementForm.getLocId());
		if(materialManagementService.otherLocOnrIdExistCheck(
				userDto,materialManagementForm.getLocId())){
			/** ロケーション情報更新登録. */
			materialManagementService.locUpdReg(materialManagementForm, userDto, locationDto);

			//TODO メッセージファイル化
			materialManagementForm.setResultMsg("ロケーション情報を下記内容で更新しました。");	// 結果メッセージ設定

		}else{

			//TODO メッセージ化
			materialManagementForm.setResultMsg("他オーナ情報もしくは存在しないため更新できません");	// 非公開メッセージ
		}
		
		materialManagementForm.setSrcLocKey(materialManagementForm.getLocId());
		
		LOGGER.debug("locUpdReg...End");

		return "locDetailSearch?redirect=true";
	}

	/**
	 * ボックス更新登録.
	 *
	 * @return materialManagement.jsp
	 */
	@Auth
	@Execute(validator = true, input = "boxUpdreinput")
	public final String boxUpdReg() {

		LOGGER.debug("boxUpdReg...");

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();
		
		/** チェックボックスをDB格納用の値に変換. */
		if (materialManagementForm.getBoxKind().equals(BOXKINDPUBLIC) 
			|| materialManagementForm.getBoxKind().equals(CHECKON)){
			materialManagementForm.setBoxKind(BOXKINDPUBLIC);
		} else {
			materialManagementForm.setBoxKind(BOXKINDPRIVATE);
		}
		
		/** 他オーナーロケーションチェック. */
		if(materialManagementService.otherBoxOnrIdExistCheck(
				userDto,materialManagementForm.getBoxId())){
			/** ボックス情報更新登録. */
			materialManagementService.boxUpdReg(materialManagementForm, userDto, locationBoxDto);
			//TODO メッセージファイル化
			materialManagementForm.setResultMsg("ロケーション情報を下記内容で更新しました。");	// 結果メッセージ設定

		}else{

			//TODO メッセージ化
			materialManagementForm.setResultMsg("他オーナ情報もしくは存在しないため更新できません");	// 非公開メッセージ
		}

		materialManagementForm.setSrcBoxKey(materialManagementForm.getBoxId());

		LOGGER.debug("boxUpdReg...End");
		return "boxDetailSearch?redirect=true";
	}
	
	/**
	 * マテリアル更新登録.
	 *
	 * @return locationManagement.jsp
	 */
	@Auth
	@Execute(validator = true, input = "matUpdreinput")
	public final String matUpdReg() {

		LOGGER.debug("matUpdReg...");

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();
		
		/** チェックボックスをDB格納用の値に変換. */
		if (materialManagementForm.getMatKind1().equals(MATERIALKINDPUBLIC) 
			|| materialManagementForm.getMatKind1().equals(CHECKON)){
			materialManagementForm.setMatKind1(MATERIALKINDPUBLIC);
		} else {
			materialManagementForm.setMatKind1(MATERIALKINDPRIVATE);
		}
		
		/** 他オーナーロケーションチェック. */
		if(materialManagementService.otherMatOnrIdExistCheck(
				userDto,materialManagementForm.getMatId())){
			/** マテリアル情報更新登録. */
			materialManagementService.matUpdReg(materialManagementForm, userDto, boxMaterialDto);
			//TODO メッセージファイル化
			materialManagementForm.setResultMsg("ロケーション情報を下記内容で更新しました。");	// 結果メッセージ設定

		}else{

			//TODO メッセージ化
			materialManagementForm.setResultMsg("他オーナ情報もしくは存在しないため更新できません");	// 非公開メッセージ
		}
		materialManagementForm.setSrcMatKey(materialManagementForm.getMatId());

		LOGGER.debug("matUpdReg...End");
		return "matDetailSearch?redirect=true";
	}
	
	// }}
	// {{ 130.削除系
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

		LOGGER.debug("lbox:" + materialManagementForm.getLbox().length);
		if (materialManagementForm.getLbox().length > 0) {
			for (String item: materialManagementForm.getLbox()) {
				String reqlecid = item;
				LOGGER.debug("hira reqlecid:" + reqlecid);
				//TODO ロケーション削除チェック（自分がオーナーになっていないものは削除できない。）
				if (userDto.getAccid().equals(locationDto.getLocOnrId())==false){
					materialManagementForm.setResultDelMsg(locationDto.getLocId() + "はロケーションオーナーでないため削除できません。");	// 結果メッセージ設定
					return GM01;
				}
			}
			for (String item: materialManagementForm.getLbox()) {
				String reqlecid = item;
				LOGGER.debug("reqlecid:" + reqlecid);
				LOGGER.debug("hira reqlecid:" + reqlecid);

				
				/** ロケーション情報取得. */
				//TODO 複数選択時にエラーとなることがあるため、暫定的に削除フラグを見ないように変更
				MLocation rec = materialManagementService.findByLocId(null,reqlecid);
				locationDto.setLocationInf(rec);

				//TODO ロケーション削除チェック（自分がオーナーになっていないものは削除できない。）
				if(userDto.getAccid().equals(locationDto.getLocOnrId())){
					/** ロケーション削除. */
					materialManagementService.locDelUpdReg(userDto, locationDto);

					/** ロケーションボックス関連マスタ削除. */
					materialManagementService.rlocBoxDelUpdReg(userDto, locationDto.getLocId(), null);
				}
			}

			/** ロケーション検索結果一覧作成 */
			makeLocList();
		}
		/** 画面表示設定. */
		setLocDetailDisplay(DISPLAYNONE);			// ボックス明細の表示設定
		setLocInsDisplay(DISPLAYNONE);				// ボックス登録画面の表示設定
		setLocInsConfirmDisplay(DISPLAYNONE);		// ボックス登録確認画面の表示設定
		setLocUpdDisplay(DISPLAYNONE);				// ボックス更新画面の表示設定
		setLocUpdConfirmDisplay(DISPLAYNONE);		// ボックス更新確認画面の表示設定

		//TODO メッセージファイル化
		materialManagementForm.setResultDelMsg("ロケーション情報を削除しました。");	// 結果メッセージ設定

		LOGGER.debug("locDelProc...End");

		return GM01;

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

		LOGGER.debug("bbox:" + materialManagementForm.getBbox().length);
		if (materialManagementForm.getBbox().length > 0) {
			for (String item: materialManagementForm.getBbox()) {
				reqboxid = item;
				LOGGER.debug("reqboxid:" + reqboxid);

				/** ボックス情報取得. */
				rec = materialManagementService.findByBoxId(reqboxid);
				locationBoxDto.setLocationBoxInf(rec);

				/** ボックス削除. */
				materialManagementService.boxDelUpdReg(userDto, locationBoxDto);

				/** ロケーションボックス関連マスタ削除. */
				materialManagementService.rlocBoxDelUpdReg(userDto, null, locationBoxDto.getBoxId());
			}
			
			/** ボックス検索結果一覧作成 */
			makeBoxList();
			
			setBoxDetailDisplay(DISPLAYNONE);
			setBoxInsDisplay(DISPLAYNONE);
			setBoxInsConfirmDisplay(DISPLAYNONE);
			setBoxUpdDisplay(DISPLAYNONE);
			setBoxUpdConfirmDisplay(DISPLAYNONE);
			//TODO メッセージファイル化
			materialManagementForm.setResultDelMsg("ボックス情報を削除しました。");	// 結果メッセージ設定
		}

		LOGGER.debug("boxDelProc...End");

		return GM02;

	}
	
	/**
	 * マテリアル削除.
	 *
	 * @return locationManagement8.jsp
	 */
	@Auth
	@Execute(validator = false)
	public final String matDelProc() {
		LOGGER.debug("matDelProc...");

		String reqmatid;
		MBoxMaterial rec;

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		LOGGER.debug("mbox:" + materialManagementForm.getMbox().length);
		if (materialManagementForm.getMbox().length > 0) {
			for (String item: materialManagementForm.getMbox()) {
				reqmatid = item;
				LOGGER.debug("reqboxid:" + reqmatid);

				/** マテリアル情報取得. */
				rec = materialManagementService.findByMatId(reqmatid);
				boxMaterialDto.setBoxMaterialInf(rec);

				/** マテリアル削除. */
				materialManagementService.matDelUpdReg(userDto, boxMaterialDto);

				/** ボックスマテリアル関連マスタ削除. */
				materialManagementService.rboxMatDelUpdReg(userDto, null, locationBoxDto.getBoxId());
			}
			
			/** ボックス検索結果一覧作成 */
			makeMatList();
			setMatDetailDisplay(DISPLAYNONE);
			setMatInsDisplay(DISPLAYNONE);
			setMatInsConfirmDisplay(DISPLAYNONE);
			setMatUpdDisplay(DISPLAYNONE);
			setMatUpdConfirmDisplay(DISPLAYNONE);
			//TODO メッセージファイル化
			materialManagementForm.setResultDelMsg("マテリアル情報を削除しました。");	// 結果メッセージ設定

		}
		LOGGER.debug("matDelProc...End");
		return GM03;
	}
	
	// }}
	// {{ 200.共通設定
	
	/**
	 * データクリア.
	 */
	private void dataClear() {
		//TODO クリアする内容を入れる。
		this.locationLink = "";
		this.materialManagementForm.reset();
		this.locKindStr = "";
		this.boxKindStr = "";
		this.matKind1Str = "";
		this.locDetailDisplay = "";
		this.locInsDisplay = "";
		this.locInsConfirmDisplay = "";
		this.locUpdDisplay = "";
		this.locUpdConfirmDisplay = "";
		this.boxDetailDisplay = "";
		this.boxInsDisplay = "";
		this.boxInsConfirmDisplay = "";
		this.boxUpdDisplay = "";
		this.boxUpdConfirmDisplay = "";
		this.matDetailDisplay = "";
		this.matInsDisplay = "";
		this.matUpdDisplay = "";
		this.pagelinkDisplay = "";
		this.locKindDef = "";
		this.boxKindDef = "";
		this.matKind1Def = "";
		materialManagementForm.setResultMsg("");	// 結果メッセージクリア
		materialManagementForm.setResultListMsg("");	// 結果メッセージクリア
		materialManagementForm.setResultDelMsg("");	// 結果メッセージクリア
	}

	/**
	 * ヘッダ、サイドメニュー設定.
	 */
	private void getheadmenu() {
		/**
		 * ヘッダ：ユーザ名設定
		 */
		userNameKnjLabel = userDto.getAccnm();

		/**
		 * 左サイドメニュー設定
		 */
		resultMsgDate = DateUtil.toDayString();
		resultItems = leftSideMenuService.getresultMessages(userDto.getAccid(), resultMsgDate);

		newsMsgDate = DateUtil.toDayString();
		newsItems = leftSideMenuService.getnewsMessages(newsMsgDate);

	}

	/**
	 * ロケーション検索結果一覧設定.
	 */
	private void makeLocList() {
		/** ロケーション検索 */
		/** 対象ページ番号(locpageno)に表示する分のレコードだけ取得. */
		setLocListItems(materialManagementService.findByLocationWithInsideMatching(userDto.getAccid(), materialManagementForm.getSrcLocKey(), materialManagementForm.getLocpageno(), PER_PAGE));

		/** レコードの総件数. */
		int totalRecNum = (int) materialManagementService.getCount();

		/** ページリンク文字列作成. */
		locationLink = ListUtil.makePagingLink(LOCLISTURL, Integer.parseInt(materialManagementForm.getLocpageno()), totalRecNum, PER_PAGE);

		/** 一覧作成. */
		MCode locationKind;
		for (MLocation item: locListItems) {
	    	locationKind = cdMstService.find(MCodeKind.LOCKIND.getName(), item.getLocKind());
	    	item.setLocKind(locationKind.getCodeNm());
		}
		/** 対象ページ番号(locpageno)に表示する分のレコードだけ取得. */
		setBoxListItems(materialManagementService.findByLocIdWithInsideMatching(userDto.getAccid(), materialManagementForm.getSrcLocKey(), materialManagementForm.getLocpageno(), PER_PAGE));

		/** ロケーション種別名設定. */
		if (materialManagementForm.getLocKind().equals(LOCATIONKINDPUBLIC) 
			|| materialManagementForm.getLocKind().equals(CHECKON) ) {
			this.setLocKindStr(LOCPUBLIC);
		} else {
			this.setLocKindStr(LOCPRIVATE);
		}
	}
	/**
	 * ボックス検索結果一覧設定.
	 */
	private void makeBoxList() {
		/** ロケーション情報再設定 */
		if (materialManagementForm.getSrcLocKey() != null) {
			makeLocationDetail(materialManagementForm.getSrcLocKey());
		}
		/** ボックス検索 */
		/** 対象ページ番号(locpageno)に表示する分のレコードだけ取得. */
		if (materialManagementForm.getSrcLocKey() == null) {
			setBoxListItems(materialManagementService.findByBoxWithInsideMatching(userDto.getAccid(), materialManagementForm.getSrcBoxKey(), materialManagementForm.getBoxpageno(), PER_PAGE));
		} else {
			setBoxListItems(materialManagementService.findByLocIdWithInsideMatching(userDto.getAccid(), materialManagementForm.getSrcLocKey(), materialManagementForm.getBoxpageno(), PER_PAGE));
		}

		/** レコードの総件数. */
		int totalRecNum = (int) materialManagementService.getCount();

		/** ページリンク文字列作成 */
		locationLink = ListUtil.makePagingLink(BOXLISTURL, Integer.parseInt(materialManagementForm.getBoxpageno()), totalRecNum, PER_PAGE);

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
		if (materialManagementForm.getBoxKind().equals(BOXKINDPUBLIC)) {
			this.setBoxKindStr(BOXPUBLIC);
		} else {
			this.setBoxKindStr(BOXPRIVATE);
		}
	}

	/**
	 * マテリアル検索結果一覧設定.
	 */
	private void makeMatList() {
		/** ボックス情報再設定 */
		LOGGER.debug("makeMatList...");
		if (materialManagementForm.getSrcBoxKey() != null) {
			makeLocationBoxDetail(materialManagementForm.getSrcBoxKey());
		}

		LOGGER.debug("makeMatList...hira" + materialManagementForm.getSrcBoxKey()+ "hiran" + materialManagementForm.getSrcMatKey());

		/** マテリアル検索 */
		/** 対象ページ番号(pageno)に表示する分のレコードだけ取得 */
		setMatListItems(materialManagementService.findByBoxIdWithInsideMatching(null, materialManagementForm.getSrcBoxKey(), materialManagementForm.getMatpageno(), PER_PAGE));
//		if (materialManagementForm.getSrcMatKey()== null) {
////			setMatListItems(materialManagementService.findByBoxIdWithInsideMatching(userDto.getAccid(), materialManagementForm.getSrcBoxKey(), materialManagementForm.getMatpageno(), PER_PAGE));
//			setMatListItems(materialManagementService.findByBoxIdWithInsideMatching(null, materialManagementForm.getSrcBoxKey(), materialManagementForm.getMatpageno(), PER_PAGE));
//		} else {
////			setMatListItems(materialManagementService.findByMaterialWithInsideMatching(userDto.getAccid(), materialManagementForm.getSrcMatKey(), materialManagementForm.getMatpageno(), PER_PAGE));
//			setMatListItems(materialManagementService.findByMaterialWithInsideMatching(null, materialManagementForm.getSrcMatKey(), materialManagementForm.getMatpageno(), PER_PAGE));
//		}

		/** レコードの総件数 */
		int totalRecNum = (int) materialManagementService.getCount();
		LOGGER.debug("totalRecNum:" + Integer.toString(totalRecNum));

		/** ページリンク文字列作成 */
		locationLink = ListUtil.makePagingLink(MATERIALLISTURL, Integer.parseInt(materialManagementForm.getMatpageno()), totalRecNum, PER_PAGE);
		LOGGER.debug("link:" + locationLink);
		
		/** 一覧作成 */
		// TODO 要修正
		for (MBoxMaterial item: matListItems) {
			if (item.getBoxKind().equals(BOXKINDPUBLIC)) {
				item.setBoxKind(BOXPUBLIC);			// ボックス種別
			} else {
				item.setBoxKind(BOXPRIVATE);		// ボックス種別
			}
			if (item.getMtKind1().equals(MATERIALKINDPUBLIC)) {
				item.setMtKind1(MATERIALPUBLIC);	// マテリアル種別
			} else {
				item.setMtKind1(MATERIALPRIVATE);	// マテリアル種別
			}
		}
		/** マテリアル種別設定. */
		if (materialManagementForm.getMatKind1().equals(MATERIALKINDPUBLIC)) {
			this.setMatKind1Str(MATERIALPUBLIC);
		} else {
			this.setMatKind1Str(MATERIALPRIVATE);
		}
		
	}
	
	/**
	 * ロケーション検索結果一覧設定.
	 * @param locId 
	 */
	private void makeLocationDetail(String locId) {
		/** ロケーション情報取得. */
		MLocation rec = materialManagementService.findByLocId(locId);
		/** ロケーションオーナー情報取得. */
		MAccount recLocOnr 
		  = materialManagementService.selectByIdWithEnsureResult(rec.getLocOnrId());
		locationDto.setLocationInf(rec);
		materialManagementForm.setLocOnrId(rec.getLocOnrId());		// ロケーションオーナー
		materialManagementForm.setLocOnrNm(recLocOnr.getAccNm());	// ロケーションオーナー名
		
		materialManagementForm.setLocId(rec.getLocId());			// ロケーションID
		if (rec.getLocKind().equals(LOCATIONKINDPUBLIC)) {
			this.setLocKindStr(LOCPUBLIC);							// ロケーション種別
			materialManagementForm.setLocKind(CHECKON);
		} else {
			this.setLocKindStr(LOCPRIVATE);							// ロケーション種別
			materialManagementForm.setLocKind(CHECKOFF);
		}
		locKindDef = rec.getLocKind();
		materialManagementForm.setPostcd(rec.getPostcd());			// 郵便番号
		materialManagementForm.setAddress(rec.getAddress());		// 住所
		materialManagementForm.setNote(rec.getNote());				// 備考

		materialManagementForm.setLocNm(rec.getLocNm());			// ロケーション名称
		materialManagementForm.setRecipient(rec.getRecipient());	// 送付先名
		materialManagementForm.setTagA(rec.getTagA());				// 追加タグA
		materialManagementForm.setTagB(rec.getTagB());				// 追加タグB
		materialManagementForm.setTel1(rec.getTel1());				// 電話番号
		materialManagementForm.setNote(rec.getNote());				// 備考

	}
	/**
	 * ボックス検索結果一覧設定.
	 * @param boxId 
	 */
	private void makeLocationBoxDetail(String boxId) {
		MLocationBox rec = materialManagementService.findByBoxId(boxId);
		/** ボックスオーナー情報取得. */
		MAccount recBoxOnr 
		  = materialManagementService.selectByIdWithEnsureResult(rec.getBoxOnrId());
		locationBoxDto.setLocationBoxInf(rec);

		materialManagementForm.setLocNm(rec.getLocNm());			// ロケーション名称
		materialManagementForm.setLocId(rec.getLocId());			// ロケーションID
		if (rec.getLocKind().equals(LOCATIONKINDPUBLIC)) {
			this.setLocKindStr(LOCPUBLIC);							// ロケーション種別
			materialManagementForm.setLocKind(CHECKON);
		} else {
			this.setLocKindStr(LOCPRIVATE);							// ロケーション種別
			materialManagementForm.setLocKind(CHECKOFF);
		}
		locKindDef = LOCATIONKINDPUBLIC;							// ロケーション種別チェックボックスvalue値
		boxKindDef = BOXKINDPUBLIC;									// ボックス種別チェックボックスvalue値
		materialManagementForm.setBoxId(rec.getBoxId());			// ボックスID
		materialManagementForm.setBoxOnrId(rec.getBoxOnrId());		// ボックスオーナーID
		materialManagementForm.setBoxOnrNm(recBoxOnr.getAccNm());	// ボックスオーナー名
		materialManagementForm.setBoxNm(rec.getBoxNm());			// ボックス名
		if (rec.getBoxKind().equals(BOXKINDPUBLIC)) {
			this.setBoxKindStr(BOXPUBLIC);							// ボックス種別
			materialManagementForm.setBoxKind(CHECKON);
		} else {
			this.setBoxKindStr(BOXPRIVATE);							// ボックス種別
			materialManagementForm.setBoxKind(CHECKOFF);
		}
		materialManagementForm.setCapaInd(rec.getCapaInd());		// 容量種別
		materialManagementForm.setNote(rec.getNote());				// 備考
		// 追加タグA
		materialManagementForm.setTagA(rec.getTagA());				// 追加タグA
		// 追加タグB
		materialManagementForm.setTagB(rec.getTagB());				// 追加タグB
	}
	
	/**
	 * マテリアル検索結果一覧設定.
	 * @param boxId 
	 */
	private void makeBoxMaterialDetail(String matId) {
		MBoxMaterial rec = materialManagementService.findByMatId(matId);
		/** マテリアルオーナー情報取得. */
		MAccount recMatOnr 
		  = materialManagementService.selectByIdWithEnsureResult(rec.getMtOnrId());
		boxMaterialDto.setBoxMaterialInf(rec);

		materialManagementForm.setBoxNm(rec.getBoxNm());			// ボックス名称
		materialManagementForm.setBoxId(rec.getBoxId());			// ボックスID
		if (rec.getBoxKind().equals(BOXKINDPUBLIC)) {
			this.setBoxKindStr(BOXPUBLIC);							// ボックス種別
			materialManagementForm.setBoxKind(CHECKON);
		} else {
			this.setBoxKindStr(BOXPRIVATE);							// ボックス種別
			materialManagementForm.setBoxKind(CHECKOFF);
		}
		boxKindDef = BOXKINDPUBLIC;									// ボックス種別チェックボックスvalue値

		materialManagementForm.setMatId(rec.getMtId());
		materialManagementForm.setMatOnrId(rec.getMtOnrId());
		materialManagementForm.setMatOnrNm(recMatOnr.getAccNm());	// マテリアルオーナー名
		materialManagementForm.setMatNm(rec.getMtNm());	
		
		if (rec.getMtKind1().equals(MATERIALKINDPUBLIC)) {
			this.setMatKind1Str(MATERIALPUBLIC);
			materialManagementForm.setMatKind1(CHECKON);
		} else {
			this.setMatKind1Str(MATERIALPRIVATE);
			materialManagementForm.setMatKind1(CHECKOFF);
		}
		// 追加タグA
		materialManagementForm.setTagA(rec.getTagA());				// 追加タグA
		// 追加タグB
		materialManagementForm.setTagB(rec.getTagB());				// 追加タグB
		matKind1Def = MATERIALKINDPUBLIC;
	}
	
	// }}
	// {{ 300.チェック
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
    	if (materialManagementService.locationIdExistCheck(materialManagementForm.getLocId())) {
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
    	if (materialManagementService.boxIdExistCheck(materialManagementForm.getBoxId())) {
			errors.add("other_err", new ActionMessage(CommonUtil.prefixError("MGS05001002E")));
    	}

		return errors;
	}
	/**
	 * マテリアル情報重複登録チェック.
	 * <p>
	 * ボックス情報の重複登録のチェックを行います。
	 * </p>
	 * @return ActionMessages エラー情報を返す
	 */
	public final ActionMessages matDuplicateValidateConfirm() {
		LOGGER.debug("matDuplicateValidateConfirm...");
		
		ActionMessages errors = new ActionMessages();
    	//マテリアル情報の重複登録チェック
    	if (materialManagementService.materialIdExistCheck(materialManagementForm.getMatId())) {
			errors.add("other_err", new ActionMessage(CommonUtil.prefixError("MGS05001003E")));
    	}
		LOGGER.debug("matDuplicateValidateConfirm...End");
		return errors;
	}
//	/**
//	 * ロケーション情報オーナープライベート登録チェック.
//	 * <p>
//	 * ロケーション情報がオーナプライベートの場合の重複登録のチェックを行います。
//	 * </p>
//	 * @return ActionMessages エラー情報を返す
//	 */
//	public final ActionMessages locOnrPrivateValidateConfirm() {
//		ActionMessages errors = new ActionMessages();
//
//    	//ロケーション情報オーナープライベート登録チェック.
//    	if (materialManagementService.locatioOnrIdPrivateExistCheck(userDto, materialManagementForm.getLocId())) {
//			//メッセージ
//    		errors.add("other_err", new ActionMessage("オーナー非公開です。"));
//    	}
//
//		return errors;
//	}

	
	// }}
	// {{ 以下、setter/getter
	
	/**
     * Returns the userNameKnjLabel.
     *
     * @return the userNameKnjLabel
     */
	public final String getUserNameKnjLabel() {
		return userNameKnjLabel;
	}

    /**
     * Sets the userNameKnjLabel.
     *
     * @param prmUserNameKnjLabel ユーザ名称情報
     */
	public final void setUserNameKnjLabel(final String prmUserNameKnjLabel) {
		this.userNameKnjLabel = prmUserNameKnjLabel;
	}

	/**
     * Returns the resultMsgDate.
     *
     * @return the resultMsgDate
     */
	public final String getResultMsgDate() {
		return resultMsgDate;
	}

    /**
     * Sets the resultMsgDate.
     *
     * @param prmResultMsgDate サイドメニュー結果報告情報 日付
     */
	public final void setResultMsgDate(final String prmResultMsgDate) {
		this.resultMsgDate = prmResultMsgDate;
	}

	/**
     * Returns the resultItems.
     *
     * @return the resultItems
     */
	public final List<TMsgSendResult> getResultItems() {
		return  resultItems;
	}

    /**
     * Sets the resultItems.
     *
     * @param prmResultItems サイドメニュー結果報告情報
     */
	public final void setResultItems(final List<TMsgSendResult> prmResultItems) {
		this.resultItems = prmResultItems;
	}

	/**
     * Returns the newsMsgDate.
     *
     * @return the newsMsgDate
     */
	public final String getNewsMsgDate() {
		return newsMsgDate;
	}

    /**
     * Sets the newsMsgDate.
     *
     * @param prmNewsMsgDate サイドメニューおしらせ情報 日付
     */
	public final void setNewsMsgDate(final String prmNewsMsgDate) {
		this.newsMsgDate = prmNewsMsgDate;
	}

	/**
     * Returns the newsItems.
     *
     * @return the newsItems
     */
	public final List<TMsgSendNews> getNewsItems() {
		return newsItems;
	}

    /**
     * Sets the newsItems.
     *
     * @param prmNewsItems サイドメニューおしらせ情報
     */
	public final void setNewsItems(final List<TMsgSendNews> prmNewsItems) {
		this.newsItems = prmNewsItems;
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
     * Returns the matListItems.
     *
	 * @return matListItems
	 */
	public final List<MBoxMaterial> getMatListItems() {
		return matListItems;
	}

	/**
     * Sets the matListItems.
     *
	 * @param prmMatListItems マテリアル一覧データ
	 */
	public final void setMatListItems(final List<MBoxMaterial> prmMatListItems) {
		this.matListItems = prmMatListItems;
	}

	
//	/**
//     * Returns the srcKey.
//     *
//     * @return the srcKey
//     */
//	public final String getSrcKey() {
//		return srcKey;
//	}
//
//    /**
//     * Sets the secKey.
//     *
//     * @param prmSrcKey ページリンク文字列 ロケーション一覧
//     */
//	public final void setSrcKey(final String prmSrcKey) {
//		this.srcKey = prmSrcKey;
//	}


	
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
     * Returns the matKind1Str.
     *
     * @return the matKind1Str
     */
	public final String getMatKind1Str() {
		return matKind1Str;
	}

    /**
     * Sets the matKind1Str.
     *
     * @param prmMatKind1Str マテリアル種別１表示
     */
	public final void setMatKind1Str(final String prmMatKind1Str) {
		this.matKind1Str = prmMatKind1Str;
	}

//	/**
//     * Returns the addDisplay.
//     *
//     * @return the addDisplay
//     */
//	public final String getAddDisplay() {
//		return addDisplay;
//	}
//
//    /**
//     * Sets the addDisplay.
//     *
//     * @param prmAddDisplay 新規追加画面表示フラグ
//     */
//	public final void setAddDisplay(final String prmAddDisplay) {
//		this.addDisplay = prmAddDisplay;
//	}

	/**
     * Returns the resultDisplay.
     *
     * @return the resultDisplay
     */
	public final String getResultDisplay() {
		return resultDisplay;
	}

    /**
     * Sets the resultDisplay.
     *
     * @param prmResultDisplay ロケーション明細画面表示フラグ
     */
	public final void setResultDisplay(final String prmResultDisplay) {
		this.resultDisplay = prmResultDisplay;
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
     * Returns the locInsConfirmDisplay.
     *
     * @return the locInsConfirmDisplay
     */
	public final String getLocInsConfirmDisplay() {
		return locInsConfirmDisplay;
	}

    /**
     * Sets the locConfirmDisplay.
     *
     * @param prmLocConfirmDisplay ロケーション登録確認表示フラグ
     */
	public final void setLocInsConfirmDisplay(final String prmLocInsConfirmDisplay) {
		this.locInsConfirmDisplay = prmLocInsConfirmDisplay;
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
     * Returns the locUpdConfirmDisplay.
     *
     * @return the locUpdConfirmDisplay
     */
	public final String getLocUpdConfirmDisplay() {
		return locUpdConfirmDisplay;
	}

    /**
     * Sets the locUpdConfirmDisplay.
     *
     * @param prmLocUpdConfirmDisplay ロケーション登録確認表示フラグ
     */
	public final void setLocUpdConfirmDisplay(final String prmLocUpdConfirmDisplay) {
		this.locUpdConfirmDisplay = prmLocUpdConfirmDisplay;
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
     * Returns the matDetailDisplay.
     *
	 * @return matDetailDisplay
	 */
	public final String getMatDetailDisplay() {
		return matDetailDisplay;
	}

	/**
     * Sets the matDetailDisplay.
     *
	 * @param prmMatDetailDisplay マテリアル明細画面表示フラグ
	 */
	public final void setMatDetailDisplay(final String prmMatDetailDisplay) {
		this.matDetailDisplay = prmMatDetailDisplay;
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
     * Returns the matInsDisplay.
     *
	 * @return matInsDisplay
	 */
	public final String getMatInsDisplay() {
		return matInsDisplay;
	}
	
	/**
     * Sets the matInsDisplay.
     *
	 * @param prmMatInsDisplay マテリアル登録画面表示フラグ
	 */
	public final void setMatInsDisplay(final String prmMatInsDisplay) {
		this.matInsDisplay = prmMatInsDisplay;
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
     * Returns the matUpdDisplay.
     *
	 * @return matUpdDisplay
	 */
	public final String getMatUpdDisplay() {
		return matUpdDisplay;
	}

	/**
     * Sets the matUpdDisplay.
     *
	 * @param prmMatUpdDisplay マテリアル更新画面表示フラグ
	 */
	public final void setMatUpdDisplay(final String prmMatUpdDisplay) {
		this.matUpdDisplay = prmMatUpdDisplay;
	}

	/**
     * Returns the boxInsConfirmDisplay.
     *
	 * @return boxInsConfirmDisplay
	 */
	public final String getBoxInsConfirmDisplay() {
		return boxInsConfirmDisplay;
	}

	/**
     * Sets the boxConfirmDisplay.
     *
	 * @param prmBoxConfirmDisplay ボックス更新画面確認表示フラグ
	 */
	public final void setBoxInsConfirmDisplay(final String prmBoxInsConfirmDisplay) {
		this.boxInsConfirmDisplay = prmBoxInsConfirmDisplay;
	}
	/**
     * Returns the boxUpdConfirmDisplay.
     *
	 * @return boxUpdConfirmDisplay
	 */
	public final String getBoxUpdConfirmDisplay() {
		return boxUpdConfirmDisplay;
	}

	/**
     * Sets the boxUpdConfirmDisplay.
     *
	 * @param prmUpdBoxConfirmDisplay ボックス更新画面確認表示フラグ
	 */
	public final void setBoxUpdConfirmDisplay(final String prmBoxUpdConfirmDisplay) {
		this.boxUpdConfirmDisplay = prmBoxUpdConfirmDisplay;
	}


//	//TODO削除予定
//	/**
//     * Sets the matConfirmDisplay.
//     *
//	 * @param prmMatConfirmDisplay マテリアル更新画面確認表示フラグ
//	 */
//	public final void setMatConfirmDisplay(final String prmMatConfirmDisplay) {
//		this.matConfirmDisplay = prmMatConfirmDisplay;
//	}
//
//	//TODO削除予定
//	/**
//     * Returns the matConfirmDisplay.
//     *
//	 * @return matConfirmDisplay
//	 */
//	public final String getMatConfirmDisplay() {
//		return matConfirmDisplay;
//	}

	/**
     * Sets the matInsConfirmDisplay.
     *
	 * @param prmMatInsConfirmDisplay マテリアル更新画面確認表示フラグ
	 */
	public final void setMatInsConfirmDisplay(final String prmMatInsConfirmDisplay) {
		this.matInsConfirmDisplay = prmMatInsConfirmDisplay;
	}
	/**
     * Returns the matInsConfirmDisplay.
     *
	 * @return matInsConfirmDisplay
	 */
	public final String getMatInsConfirmDisplay() {
		return matInsConfirmDisplay;
	}

	/**
     * Sets the matUpdConfirmDisplay.
     *
	 * @param prmMatUpdConfirmDisplay マテリアル更新画面確認表示フラグ
	 */
	public final void setMatUpdConfirmDisplay(final String prmMatUpdConfirmDisplay) {
		this.matUpdConfirmDisplay = prmMatUpdConfirmDisplay;
	}
	/**
     * Returns the matConfirmDisplay.
     *
	 * @return matConfirmDisplay
	 */
	public final String getMatUpdConfirmDisplay() {
		return matUpdConfirmDisplay;
	}

	/**
     * Returns the pagelinkDisplay.
     *
	 * @return pagelinkDisplay
	 */
	public final String getPagelinkDisplay() {
		return pagelinkDisplay;
	}

	/**
     * Sets the pagelinkDisplay.
     *
	 * @param prmPagelinkDisplay ページリンク表示フラグ
	 */
	public final void setPagelinkDisplay(final String prmPagelinkDisplay) {
		this.pagelinkDisplay = prmPagelinkDisplay;
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
	/**
     * Returns the matKind1Def.
     *
     * @return the matKind1Def
     */
	public final String getMatKind1Def() {
		return matKind1Def;
	}
	// }}
}
