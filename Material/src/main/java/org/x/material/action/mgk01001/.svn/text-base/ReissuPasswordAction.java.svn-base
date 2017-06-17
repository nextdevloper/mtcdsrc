package org.x.material.action.mgk01001;



import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.seasar.doma.jdbc.NoResultException;
import org.seasar.framework.container.annotation.tiger.Binding;
import org.seasar.framework.container.annotation.tiger.BindingType;
import org.seasar.mai.mail.MailAddress;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.exception.ActionMessagesException;
import org.x.material.dto.MailDto;
import org.x.material.form.mgk01001.ReissuPasswordForm;
import org.x.material.mai.MailMai;
import org.x.material.service.mgk01001.ReissuPasswordService;


/**
 * パスワード再登録アクション.
 *
 * @author nakada
 * @since   20141016.1.0
 * @version 20141016.0.1
 */
public class ReissuPasswordAction {

	/** 画面 - GM01. */
	private static final String GM01 = "reissupassword1.jsp";
	/** 画面 - GM02. */
	private static final String GM02 = "reissupassword2.jsp";
	/** 画面 - GM_LOGIN. */
	private static final String GM_LOGIN_REDIRECT = "/mgk01001/login/init?redirect=true";
	/** メール subject指定. */
	private static final String ST_SUBJECT = "パスワードを変更しました.";

	/** ログ出力定義. */
	private static final Logger LOGGER = Logger.getLogger(ReissuPasswordAction.class);

	/** コンスタント定義. */
	@Binding(bindingType = BindingType.MUST)
	private MailMai mailMai;

	/** アクションフォームの設定情報. **/
	@Resource
	@ActionForm
	private ReissuPasswordForm reissuPasswordForm;


	/** パスワード再発行サービス. **/
	@Resource
	private ReissuPasswordService reissuPasswordService;

	/**
	 * 初期表示.
	 *
	 * @return reissupassword1.jsp
	 */
    @Execute(validator = false, reset = "reset")
	public final String init() {
    	LOGGER.debug("init...");


		return GM01;
    }

    /**
     * パスワード再発行.
     *
     * @return reissupassword2.jsp
     */
    @Execute(validate = "validateConfirm", input = GM01)
	public final String reReg() {
    	LOGGER.debug("reReg...");

    	try {
	    	// メールアドレス検索及びアカウント取得
	    	reissuPasswordService.getMaccount(reissuPasswordForm.getMailAddr());

	    	// パスワード生成
	    	reissuPasswordService.makePassword();

	    	// パスワード更新
	    	reissuPasswordService.reRegPassword();

	    	// パスワード更新通知
	    	rissueMailSend();

    	} catch (NoResultException e) {
            //エラーメッセージをセットします。
    		throw new ActionMessagesException("errors.nomailaddress");
        }
		return GM02;

    }

    /**
     * ログインページ画面へ遷移.
     *
     * @return /mgk01001/login/init?redirect=true
     */
    @Execute(validator = false)
	public final String toLogin() {

    	return GM_LOGIN_REDIRECT;

    }

	/**
	 * メール送信.
	 */
    public final void rissueMailSend() {

    	LOGGER.debug("rissueMailSend...");

    	/** メール送信. */
    	MailDto mailDto = new MailDto();

    	mailDto.setSubject(ST_SUBJECT);
    	mailDto.setFrom(new MailAddress("info@reve-gift.co.jp"));

    	mailDto.setTo(new MailAddress[]{new MailAddress(reissuPasswordForm.getMailAddr())});

    	mailDto.setExtendValue1(reissuPasswordService.getMaccountList().get(0).getAccNm().toString());

    	List<String> acclist = new ArrayList<String>();
    	for (int i = 0; i < reissuPasswordService.getMaccountList().size(); i++) {
//    		acclist.add(new String(
//    				reissuPasswordService.getMaccountList().get(i).getAccId().toString()));
    		acclist.add(reissuPasswordService.getMaccountList().get(i).getAccId().toString());
    	}

    	mailDto.setAccList(acclist.toArray(new String[acclist.size()]));
    	mailDto.setExtendValue2(reissuPasswordService.getPassWord());

    	mailMai.sendRegisterMail(mailDto);

    }

    /**
     * Returns the reissuPasswordForm.
     *
     * @return the reissuPasswordForm
     */
    public final ReissuPasswordForm getReissuPasswordForm() {
        return reissuPasswordForm;
    }

    /**
     * Sets the reissuPasswordForm.
     *
     * @param prmReissuPasswordForm アクションフォーム情報
     */
    public final void setReissuPasswordForm(final ReissuPasswordForm prmReissuPasswordForm) {
        this.reissuPasswordForm = prmReissuPasswordForm;
    }


}
