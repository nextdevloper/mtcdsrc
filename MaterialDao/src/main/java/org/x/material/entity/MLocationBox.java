package org.x.material.entity;


import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Transient;
import org.seasar.doma.jdbc.SelectOptions;

/**
 * ロケーションボックス情報を定義する.
 *
 * @author  nakada
 * @since   20141124.00.01
 * @version 20141124.00.01
 */
@Entity(listener = MLocationBoxListener.class)
public class MLocationBox extends MBox {

    /** ロケーションID. */
    @Column(name = "loc_id")
    private String locId;

    /** ロケーション種別	 プライベート/パブリック. */
    @Column(name = "loc_kind")
    private String locKind;

    /** ロケーション名. */
    @Column(name = "loc_nm")
    private String locNm;

    /** ロケーションオーナーID	 カウントIDを指定. */
    @Column(name = "loc_onr_id")
    private String locOnrId;

    /** 追加タグA. */
    @Column(name = "tag_a")
    private String tagA;

    /** 追加タグB. */
    @Column(name = "tag_b")
    private String tagB;

    /** SelectOptions. */
    @Transient
    private SelectOptions options;

    /** 検索 ボックスID. */
	@Transient
    private String srcBoxId;

    /** 検索 ボックス名. */
	@Transient
    private String srcBoxNm;

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

    /**
     * Returns the srcBoxId.
     *
     * @return the srcBoxId
     */
    public final String getSrcBoxId() {
        return srcBoxId;
    }

    /**
     * Sets the srcBoxId.
     *
     * @param prmSrcBoxId the srcBoxNm
     */
    public final void setSrcBoxId(final String prmSrcBoxId) {
        this.srcBoxId = prmSrcBoxId;
    }

    /**
     * Returns the srcBoxNm.
     *
     * @return the srcBoxNm
     */
    public final String getSrcBoxNm() {
        return srcBoxNm;
    }

    /**
     * Sets the srcBoxNm.
     *
     * @param prmSrcBoxNm the srcBoxNm
     */
    public final void setSrcBoxNm(final String prmSrcBoxNm) {
        this.srcBoxNm = prmSrcBoxNm;
    }

}
