package org.x.material.form.mgs06001;

import static org.x.material.condition.MaterialConstants.*;

import java.io.Serializable;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;
import org.seasar.struts.annotation.IntegerType;
import org.seasar.struts.annotation.Mask;
import org.seasar.struts.annotation.Maxlength;
import org.seasar.struts.annotation.Required;

/**
 * マテリアル管理Form.
 *
 * @author  nakada
 * @since   20141114.0.1
 * @version 20141114.0.1
 */
@Component(instance = InstanceType.SESSION)
public class MaterialManagementForm implements Serializable {

	/** セッションシリアル番号. */
	private static final long serialVersionUID = 1L;

	/** ロケーション/ボックス参照検索条件 定義(LOCATION). */
	public static final String CONDLOCATION = "1";
	/** ロケーション/ボックス参照検索条件 定義(BOX). */
	public static final String CONDBOX = "2";
	/** ロケーション/ボックス参照検索条件 定義(BOX). */
	public static final String CONDMATERIAL = "3";

	/**
	 * ロケーション/ボックス/マテリアル参照条件.
	 */
	@Maxlength(maxlength = USERIDMAX)
	@Mask(mask = "^[a-zA-Z0-9]+$")
	private String srcKey;
	
	/**
	 * ロケーション参照条件.
	 */
	private String srcLocKey;
	
	/**
	 * ボックス参照条件.
	 */
	private String srcBoxKey;
	
	/**
	 * マテリアル参照条件.
	 */
	private String srcMatKey;
	
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

	/** マテリアル一覧ページ番号. */
	@Required
	@IntegerType
	private String matpageno;

	/** 一覧見出しチェックボックス. */
	private String checkbox;

	/** ロケーション一覧マルチチェックボックス. */
	private String[] lbox;

	/** ボックス一覧マルチチェックボックス. */
	private String[] bbox;

	/** マテリアル一覧マルチチェックボックス. */
	private String[] mbox;

	
	/**
	 * ロケーション登録/更新.
	 */
	/** ロケーションID. */
	@Required(target = "locInsCheck,boxInsCheck,boxUpdCheck")
	@Maxlength(maxlength = LOCIDMAX)
	@Mask(mask = "^[a-zA-Z0-9]+$")
	private String locId;

	/** ロケーション種別. */
	private String locKind;

	/** ロケーション名. */
	@Required(target = "locInsCheck,locUpdCheck")
	@Maxlength(maxlength = LOCNMMAX)
	private String locNm;

	/** ロケーショオーナーID. */
	@Required(target = "locInsCheck,locUpdCheck")
	@Maxlength(maxlength = USERIDMAX)
	@Mask(mask = "^[a-zA-Z0-9]+$")
	private String locOnrId;

	/** ロケーショオーナー名称. */
	private String locOnrNm;

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
	/** ボックスID. */
	@Required(target = "boxInsCheck,matInsCheck,matUpdCheck")
	@Maxlength(maxlength = BOXIDMAX)
	@Mask(mask = "^[a-zA-Z0-9]+$")
	private String boxId;

	/** ボックス種別. */
	private String boxKind;

	/** ボックスオーナーID. */
	@Required(target = "boxInsCheck,boxUpdCheck")
	@Maxlength(maxlength = USERIDMAX)
	@Mask(mask = "^[a-zA-Z0-9]+$")
	private String boxOnrId;
	
	/** ボックスオーナー名称. */
	private String boxOnrNm;

	/** ボックス名. */
	@Required(target = "boxInsCheck,boxUpdCheck")
	@Maxlength(maxlength = BOXNMMAX)
	private String boxNm;

	/** 容量種別. */
	@Maxlength(maxlength = CAPAINDMAX)
	private String capaInd;

	/**
	 * マテリアル登録/更新.
	 */
	/** マテリアルID. */
	@Required(target = "matInsCheck")
	@Maxlength(maxlength = MATERIALIDMAX)
	@Mask(mask = "^[a-zA-Z0-9]+$")
	private String matId;

	/** マテリアル種別１. */
	private String matKind1;

	/** マテリアル種別２. */
	private String matKind2;

	/** マテリアルオーナーID. */
	@Required(target = "matInsCheck,matUpdCheck")
	@Maxlength(maxlength = USERIDMAX)
	@Mask(mask = "^[a-zA-Z0-9]+$")
	private String matOnrId;
	
	/** マテリアルオーナー名称. */
	private String matOnrNm;

	/** マテリアル名. */
	@Required(target = "matInsCheck,matUpdCheck")
	@Maxlength(maxlength = MATERIALNMMAX)
	private String matNm;

	/** 結果メッセージ. */
	private String resultMsg;
	
	/** 一覧表示結果メッセージ. */
	private String resultListMsg;
	
	/** 削除結果メッセージ. */
	private String resultDelMsg;

	/**
	 * Form初期化.
	 */
	public final void initialize() {
		//TODO クリア内容の見直し
		this.searchClear();
		this.detailClear();
		this.resultClear();
		
	
		
//		material=null;
//		locpageno=null;
//		boxpageno=null;
//		matpageno=null;
//		checkbox=null;
//		lbox=null;
//		bbox=null;
//		mbox=null;
		
	}

	/**
	 * Formクリア.
	 * 	setterが実施される前に動作します。
	 */
	public final void reset() {
		checkbox = null;
		lbox = new String[0];
		bbox = new String[0];
		mbox = new String[0];
		
		//TODO 一旦、initializeの内容を記載
		locOnrId = null;
		locOnrNm = null;
		locId = null;
		locKind = null;
		locNm = null;
		postcd = null;
		address = null;
		recipient = null;
		tel1 = null;
		note = null;
		tagA = null;
		tagB = null;

		boxOnrId = null;
		boxOnrNm = null;
		boxId = null;
		boxKind = null;
		boxNm = null;
		capaInd = null;
		
		matOnrId = null;
		matOnrNm = null;
		matId = null;
		matKind1 = null;
		matKind2 = null;
		matNm = null;
	}
	
	/**
	 * Form検索条件クリア.
	 */
	public final void searchClear() {
		//TODO クリア内容の見直し
		srcKey = null;
		srcLocKey = null;
		srcBoxKey = null;
		srcMatKey = null;
	}
	/**
	 * Form詳細クリア.
	 */
	public final void detailClear() {
		//TODO クリア内容の見直し
		locOnrId = null;
		locOnrNm = null;
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
		boxOnrNm = null;
		boxId = null;
		boxKind = null;
		boxNm = null;
		capaInd = null;
		
		matOnrId = null;
		matOnrNm = null;
		matId = null;
		matKind1 = null;
		matKind2 = null;
		matNm = null;
	}
	
	/**
	 * Form結果メッセージクリア.
	 */
	public final void resultClear() {
		//TODO クリア内容の見直し
		resultMsg=null;
		resultListMsg=null;
		resultDelMsg=null;
	}

	/**
     * Returns the srcKey.
     *
     * @return the srcKey
     */
	public final String getSrcKey() {
		return srcKey;
	}

    /**
     * Sets the srcKey.
     *
     * @param prmSrcKey ロケーション/ボックス/マテリアル参照検索条件
     */
	public final void setSrcKey(final String prmSrcKey) {
		this.srcKey = prmSrcKey;
	}
	
	/**
     * Returns the srcLocKey.
     *
     * @return the srcLocKey
     */
	public final String getSrcLocKey() {
		return srcLocKey;
	}

    /**
     * Sets the srcLocKey.
     *
     * @param prmSrcLocKey ロケーション参照検索条件
     */
	public final void setSrcLocKey(final String prmSrcLocKey) {
		this.srcLocKey = prmSrcLocKey;
	}

	/**
     * Returns the srcBoxKey.
     *
     * @return the srcBoxKey
     */
	public final String getSrcBoxKey() {
		return srcBoxKey;
	}

    /**
     * Sets the srcBoxKey.
     *
     * @param prmSrcBocKey ボックス参照検索条件
     */
	public final void setSrcBoxKey(final String prmSrcBoxKey) {
		this.srcBoxKey = prmSrcBoxKey;
	}
	/**
     * Returns the srcMatKey.
     *
     * @return the srcMatKey
     */
	public final String getSrcMatKey() {
		return srcMatKey;
	}

    /**
     * Sets the srcMatKey.
     *
     * @param prmSrcMatKey マテリアル参照検索条件
     */
	public final void setSrcMatKey(final String prmSrcMatKey) {
		this.srcMatKey = prmSrcMatKey;
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
     * Returns the matpageno.
     *
     * @return the matpageno
     */
	public final String getMatpageno() {
		if (this.matpageno == null) {
			matpageno = "1";
		}

		return this.matpageno;
	}

    /**
     * Sets the materialpageno.
     *
     * @param prmMatpageno ページ番号
     */
	public final void setMatpageno(final String prmMatpageno) {
		this.matpageno = prmMatpageno;
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
     * Returns the mbox.
     *
	 * @return mbox
	 */
	public final String[] getMbox() {
		return mbox;
	}

	/**
     * Sets the mbox.
     *
	 * @param prmMbox マテリアル一覧マルチチェックボックス
	 */
	public final void setMbox(final String[] prmMbox) {
		this.mbox = prmMbox;
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
     * @param prmLocOnrId ロケーションオーナーID
     */
	public final void setLocOnrId(final String prmLocOnrId) {
		this.locOnrId = prmLocOnrId;
	}
	
	/**
     * Returns the locOnrNm.
     *
     * @return the locOnrNm
     */
	public final String getLocOnrNm() {
		return locOnrNm;
	}

    /**
     * Sets the locOnrNm.
     *
     * @param prmLocOnrNm ロケーションオーナー名称
     */
	public final void setLocOnrNm(final String prmLocOnrNm) {
		this.locOnrNm = prmLocOnrNm;
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
//TODO 後で検討
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
     * Returns the boxOnrNm.
     *
     * @return the boxOnrNm
     */
	public final String getBoxOnrNm() {
		return boxOnrNm;
	}

    /**
     * Sets the boxOnrNm.
     *
     * @param prmBoxOnrNm ボックスオーナー名
     */
	public final void setBoxOnrNm(final String prmBoxOnrNm) {
		this.boxOnrNm = prmBoxOnrNm;
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
	/**
     * Returns the matOnrId.
     *
     * @return the matOnrId
     */
	public final String getMatOnrId() {
		return matOnrId;
	}

    /**
     * Sets the natOnrId.
     *
     * @param prmMatOnrId マテリアルオーナーID
     */
	public final void setMatOnrId(final String prmMatOnrId) {
		this.matOnrId = prmMatOnrId;
	}

	/**
     * Returns the matOnrNm.
     *
     * @return the matOnrNm
     */
	public final String getMatOnrNm() {
		return matOnrNm;
	}

    /**
     * Sets the matOnrNm.
     *
     * @param prmMatOnrNm マテリアルオーナー名
     */
	public final void setMatOnrNm(final String prmMatOnrNm) {
		this.matOnrNm = prmMatOnrNm;
	}

	
	/**
     * Returns the matId.
     *
     * @return the matId
     */
	public final String getMatId() {
		return matId;
	}

    /**
     * Sets the matId.
     *
     * @param prmMatId マテリアルID
     */
	public final void setMatId(final String prmMatId) {
		this.matId = prmMatId;
	}

	/**
     * Returns the matKind1.
     *
     * @return the matKind1
     */
	public final String getMatKind1() {
		if (this.matKind1 != null && this.matKind1.length() > 0) {
			return matKind1;
		} else {
			return MATERIALKINDPRIVATE;
		}
	}

    /**
     * Sets the matKind1.
     *
     * @param prmMatKind1 マテリアル種別１
     */
	public final void setMatKind1(final String prmMatKind1) {
		this.matKind1 = prmMatKind1;
	}

	/**
     * Returns the matKind2.
     *
     * @return the matKind2
     */
	public final String getMatKind2() {
		if (this.matKind2 != null && this.matKind2.length() > 0) {
			return matKind2;
		} else {
			return MATERIALKINDPRIVATE;
		}
	}

    /**
     * Sets the matKind2.
     *
     * @param prmMatKind2 マテリアル種別2
     */
	public final void setMatKind2(final String prmMatKind2) {
		this.matKind2 = prmMatKind2;
	}
	/**
     * Returns the matNm.
     *
     * @return the matNm
     */
	public final String getMatNm() {
		return matNm;
	}

    /**
     * Sets the matNm.
     *
     * @param prmMatNm マテリアル名
     */
	public final void setMatNm(final String prmMatNm) {
		this.matNm = prmMatNm;
	}
	
	/**
     * Returns the resultMsg.
     *
     * @return the resultMsg
     */
	public final String getResultMsg() {
		return resultMsg;
	}

    /**
     * Sets the resultMsg.
     *
     * @param prmResultMsg 結果メッセージ
     */
	public final void setResultMsg(final String prmResultMsg) {
		this.resultMsg = prmResultMsg;
	}
	/**
     * Returns the resultListMsg.
     *
     * @return the resultListMsg
     */
	public final String getResultListMsg() {
		return resultListMsg;
	}

    /**
     * Sets the resultListMsg.
     *
     * @param prmResultListMsg 結果メッセージ
     */
	public final void setResultListMsg(final String prmResultListMsg) {
		this.resultListMsg = prmResultListMsg;
	}
	/**
     * Returns the resultDelMsg.
     *
     * @return the resultDelMsg
     */
	public final String getResultDelMsg() {
		return resultDelMsg;
	}

    /**
     * Sets the resultDelMsg.
     *
     * @param prmResultDelMsg 削除結果メッセージ
     */
	public final void setResultDelMsg(final String prmResultDelMsg) {
		this.resultDelMsg = prmResultDelMsg;
	}
}
