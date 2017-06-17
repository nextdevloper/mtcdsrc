package org.x.material.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;
import org.x.material.entity.MLocationBox;

/**
 * ロケーション情報.
 *
 * @author nakada
 * @since   20141120.0.1
 * @version 20141120.0.1
 */
@Component(instance = InstanceType.SESSION)
public class LocationBoxDto implements Serializable {

	/** シリアルバージョン番号. */
	private static final long serialVersionUID = 1L;

    /** ボックスID. */
    private String boxId;

    /** ボックス種別. */
    private String boxKind;

    /** ボックスオーナーID. */
    private String boxOnrId;

    /** 容量種別. */
    private String capaInd;

    /** ボックス名. */
    private String boxNm;

    /** 備考. */
    private String note;

    /** 標準ロケールID. */
    private String defaultLocale;

    /** 排他制御カウンタ. */
	private BigDecimal exCnt;

    /** 登録アカウント. */
    private String insAcc;

    /** 登録日時. */
    private Date insDate;

    /** 更新アカウント. */
    private String updAcc;

    /** 更新日時. */
    private Date updDate;

    /** 削除フラグ. */
    private String delFlg;

    /** レコードID	 レコード編集用ID. */
	private Long recId;

    /** ロケーションID. */
    private String locId;

    /** ロケーション種別	 プライベート/パブリック. */
    private String locKind;

    /** ロケーション名. */
    private String locNm;

    /** ロケーションオーナーID	 カウントIDを指定. */
    private String locOnrId;

    /** 追加タグA. */
    private String tagA;

    /** 追加タグB. */
    private String tagB;

	/**
	 * ロケーションボックス情報を設定します.
	 *
	 * @param mlocationBox ロケーションボックス情報
	 */
	public final void setLocationBoxInf(final MLocationBox mlocationBox) {
		boxId = mlocationBox.getBoxId();
		boxKind = mlocationBox.getBoxKind();
		boxOnrId = mlocationBox.getBoxOnrId();
		capaInd = mlocationBox.getCapaInd();
		boxNm = mlocationBox.getBoxNm();
	    note = mlocationBox.getNote();
	    defaultLocale = mlocationBox.getDefaultLocale();
		exCnt = mlocationBox.getExCnt();
	    insAcc = mlocationBox.getInsAcc();
	    insDate = mlocationBox.getInsDate();
	    updAcc = mlocationBox.getUpdAcc();
	    updDate = mlocationBox.getUpdDate();
	    delFlg = mlocationBox.getDelFlg();
		recId = mlocationBox.getRecId();
		locId = mlocationBox.getLocId();
		locKind = mlocationBox.getLocKind();
		locNm = mlocationBox.getLocNm();
		locOnrId = mlocationBox.getLocOnrId();
		tagA = mlocationBox.getTagA();
		tagB = mlocationBox.getTagB();
	}

	/**
	 *  ロケーションボックス情報を破棄します.
	 */
	public final void resetLocationBoxInf() {
		boxId = null;
		boxKind = null;
		boxOnrId = null;
		capaInd = null;
		boxNm = null;
	    note = null;
	    defaultLocale = null;
		exCnt = null;
	    insAcc = null;
	    insDate = null;
	    updAcc = null;
	    updDate = null;
	    delFlg = null;
		recId = null;
		locId = null;
		locKind = null;
		locNm = null;
		locOnrId = null;
		tagA = null;
		tagB = null;
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

}
