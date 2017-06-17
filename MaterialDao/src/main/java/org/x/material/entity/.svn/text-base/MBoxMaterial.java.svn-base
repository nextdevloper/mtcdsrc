package org.x.material.entity;


import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Transient;
import org.seasar.doma.jdbc.SelectOptions;

/**
 * ボックスマテリアル情報を定義する.
 *
 * @author  nakada
 * @since   20141124.00.01
 * @version 20141124.00.01
 */
@Entity(listener = MBoxMaterialListener.class)
public class MBoxMaterial extends MMaterial {

    /** ボックスID. */
    @Column(name = "box_id")
    private String boxId;

    /** ボックス種別	 プライベート/パブリック. */
    @Column(name = "box_kind")
    private String boxKind;

    /** ボックス名. */
    @Column(name = "box_nm")
    private String boxNm;

    /** ボックスオーナーID	 アカウントIDを指定. */
    @Column(name = "box_onr_id")
    private String boxOnrId;

 
    /** SelectOptions. */
    @Transient
    private SelectOptions options;

    /** 検索 マテリアルID. */
	@Transient
    private String srcMaterialId;

    /** 検索 マテリアル名. */
	@Transient
    private String srcMaterialNm;

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
