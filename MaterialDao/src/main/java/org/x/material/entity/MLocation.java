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
import org.seasar.doma.Transient;
import org.seasar.doma.Version;
import org.seasar.doma.jdbc.SelectOptions;

/**
 * ロケーションマスタ	 ロケーション情報を定義する.
 *
 * @author  nakada
 * @since   20141029.00.01
 * @version 20141029.00.01
 */
@Entity(listener = MLocationListener.class)
@Table(name = "m_location")
public class MLocation {

    /** ロケーションID. */
    @Column(name = "loc_id")
    private String locId;

    /** ロケーション種別	 プライベート/パブリック. */
    @Column(name = "loc_kind")
    private String locKind;

    /** ロケーション名. */
    @Column(name = "loc_nm")
    private String locNm;

    /** ロケーションオーナーID	 カウントIDを指定. */
    @Column(name = "loc_onr_id")
    private String locOnrId;

    /** 郵便番号	 XXX-XXXX. */
    @Column(name = "postcd")
    private String postcd;

    /** 住所. */
    @Column(name = "address")
    private String address;

    /** 送付先名. */
    @Column(name = "recipient")
    private String recipient;

    /** 電話番号（固定）	 XXX-XXXX-XXXX. */
    @Column(name = "tel1")
    private String tel1;
    
    /** 追加タグA. */
    @Column(name = "tag_a")
    private String tagA;

    /** 追加タグB. */
    @Column(name = "tag_b")
    private String tagB;

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

    /** SelectOptions. */
    @Transient
    private SelectOptions options;

    /**
     * Returns the locId.
     *
     * @return the locId
     */
    public final String getLocId() {
        return locId;
    }

    /**
     * Sets the locId.
     *
     * @param prmLocId the locId
     */
    public final void setLocId(final String prmLocId) {
        this.locId = prmLocId;
    }

    /**
     * Returns the locKind.
     *
     * @return the locKind
     */
    public final String getLocKind() {
        return locKind;
    }

    /**
     * Sets the locKind.
     *
     * @param prmLocKind the locKind
     */
    public final void setLocKind(final String prmLocKind) {
        this.locKind = prmLocKind;
    }

    /**
     * Returns the locNm.
     *
     * @return the locNm
     */
    public final String getLocNm() {
        return locNm;
    }

    /**
     * Sets the locNm.
     *
     * @param prmLocNm the locNm
     */
    public final void setLocNm(final String prmLocNm) {
        this.locNm = prmLocNm;
    }

    /**
     * Returns the locOnrId.
     *
     * @return the locOnrId
     */
    public final String getLocOnrId() {
        return locOnrId;
    }

    /**
     * Sets the locOnrId.
     *
     * @param prmLocOnrId the locOnrId
     */
    public final void setLocOnrId(final String prmLocOnrId) {
        this.locOnrId = prmLocOnrId;
    }

    /**
     * Returns the postcd.
     *
     * @return the postcd
     */
    public final String getPostcd() {
        return postcd;
    }

    /**
     * Sets the postcd.
     *
     * @param prmPostcd the postcd
     */
    public final void setPostcd(final String prmPostcd) {
        this.postcd = prmPostcd;
    }

    /**
     * Returns the address.
     *
     * @return the address
     */
    public final String getAddress() {
        return address;
    }

    /**
     * Sets the address.
     *
     * @param prmAddress the address
     */
    public final void setAddress(final String prmAddress) {
        this.address = prmAddress;
    }

    /**
     * Returns the recipient.
     *
     * @return the recipient
     */
    public final String getRecipient() {
        return recipient;
    }

    /**
     * Sets the recipient.
     *
     * @param prmRecipient the recipient
     */
    public final void setRecipient(final String prmRecipient) {
        this.recipient = prmRecipient;
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
     * Returns the tagA.
     *
     * @return the tagA
     */
    public final String getTagA() {
        return tagA;
    }

    /**
     * Sets the tagA.
     *
     * @param prmTagA the tagA
     */
    public final void setTagA(final String prmTagA) {
        this.tagA = prmTagA;
    }

    /**
     * Returns the tagB.
     *
     * @return the tagB
     */
    public final String getTagB() {
        return tagB;
    }

    /**
     * Sets the tagB.
     *
     * @param prmTagB the tagB
     */
    public final void setTagB(final String prmTagB) {
        this.tagB = prmTagB;
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
     * @param prmExCnt the exCnt
     */
    public final void setExCnt(final BigDecimal prmExCnt) {
        this.exCnt = prmExCnt;
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