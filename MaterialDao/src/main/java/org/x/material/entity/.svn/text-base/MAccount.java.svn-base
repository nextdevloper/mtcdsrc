package org.x.material.entity;

import java.math.BigDecimal;
import java.util.Date;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.SequenceGenerator;
import org.seasar.doma.Table;
import org.seasar.doma.Version;

/**
 * アカウントマスタ	 アカウント情報を定義する。尚、アカウントには、運営アカウントを含む.
 *
 * @author  nakada
 * @since   XXXXXXXX.01.00
 * @version 20141029.00.01
 */
@Entity(listener = MAccountListener.class)
@Table(name = "m_account")
public class MAccount {

    /** アカウントID. */
    @Column(name = "acc_id")
    private String accId;

    /** アカウント種別	 個人/法人/倉庫業者/運送業者/連携システム. */
    @Column(name = "acc_kind")
    private String accKind;

    /** アカウントステータス	 パブリック、プライベート. */
    @Column(name = "acc_stat")
    private String accStat;

    /** アカウント名（名称）	 姓、ミドルネーム、名の間は、半角スペースを入れる. */
    @Column(name = "acc_nm")
    private String accNm;

    /** アカウント名（かな）	 姓、ミドルネーム、名の間は、半角スペースを入れる. */
    @Column(name = "acc_nm_kana")
    private String accNmKana;

    /** アカウント名（ニックネーム）	 姓、ミドルネーム、名の間は、半角スペースを入れる. */
    @Column(name = "acc_nm_nick")
    private String accNmNick;

    /** メールアドレス	 存在しない場合（システムアカウント等）は「none」固定. */
    @Column(name = "mailaddress")
    private String mailaddress;

    /** パスワード. */
    @Column(name = "password")
    private String password;

    /** 性別	 男性、女性、その他. */
    @Column(name = "gender")
    private String gender;

    /** 生年月日	 存在しない場合（システムアカウント等）は「00000000」固定. */
    @Column(name = "birthdate")
    private String birthdate;

    /** 電話番号（固定）	 XXX-XXXX-XXXX. */
    @Column(name = "tel1")
    private String tel1;

    /** 電話番号（携帯）	 XXX-XXXX-XXXX. */
    @Column(name = "tel2")
    private String tel2;

    /** 備考. */
    @Column(name = "note")
    private String note;

    /** 標準ロケールID	 言語コードを設定（当面は、日本固定）. */
    @Column(name = "default_locale")
    private String defaultLocale;

    /** 排他制御カウンタ	 登録されるごとに＋１する. */
	@Version
    @Column(name = "ex_cnt")
	private BigDecimal exCnt;

    /** 登録アカウント	 登録時のアカウント. */
    @Column(name = "ins_acc")
    private String insAcc;

    /** 登録日時	 登録した日時. */
    @Column(name = "ins_date")
    private Date insDate;

    /** 更新アカウント	 更新時のアカウント. */
    @Column(name = "upd_acc")
    private String updAcc;

    /** 更新日時	 更新した日時. */
    @Column(name = "upd_date")
    private Date updDate;

    /** 削除フラグ	 "1"になると論理削除. */
    @Column(name = "del_flg")
    private String delFlg;

    /** レコードID	 レコード編集用ID. */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(sequence = "mtcddb.m_account_rec_id_seq")
    @Column(name = "rec_id")
	private Long recId;

    /**
     * Returns the accId.
     *
     * @return the accId
     */
    public final String getAccId() {
        return accId;
    }

    /**
     * Sets the accId.
     *
     * @param prmAccId the accId
     */
    public final void setAccId(final String prmAccId) {
        this.accId = prmAccId;
    }

    /**
     * Returns the accKind.
     *
     * @return the accKind
     */
    public final String getAccKind() {
        return accKind;
    }

    /**
     * Sets the accKind.
     *
     * @param prmAccKind the accKind
     */
    public final void setAccKind(final String prmAccKind) {
        this.accKind = prmAccKind;
    }

    /**
     * Returns the accStat.
     *
     * @return the accStat
     */
    public final String getAccStat() {
        return accStat;
    }

    /**
     * Sets the accStat.
     *
     * @param prmAccStat the accStat
     */
    public final void setAccStat(final String prmAccStat) {
        this.accStat = prmAccStat;
    }

    /**
     * Returns the accNm.
     *
     * @return the accNm
     */
    public final String getAccNm() {
        return accNm;
    }

    /**
     * Sets the accNm.
     *
     * @param prmAccNm the accNm
     */
    public final void setAccNm(final String prmAccNm) {
        this.accNm = prmAccNm;
    }

    /**
     * Returns the accNmKana.
     *
     * @return the accNmKana
     */
    public final String getAccNmKana() {
        return accNmKana;
    }

    /**
     * Sets the accNmKana.
     *
     * @param prmAccNmKana the accNmKana
     */
    public final void setAccNmKana(final String prmAccNmKana) {
        this.accNmKana = prmAccNmKana;
    }

    /**
     * Returns the accNmNick.
     *
     * @return the accNmNick
     */
    public final String getAccNmNick() {
        return accNmNick;
    }

    /**
     * Sets the accNmNick.
     *
     * @param prmAccNmNick the accNmNick
     */
    public final void setAccNmNick(final String prmAccNmNick) {
        this.accNmNick = prmAccNmNick;
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
     * @param prmMailaddress the mailaddress
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
     * @param prmPassword the password
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
     * @param prmGender the gender
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
     * @param prmBirthdate the birthdate
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
     * @param prmTel1 the tel1
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
     * @param prmTel2 the tel2
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
     * @param prmNote the note
     */
    public final void setNote(final String prmNote) {
        this.note = prmNote;
    }

    /**
     * Returns the defaultLocale.
     *
     * @return the defaultLocale
     */
    public final String getDefaultLocale() {
        return defaultLocale;
    }

    /**
     * Sets the defaultLocale.
     *
     * @param prmDefaultLocale the defaultLocale
     */
    public final void setDefaultLocale(final String prmDefaultLocale) {
        this.defaultLocale = prmDefaultLocale;
    }

    /**
     * Returns the exCnt.
     *
     * @return the exCnt
     */
    public final BigDecimal getExCnt() {
        return exCnt;
    }

    /**
     * Sets the exCnt.
     *
     * @param prmI the exCnt
     */
    public final void setExCnt(final BigDecimal prmI) {
        this.exCnt = prmI;
    }

    /**
     * Returns the insAcc.
     *
     * @return the insAcc
     */
    public final String getInsAcc() {
        return insAcc;
    }

    /**
     * Sets the insAcc.
     *
     * @param prmInsAcc the insAcc
     */
    public final void setInsAcc(final String prmInsAcc) {
        this.insAcc = prmInsAcc;
    }

    /**
     * Returns the insDate.
     *
     * @return the insDate
     */
    public final Date getInsDate() {
        return insDate;
    }

    /**
     * Sets the insDate.
     *
     * @param prmInsDate the insDate
     */
    public final void setInsDate(final Date prmInsDate) {
        this.insDate = prmInsDate;
    }

    /**
     * Returns the updAcc.
     *
     * @return the updAcc
     */
    public final String getUpdAcc() {
        return updAcc;
    }

    /**
     * Sets the updAcc.
     *
     * @param prmUpdAcc the updAcc
     */
    public final void setUpdAcc(final String prmUpdAcc) {
        this.updAcc = prmUpdAcc;
    }

    /**
     * Returns the updDate.
     *
     * @return the updDate
     */
    public final Date getUpdDate() {
        return updDate;
    }

    /**
     * Sets the updDate.
     *
     * @param prmUpdDate the updDate
     */
    public final void setUpdDate(final Date prmUpdDate) {
        this.updDate = prmUpdDate;
    }

    /**
     * Returns the delFlg.
     *
     * @return the delFlg
     */
    public final String getDelFlg() {
        return delFlg;
    }

    /**
     * Sets the delFlg.
     *
     * @param prmDelFlg the delFlg
     */
    public final void setDelFlg(final String prmDelFlg) {
        this.delFlg = prmDelFlg;
    }

    /**
     * Returns the recId.
     *
     * @return the recId
     */
    public final Long getRecId() {
        return recId;
    }

    /**
     * Sets the recId.
     *
     * @param prmRecId the recId
     */
    public final void setRecId(final Long prmRecId) {
        this.recId = prmRecId;
    }


}