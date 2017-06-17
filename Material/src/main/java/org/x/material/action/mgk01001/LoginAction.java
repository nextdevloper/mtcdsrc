package org.x.material.action.mgk01001;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import org.x.material.action.mgs07001.MaterialCockpitAction;
import org.x.material.common.util.ListUtil;
import org.x.material.condition.MaterialConstants.MCodeKind;
import org.x.material.dto.UserDto;
import org.x.material.entity.MLocationBoxMaterial;
import org.x.material.form.mgk01001.LoginForm;
import org.x.material.service.CdMstService;
import org.x.material.service.MDBEnviromentService;
import org.x.material.service.mgk01001.LoginService;
import org.x.material.service.mgs07001.MaterialCockpitService;

/**
 * ログインアクションクラス.
 * <p>
 * ログインアクション。
 * </p>
 *
 * @author  nakada
 * @since   20141026.1.0
 * @version 20160430.0.1
 */
public class LoginAction {
	/** 画面 - GM01. */
	private static final String GM01 = "login.jsp";

	/** 画面 - GM_NEWS. */
	private static final String GM_NEWS_REDIRECT = "/mgs01001/news/init?redirect=true";

	/** ログ出力定義. */
	private static final Logger LOGGER = Logger.getLogger(MaterialCockpitAction.class);

	/** アクションフォームの設定情報. **/
	@ActionForm
	@Resource
	private LoginForm loginForm;

	/** 認証情報を格納するセッションスコープのDTO. **/
	@Resource
	private UserDto userDto;

	/** 認証チェックサービス. **/
	@Resource
	private LoginService loginService;

	/** DBの環境設定情報関連サービス. **/
	@Resource(name = "MDBEnviromentService")
	private MDBEnviromentService mdbEnvService;

	/**
	 * マテリアルコックピット表示用
	 *
	 */

	/** 使用DB種別表示. */
	private String dbKindName;

	/** １ページあたりのレコード数. */
	private static final int PER_PAGE = 6;

	/** ページリンク文字列. */
	private String link;

	/** 一覧取得url. */
	private static final String LISTURL = "/Material/mgk01001/login/locturn/";

	/** 表示用ユーザ. */
	private static final String GUEST_ACC_ID = "guest_accid";

	/** コードマスタテーブル情報関連サービス. **/
	@Resource
	private CdMstService cdMstService;

	/** 一覧データ. */
    private List<MLocationBoxMaterial> listItemsMt;

	/** マテリアルコックピットサービスサービス. **/
	@Resource
	private MaterialCockpitService materialCockpitService;

	/**
	 * 初期表示.
	 * <p>
	 * 初期表示をおこないます。
	 * </p>
	 * @return login.jsp
	 */
    @Execute(validator = false)
	public final String init() {

    	setDbKindName(mdbEnvService.getDbKindNme());

    	return GM01;
	}

    /**
     * ログイン.
     * <p>
     * ログイン処理をおこないます。
     * </p>
     * @return /mgs01001/news/init?redirect=true
     */

    @Execute(validate = "validateConfirm", input = GM01)
	public final String login() {

    	setDbKindName(mdbEnvService.getDbKindNme());

    	return GM_NEWS_REDIRECT;
    }

	/**
	 * ログアウト.
	 * <p>
	 * ログアウト処理をおこないます。
	 * </p>
	 * @return news.jsp
	 */
    @Execute(validator = false)
	public final String logout() {

    	// ログイン情報の削除
		userDto.resetUserinfo();

    	setDbKindName(mdbEnvService.getDbKindNme());

    	return GM01;
    }

    /**
	 * 照会表示.
	 *
	 * @return materialCockpit2.jsp
	 */
	@Execute(validator = false)
	public final String regSearch() {

		LOGGER.debug("LoginAction/regSearch...");

    	setDbKindName(mdbEnvService.getDbKindNme());

    	/** 照会検索 */
		LOGGER.debug("SrcKey1:" + loginForm.getSrcKey1());
		LOGGER.debug("SrcKey2:" + loginForm.getSrcKey2());
		LOGGER.debug("SrcKey3:" + loginForm.getSrcKey3());
		// 対象ページ番号(pageno)に表示する分のレコードだけ取得
		listItemsMt = materialCockpitService.findByLocBoxMatWithInsideMatching(
				GUEST_ACC_ID,
				loginForm.getSrcKey1(),
				loginForm.getSrcKey2(),
				loginForm.getSrcKey3(),
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

		loginForm.setSrcKey1(loginForm.getSrcKey1());
		loginForm.setSrcKey2(loginForm.getSrcKey2());
		loginForm.setSrcKey3(loginForm.getSrcKey3());

		LOGGER.debug("LoginAction/regSearch...End");

		return GM01;
	}

	/**
	 * ページング表示.
	 * @return materialCockpit2.jsp
	 */
	@Execute(validator = false, urlPattern = "locturn/{locpageno}")
	public final String locturn() {

		LOGGER.debug("MaterialCockpitAction/locturn...");

    	setDbKindName(mdbEnvService.getDbKindNme());

    	/** 照会検索 */
		LOGGER.debug("SrcKey1:" + loginForm.getSrcKey1());
		LOGGER.debug("SrcKey2:" + loginForm.getSrcKey2());
		LOGGER.debug("SrcKey3:" + loginForm.getSrcKey3());
		// 対象ページ番号(pageno)に表示する分のレコードだけ取得
		listItemsMt = materialCockpitService.findByLocBoxMatWithInsideMatching(
				GUEST_ACC_ID,
				loginForm.getSrcKey1(),
				loginForm.getSrcKey2(),
				loginForm.getSrcKey3(),
				loginForm.getLocpageno(), PER_PAGE);

		// レコードの総件数
		int totalRecNum = (int) materialCockpitService.getCount();
		LOGGER.debug("totalRecNum:" + Integer.toString(totalRecNum));

		// ページリンク文字列作成
		link = ListUtil.makePagingLink(LISTURL, Integer.parseInt(loginForm.getLocpageno()), totalRecNum, PER_PAGE);
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

		loginForm.setSrcKey1(loginForm.getSrcKey1());
		loginForm.setSrcKey2(loginForm.getSrcKey2());
		loginForm.setSrcKey3(loginForm.getSrcKey3());

		LOGGER.debug("MaterialCockpitAction/locturn...End");

		return GM01;

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

	/**
	 * Get dbKindName.
	 *
	 * @return dbKindName
	 */
	public final String getDbKindName() {
		return dbKindName;
	}

	/**
	 * Set dbKindName.
	 *
	 * @param prmDbKindName セットする dbKindName
	 */
	public final void setDbKindName(final String prmDbKindName) {
		this.dbKindName = prmDbKindName;
	}


}
