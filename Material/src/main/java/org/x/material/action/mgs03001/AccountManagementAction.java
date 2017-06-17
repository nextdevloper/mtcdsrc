package org.x.material.action.mgs03001;

//import org.seasar.sastruts.example.annotation.Auth;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.annotation.Resource;

import org.seasar.framework.log.Logger;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import org.x.material.common.annotation.Auth;
import org.x.material.common.exception.MCBusinessException;
import org.x.material.common.util.ConstUtil;
import org.x.material.condition.MaterialConstants.MCodeKind;
import org.x.material.dto.UserDto;
import org.x.material.entity.MCode;
import org.x.material.form.mgs03001.AccountManagementForm;
import org.x.material.service.CdMstService;
import org.x.material.service.mgk01001.LoginService;
import org.x.material.service.mgs03001.AccountManagementService;
//import org.apache.log4j.Logger;
// import org.x.material.service.mgk01001.NewAccountService;


/**
 * お知らせアクション
 * @author
 */
public class AccountManagementAction {

	/** ログ**/
	private static Logger logger = Logger.getLogger(AccountManagementAction.class);

	//１．画面の定義
	/** 画面 - GM01 */
	private static final String GM01 = "accountmanagement1.jsp";
	/** 画面 - GM02 */
	private static final String GM02 = "accountmanagement2.jsp";
	/** 画面 - GM03 */
	private static final String GM03 = "accountmanagement3.jsp";
	/** 画面 - GM04 */
	private static final String GM04 = "accountmanagement4.jsp";

	@Resource
	public UserDto userDto;
	/** 認証チェックサービス **/
	@Resource
	protected LoginService loginService;

	@Resource
    @ActionForm
	protected AccountManagementForm AccountManagementForm;

	//TODO DBと名称がことなる。どちらかにあわせる。
    // 表示 - GM01
//	@Resource
//	protected MaterialDto materialDto;

	// アカウントID
    public String user_id_label;
    // アカウント種別 (http:options)
    public List<MCode> user_kind_list;
    public String      user_kind_label;
    // アカウント種別コード
    public String user_kindcd_label;
    // アカウントステータス
    public String user_status_label;
    // アカウント名（名称）
    public String user_name_knj_label;
    // アカウント名（かな）
    public String user_name_kana_label;
    // アカウント名（ニックネーム）
    public String user_name_nick_label;
    // メールアドレス
    public String mail_addr_label;
    // 性別 (http:options)
    public List<MCode> seibetu_list;
    public String      seibetu_label;
    // 性別 コード
    public String      seibetucd_label;
    // 生年月日（年）
    public String birthdateYYYY_label;
    // 生年月日（月）
    public String birthdateMM_label;
    // 生年月日（日）
    public String birthdateDD_label;
    // 電話番号（固定）
    public String tel1_label;
    // 電話番号（携帯）
    public String tel2_label;
    // 備考
    public String note_label;

	@Resource
	protected CdMstService cdMstService;

	@Resource
	protected AccountManagementService AccountManagementService;


	// TODO あとで、commonUtilに移動
	/**
	 * 画面操作時共通処理
	 * @return boolean
	 */
	@Auth
    @Execute(validator = false)
	private ConstUtil.result opeCommon(ConstUtil.opeKind opeKind ) {
		//操作ログ（初期表示）
		logger.log("IMTR0101", new Object[] {"[AccountManagementAction]" ,opeKind,userDto.getAccid()});
		//ユーザ名表示
		user_id_label = userDto.getAccid();
		user_name_knj_label = userDto.getAccnm() + "(" + userDto.getAccnmKana() + ")" ;
		return ConstUtil.result.OK;
	}

	/**
	 * 初期表示
	 * @return accountmanagement1.jsp
	 */
	@Auth
    @Execute(validator = false)
	public String init() {
		//ユーザ情報を再取得
		try {
			userDto.setUserInfo(loginService.getUserInfomation(userDto.getAccid()));
			logger.log("DMTR0001", new Object[] {"[userDto.exCnt]" ,userDto.getExCnt()});
		} catch (NoSuchAlgorithmException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (MCBusinessException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		//画面共通処理（初期処理）
		ConstUtil.result rt;
		rt = opeCommon(ConstUtil.opeKind.init);
		//OKでない場合は、エラーログを出力
		if(rt != ConstUtil.result.OK){
			logger.log("EMTR0101", new Object[] {"[AccountManagementAction]",ConstUtil.opeKind.init,"opeecommon",userDto.getAccid()});
		}
		// アカウント種別
		MCode user_kind = cdMstService.find("MC0101",userDto.getAcckind());
		user_kind_label = user_kind.getCodeNm();
		// アカウントステータス
		MCode user_status = cdMstService.find("MC0102",userDto.getAccstatus());
		user_status_label = user_status.getCodeNm();
		// アカウント名（漢字）
		user_name_knj_label = userDto.getAccnm();
		// アカウント名（かな）
		user_name_kana_label = userDto.getAccnmKana();
		// アカウント名（ニックネーム）
		user_name_nick_label = userDto.getAccnmNick();
		// メールアドレス
		mail_addr_label = userDto.getMailaddress();
		// TODO あとでコード化する。MC1101
		// 性別
		MCode seibetu = cdMstService.find("MC1101",userDto.getGender());
		seibetu_label = seibetu.getCodeNm();
		//生年月日
		if(userDto.getBirthdate().equals("")){
			// 生年月日（年）
			birthdateYYYY_label = "";
			// 生年月日（月）
			birthdateMM_label = "";
			// 生年月日（日）
			birthdateDD_label = "";
		}else{
			// 生年月日（年）
			birthdateYYYY_label = userDto.getBirthdate().substring(0,4);
			// 生年月日（月）
			birthdateMM_label = userDto.getBirthdate().substring(4,6);
			// 生年月日（日）
			birthdateDD_label = userDto.getBirthdate().substring(6,8);
		}
		// 電話番号（固定）
		tel1_label = userDto.getTel1();
		// 電話番号（携帯）
		tel2_label = userDto.getTel2();
		// 備考
		note_label = userDto.getNote();

		return GM01;
	}

	/**
	 * 入力表示
	 * @return accountmanagement2.jsp
	 */
	@Auth
    @Execute(validator = false)
	public String input() {
		//画面共通処理（入力表示）
		ConstUtil.result rt;
		rt = opeCommon(ConstUtil.opeKind.input);
		//OKでない場合は、エラーログを出力
		if(rt != ConstUtil.result.OK){
			logger.log("EMTR0101", new Object[] {"[AccountManagementAction]",ConstUtil.opeKind.input,"opeecommon",userDto.getAccid()});
		}

		AccountManagementForm.initialize();

		// 動的なラジオボタンのデータの生成
//		user_syubetu_list = cdMstService.find("MC0101");
//		logger.log("IMTR0102", new Object[] {"[AccountManagementAction]" ,userDto.accid});
//		logger.log("DMTR0001", new Object[] {"[user_syubetu_list]" ,user_syubetu_list});
//		logger.log("DMTR0001", new Object[] {"[seibetu_list]" ,seibetu_list});

		// ユーザ情報の初期表示
		// ユーザ種別
//		logger.log("DMTR0001", new Object[] {"[user_syubetucd_label]" ,user_syubetucd_label});
		// TODO あとでコード化する。MC1101
		// ユーザ種別：動的なリストボックスのデータの生成
		user_kind_list = cdMstService.find("MC0101");
		// ユーザ種別：初期選択
		user_kindcd_label = userDto.getAcckind();
		logger.log("DMTR0001", new Object[] {"[user_kindcd_label]" ,user_kindcd_label});

	    // アカウント名（漢字）
	    user_name_knj_label = userDto.getAccnm();
	    // アカウント名（かな）
	    user_name_kana_label = userDto.getAccnmKana();
	    // アカウント名（ニックネーム）
	    user_name_nick_label = userDto.getAccnmNick();
	    // メールアドレス
	    mail_addr_label = userDto.getMailaddress();

		// TODO あとでコード化する。MC1101
		// 性別
		// 性別：動的なリストボックスのデータの生成
		seibetu_list = cdMstService.find("MC1101");
//		MCode seibetu = cdMstService.find("MC1101",userDto.gender);
		// 性別：初期選択
		seibetucd_label = userDto.getGender();
		//生年月日
		if(userDto.getBirthdate().equals("")){
			// 生年月日（年）
			birthdateYYYY_label = "";
			// 生年月日（月）
			birthdateMM_label = "";
			// 生年月日（日）
			birthdateDD_label = "";
		}else{
			// 生年月日（年）
			birthdateYYYY_label = userDto.getBirthdate().substring(0,4);
			// 生年月日（月）
			birthdateMM_label = userDto.getBirthdate().substring(4,6);
			// 生年月日（日）
			birthdateDD_label = userDto.getBirthdate().substring(6,8);
		}
		// 電話番号（固定）
		tel1_label = userDto.getTel1();
		// 電話番号（携帯）
		tel2_label = userDto.getTel2();
		// 備考
		note_label = userDto.getNote();


    	user_name_knj_label = userDto.getAccnm() ;

		return GM02;
    }

	/**
     * チェック兼確認表示
     * @return accountmanagement3.jsp
     */
    @Execute(validate = "validateConfirm", input = "input")
    public String check() {
		//画面共通処理（チェック兼確認表示）
		ConstUtil.result rt;
		rt = opeCommon(ConstUtil.opeKind.check);
		//OKでない場合は、エラーログを出力
		if(rt != ConstUtil.result.OK){
			logger.log("EMTR0101", new Object[] {"[AccountManagementAction]",ConstUtil.opeKind.check,"opeecommon",userDto.getAccid()});
		}
    	//TODO チェック処理は後で

    	//ユーザ種別ラベル設定
		MCode userKind = cdMstService.find(MCodeKind.KIND_ACC.getName(), AccountManagementForm.user_kind);
    	user_kind_label = userKind.getCodeNm();

    	//性別ラベル設定
    	MCode seibetu = cdMstService.find(MCodeKind.GENDER.getName(), AccountManagementForm.seibetu);
    	seibetu_label = seibetu.getCodeNm();

    	return GM03;
    }

    /**
     * 確定
     * @return accountmanagement1.jsp
     */
    @Execute(validator = true, input = "init")
    public String reg() {
		//画面共通処理（確定）
		ConstUtil.result rt;
		rt = opeCommon(ConstUtil.opeKind.reg);
		//OKでない場合は、エラーログを出力
		if(rt != ConstUtil.result.OK){
			logger.log("EMTR0101", new Object[] {"[AccountManagementAction]",ConstUtil.opeKind.reg,"opeecommon",userDto.getAccid()});
		}
    	/** TODO- Dtoで表示情報をセッションに格納する仕組みに変更した方がよさそう。*/

    	//ユーザ情報の重複登録チェック
//    	if(AccountManagementService.accountIdExistCheck(AccountManagementForm.user_id)){
//    		throw new ActionMessagesException("アカウントIDはすでに使用されています。", false);
//    	}

    	//ユーザ情報変更
    	AccountManagementService.reg(AccountManagementForm);

    	//ユーザ種別ラベル設定
    	MCode userKind = cdMstService.find(MCodeKind.KIND_ACC.getName(), AccountManagementForm.user_kind);
//    	user_kind_label = AccountManagementForm.user_kind;
    	user_kind_label = userKind.getCodeNm();

    	//性別ラベル設定
    	MCode seibetu = cdMstService.find(MCodeKind.GENDER.getName(), AccountManagementForm.seibetu);
    	seibetu_label = seibetu.getCodeNm();

    	return GM04;

    }
    /**
     * 初期表示画面に戻る
	 * @return  accountmanagement1.jsp
     */
    @Execute(validator = false)
	public String backToInit() {
    	// TODO 要検討
    	//初期処理を実施
    	return init();
/*
		//画面共通処理（入力画面に戻る）
		ConstUtil.result rt;
		rt = opeCommon(ConstUtil.opeKind.backToInit);
		//OKでない場合は、エラーログを出力
		if(rt != ConstUtil.result.OK){
			logger.log("EMTR0101", new Object[] {"[AccountManagementAction]",ConstUtil.opeKind.backToInit,"opeecommon",userDto.accid});
		}

    	// 動的なラジオボタンのデータの生成
    	user_syubetu_list = cdMstService.find("MC0101");
    	seibetu_list = cdMstService.find("MC1101");

    	return GM01;
*/
    }

    /**
     * 入力画面に戻る
	 * @return  accountmanagement2.jsp
     */
    @Execute(validator = false)
	public String backToInput() {
    	// TODO 要検討
    	//初期処理を実施
    	return init();
/*
		//画面共通処理（入力画面に戻る）
		ConstUtil.result rt;
		rt = opeCommon(ConstUtil.opeKind.backToInput);
		//OKでない場合は、エラーログを出力
		if(rt != ConstUtil.result.OK){
			logger.log("EMTR0101", new Object[] {"[AccountManagementAction]",ConstUtil.opeKind.backToInput,"opeecommon",userDto.accid});
		}

    	// 動的なラジオボタンのデータの生成
    	user_syubetu_list = cdMstService.find("MC0101");
    	seibetu_list = cdMstService.find("MC1101");

    	return GM02;
*/
	}

}
