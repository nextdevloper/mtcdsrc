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
 * ボックスマスタ	 ボックス情報を定義する。.
 *
 * @author  nakada
 * @since   XXXXXXXX.01.00
 * @version 20141029.00.01
 */
@Entity(listener = MBoxListener.class)
@Table(name = "m_box")
public class MBox {

    /** ボックスID. */
    @Column(name = "box_id")
    private String boxId;

    /** ボックス種別. */
    @Column(name = "box_kind")
    private String boxKind;

    /** ボックスオーナーID. */
    @Column(name = "box_onr_id")
    private String boxOnrId;

    /** 容量種別. */
    @Column(name = "capa_ind")
    private String capaInd;

    /** ボックス名. */
    @Column(name = "box_nm")
    private String boxNm;

    /** 備考. */
    @Column(name = "note")
    private String note;

    /** 標準ロケールID. */
    @Column(name = "default_locale")
    private String defaultLocale;

    /** 排他制御カウンタ. */
	@Version
    @Column(name = "ex_cnt")
	private BigDecimal exCnt;

    /** 登録アカウント. */
    @Column(name = "ins_acc")
    private String insAcc;

    /** 登録日時. */
    @Column(name = "ins_date")
    private Date insDate;

    /** 更新アカウント. */
    @Column(name = "upd_acc")
    private String updAcc;

    /** 更新日時. */
    @Column(name = "upd_date")
    private Date updDate;

    /** 削除フラグ. */
    @Column(name = "del_flg")
    private String delFlg;

    /** レコードID	 レコード編集用ID. */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(sequence = "mtcddb.m_account_rec_id_seq")
    @Column(name = "rec_id")
	private Long recId;

    /**
     * Returns the boxId.
     *
     * @return the boxId
     */
    public final String getBoxId() {
        return boxId;
    }

    /**
     * Sets the boxId.
     *
     * @param prmBoxId the boxId
     */
    public final void setBoxId(final String prmBoxId) {
        this.boxId = prmBoxId;
    }

    /**
     * Returns the boxKind.
     *
     * @return the boxKind
     */
    public final String getBoxKind() {
        return boxKind;
    }

    /**
     * Sets the boxKind.
     *
     * @param prmBoxKind the boxKind
     */
    public final void setBoxKind(final String prmBoxKind) {
        this.boxKind = prmBoxKind;
    }

    /**
     * Returns the boxOnrId.
     *
     * @return the boxOnrId
     */
    public final String getBoxOnrId() {
        return boxOnrId;
    }

    /**
     * Sets the boxOnrId.
     *
     * @param prmBoxOnrId the boxOnrId
     */
    public final void setBoxOnrId(final String prmBoxOnrId) {
        this.boxOnrId = prmBoxOnrId;
    }

    /**
     * Returns the capaInd.
     *
     * @return the capaInd
     */
    public final String getCapaInd() {
        return capaInd;
    }

    /**
     * Sets the capaInd.
     *
     * @param prmCapaInd the capaInd
     */
    public final void setCapaInd(final String prmCapaInd) {
        this.capaInd = prmCapaInd;
    }

    /**
     * Returns the boxNm.
     *
     * @return the boxNm
     */
    public final String getBoxNm() {
        return boxNm;
    }

    /**
     * Sets the boxNm.
     *
     * @param prmBoxNm the boxNm
     */
    public final void setBoxNm(final String prmBoxNm) {
        this.boxNm = prmBoxNm;
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