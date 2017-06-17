package org.x.material.dto;

import java.io.Serializable;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;
import org.x.material.common.util.DateUtil;
import org.x.material.entity.MMaterial;

/**
 * ロケーション情報.
 *
 * @author nakada
 * @since   20141120.0.1
 * @version 20141120.0.1
 */
@Component(instance = InstanceType.SESSION)
public class MaterialDto implements Serializable {

	/** シリアルバージョン番号. */
	private static final long serialVersionUID = 1L;

    /** ロケーションID. */
    private String locId = null;

    /** ロケーション種別	 プライベート/パブリック. */
    private String locKind = null;

    /** ロケーション名. */
    private String locNm = null;

    /** ロケーションオーナーID	 カウントIDを指定. */
    private String locOnrId = null;

    /** 郵便番号. */
    private String postcd = null;

    /** 住所. */
    private String address = null;

    /** 送付先名. */
    private String recipient = null;

    /** 電話番号（固定）. */
    private String tel1 = null;

    /** 備考. */
    private String note = null;

    /** 標準ロケールID	 言語コードを設定（当面は、日本固定）. */
    private String defaultLocale = null;

    /** 排他制御カウンタ	 登録されるごとに＋１する. */
	private String exCnt = null;

    /** 登録アカウント	 登録時のアカウント. */
    private String insAcc = null;

    /** 登録日時	 登録した日時. */
    private String insDate = null;

    /** 更新アカウント	 更新時のアカウント. */
    private String updAcc = null;

    /** 更新日時	 更新した日時. */
    private String updDate = null;

    /** 削除フラグ	 "1"になると論理削除. */
    private String delFlg = null;

    /** レコードID	 レコード編集用ID. */
	private String recId = null;

	/**
	 * マテリアル情報を設定します.
	 *
	 * @param mlocation ロケーション情報
	 */
	public final void setMaterialInf(final MMaterial mmaterial) {
		//TODO 後で
/*	    locId = mmaterial.getLocId();
	    locKind = mmaterial.getLocKind();
	    locNm = mmaterial.getLocNm();
	    locOnrId = mmaterial.getLocOnrId();
	    postcd = mmaterial.getPostcd();
	    address = mmaterial.getAddress();
	    recipient = mmaterial.getRecipient();
	    tel1 = mmaterial.getTel1();
	    note = mmaterial.getNote();
*/	    defaultLocale = mmaterial.getDefaultLocale();
		exCnt = mmaterial.getExCnt().toString();
	    insAcc = mmaterial.getInsAcc();
	    insDate = DateUtil.toDateTimestampString(mmaterial.getInsDate());
	    updAcc = mmaterial.getUpdAcc();
	    updDate = DateUtil.toDateTimestampString(mmaterial.getUpdDate());
	    delFlg = mmaterial.getDelFlg();
		recId = mmaterial.getRecId().toString();
	}

	/**
	 *  ロケーション情報を破棄します.
	 */
	public final void resetMaterialInf() {
	    locId = null;
	    locKind = null;
	    locNm = null;
	    locOnrId = null;
	    postcd = null;
	    address = null;
	    recipient = null;
	    tel1 = null;
	    note = null;
	    defaultLocale = null;
		exCnt = null;
	    insAcc = null;
	    insDate = null;
	    updAcc = null;
	    updDate = null;
	    delFlg = null;
		recId = null;
	}


	/**
     * Returns the insdate.
     *
     * @return the insdate
     */
	public final String getLocId() {
		return locId;
	}

    /**
     * Sets the insdate.
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
		return locKind;
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
     * Sets the recipient.
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
     * @param prmTel1 電話番号（固定）
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
     * @param prmDefaultLocale 標準ロケールID
     */
	public final void setDefaultLocale(final String prmDefaultLocale) {
		this.defaultLocale = prmDefaultLocale;
	}

	/**
     * Returns the exCnt.
     *
     * @return the exCnt
     */
	public final String getExCnt() {
		return exCnt;
	}

    /**
     * Sets the exCnt.
     *
     * @param prmExCnt 排他制御カウンタ
     */
	public final void setExCnt(final String prmExCnt) {
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
     * @param prmInsAcc 登録アカウント
     */
	public final void setInsAcc(final String prmInsAcc) {
		this.insAcc = prmInsAcc;
	}

	/**
     * Returns the insDate.
     *
     * @return the insDate
     */
	public final String getInsDate() {
		return insDate;
	}

    /**
     * Sets the insDate.
     *
     * @param prmInsDate 登録日時
     */
	public final void setInsDate(final String prmInsDate) {
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
     * @param prmUpdAcc 更新アカウント
     */
	public final void setUpdAcc(final String prmUpdAcc) {
		this.updAcc = prmUpdAcc;
	}

	/**
     * Returns the updDate.
     *
     * @return the updDate
     */
	public final String getUpdDate() {
		return updDate;
	}

    /**
     * Sets the updDate.
     *
     * @param prmUpdDate 更新日時
     */
	public final void setUpdDate(final String prmUpdDate) {
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
     * @param prmDelFlg 削除フラグ
     */
	public final void setDelFlg(final String prmDelFlg) {
		this.delFlg = prmDelFlg;
	}

	/**
     * Returns the recId.
     *
     * @return the recId
     */
	public final String getRecId() {
		return recId;
	}

    /**
     * Sets the recId.
     *
     * @param prmRecId レコードID
     */
	public final void setRecId(final String prmRecId) {
		this.recId = prmRecId;
	}


}
