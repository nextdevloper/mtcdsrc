package org.x.material.form.mgk01001;

import static org.x.material.condition.MaterialConstants.*;

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
import org.x.material.common.util.CommonUtil;
import org.x.material.common.util.DateUtil;

/**
 * Form:新規アカウント登録.
 *
 * @author  nakada
 * @since   20141026.1.0
 * @version 20141026.0.1
 */
@Component(instance = InstanceType.SESSION)
public class NewAccountForm implements Serializable {

	/** シリアルバージョン番号. */
	private static final long serialVersionUID = 1L;

	/** アカウントID. */
	@Required
	@Maxlength(maxlength = USERIDMAX)
	@Mask(mask = "^[a-zA-Z0-9]+$")
	private String userId;
	/** アカウント種別. */
	@Required
	private String userKind;
//	public LinkedHashMap usersyubetuMap;
	/** アカウントステータス. */
	@Required
	private String userStatus;
	/** 氏名（漢字）. */
	@Required
	@Maxlength(maxlength = USERNAMEKNJMAX)
	private String userNameKnj;
	/** 氏名（かな）. */
	@Maxlength(maxlength = USERNAMEKANAMAX)
	private String userNameKana;
	/** ニックネーム. */
	@Maxlength(maxlength = USERNAMENICKMAX)
	private String userNameNick;
	/** メールアドレス. */
	@Required
	@EmailType
	@Maxlength(maxlength = MAILADDRMAX)
	private String mailAddr;
	/** メールアドレス（確認用）. */
	@Required
	@EmailType
	@Maxlength(maxlength = MAILADDRMAX)
	private String mailAddrKakunin;
	/** パスワード. */
	@Required
	@Minlength(minlength = PASSWORDMIN)
	@Maxlength(maxlength = PASSWORDMAX)
	@Mask(mask = "^[a-zA-Z0-9]+$")
	private String password;
	/** パスワード （確認用）. */
	@Required
	@Minlength(minlength = PASSWORDMIN)
	@Maxlength(maxlength = PASSWORDMAX)
	@Mask(mask = "^[a-zA-Z0-9]+$")
	private String passwordKakunin;
	/** 性別. */
	private String seibetu;
	/** 生年月日　西暦年（YYYY）.  */
	@DateType(datePattern = "yyyy")
	@Mask(mask = "[0-9]{4}")
	@Validwhen(test = "((seinengappiMM == null) or (*this* != null))",
    msg = @Msg(key = "errors.required.other"))
	private String seinengappiYYYY;
	/** 生年月日　西暦月（MM）. */
	@DateType(datePattern = "MM")
	@Mask(mask = "[0-9]{2}")
	@Validwhen(test = "((seinengappiDD == null) or (*this* != null))",
    msg = @Msg(key = "errors.required.other"))
	private String seinengappiMM;
	/** 生年月日　西暦日（DD）. */
	@DateType(datePattern = "dd")
	@Mask(mask = "[0-9]{2}")
	@Validwhen(test = "((seinengappiYYYY == null) or (*this* != null))",
	msg = @Msg(key = "errors.required.other"))
	private String seinengappiDD;
	/** 電話番号（固定）. */
	@Maxlength(maxlength = TELKOTEIMAX)
	private String telKotei;
	/** 電話番号（携帯）. */
	@Maxlength(maxlength = TELKEITAIMAX)
	private String telKeitai;
	/** 備考. */
	@Maxlength(maxlength = BIKOMAX)
	private String biko;


	/**
	 * Form初期化.
	 */
	public final void initialize() {
		userId = null;
		userKind = null;
		userNameKnj = null;
		userNameKnj = null;
		userNameKana = null;
		userNameNick = null;
		mailAddr = null;
		mailAddrKakunin = null;
		password = null;
		passwordKakunin = null;
		setSeibetu(null);
		seinengappiYYYY = null;
		seinengappiMM = null;
		seinengappiDD = null;
		telKotei = null;
		telKeitai = null;
		biko = null;

	}

	/**
	 * Formクリア.
	 * 	setterが実施される前に動作します。
	 */
	public void reset() {
	}

	/**
	 * 確認チェック.
	 * 	確認項目のチェックを行います。
	 *  エラーの場合、ActioMessagesに、エラーを設定します。
	 * @return ActionMessages
	 */
	public final ActionMessages validateConfirm() {
		ActionMessages errors = new ActionMessages();

		/**
		 * メールアドレスのチェック
		 */
		if (!mailAddr.equals(mailAddrKakunin)) {
			errors.add("mail_addr", new ActionMessage(CommonUtil.prefixError("100001E")));
		}

		/**
		 * パスワードのチェック
		 */
		if (!password.equals(passwordKakunin)) {
			errors.add("password", new ActionMessage("errors.passwd_confirmerror", false));
		}

		/**
		 * 生年月日のチェック
		 */
		if (seinengappiYYYY.length() != 0 && seinengappiMM.length() != 0 && seinengappiDD.length() != 0) {
			if (!DateUtil.checkDate(DateUtil.toDateFormatString(seinengappiYYYY, seinengappiMM, seinengappiDD))) {
				errors.add("date_other_err", new ActionMessage("errors.date.other"));
			}
		}

		return errors;
	}

	/**
     * Returns the userId.
     *
     * @return the userId
     */
	public final String getUserId() {
		return userId;
	}

    /**
     * Sets the userId.
     *
     * @param prmUserId アカウントID
     */
	public final void setUserId(final String prmUserId) {
		this.userId = prmUserId;
	}

	/**
     * Returns the userKind.
     *
     * @return the userKind
     */
	public final String getUserKind() {
		return userKind;
	}

    /**
     * Sets the userKind.
     *
     * @param prmUserKind アカウント種別
     */
	public final void setUserKind(final String prmUserKind) {
		this.userKind = prmUserKind;
	}

	/**
     * Returns the userStatus.
     *
     * @return the userStatus
     */
	public final String getUserStatus() {
		return userStatus;
	}

    /**
     * Sets the userStatus.
     *
     * @param prmUserStatus アカウントステータス
     */
	public final void setUserStatus(final String prmUserStatus) {
		this.userStatus = prmUserStatus;
	}

	/**
     * Returns the userNameKnj.
     *
     * @return the userNameKnj
     */
	public final String getUserNameKnj() {
		return userNameKnj;
	}

    /**
     * Sets the userNameKnj.
     *
     * @param prmUserNameKnj 氏名（漢字）
     */
	public final void setUserNameKnj(final String prmUserNameKnj) {
		this.userNameKnj = prmUserNameKnj;
	}

	/**
     * Returns the userNameKana.
     *
     * @return the userNameKana
     */
	public final String getUserNameKana() {
		return userNameKana;
	}

    /**
     * Sets the userNameKana.
     *
     * @param prmUserNameKana 氏名（かな）
     */
	public final void setUserNameKana(final String prmUserNameKana) {
		this.userNameKana = prmUserNameKana;
	}

	/**
     * Returns the userNameNick.
     *
     * @return the userNameNick
     */
	public final String getUserNameNick() {
		return userNameNick;
	}

    /**
     * Sets the userNameNick.
     *
     * @param prmUserNameNick ニックネーム
     */
	public final void setUserNameNick(final String prmUserNameNick) {
		this.userNameNick = prmUserNameNick;
	}

	/**
     * Returns the mailAddr.
     *
     * @return the mailAddr
     */
	public final String getMailAddr() {
		return mailAddr;
	}

    /**
     * Sets the mailAddr.
     *
     * @param prmMailAddr メールアドレス
     */
	public final void setMailAddr(final String prmMailAddr) {
		this.mailAddr = prmMailAddr;
	}

	/**
     * Returns the mailAddrKakunin.
     *
     * @return the mailAddrKakunin
     */
	public final String getMailAddrKakunin() {
		return mailAddrKakunin;
	}

    /**
     * Sets the mailAddrKakunin.
     *
     * @param prmMailAddrKakunin メールアドレス（確認用）
     */
	public final void setMailAddrKakunin(final String prmMailAddrKakunin) {
		this.mailAddrKakunin = prmMailAddrKakunin;
	}

	/**
     * Returns the password.
     *
     * @return the password
     */
	public final String getPassword() {
		return password;
	}

    /**
     * Sets the password.
     *
     * @param prmPassword パスワード
     */
	public final void setPassword(final String prmPassword) {
		this.password = prmPassword;
	}

	/**
     * Returns the passwordKakunin.
     *
     * @return the passwordKakunin
     */
	public final String getPasswordKakunin() {
		return passwordKakunin;
	}

    /**
     * Sets the passwordKakunin.
     *
     * @param prmPasswordKakunin パスワード （確認用）
     */
	public final void setPasswordKakunin(final String prmPasswordKakunin) {
		this.passwordKakunin = prmPasswordKakunin;
	}

	/**
     * Returns the seibetu.
     *
     * @return the seibetu
     */
	public final String getSeibetu() {
		return seibetu;
	}

    /**
     * Sets the seibetu.
     *
     * @param prmSeibetu 性別
     */
	public final void setSeibetu(final String prmSeibetu) {
		this.seibetu = prmSeibetu;
	}

	/**
     * Returns the seinengappiYYYY.
     *
     * @return the seinengappiYYYY
     */
	public final String getSeinengappiYYYY() {
		return seinengappiYYYY;
	}

    /**
     * Sets the seinengappiYYYY.
     *
     * @param prmSeinengappiYYYY 生年月日　西暦年（YYYY）
     */
	public final void setSeinengappiYYYY(final String prmSeinengappiYYYY) {
		this.seinengappiYYYY = prmSeinengappiYYYY;
	}

	/**
     * Returns the seinengappiMM.
     *
     * @return the seinengappiMM
     */
	public final String getSeinengappiMM() {
		return seinengappiMM;
	}

    /**
     * Sets the seinengappiMM.
     *
     * @param prmSeinengappiMM 生年月日　西暦月（MM）
     */
	public final void setSeinengappiMM(final String prmSeinengappiMM) {
		this.seinengappiMM = prmSeinengappiMM;
	}

	/**
     * Returns the seinengappiDD.
     *
     * @return the seinengappiDD
     */
	public final String getSeinengappiDD() {
		return seinengappiDD;
	}

    /**
     * Sets the seinengappiDD.
     *
     * @param prmSeinengappiDD 生年月日　西暦日（DD）
     */
	public final void setSeinengappiDD(final String prmSeinengappiDD) {
		this.seinengappiDD = prmSeinengappiDD;
	}

	/**
     * Returns the telKotei.
     *
     * @return the telKotei
     */
	public final String getTelKotei() {
		return telKotei;
	}

    /**
     * Sets the telKotei.
     *
     * @param prmTelKotei 電話番号（固定）
     */
	public final void setTelKotei(final String prmTelKotei) {
		this.telKotei = prmTelKotei;
	}

	/**
     * Returns the telKeitai.
     *
     * @return the telKeitai
     */
	public final String getTelKeitai() {
		return telKeitai;
	}

    /**
     * Sets the telKeitai.
     *
     * @param prmTelKeitai 電話番号（携帯）
     */
	public final void setTelKeitai(final String prmTelKeitai) {
		this.telKeitai = prmTelKeitai;
	}

	/**
     * Returns the biko.
     *
     * @return the biko
     */
	public final String getBiko() {
		return biko;
	}

    /**
     * Sets the biko.
     *
     * @param prmBiko 備考
     */
	public final void setBiko(final String prmBiko) {
		this.biko = prmBiko;
	}


}
