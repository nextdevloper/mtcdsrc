package org.x.material.action.mgk01001;


import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.exception.ActionMessagesException;
import org.x.material.action.mgs06001.MaterialManagementAction;
import org.x.material.common.exception.MCBusinessException;
import org.x.material.common.util.CommonUtil;
import org.x.material.condition.MaterialConstants.MCodeKind;
import org.x.material.dto.UserDto;
import org.x.material.entity.MCode;
import org.x.material.form.mgk01001.NewAccountForm;
import org.x.material.service.CdMstService;
import org.x.material.service.mgk01001.LoginService;
import org.x.material.service.mgk01001.NewAccountService;

/**
 * アカウント登録アクション.
 *
 * @author  nakada
 * @since   20141026.1.0
 * @version 20141026.0.1
 */
public class NewAccountAction {
	/** 画面 - GM01. */
	private static final String GM01 = "newaccount1.jsp";
	/** 画面 - GM02. */
	private static final String GM02 = "newaccount2.jsp";
	/** 画面 - GM03. */
	private static final String GM03 = "newaccount3.jsp";
	/** 画面 - GM_NEWS. */
	private static final String GM_NEWS_REDIRECT = "/mgs01001/news/init?redirect=true";

	// 表示 - GM02
    /** ユーザ種別. */
    private String userKindLabel;
    /** ユーザステータス. */
    private String userStatusLabel;
    /** 性別. */
    private String seibetuLabel;

    /** ユーザ種別 (http:options). */
    private List<MCode> userKindList;

    /** ユーザステータス (http:options). */
    private List<MCode> userStatusList;

    /** 性別 (http:options). */
    private List<MCode> seibetuList;

	/** アクションフォームの設定情報. */
    @Resource
    @ActionForm
    private NewAccountForm newAccountForm;

	/** コードマスタ情報制御サービス. */
	@Resource
	private CdMstService cdMstService;

	/** アカウント登録サービス. */
	@Resource
	private NewAccountService newAccountService;

	/** 認証情報を格納するセッションスコープのDTO. */
	@Resource
	private UserDto userDto;

	/** 認証チェックサービス. */
	@Resource
	private LoginService loginService;
	/**
	 * デバッグ・ログ出力設定.
	 */
	private static final Logger LOGGER = Logger.getLogger(MaterialManagementAction.class);

	/**
	 * 初期表示を行います.
	 * @return newaccount1.jsp
	 */
    @Execute(validator = false)
	public final String init() {

    	LOGGER.debug("init...");

    	//入力初期化
    	newAccountForm.initialize();

    	// 動的なラジオボタンのデータの生成
    	userKindList = cdMstService.find(MCodeKind.KIND_ACC.getName());
    	userStatusList = cdMstService.find(MCodeKind.STATUS_ACC.getName());
    	seibetuList = cdMstService.find(MCodeKind.GENDER.getName());

    	LOGGER.debug("init...End");

    	return GM01;
	}

    /**
     * 入力エラー時の登録画面表示.
	 * @return newaccount1.jsp
     */
    @Execute(validator = false)
	public final String backToInput() {
		LOGGER.debug("backToInput...");

    	// 動的なラジオボタンのデータの生成
    	userKindList = cdMstService.find(MCodeKind.KIND_ACC.getName());
    	userStatusList = cdMstService.find(MCodeKind.STATUS_ACC.getName());
    	seibetuList = cdMstService.find(MCodeKind.GENDER.getName());

    	LOGGER.debug("backToInput...End");

    	return GM01;
    }

    /**
     * ユーザ登録チェックを行います.
     * @return newaccount2.jsp
     */
    @Execute(validate = "validateConfirm", input = "backToInput")
	public final String check() {
		LOGGER.debug("check...");

    	//ユーザ種別ラベル設定
    	MCode userKind = cdMstService.find(MCodeKind.KIND_ACC.getName(), newAccountForm.getUserKind());
    	setUserKindLabel(userKind.getCodeNm());

    	//ユーザステータスラベル設定
    	MCode userStatus = cdMstService.find(MCodeKind.STATUS_ACC.getName(), newAccountForm.getUserStatus());
    	setUserStatusLabel(userStatus.getCodeNm());

    	//性別ラベル設定
    	MCode seibetu = cdMstService.find(MCodeKind.GENDER.getName(), newAccountForm.getSeibetu());
    	setSeibetuLabel(seibetu.getCodeNm());

    	LOGGER.debug("backToInput...End");

    	return GM02;
    }


    /**
     * 確定.
     * <p>
     * 確定処理をおこないます。
     * </p>
     * @return newaccount3.jsp
     */
    @Execute(validate = "duplicateValidateConfirm", input = "backToInput")
	public final String reg() {

    	/** TODO- Dtoで表示情報をセッションに格納する仕組みに変更した方がよさそう。*/

    	//ユーザ情報登録
    	newAccountService.reg(newAccountForm);

    	//ユーザ種別ラベル設定
    	MCode userKind = cdMstService.find(MCodeKind.KIND_ACC.getName(), newAccountForm.getUserKind());
    	setUserKindLabel(userKind.getCodeNm());

    	//ユーザステータスラベル設定
    	MCode userStatus = cdMstService.find(MCodeKind.KIND_ACC.getName(), newAccountForm.getUserKind());
    	setUserStatusLabel(userStatus.getCodeNm());

    	//性別ラベル設定
    	MCode seibetu = cdMstService.find(MCodeKind.GENDER.getName(), newAccountForm.getSeibetu());
    	setSeibetuLabel(seibetu.getCodeNm());

    	return GM03;
    }

    /**
     * メイン画面へ.
     * <p>
     * メイン画面へ遷移する。
     * </p>
     * @return /mgs01001/news/init?redirect=true
     */
    @Execute(validator = false)
	public final String toMain() {


    	// 認証チェック
    	try {
	    	// ログイン実施
    		userDto.setUserInfo(loginService.attestationCheck(newAccountForm.getUserId(), newAccountForm.getPassword()));

    	} catch (MCBusinessException | NoSuchAlgorithmException e) {
    		throw new ActionMessagesException(CommonUtil.prefixError(((MCBusinessException) e).getKey()), ((MCBusinessException) e).getValues());
    	}

    	return GM_NEWS_REDIRECT;

    }

	/**
	 * 重複登録チェック.
	 * <p>
	 * 重複登録のチェックを行います。
	 * </p>
	 * @return ActionMessages エラー情報を返す
	 */
	public final ActionMessages duplicateValidateConfirm() {
		ActionMessages errors = new ActionMessages();
		LOGGER.debug("duplicateValidateConfirm...");

    	//ユーザ情報の重複登録チェック
    	if (newAccountService.accountIdExistCheck(newAccountForm.getUserId())) {
			errors.add("other_err", new ActionMessage("errors.account_duplicateerror"));
    	}

		return errors;
	}

    /**
     * Returns the userKindLabel.
     *
     * @return the userKindLabel
     */
	public final String getUserKindLabel() {
		return userKindLabel;
	}

    /**
     * Sets the userKindLabel.
     *
     * @param prmUserKindLabel ユーザ種別情報
     */
	public final void setUserKindLabel(final String prmUserKindLabel) {
		this.userKindLabel = prmUserKindLabel;
	}

    /**
     * Returns the userStatusLabel.
     *
     * @return the userStatusLabel
     */
	public final String getUserStatusLabel() {
		return userStatusLabel;
	}

    /**
     * Sets the userStatusLabel.
     *
     * @param prmUserStatusLabel  ユーザステータス情報
     */
	public final void setUserStatusLabel(final String prmUserStatusLabel) {
		this.userStatusLabel = prmUserStatusLabel;
	}

    /**
     * Returns the seibetuLabel.
     *
     * @return the seibetuLabel
     */
	public final String getSeibetuLabel() {
		return seibetuLabel;
	}

    /**
     * Sets the seibetuLabel.
     *
     * @param prmSeibetuLabel 性別情報
     */
	public final void setSeibetuLabel(final String prmSeibetuLabel) {
		this.seibetuLabel = prmSeibetuLabel;
	}

	/**
     * Returns the userKindList.
     *
     * @return the userKindList
     */
    public final List<MCode> getUserKindList() {
    	return userKindList;
    }
    /**
     * Sets the userKindList.
     *
     * @param prmUserKindList ユーザ種別リスト情報
     */
    public final void setUserKindList(final List<MCode> prmUserKindList) {
    	this.userKindList = prmUserKindList;
    }
	/**
     * Returns the userStatusList.
     *
     * @return the userStatusList
     */
    public final List<MCode> getUserStatusList() {
    	return userStatusList;
    }
    /**
     * Sets the userStatusList.
     *
     * @param prmUserStatusList ユーザステータスリスト情報
     */
    public final void setUserStatusList(final List<MCode> prmUserStatusList) {
    	this.userStatusList = prmUserStatusList;
    }
	/**
     * Returns the seibetuList.
     *
     * @return the seibetuList
     */
    public final List<MCode> getSeibetuList() {
    	return seibetuList;
    }
    /**
     * Sets the seibetuList.
     *
     * @param prmSeibetuList 性別リスト情報
     */
    public final void setSeibetuList(final List<MCode> prmSeibetuList) {
    	this.seibetuList = prmSeibetuList;
    }


}
