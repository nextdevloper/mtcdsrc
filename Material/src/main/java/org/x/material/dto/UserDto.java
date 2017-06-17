package org.x.material.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;
import org.x.material.common.util.DateUtil;
import org.x.material.entity.MAccount;

/**
 * ユーザー情報.
 *
 * @author nakada
 * @since   20140501.0.0
 * @version 20141016.0.1
 */
@Component(instance = InstanceType.SESSION)
public class UserDto implements Serializable {

	/** シリアルバージョン番号. */
	private static final long serialVersionUID = 1L;

	/** アカウントID. */
	private String	accid = null;

	/** アカウント種別. */
	private String	acckind = null;

	/** アカウントステータス. */
	private String	accstatus = null;

	/** アカウント名（名称）. */
	private String	accnm = null;

	/** アカウント名（かな）. */
	private String	accnmKana = null;

	/** アカウント名（ニックネーム）. */
	private String	accnmNick = null;

	/** メールアドレス. */
	private String	mailaddress = null;

	/** パスワード. */
	private String	password = null;

	/** 性別. */
	private String	gender = null;

	/** 生年月日. */
	private String	birthdate = null;

	/** 電話番号（固定）. */
	private String	tel1 = null;

	/** 電話番号（携帯）. */
	private String	tel2 = null;

	/** 備考. */
	private String	note = null;

	/** 標準ロケールID. */
	private String	defaultlocale = null;

	/** レコードID. */
	private String	recid = null;

	/** 排他制御カウンタ. */
	private String	exCnt = null;

	/** 登録アカウント. */
	private String	insacc = null;

	/** 登録日時. */
	private String	insdate = null;

	/**
	 * ログインしているかどうかを返します。.
	 *
	 * @return true login /false Not login
	 */
	public final boolean isLogin() {
		return accid != null;
	}

	/**
	 * ユーザ情報を設定します.
	 *
	 * @param userInfoList ユーザ情報
	 */
	public final void setUserInfo(final List<MAccount> userInfoList) {
		accid = userInfoList.get(0).getAccId();
		acckind = userInfoList.get(0).getAccKind();
		accstatus = userInfoList.get(0).getAccStat();
		accnm = userInfoList.get(0).getAccNm();
		accnmKana = userInfoList.get(0).getAccNmKana();
		accnmNick = userInfoList.get(0).getAccNmNick();
		mailaddress = userInfoList.get(0).getMailaddress();
		password = userInfoList.get(0).getPassword();
		gender = userInfoList.get(0).getGender();
		birthdate = userInfoList.get(0).getBirthdate();
		tel1 = userInfoList.get(0).getTel1();
		tel2 = userInfoList.get(0).getTel2();
		note = userInfoList.get(0).getNote();
		defaultlocale = userInfoList.get(0).getDefaultLocale();
		recid = userInfoList.get(0).getRecId().toString();
		exCnt = userInfoList.get(0).getExCnt().toString();
		insacc = userInfoList.get(0).getInsAcc().toString();
		setInsdate(userInfoList.get(0).getInsDate());
	}

	/**
	 *  ユーザ情報を破棄します.
	 */
	public final void resetUserinfo() {
		accid = null;
		acckind = null;
		accstatus = null;
		accnm = null;
		accnmKana = null;
		accnmNick = null;
		mailaddress = null;
		password = null;
		gender = null;
		birthdate = null;
		tel1 = null;
		tel2 = null;
		note = null;
		defaultlocale = null;
		recid = null;
		exCnt = null;
		insacc = null;
		insdate = null;
	}

	/**
     * Returns the accid.
     *
     * @return the accid
     */
	public final String getAccid() {
		return accid;
	}

    /**
     * Sets the accid.
     *
     * @param prmAccid アカウントID
     */
	public final void setUsername(final String prmAccid) {
		this.accid = prmAccid;
	}

	/**
     * Returns the acckind.
     *
     * @return the acckind
     */
	public final String getAcckind() {
		return acckind;
	}

    /**
     * Sets the acckind.
     *
     * @param prmAcckind アカウント種別
     */
	public final void setAcckind(final String prmAcckind) {
		this.acckind = prmAcckind;
	}

	/**
     * Returns the accstatus.
     *
     * @return the accstatus
     */
	public final String getAccstatus() {
		return accstatus;
	}

    /**
     * Sets the accstatus.
     *
     * @param prmAccstatus アカウントステータス
     */
	public final void setAccstatus(final String prmAccstatus) {
		this.accstatus = prmAccstatus;
	}

	/**
     * Returns the accnm.
     *
     * @return the accnm
     */
	public final String getAccnm() {
		return accnm;
	}

    /**
     * Sets the accnm.
     *
     * @param prmAccnm アカウントステータス
     */
	public final void setAccnm(final String prmAccnm) {
		this.accnm = prmAccnm;
	}

	/**
     * Returns the accnmKana.
     *
     * @return the accnmKana
     */
	public final String getAccnmKana() {
		return accnmKana;
	}

    /**
     * Sets the accnmKana.
     *
     * @param prmAccnmKana アカウント名（かな）
     */
	public final void setAccnmKana(final String prmAccnmKana) {
		this.accnmKana = prmAccnmKana;
	}

	/**
     * Returns the accnmNick.
     *
     * @return the accnmNick
     */
	public final String getAccnmNick() {
		return accnmNick;
	}

    /**
     * Sets the accnmNick.
     *
     * @param prmAccnmNick アカウント名（ニックネーム）
     */
	public final void setAccnmNick(final String prmAccnmNick) {
		this.accnmNick = prmAccnmNick;
	}

	/**
     * Returns the mailaddress.
     *
     * @return the mailaddress
     */
	public final String getMailaddress() {
		return mailaddress;
	}

    /**
     * Sets the mailaddress.
     *
     * @param prmMailaddress メールアドレス
     */
	public final void setMailaddress(final String prmMailaddress) {
		this.mailaddress = prmMailaddress;
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
     * Returns the gender.
     *
     * @return the gender
     */
	public final String getGender() {
		return gender;
	}

    /**
     * Sets the gender.
     *
     * @param prmGender 性別
     */
	public final void setGender(final String prmGender) {
		this.gender = prmGender;
	}

	/**
     * Returns the birthdate.
     *
     * @return the birthdate
     */
	public final String getBirthdate() {
		return birthdate;
	}

    /**
     * Sets the birthdate.
     *
     * @param prmBirthdate 生年月日
     */
	public final void setBirthdate(final String prmBirthdate) {
		this.birthdate = prmBirthdate;
	}

	/**
     * Returns the tel1.
     *
     * @return the tel1
     */
	public final String getTel1() {
		return tel1;
	}

    /**
     * Sets the tel1.
     *
     * @param prmTel1 電話番号（固定）
     */
	public final void setTel1(final String prmTel1) {
		this.tel1 = prmTel1;
	}

	/**
     * Returns the tel2.
     *
     * @return the tel2
     */
	public final String getTel2() {
		return tel2;
	}

    /**
     * Sets the tel2.
     *
     * @param prmTel2 電話番号（携帯）
     */
	public final void setTel2(final String prmTel2) {
		this.tel2 = prmTel2;
	}

	/**
     * Returns the note.
     *
     * @return the note
     */
	public final String getNote() {
		return note;
	}

    /**
     * Sets the note.
     *
     * @param prmNote 備考
     */
	public final void setNote(final String prmNote) {
		this.note = prmNote;
	}

	/**
     * Returns the defaultlocale.
     *
     * @return the defaultlocale
     */
	public final String getDefaultlocale() {
		return defaultlocale;
	}

    /**
     * Sets the defaultlocale.
     *
     * @param prmDefaultlocale 標準ロケールID
     */
	public final void setDefaultlocale(final String prmDefaultlocale) {
		this.defaultlocale = prmDefaultlocale;
	}

	/**
     * Returns the recid.
     *
     * @return the recid
     */
	public final String getRecid() {
		return recid;
	}

    /**
     * Sets the recid.
     *
     * @param prmRecid レコードID
     */
	public final void setRecid(final String prmRecid) {
		this.recid = prmRecid;
	}

	/**
     * Returns the exCnt.
     *
     * @return the exCnt
     */
	public final String getExCnt() {
		return exCnt;
	}

    /**
     * Sets the exCnt.
     *
     * @param prmExCnt 排他制御カウンタ
     */
	public final void setExCnt(final String prmExCnt) {
		this.exCnt = prmExCnt;
	}

	/**
     * Returns the insacc.
     *
     * @return the insacc
     */
	public final String getInsacc() {
		return insacc;
	}

    /**
     * Sets the insacc.
     *
     * @param prmInsacc 登録アカウント
     */
	public final void setInsacc(final String prmInsacc) {
		this.insacc = prmInsacc;
	}

	/**
     * Returns the insdate.
     *
     * @return the insdate
     */
	public final Date getInsdate() {
		if (insdate != null || insdate.length() > 1) {
			return DateUtil.toDateTimestamp(insdate);
		} else {
			return null;
		}
	}

    /**
     * Sets the insdate.
     *
     * @param prmInsdate 登録日時
     */
	public final void setInsdate(final Date prmInsdate) {
		if (prmInsdate != null) {
			this.insdate =  DateUtil.toDateTimestampString(prmInsdate);
		} else {
			this.insdate = null;
		}
	}

}
