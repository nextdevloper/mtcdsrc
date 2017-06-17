package org.x.material.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;
import org.x.material.entity.MBoxMaterial;

/**
 * ボックスマテリアル情報.
 *
 * @author hirano
 * @since   20141120.0.1
 * @version 20141120.0.1
 */
@Component(instance = InstanceType.SESSION)
public class BoxMaterialDto implements Serializable {

	/** シリアルバージョン番号. */
	private static final long serialVersionUID = 1L;

    /** マテリアルID. */
    private String mtId;

    /** マテリアル種別１	 パブリック/プライベート. */
    private String mtKind1;

    /** マテリアル種別２	 本/CD/DVD/その他. */
    private String mtKind2;

    /** マテリアルオーナーID. */
    private String mtOnrId;

    /** マテリアル名. */
    private String mtNm;

    /** 追加タグA. */
    private String tagA;

    /** 追加タグB. */
    private String tagB;

    /** 標準ロケールID	 言語コードを設定（当面は、日本固定）. */
    private String defaultLocale;

    /** 排他制御カウンタ	 登録されるごとに＋１する. */
	private BigDecimal exCnt;

    /** 登録アカウント	 登録時のアカウント. */
    private String insAcc;

    /** 登録日時	 登録した日時. */
    private Date insDate;

    /** 更新アカウント	 更新時のアカウント. */
    private String updAcc;

    /** 更新日時	 更新した日時. */
    private Date updDate;

    /** 削除フラグ	 "1"になると論理削除. */
    private String delFlg;

    /** レコードID	 レコード編集用ID. */
	private Long recId;
	
    /** ボックスID. */
    private String boxId;

    /** ボックス種別	 プライベート/パブリック. */
    private String boxKind;

    /** ボックス名. */
    private String boxNm;

    /** ボックスオーナーID	 アカウントIDを指定. */
    private String boxOnrId;

    /** 検索 マテリアルID. */
    private String srcMaterialId;

    /** 検索 マテリアル名. */
    private String srcMaterialNm;
	/**
	 * ボックスマテリアル情報を設定します.
	 *
	 * @param mboxMaterial ロケーションボックス情報
	 */
	public final void setBoxMaterialInf(final MBoxMaterial mboxMaterial) {
		/** マテリアルマスタ情報. */
		mtId = mboxMaterial.getMtId();
		mtKind1 = mboxMaterial.getMtKind1();
		mtKind2 = mboxMaterial.getMtKind2();
		mtOnrId = mboxMaterial.getMtOnrId();
		mtNm = mboxMaterial.getMtNm();
		tagA = mboxMaterial.getTagA();
		tagB = mboxMaterial.getTagB();
		defaultLocale = mboxMaterial.getDefaultLocale();
		exCnt = mboxMaterial.getExCnt();
		insAcc = mboxMaterial.getInsAcc();
		insDate = mboxMaterial.getInsDate();
		updAcc = mboxMaterial.getUpdAcc();
		updDate = mboxMaterial.getUpdDate();
		delFlg = mboxMaterial.getDelFlg();
		recId = mboxMaterial.getRecId();
		
		/** 追加情報. */
//		locId = mboxMaterial.getLocId();
//		locKind = mboxMaterial.getLocKind();
//		locNm = mboxMaterial.getLocNm();
//		locOnrId = mboxMaterial.getLocOnrId();
		boxId = mboxMaterial.getBoxId();
		boxKind = mboxMaterial.getBoxKind();
		boxOnrId = mboxMaterial.getBoxOnrId();
//		capaInd = mboxMaterial.getCapaInd();
		boxNm = mboxMaterial.getBoxNm();
//	    note = mboxMaterial.getNote();

	
	}

	/**
	 *  ボックスマテリアル情報を破棄します.
	 */
	public final void resetBoxMaterialInf() {
		/** マテリアルマスタ情報. */
		mtId = null;;
		mtKind1 = null;
		mtKind2 = null;
		mtOnrId = null;
		mtNm = null;
		tagA = null;
		tagB = null;
		defaultLocale = null;
		exCnt = null;
		insAcc = null;
		insDate = null;
		updAcc = null;
		updDate = null;
		delFlg = null;
		recId = null;
		
		/** 追加情報. */
//		locId = null;
//		locKind = null;
//		locNm = null;
//		locOnrId = null;
		boxId = null;
		boxKind = null;
		boxOnrId = null;
//		capaInd = null;
		boxNm = null;
//	    note = null;
		
	}

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
     * @param prmMtNm the mtOnrId
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
     * Returns the locOnrId.
     *
     * @return the locOnrId
     */
    public final String getBoxOnrId() {
        return boxOnrId;
    }

    /**
     * Sets the locOnrId.
     *
     * @param prmLocOnrId the locOnrId
     */
    public final void setBoxOnrId(final String prmBoxOnrId) {
        this.boxOnrId = prmBoxOnrId;
    }

  
    /**
     * Returns the srcBoxId.
     *
     * @return the srcBoxId
     */
    public final String getSrcMaterialId() {
        return srcMaterialId;
    }

    /**
     * Sets the srcBoxId.
     *
     * @param prmSrcBoxId the srcBoxNm
     */
    public final void setSrcMaterialId(final String prmSrcMaterialId) {
        this.srcMaterialId = prmSrcMaterialId;
    }

    /**
     * Returns the srcBoxNm.
     *
     * @return the srcBoxNm
     */
    public final String getSrcMaterialNm() {
        return srcMaterialNm;
    }

    /**
     * Sets the srcBoxNm.
     *
     * @param prmSrcBoxNm the srcBoxNm
     */
    public final void setSrcBoxNm(final String prmSrcMaterialNm) {
        this.srcMaterialNm = prmSrcMaterialNm;
    }

}
