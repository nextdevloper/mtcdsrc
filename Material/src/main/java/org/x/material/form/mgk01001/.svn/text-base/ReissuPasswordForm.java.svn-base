package org.x.material.form.mgk01001;

import static org.x.material.condition.MaterialConstants.*;

import java.io.Serializable;

import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;
import org.seasar.struts.annotation.EmailType;
import org.seasar.struts.annotation.Maxlength;
import org.seasar.struts.annotation.Required;

/**
 * パスワード再発行 Form.
 *
 * @author  nakada
 * @since   20141026.01.00
 * @version 20141026.00.01
 */
@Component(instance = InstanceType.SESSION)
public class ReissuPasswordForm implements Serializable {

	/** シリアルバージョン番号. */
	private static final long serialVersionUID = 1L;

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

	/**
	 * 確認チェック.
	 * 	確認項目のチェックを行います。
	 *
	 * @return errors the ActionMessages
	 */
	public final ActionMessages validateConfirm() {
		ActionMessages errors = new ActionMessages();

		if (!mailAddr.equals(mailAddrKakunin)) {
			errors.add(null, new ActionMessage("errors.mail_confirmerror", false));
		}

		return errors;
	}

	/**
	 * リセット.
	 * 	入力項目をリセットします
	 */
	public final void reset() {
		mailAddr = null;
		mailAddrKakunin = null;
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

}
