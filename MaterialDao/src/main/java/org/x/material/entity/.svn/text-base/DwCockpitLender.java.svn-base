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
 * コックピット情報（提供側）	 現在の状態が確認できる分析用の情報.
 * @author  nakada
 * @since   XXXXXXXX.01.00
 * @version 20141029.00.01
 */
@Entity(listener = DwCockpitLenderListener.class)
@Table(name = "dw_cockpit_lender")
public class DwCockpitLender {

    /** アカウントID. */
    @Column(name = "acc_id")
    private String accId;

    /** コックピットID. */
    @Column(name = "cocpit_id")
    private String cocpitId;

    /** ロケーションID. */
    @Column(name = "loc_id")
    private String locId;

    /** ボックスID. */
    @Column(name = "box_id")
    private String boxId;

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

    /** 預かり開始日. */
    @Column(name = "rent_day")
    private String rentDay;

    /** 預かり期間	 日数を指定. */
    @Column(name = "rent_term")
    private BigDecimal rentTerm;

    /** 追加タグA. */
    @Column(name = "tag_a")
    private String tagA;

    /** 追加タグB. */
    @Column(name = "tag_b")
    private String tagB;

    /** 標準ロケールID	 言語コードを設定（当面は、日本（ja）固定）. */
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
    private Timestamp insDate;

    /** 更新アカウント	 更新時のアカウント（初回は登録時と同じ）. */
    @Column(name = "upd_acc")
    private String updAcc;

    /** 更新日時	 更新した日時（初回は登録時と同じ）. */
    @Column(name = "upd_date")
    private Timestamp updDate;

    /** 削除フラグ	 1になると論理削除. */
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
     * Returns the cocpitId.
     *
     * @return the cocpitId
     */
    public final String getCocpitId() {
        return cocpitId;
    }

    /**
     * Sets the cocpitId.
     *
     * @param prmCocpitId the cocpitId
     */
    public final void setCocpitId(final String prmCocpitId) {
        this.cocpitId = prmCocpitId;
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
     * Returns the rentDay.
     *
     * @return the rentDay
     */
    public final String getRentDay() {
        return rentDay;
    }

    /**
     * Sets the rentDay.
     *
     * @param prmRentDay the rentDay
     */
    public final void setRentDay(final String prmRentDay) {
        this.rentDay = prmRentDay;
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