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
 * マテリアルマスタ	 マテリアル情報を定義する.
 *
 * @author  nakada
 * @since   XXXXXXXX.01.00
 * @version 20141029.00.01
 */
@Entity(listener = MMaterialListener.class)
@Table(name = "m_material")
public class MMaterial {

    /** マテリアルID. */
    @Column(name = "mt_id")
    private String mtId;

    /** マテリアル種別１	 パブリック/プライベート. */
    @Column(name = "mt_kind1")
    private String mtKind1;

    /** マテリアル種別２	 本/CD/DVD/その他. */
    @Column(name = "mt_kind2")
    private String mtKind2;

    /** マテリアルオーナーID. */
    @Column(name = "mt_onr_id")
    private String mtOnrId;

    /** マテリアル名. */
    @Column(name = "mt_nm")
    private String mtNm;

    /** 追加タグA. */
    @Column(name = "tag_a")
    private String tagA;

    /** 追加タグB. */
    @Column(name = "tag_b")
    private String tagB;

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
     * Returns the mtId.
     *
     * @return the mtId
     */
    public final String getMtId() {
        return mtId;
    }

    /**
     * Sets the mtId.
     *
     * @param prmMtId the mtId
     */
    public final void setMtId(final String prmMtId) {
        this.mtId = prmMtId;
    }

    /**
     * Returns the mtKind1.
     *
     * @return the mtKind1
     */
    public final String getMtKind1() {
        return mtKind1;
    }

    /**
     * Sets the mtKind1.
     *
     * @param prmMtKind1 the mtKind1
     */
    public final void setMtKind1(final String prmMtKind1) {
        this.mtKind1 = prmMtKind1;
    }

    /**
     * Returns the mtKind2.
     *
     * @return the mtKind2
     */
    public final String getMtKind2() {
        return mtKind2;
    }

    /**
     * Sets the mtKind2.
     *
     * @param prmMtKind2 the mtKind2
     */
    public final void setMtKind2(final String prmMtKind2) {
        this.mtKind2 = prmMtKind2;
    }
    /**
     * Returns the mtOnrId.
     *
     * @return the mtOnrId
     */
    public final String getMtOnrId() {
        return mtOnrId;
    }

    /**
     * Sets the mtOnrId.
     *
     * @param prmMtOnrId the mtOnrId
     */
    public final void setMtOnrId(final String prmMtOnrId) {
        this.mtOnrId = prmMtOnrId;
    }

    /**
     * Returns the mtNm.
     *
     * @return the mtNm
     */
    public final String getMtNm() {
        return mtNm;
    }

    /**
     * Sets the mtNm.
     *
     * @param prmMtNm the mtNm
     */
    public final void setMtNm(final String prmMtNm) {
        this.mtNm = prmMtNm;
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