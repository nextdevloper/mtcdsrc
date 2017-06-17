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
 * アカウントマスタ（ブロック）	 アカウントブロック.
 *
 * @author  nakada
 * @since   XXXXXXXX.01.00
 * @version 20141029.00.01
 */
@Entity(listener = MAccountBlockListener.class)
@Table(name = "m_account_block")
public class MAccountBlock {

    /** アカウントID. */
    @Column(name = "acc_id")
    private String accId;

    /** アカウントID（ブロック）	 アカウントIDを指定. */
    @Column(name = "acc_id_block")
    private String accIdBlock;

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
	@SequenceGenerator(sequence = "mtcddb.m_account_block_rec_id_seq")
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
     * Returns the accIdBlock.
     *
     * @return the accIdBlock
     */
    public final String getAccIdBlock() {
        return accIdBlock;
    }

    /**
     * Sets the accIdBlock.
     *
     * @param prmAccIdBlock the accIdBlock
     */
    public final void setAccIdBlock(final String prmAccIdBlock) {
        this.accIdBlock = prmAccIdBlock;
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