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
 * ポイント受取支払情報	 ポイント決済履歴を格納する.
 *
 * @author  nakada
 * @since   XXXXXXXX.01.00
 * @version 20141029.00.01
 */
@Entity(listener = TPointsettlementListener.class)
@Table(name = "t_pointsettlement")
public class TPointsettlement {

    /** 決済ID. */
    @Column(name = "setle_id")
    private String setleId;

    /** 取引ID. */
    @Column(name = "trade_id")
    private String tradeId;

    /** アカウントID（支払側）. */
    @Column(name = "acc_id_pay")
    private String accIdPay;

    /** アカウントID（受取側）. */
    @Column(name = "acc_id_income")
    private String accIdIncome;

    /** ポイント種別	 キャッシュポイント/トレードポイント. */
    @Column(name = "point_kind")
    private String pointKind;

    /** 取引日	 存在しない場合（システムアカウント等）は「00000000」固定. */
    @Column(name = "trade_date")
    private String tradeDate;

    /** 取引額. */
    @Column(name = "trade_amount")
    private BigDecimal tradeAmount;

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
     * Returns the setleId.
     *
     * @return the setleId
     */
    public final String getSetleId() {
        return setleId;
    }

    /**
     * Sets the setleId.
     *
     * @param prmSetleId the setleId
     */
    public final void setSetleId(final String prmSetleId) {
        this.setleId = prmSetleId;
    }

    /**
     * Returns the tradeId.
     *
     * @return the tradeId
     */
    public final String getTradeId() {
        return tradeId;
    }

    /**
     * Sets the tradeId.
     *
     * @param prmTradeId the tradeId
     */
    public final void setTradeId(final String prmTradeId) {
        this.tradeId = prmTradeId;
    }

    /**
     * Returns the accIdPay.
     *
     * @return the accIdPay
     */
    public final String getAccIdPay() {
        return accIdPay;
    }

    /**
     * Sets the accIdPay.
     *
     * @param prmAccIdPay the accIdPay
     */
    public final void setAccIdPay(final String prmAccIdPay) {
        this.accIdPay = prmAccIdPay;
    }

    /**
     * Returns the accIdIncome.
     *
     * @return the accIdIncome
     */
    public final String getAccIdIncome() {
        return accIdIncome;
    }

    /**
     * Sets the accIdIncome.
     *
     * @param prmAccIdIncome the accIdIncome
     */
    public final void setAccIdIncome(final String prmAccIdIncome) {
        this.accIdIncome = prmAccIdIncome;
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
     * Returns the tradeDate.
     *
     * @return the tradeDate
     */
    public final String getTradeDate() {
        return tradeDate;
    }

    /**
     * Sets the tradeDate.
     *
     * @param prmTradeDate the tradeDate
     */
    public final void setTradeDate(final String prmTradeDate) {
        this.tradeDate = prmTradeDate;
    }

    /**
     * Returns the tradeAmount.
     *
     * @return the tradeAmount
     */
    public final BigDecimal getTradeAmount() {
        return tradeAmount;
    }

    /**
     * Sets the tradeAmount.
     *
     * @param prmTradeAmount the tradeAmount
     */
    public final void setTradeAmount(final BigDecimal prmTradeAmount) {
        this.tradeAmount = prmTradeAmount;
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