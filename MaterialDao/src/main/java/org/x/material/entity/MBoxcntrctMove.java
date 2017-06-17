package org.x.material.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.SequenceGenerator;
import org.seasar.doma.Table;
import org.seasar.doma.Version;

/**
 * ボックス契約マスタ（ロケーション間移動）	 ボックスのロケーション間移動条件を定義する.
 *
 * @author  nakada
 * @since   XXXXXXXX.01.00
 * @version 20141029.00.01
 */
@Entity(listener = MBoxcntrctMoveListener.class)
@Table(name = "m_boxcntrct_move")
public class MBoxcntrctMove {

    /** 契約ID. */
    @Column(name = "cntrct_id")
    private String cntrctId;

    /** ロケーションID. */
    @Column(name = "loc_id")
    private String locId;

    /** ロケーションID（移動後）	 移動後. */
    @Column(name = "loc_id_after")
    private String locIdAfter;

    /** ボックスID. */
    @Column(name = "box_id")
    private String boxId;

    /** 契約業者ID(組織)	 アカウントIDを指定. */
    @Column(name = "cntrct_carier_id")
    private String cntrctCarierId;

    /** 容量種別	 キャパシティの種類（サイズ等）. */
    @Column(name = "capa_kind")
    private String capaKind;

    /** ポイント種別	 キャッシュポイント/トレードポイント. */
    @Column(name = "point_kind")
    private String pointKind;

    /** 移動料. */
    @Column(name = "move_fee_amount")
    private BigDecimal moveFeeAmount;

    /** 標準ロケールID	 言語コードを設定（当面は、日本固定）. */
    @Column(name = "default_locale")
    private String defaultLocale;

    /** 排他制御カウンタ	 登録されるごとに＋１する。. */
	@Version
    @Column(name = "ex_cnt")
	private BigDecimal exCnt;

    /** 登録アカウント	 登録時のアカウント. */
    @Column(name = "ins_acc")
    private String insAcc;

    /** 登録日時	 登録した日時. */
    @Column(name = "ins_date")
    private Timestamp insDate;

    /** 更新アカウント	 更新時のアカウント. */
    @Column(name = "upd_acc")
    private String updAcc;

    /** 更新日時	 更新した日時. */
    @Column(name = "upd_date")
    private Timestamp updDate;

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
     * Returns the cntrctId.
     *
     * @return the cntrctId
     */
    public final String getCntrctId() {
        return cntrctId;
    }

    /**
     * Sets the cntrctId.
     *
     * @param prmCntrctId the cntrctId
     */
    public final void setCntrctId(final String prmCntrctId) {
        this.cntrctId = prmCntrctId;
    }

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
     * Returns the locIdAfter.
     *
     * @return the locIdAfter
     */
    public final String getLocIdAfter() {
        return locIdAfter;
    }

    /**
     * Sets the locIdAfter.
     *
     * @param prmLocIdAfter the locIdAfter
     */
    public final void setLocIdAfter(final String prmLocIdAfter) {
        this.locIdAfter = prmLocIdAfter;
    }

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
     * Returns the cntrctCarierId.
     *
     * @return the cntrctCarierId
     */
    public final String getCntrctCarierId() {
        return cntrctCarierId;
    }

    /**
     * Sets the cntrctCarierId.
     *
     * @param prmCntrctCarierId the cntrctCarierId
     */
    public final void setCntrctCarierId(final String prmCntrctCarierId) {
        this.cntrctCarierId = prmCntrctCarierId;
    }

    /**
     * Returns the capaKind.
     *
     * @return the capaKind
     */
    public final String getCapaKind() {
        return capaKind;
    }

    /**
     * Sets the capaKind.
     *
     * @param prmCapaKind the capaKind
     */
    public final void setCapaKind(final String prmCapaKind) {
        this.capaKind = prmCapaKind;
    }

    /**
     * Returns the pointKind.
     *
     * @return the pointKind
     */
    public final String getPointKind() {
        return pointKind;
    }

    /**
     * Sets the pointKind.
     *
     * @param prmPointKind the pointKind
     */
    public final void setPointKind(final String prmPointKind) {
        this.pointKind = prmPointKind;
    }

    /**
     * Returns the moveFeeAmount.
     *
     * @return the moveFeeAmount
     */
    public final BigDecimal getMoveFeeAmount() {
        return moveFeeAmount;
    }

    /**
     * Sets the moveFeeAmount.
     *
     * @param prmMoveFeeAmount the moveFeeAmount
     */
    public final void setMoveFeeAmount(final BigDecimal prmMoveFeeAmount) {
        this.moveFeeAmount = prmMoveFeeAmount;
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
    public final Timestamp getInsDate() {
        return insDate;
    }

    /**
     * Sets the insDate.
     *
     * @param prmInsDate the insDate
     */
    public final void setInsDate(final Timestamp prmInsDate) {
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
    public final Timestamp getUpdDate() {
        return updDate;
    }

    /**
     * Sets the updDate.
     *
     * @param prmUpdDate the updDate
     */
    public final void setUpdDate(final Timestamp prmUpdDate) {
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