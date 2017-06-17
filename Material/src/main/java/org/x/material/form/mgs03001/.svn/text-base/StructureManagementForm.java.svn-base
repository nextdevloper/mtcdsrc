package org.x.material.form.mgs03001;

import static org.x.material.condition.MaterialConstants.*;

import java.io.Serializable;

import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;
import org.seasar.struts.annotation.EmailType;
import org.seasar.struts.annotation.IntegerType;
import org.seasar.struts.annotation.Mask;
import org.seasar.struts.annotation.Maxlength;
import org.seasar.struts.annotation.Required;
import org.x.material.common.util.CommonUtil;

/**
 * 組織管理 Form
 *
 * @author  nakada
 * @since   20150225.0.1
 * @version 20150225.0.1
 */
@Component(instance = InstanceType.SESSION)
public class StructureManagementForm implements Serializable {

	/** セッションシリアル番号. */
	private static final long serialVersionUID = 1L;

	/** 組織一覧マルチチェックボックス. */
	private String[] chkStrct;

	/** 組織IDパラメータ. */
	private String strctkey;

	/** 組織一覧ページ番号. */
	@Required
	@IntegerType
	private String strpageno;

	/**
	 * 画面入力項目
	 */
	/** 組織属性id. */
	@Required(target = "strctInsCheck")
	@Maxlength(maxlength = STRCTIDMAX)
	@Mask(mask = "^[a-zA-Z0-9]+$")
	private String strctId;

	/** 組織ステータス. */
	private String strctStatus;

	/** 組織種別. */
	@Required(target = "strctInsCheck")
	private String strctKind;

	/** 組織名（漢字）. */
	@Required(target = "strctInsCheck")
	@Maxlength(maxlength = STRCTNMMAX)
	private String strctNm;

	/** 組織名（かな）.*/
	@Required(target = "strctInsCheck")
	@Maxlength(maxlength = STRCTNMKANAMAX)
	private String strctNmKana;

	/** 組織名（略称）.*/
	@Required(target = "strctInsCheck")
	@Maxlength(maxlength = STRCTNMNICKMAX)
	private String strctNmNick;

	/** メールアドレス. */
	@Required(target = "strctInsCheck")
	@Maxlength(maxlength = MAILADDRMAX)
	@EmailType
	private String mailAddress;

	/** メールアドレス（確認用）.*/
	@Required(target = "strctInsCheck")
	@Maxlength(maxlength = MAILADDRMAX)
	@EmailType
	private String mailAddressConfirm;

	/** 電話番号（固定）.*/
	@Maxlength(maxlength = TELKOTEIMAX)
	private String tel1;

	/** 電話番号（携帯）.*/
	@Maxlength(maxlength = TELKEITAIMAX)
	private String tel2;

	/** 備考. */
	@Maxlength(maxlength = BIKOMAX)
	private String note;

	/** 追加タグA. */
	@Maxlength(maxlength = TAGAMAX)
	private String tagA;

	/** 追加タグB. */
	@Maxlength(maxlength = TAGBMAX)
	private String tagB;


	/**
	 * Form初期化.
	 */
	public final void initialize() {
		strctId = null;
		strctStatus = null;
		strctKind = "01";
		strctNm = null;
		strctNmKana = null;
		strctNmNick = null;
		mailAddress = null;
		mailAddressConfirm = null;
		tel1 = null;
		tel2 = null;
		note = null;
		tagA = null;
		tagB = null;

	}

	/**
	 * Formクリア.
	 * 	setterが実施される前に動作します。
	 */
	public final void reset() {
		strctStatus = "02";
		chkStrct = new String[0];
	}

	/**
	 * 組織登録チェック.
	 * 	確認項目のチェックを行います。
	 *  エラーの場合、ActioMessagesに、エラーを設定します。
	 * @return ActionMessages
	 */
	public final ActionMessages strctValidateConfirm() {
		ActionMessages errors = new ActionMessages();

		/**
		 * メールアドレスのチェック
		 */
		if (!mailAddress.equals(mailAddressConfirm)) {
			errors.add("mailAddress", new ActionMessage(CommonUtil.prefixError("100001E")));
		}

		return errors;
	}

	//
	// getter setter
	//
	/**
	 * Returns the chkStrct.
	 * @return chkStrct
	 */
	public final String[] getChkStrct() {
		return chkStrct;
	}

	/**
     * Sets the chkStrct.
	 * @param prmChkStrct セットする chkStrct
	 */
	public final void setChkStrct(final String[] prmChkStrct) {
		this.chkStrct = prmChkStrct;
	}

	/**
	 * Returns the strctkey.
	 * @return strctkey
	 */
	public final String getStrctkey() {
		return strctkey;
	}

	/**
     * Sets the chkStrct.
	 * @param prmStrctkey セットする strctkey
	 */
	public final void setStrctkey(final String prmStrctkey) {
		this.strctkey = prmStrctkey;
	}

	/**
	 * Returns the strpageno.
	 * @return strpageno
	 */
	public final String getStrpageno() {
		return strpageno;
	}

	/**
     * Sets the strpageno.
	 * @param prmStrpageno セットする strpageno
	 */
	public final void setStrpageno(final String prmStrpageno) {
		this.strpageno = prmStrpageno;
	}

	/**
	 * Returns the strctId.
	 * @return strctId
	 */
	public final String getStrctId() {
		return strctId;
	}

	/**
     * Sets the strctId.
	 * @param prmStrctId セットする strctId
	 */
	public final void setStrctId(final String prmStrctId) {
		this.strctId = prmStrctId;
	}

	/**
	 * Returns the strctStatus.
	 * @return strctStatus
	 */
	public final String getStrctStatus() {
		return strctStatus;
	}

	/**
     * Sets the strctStatus.
	 * @param prmStrctStatus セットする strctStatus
	 */
	public final void setStrctStatus(final String prmStrctStatus) {
		this.strctStatus = prmStrctStatus;
	}

	/**
	 * Returns the strctKind.
	 * @return strctKind
	 */
	public final String getStrctKind() {
		return strctKind;
	}

	/**
     * Sets the strctKind.
	 * @param prmStrctKind セットする strctKind
	 */
	public final void setStrctKind(final String prmStrctKind) {
		this.strctKind = prmStrctKind;
	}

	/**
	 * Returns the strctNm.
	 * @return strctNm
	 */
	public final String getStrctNm() {
		return strctNm;
	}

	/**
     * Sets the strctNm.
	 * @param prmStrctNm セットする strctNm
	 */
	public final void setStrctNm(final String prmStrctNm) {
		this.strctNm = prmStrctNm;
	}

	/**
	 * Returns the strctNmKana.
	 * @return strctNmKana
	 */
	public final String getStrctNmKana() {
		return strctNmKana;
	}

	/**
     * Sets the strctNmKana.
	 * @param prmStrctNmKana セットする strctNmKana
	 */
	public final void setStrctNmKana(final String prmStrctNmKana) {
		this.strctNmKana = prmStrctNmKana;
	}

	/**
	 * Returns the strctNmNick.
	 * @return strctNmNick
	 */
	public final String getStrctNmNick() {
		return strctNmNick;
	}

	/**
     * Sets the strctNmNick.
	 * @param prmStrctNmNick セットする strctNmNick
	 */
	public final void setStrctNmNick(final String prmStrctNmNick) {
		this.strctNmNick = prmStrctNmNick;
	}

	/**
	 * Returns the mailAddress.
	 * @return mailAddress
	 */
	public final String getMailAddress() {
		return mailAddress;
	}

	/**
     * Sets the mailAddress.
	 * @param prmMailAddress セットする mailAddress
	 */
	public final void setMailAddress(final String prmMailAddress) {
		this.mailAddress = prmMailAddress;
	}

	/**
	 * Returns the mailAddressConfirm.
	 * @return mailAddressConfirm
	 */
	public final String getMailAddressConfirm() {
		return mailAddressConfirm;
	}

	/**
     * Sets the mailAddressConfirm.
	 * @param prmMailAddressConfirm セットする mailAddressConfirm
	 */
	public final void setMailAddressConfirm(final String prmMailAddressConfirm) {
		this.mailAddressConfirm = prmMailAddressConfirm;
	}

	/**
	 * Returns the tel1.
	 * @return tel1
	 */
	public final String getTel1() {
		return tel1;
	}

	/**
     * Sets the tel1.
	 * @param prmTel1 セットする tel1
	 */
	public final void setTel1(final String prmTel1) {
		this.tel1 = prmTel1;
	}

	/**
	 * Returns the tel2.
	 * @return tel2
	 */
	public final String getTel2() {
		return tel2;
	}

	/**
     * Sets the tel2.
	 * @param prmTel2 セットする tel2
	 */
	public final void setTel2(final String prmTel2) {
		this.tel2 = prmTel2;
	}

	/**
	 * Returns the note.
	 * @return note
	 */
	public final String getNote() {
		return note;
	}

	/**
     * Sets the note.
	 * @param prmNote セットする note
	 */
	public final void setNote(final String prmNote) {
		this.note = prmNote;
	}

	/**
	 * Returns the tagA.
	 * @return tagA
	 */
	public final String getTagA() {
		return tagA;
	}

	/**
     * Sets the tagA.
	 * @param prmTagA セットする tagA
	 */
	public final void setTagA(final String prmTagA) {
		this.tagA = prmTagA;
	}

	/**
	 * Returns the tagB.
	 * @return tagB
	 */
	public final String getTagB() {
		return tagB;
	}

	/**
     * Sets the tagB.
	 * @param prmTagB セットする tagB
	 */
	public final void setTagB(final String prmTagB) {
		this.tagB = prmTagB;
	}

}
