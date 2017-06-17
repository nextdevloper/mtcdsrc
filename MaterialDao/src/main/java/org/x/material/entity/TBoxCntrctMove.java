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
 * ボックス契約取引情報（ロケーション間移動）	 ボックスのロケーション間移動契約取引情報を格納する。.
 *
 * @author  nakada
 * @since   XXXXXXXX.01.00
 * @version 20141029.00.01
 */
@Entity(listener = TBoxCntrctMoveListener.class)
@Table(name = "t_box_cntrct_move")
public class TBoxCntrctMove {

    /** 取引ID. */
    @Column(name = "trade_id")
    private String tradeId;

    /** 契約ID. */
    @Column(name = "cntrct_id")
    private String cntrctId;

    /** 契約状態	 未契約/契約中/契約終了. */
    @Column(name = "contrct_stat")
    private String contrctStat;

    /** 支払状況-移動料	 未/済. */
    @Column(name = "move_fee_stat")
    private String moveFeeStat;

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
     * Returns the contrctStat.
     *
     * @return the contrctStat
     */
    public final String getContrctStat() {
        return contrctStat;
    }

    /**
     * Sets the contrctStat.
     *
     * @param prmContrctStat the contrctStat
     */
    public final void setContrctStat(final String prmContrctStat) {
        this.contrctStat = prmContrctStat;
    }

    /**
     * Returns the moveFeeStat.
     *
     * @return the moveFeeStat
     */
    public final String getMoveFeeStat() {
        return moveFeeStat;
    }

    /**
     * Sets the moveFeeStat.
     *
     * @param prmMoveFeeStat the moveFeeStat
     */
    public final void setMoveFeeStat(final String prmMoveFeeStat) {
        this.moveFeeStat = prmMoveFeeStat;
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