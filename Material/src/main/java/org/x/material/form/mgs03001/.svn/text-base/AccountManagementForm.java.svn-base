package org.x.material.form.mgs03001;

import java.io.Serializable;

import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;
import org.seasar.struts.annotation.DateType;
import org.seasar.struts.annotation.EmailType;
import org.seasar.struts.annotation.Mask;
import org.seasar.struts.annotation.Maxlength;
import org.seasar.struts.annotation.Minlength;
import org.seasar.struts.annotation.Msg;
import org.seasar.struts.annotation.Required;
import org.seasar.struts.annotation.Validwhen;

/**
 * 新規アカウント登録 Form
 * @author x
 */
@Component(instance = InstanceType.SESSION)
public class AccountManagementForm implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

//	/** アカウントID */
//	@Required
//	@Maxlength(maxlength=20)
//	@Mask(mask = "^[a-zA-Z0-9]+$")
//	public String user_id;
	/** アカウント種別 */
	@Required
	public String user_kind;
	
//	/** アカウント種別コード */
//	@Required
//	public String user_kindcd_ｌabel;
//	public LinkedHashMap userkindMap;
	/** 氏名（漢字）*/
	@Required
	@Maxlength(maxlength=80)
	public String user_name_knj;
	/** 氏名（かな）*/
	@Maxlength(maxlength=80)
	public String user_name_kana;
	/** ニックネーム */
	@Maxlength(maxlength=80)
	public String user_name_nick;
	/** メールアドレス */
	@Required
	@EmailType
	@Maxlength(maxlength=80)
	public String mail_addr;
	/** メールアドレス（確認用） */
	@Required
	@EmailType
	@Maxlength(maxlength=80)
	public String mail_addr_kakunin;
	/** パスワード */
	@Required
	@Minlength(minlength = 5)
	@Maxlength(maxlength = 16)
	@Mask(mask = "^[a-zA-Z0-9]+$")
	public String password;
	/** パスワード （確認用）*/
	@Required
	@Minlength(minlength = 5)
	@Maxlength(maxlength = 16)
	@Mask(mask = "^[a-zA-Z0-9]+$")
	public String password_kakunin;
	/** 性別 */
	public String seibetu;
	/** 生年月日　西暦年（YYYY） */
	@DateType(datePattern = "yyyy")
	@Mask(mask = "[0-9]{4}")
	@Validwhen(test = "((seinengappi_MM == null) or (*this* != null))",
    msg = @Msg(key = "errors.required.other"))
	public String seinengappi_YYYY;
	/** 生年月日　西暦月（MM） */
	@DateType(datePattern = "MM")
	@Mask(mask = "[0-9]{2}")
	@Validwhen(test = "((seinengappi_DD == null) or (*this* != null))",
    msg = @Msg(key = "errors.required.other"))
	public String seinengappi_MM;
	/** 生年月日　西暦日（DD） */
	@DateType(datePattern = "dd")
	@Mask(mask = "[0-9]{2}")
	@Validwhen(test = "((seinengappi_YYYY == null) or (*this* != null))",
	msg = @Msg(key = "errors.required.other"))
	public String seinengappi_DD;
	/** 電話番号（固定） */
	@Maxlength(maxlength=15)
	public String tel_kotei;
	/** 電話番号（携帯） */
	@Maxlength(maxlength=15)
	public String tel_keitai;
	/** 備考 */
	@Maxlength(maxlength=250)
	public String biko;

	/**
	 * Form初期化
	 */
	public void initialize() {
	}

	/**
	 * Formクリア
	 * 	setterが実施される前に動作します。
	 */
	public void reset() {
	}

	/**
	 * 確認チェック
	 * 	確認項目のチェックを行います。
	 */
	public ActionMessages validateConfirm() {
		ActionMessages errors = new ActionMessages();

		if(!mail_addr.equals(mail_addr_kakunin)){
			errors.add("mail_addr", new ActionMessage("メールアドレスが異なります。",false));
		}

		if(!password.equals(password_kakunin)){
			errors.add("password", new ActionMessage("パスワードが異なります。",false));
		}

		return errors;
	}
}
