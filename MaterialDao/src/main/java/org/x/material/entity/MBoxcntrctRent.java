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
 * ボックス契約マスタ（ロケーション提供）	 ボックス向けロケーション提供契約条件を定義する。.
 *
 * @author  nakada
 * @since   XXXXXXXX.01.00
 * @version 20141029.00.01
 */
@Entity(listener = MBoxcntrctRentListener.class)
@Table(name = "m_boxcntrct_rent")
public class MBoxcntrctRent {

    /** 契約ID. */
    @Column(name = "cntrct_id")
    private String cntrctId;

    /** ロケーションID. */
    @Column(name = "loc_id")
    private String locId;

    /** ボックスID. */
    @Column(name = "box_id")
    private String boxId;

    /** 容量種別	 キャパシティの種類（サイズ等）. */
    @Column(name = "capa_kind")
    private String capaKind;

    /** マテリアル状態２	 未使用/通常/不良品/その他. */
    @Column(name = "mt_stat2")
    private String mtStat2;

    /** ポイント種別	 キャッシュポイント/トレードポイント. */
    @Column(name = "point_kind")
    private String pointKind;

    /** 場所提供料（初回）	 1回目. */
    @Column(name = "rent_fee_init_amount")
    private BigDecimal rentFeeInitAmount;

    /** 場所提供料（日額）. */
    @Column(name = "rent_fee_daily_amount")
    private BigDecimal rentFeeDailyAmount;

    /** 利用側保証料. */
    @Column(name = "deposit_usage_amount")
    private BigDecimal depositUsageAmount;

    /** 提供側保証料. */
    @Column(name = "deposit_lender_amount")
    private BigDecimal depositLenderAmount;

    /** 預かり期間	 日数を指定. */
    @Column(name = "rent_term")
    private BigDecimal rentTerm;

    /** 預かり種別	 延長無（破棄）/延長有（自動延長）/その他. */
    @Column(name = "rent_kind")
    private String rentKind;

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
     * Returns the mtStat2.
     *
     * @return the mtStat2
     */
    public final String getMtStat2() {
        return mtStat2;
    }

    /**
     * Sets the mtStat2.
     *
     * @param prmMtStat2 the mtStat2
     */
    public final void setMtStat2(final String prmMtStat2) {
        this.mtStat2 = prmMtStat2;
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
     * Returns the rentFeeInitAmount.
     *
     * @return the rentFeeInitAmount
     */
    public final BigDecimal getRentFeeInitAmount() {
        return rentFeeInitAmount;
    }

    /**
     * Sets the rentFeeInitAmount.
     *
     * @param prmRentFeeInitAmount the rentFeeInitAmount
     */
    public final void setRentFeeInitAmount(final BigDecimal prmRentFeeInitAmount) {
        this.rentFeeInitAmount = prmRentFeeInitAmount;
    }

    /**
     * Returns the rentFeeDailyAmount.
     *
     * @return the rentFeeDailyAmount
     */
    public final BigDecimal getRentFeeDailyAmount() {
        return rentFeeDailyAmount;
    }

    /**
     * Sets the rentFeeDailyAmount.
     *
     * @param prmRentFeeDailyAmount the rentFeeDailyAmount
     */
    public final void setRentFeeDailyAmount(final BigDecimal prmRentFeeDailyAmount) {
        this.rentFeeDailyAmount = prmRentFeeDailyAmount;
    }

    /**
     * Returns the depositUsageAmount.
     *
     * @return the depositUsageAmount
     */
    public final BigDecimal getDepositUsageAmount() {
        return depositUsageAmount;
    }

    /**
     * Sets the depositUsageAmount.
     *
     * @param prmDepositUsageAmount the depositUsageAmount
     */
    public final void setDepositUsageAmount(final BigDecimal prmDepositUsageAmount) {
        this.depositUsageAmount = prmDepositUsageAmount;
    }

    /**
     * Returns the depositLenderAmount.
     *
     * @return the depositLenderAmount
     */
    public final BigDecimal getDepositLenderAmount() {
        return depositLenderAmount;
    }

    /**
     * Sets the depositLenderAmount.
     *
     * @param prmDepositLenderAmount the depositLenderAmount
     */
    public final void setDepositLenderAmount(final BigDecimal prmDepositLenderAmount) {
        this.depositLenderAmount = prmDepositLenderAmount;
    }

    /**
     * Returns the rentTerm.
     *
     * @return the rentTerm
     */
    public final BigDecimal getRentTerm() {
        return rentTerm;
    }

    /**
     * Sets the rentTerm.
     *
     * @param prmRentTerm the rentTerm
     */
    public final void setRentTerm(final BigDecimal prmRentTerm) {
        this.rentTerm = prmRentTerm;
    }

    /**
     * Returns the rentKind.
     *
     * @return the rentKind
     */
    public final String getRentKind() {
        return rentKind;
    }

    /**
     * Sets the rentKind.
     *
     * @param prmRentKind the rentKind
     */
    public final void setRentKind(final String prmRentKind) {
        this.rentKind = prmRentKind;
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