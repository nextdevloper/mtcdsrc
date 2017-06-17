package org.x.material.form.mgs05001;

import static org.x.material.condition.MaterialConstants.*;

import java.io.Serializable;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;
import org.seasar.struts.annotation.IntegerType;
import org.seasar.struts.annotation.Mask;
import org.seasar.struts.annotation.Maxlength;
import org.seasar.struts.annotation.Required;

/**
 * ロケーション管理Form.
 *
 * @author  nakada
 * @since   20141114.0.1
 * @version 20141114.0.1
 */
@Component(instance = InstanceType.SESSION)
public class LocationManagementForm implements Serializable {

	/** セッションシリアル番号. */
	private static final long serialVersionUID = 1L;

	/** ロケーション/ボックス参照検索条件 定義(LOCATION). */
	public static final String CONDLOCATION = "1";
	/** ロケーション/ボックス参照検索条件 定義(BOX). */
	public static final String CONDBOX = "2";

	/**
	 * ロケーション/ボックス参照条件.
	 */
	/** ロケーション/ボックス参照検索条件. */
	@Maxlength(maxlength = USERIDMAX)
	@Mask(mask = "^[a-zA-Z0-9]+$")
	private String srcLocBox;

	/**
	 * ロケーション一覧.
	 *
	 */
	/** ラジオボックス. */
	private String material;

	/** ロケーション一覧ページ番号. */
	@Required
	@IntegerType
	private String locpageno;

	/** ボックス一覧ページ番号. */
	@Required
	@IntegerType
	private String boxpageno;

	/** 一覧見出しチェックボックス. */
	private String checkbox;

	/** ロケーション一覧マルチチェックボックス. */
	private String[] lbox;

	/** ボックス一覧マルチチェックボックス. */
	private String[] bbox;

	/** ロケーション一覧パラメータ. */
	private String srckey;

	/** ボックス一覧ロケーション指定パラメータ. */
	private String srcboxlockey;

	/**
	 * ロケーション登録/更新.
	 */
	/** ロケーションID. */
	@Required(target = "locInsCheck,boxInsCheck")
	@Maxlength(maxlength = LOCIDMAX)
	@Mask(mask = "^[a-zA-Z0-9]+$")
	private String locId;

	/** ロケーション種別. */
	private String locKind;

	/** ロケーション名. */
	@Required(target = "locInsCheck")
	@Maxlength(maxlength = LOCNMMAX)
	private String locNm;

	/** 郵便番号. */
	@Mask(mask = "[0-9]{3}-[0-9]{4}")
	private String postcd;

	/** 住所. */
	@Maxlength(maxlength = ADDRMAX)
	private String address;

	/** 送付先名. */
	@Maxlength(maxlength = RECIPMAX)
	private String recipient;

	/** 電話番号. */
	@Maxlength(maxlength = TELKOTEIMAX)
	private String tel1;

	/** 備考. */
	@Maxlength(maxlength = BIKOMAX)
	private String note;

	/** 追加タグA. */
	@Maxlength(maxlength = TAGAMAX)
	private String tagA;

	/** 追加タグB. */
	@Maxlength(maxlength = TAGBMAX)
	private String tagB;

	/**
	 * ボックス登録/更新.
	 */
	/** ボックスオーナーID. */
	@Required(target = "boxInsCheck")
	@Maxlength(maxlength = USERIDMAX)
	@Mask(mask = "^[a-zA-Z0-9]+$")
	private String boxOnrId;

	/** ボックスID. */
	@Required(target = "boxInsCheck")
	@Maxlength(maxlength = BOXIDMAX)
	@Mask(mask = "^[a-zA-Z0-9]+$")
	private String boxId;

	/** ボックス種別. */
	private String boxKind;

	/** ボックス名. */
	@Required(target = "boxInsCheck")
	@Maxlength(maxlength = BOXNMMAX)
	private String boxNm;

	/** 容量種別. */
	@Maxlength(maxlength = CAPAINDMAX)
	private String capaInd;

	/**
	 * Form初期化.
	 */
	public final void initialize() {
		locId = null;
		locKind = "02";
		locNm = null;
		postcd = null;
		address = null;
		recipient = null;
		tel1 = null;
		note = null;
		tagA = null;
		tagB = null;

		boxOnrId = null;
		boxId = null;
		boxKind = null;
		boxNm = null;
		capaInd = null;
	}

	/**
	 * Formクリア.
	 * 	setterが実施される前に動作します。
	 */
	public final void reset() {
		checkbox = null;
		locKind = "02";
		lbox = new String[0];
		boxKind = null;
		bbox = new String[0];

	}

	/**
     * Returns the srcLocBox.
     *
     * @return the srcLocBox
     */
	public final String getSrcLocBox() {
		return srcLocBox;
	}

    /**
     * Sets the srcLocBox.
     *
     * @param prmSrcLocBox ロケーション/ボックス参照検索条件
     */
	public final void setSrcLocBox(final String prmSrcLocBox) {
		this.srcLocBox = prmSrcLocBox;
	}

	/**
     * Returns the material.
     *
     * @return the material
     */
	public final String getMaterial() {
		if (material == null || material.length() < 1) {
			material = CONDLOCATION;
		}
		return material;
	}

    /**
     * Sets the material.
     *
     * @param prmMaterial ロケーション/ボックス
     */
	public final void setMaterial(final String prmMaterial) {
		if (prmMaterial == null || prmMaterial.length() < 1) {
			this.material = CONDLOCATION;
		}
		this.material = prmMaterial;
	}

	/**
     * Returns the locpageno.
     *
     * @return the locpageno
     */
	public final String getLocpageno() {
		if (this.locpageno == null) {
			locpageno = "1";
		}

		return this.locpageno;
	}

    /**
     * Sets the locpageno.
     *
     * @param prmLocpageno ページ番号
     */
	public final void setLocpageno(final String prmLocpageno) {
		this.locpageno = prmLocpageno;
	}

	/**
     * Returns the boxpageno.
     *
     * @return the boxpageno
     */
	public final String getBoxpageno() {
		if (this.boxpageno == null) {
			boxpageno = "1";
		}

		return this.boxpageno;
	}

    /**
     * Sets the boxpageno.
     *
     * @param prmBoxpageno ページ番号
     */
	public final void setBoxpageno(final String prmBoxpageno) {
		this.boxpageno = prmBoxpageno;
	}

	/**
     * Returns the checkbox.
     *
     * @return the checkbox
     */
	public final String getCheckbox() {
		return checkbox;
	}

    /**
     * Sets the checkbox.
     *
     * @param prmCheckbox 一覧見出しチェックボックス
     */
	public final void setCheckbox(final String prmCheckbox) {
		this.checkbox = prmCheckbox;
	}

	/**
     * Returns the lbox.
     *
     * @return the lbox
     */
	public final String[] getLbox() {
		return lbox;
	}

    /**
     * Sets the lbox.
     *
     * @param prmLbox ロケーション一覧マルチチェックボックス
     */
	public final void setLbox(final String[] prmLbox) {
		this.lbox = prmLbox;
	}

	/**
     * Returns the bbox.
     *
	 * @return bbox
	 */
	public final String[] getBbox() {
		return bbox;
	}

	/**
     * Sets the bbox.
     *
	 * @param prmBbox ボックス一覧マルチチェックボックス
	 */
	public final void setBbox(final String[] prmBbox) {
		this.bbox = prmBbox;
	}

	/**
     * Returns the srckey.
     *
     * @return the srckey
     */
	public final String getSrckey() {
		return srckey;
	}

    /**
     * Sets the srckey.
     *
     * @param prmSrckey ロケーション一覧パラメータ
     */
	public final void setSrckey(final String prmSrckey) {
		this.srckey = prmSrckey;
	}

	/**
     * Returns the srcboxlockey.
     *
	 * @return srcboxlockey
	 */
	public final String getSrcboxlockey() {
		return srcboxlockey;
	}

	/**
     * Sets the srcboxlockey.
     *
	 * @param prmSrcboxlockey ボックス一覧対象ロケーション
	 */
	public final void setSrcboxlockey(final String prmSrcboxlockey) {
		this.srcboxlockey = prmSrcboxlockey;
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
     * @param prmLocId ロケーションID
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
		if (locKind != null && locKind.length() > 0) {
		return locKind;
		} else {
			return LOCATIONKINDPRIVATE;
	}
	}

    /**
     * Sets the locKind.
     *
     * @param prmLocKind ロケーション種別
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
     * @param prmLocNm ロケーション名
     */
	public final void setLocNm(final String prmLocNm) {
		this.locNm = prmLocNm;
	}

	/**
     * Returns the postcd.
     *
     * @return the postcd
     */
	public final String getPostcd() {
		return postcd;
	}

    /**
     * Sets the postcd.
     *
     * @param prmPostcd 郵便番号
     */
	public final void setPostcd(final String prmPostcd) {
		this.postcd = prmPostcd;
	}

	/**
     * Returns the address.
     *
     * @return the address
     */
	public final String getAddress() {
		return address;
	}

    /**
     * Sets the address.
     *
     * @param prmAddress 住所
     */
	public final void setAddress(final String prmAddress) {
		this.address = prmAddress;
	}

	/**
     * Returns the recipient.
     *
     * @return the recipient
     */
	public final String getRecipient() {
		return recipient;
	}

    /**
     * Sets the srckey.
     *
     * @param prmRecipient 送付先名
     */
	public final void setRecipient(final String prmRecipient) {
		this.recipient = prmRecipient;
	}

	/**
     * Returns the tel1.
     *
     * @return the tel1
     */
	public final String getTel1() {
		return tel1;
	}

    /**
     * Sets the tel1.
     *
     * @param prmTel1 電話番号
     */
	public final void setTel1(final String prmTel1) {
		this.tel1 = prmTel1;
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
     * @param prmNote 備考
     */
	public final void setNote(final String prmNote) {
		this.note = prmNote;
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
     * @param prmTagA 追加タグA
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
     * @param prmTagB 追加タグB
     */
	public final void setTagB(final String prmTagB) {
		this.tagB = prmTagB;
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
     * @param prmBoxOnrId ボックスオーナーID
     */
	public final void setBoxOnrId(final String prmBoxOnrId) {
		this.boxOnrId = prmBoxOnrId;
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
     * @param prmBoxId ボックスID
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
		if (this.boxKind != null && this.boxKind.length() > 0) {
			return boxKind;
		} else {
			return BOXKINDPRIVATE;
		}
	}

    /**
     * Sets the boxKind.
     *
     * @param prmBoxKind ボックス種別
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
     * @param prmBoxNm ボックス名
     */
	public final void setBoxNm(final String prmBoxNm) {
		this.boxNm = prmBoxNm;
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
     * @param prmCapaInd 容量種別
     */
	public final void setCapaInd(final String prmCapaInd) {
		this.capaInd = prmCapaInd;
	}

}
