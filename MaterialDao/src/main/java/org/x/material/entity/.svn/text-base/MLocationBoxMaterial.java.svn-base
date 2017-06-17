package org.x.material.entity;


import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Transient;
import org.seasar.doma.jdbc.SelectOptions;

/**
 * ロケーション/ボックス/マテリアル情報を定義する.<BR>
 * （情報の取得のみ使用）<BR>
 * 対象テーブル<BR>
 * ・ロケーションマスタ<BR>
 * ・ボックスマスタ<BR>
 * ・マテリアルマスタ<BR>
 * ・ロケーションボックス関連マスタ
 * ・ボックスマテリアル関連マスタ
 * @author  nakada
 * @since   20151011.00.01
 * @version 20151011.00.01
 */
@Entity(listener = MLocationBoxMaterialListener.class)
public class MLocationBoxMaterial {

	/**
	 *  ロケーションボックス関連マスタエンティティ
	 */
	/** ロケーションID. */
    @Column(name = "loc_id")
    private String mrlLocId;

    /** ボックスID. */
    @Column(name = "box_id")
    private String mrlBoxId;

	/**
	 *  ロケーションマスタエンティティ
	 */
    /** ロケーション種別	 プライベート/パブリック. */
    @Column(name = "loc_kind")
    private String locLocKind;

    /** ロケーション名. */
    @Column(name = "loc_nm")
    private String locLocNm;

    /** ロケーションオーナーID	 カウントIDを指定. */
    @Column(name = "loc_onr_id")
    private String locLocOnrId;

    /** 郵便番号	 XXX-XXXX. */
    @Column(name = "postcd")
    private String locPostcd;

    /** 住所. */
    @Column(name = "address")
    private String locAddress;

    /** 送付先名. */
    @Column(name = "recipient")
    private String locRecipient;

    /** 電話番号（固定）	 XXX-XXXX-XXXX. */
    @Column(name = "tel1")
    private String locTel1;

    /** 備考. */
    @Column(name = "note")
    private String locNote;


	/**
	 *  ボックスマスタエンティティ
	 */
    /** ボックス種別. */
    @Column(name = "box_kind")
    private String boxBoxKind;

    /** ボックスオーナーID. */
    @Column(name = "box_onr_id")
    private String boxBoxOnrId;

    /** 容量種別. */
    @Column(name = "capa_ind")
    private String boxCapaInd;

    /** ボックス名. */
    @Column(name = "box_nm")
    private String boxBoxNm;

    /** 備考. */
    @Column(name = "note")
    private String boxNote;


	/**
	 *  マテリアルマスタエンティティ
	 */
    /** マテリアルID. */
    @Column(name = "mt_id")
    private String mtMtId;

    /** マテリアル種別１	 パブリック/プライベート. */
    @Column(name = "mt_kind1")
    private String mtMtKind1;

    /** マテリアル種別２	 本/CD/DVD/その他. */
    @Column(name = "mt_kind2")
    private String mtMtKind2;

    /** マテリアル名. */
    @Column(name = "mt_nm")
    private String mtMtNm;

    /** マテリアルオーナーID. */
    @Column(name = "mt_onr_id")
    private String mtMtOnrId;

    /** 追加タグA. */
    @Column(name = "tag_a")
    private String mtTagA;

    /** 追加タグB. */
    @Column(name = "tag_b")
    private String mtTagB;




    /** SelectOptions. */
    @Transient
    private SelectOptions options;

    /** 検索ロケーション名. */
    @Transient
    private String srcLocNm;

    /** 検索ボックス名. */
    @Transient
    private String srcBoxNm;

    /** 検索マテリアル名. */
    @Transient
    private String srcMtrNm;

    /** チェック用アカウントID. */
    @Transient
    private String accId;

    /**
	 * Get boxBoxKind.
	 *
	 * @return boxBoxKind
	 */
	public final String getBoxBoxKind() {
		return boxBoxKind;
	}



	/**
	 * Set boxBoxKind.
	 *
	 * @param prmBoxBoxKind セットする boxBoxKind
	 */
	public final void setBoxBoxKind(final String prmBoxBoxKind) {
		this.boxBoxKind = prmBoxBoxKind;
	}



	/**
	 * Get boxBoxNm.
	 *
	 * @return boxBoxNm
	 */
	public final String getBoxBoxNm() {
		return boxBoxNm;
	}



	/**
	 * Set boxBoxNm.
	 *
	 * @param prmBoxBoxNm セットする boxBoxNm
	 */
	public final void setBoxBoxNm(final String prmBoxBoxNm) {
		this.boxBoxNm = prmBoxBoxNm;
	}



	/**
	 * Get mrlLocId.
	 *
	 * @return mrlLocId
	 */
	public final String getMrlLocId() {
		return mrlLocId;
	}



	/**
	 * Set mrlLocId.
	 *
	 * @param prmMrlLocId セットする mrlLocId
	 */
	public final void setMrlLocId(final String prmMrlLocId) {
		this.mrlLocId = prmMrlLocId;
	}



	/**
	 * Get mrlBoxId.
	 *
	 * @return mrlBoxId
	 */
	public final String getMrlBoxId() {
		return mrlBoxId;
	}



	/**
	 * Set mrlBoxId.
	 *
	 * @param mrlBoxId セットする mrlBoxId
	 */
	public final void setMrlBoxId(String mrlBoxId) {
		this.mrlBoxId = mrlBoxId;
	}



	/**
	 * Get locLocKind.
	 *
	 * @return locLocKind
	 */
	public final String getLocLocKind() {
		return locLocKind;
	}



	/**
	 * Set locLocKind.
	 *
	 * @param locLocKind セットする locLocKind
	 */
	public final void setLocLocKind(String locLocKind) {
		this.locLocKind = locLocKind;
	}



	/**
	 * Get locLocNm.
	 *
	 * @return locLocNm
	 */
	public final String getLocLocNm() {
		return locLocNm;
	}



	/**
	 * Set locLocNm.
	 *
	 * @param locLocNm セットする locLocNm
	 */
	public final void setLocLocNm(String locLocNm) {
		this.locLocNm = locLocNm;
	}



	/**
	 * Get locLocOnrId.
	 *
	 * @return locLocOnrId
	 */
	public final String getLocLocOnrId() {
		return locLocOnrId;
	}



	/**
	 * Set locLocOnrId.
	 *
	 * @param locLocOnrId セットする locLocOnrId
	 */
	public final void setLocLocOnrId(String locLocOnrId) {
		this.locLocOnrId = locLocOnrId;
	}



	/**
	 * Get locPostcd.
	 *
	 * @return locPostcd
	 */
	public final String getLocPostcd() {
		return locPostcd;
	}



	/**
	 * Set locPostcd.
	 *
	 * @param locPostcd セットする locPostcd
	 */
	public final void setLocPostcd(String locPostcd) {
		this.locPostcd = locPostcd;
	}



	/**
	 * Get locAddress.
	 *
	 * @return locAddress
	 */
	public final String getLocAddress() {
		return locAddress;
	}



	/**
	 * Set locAddress.
	 *
	 * @param locAddress セットする locAddress
	 */
	public final void setLocAddress(String locAddress) {
		this.locAddress = locAddress;
	}



	/**
	 * Get locRecipient.
	 *
	 * @return locRecipient
	 */
	public final String getLocRecipient() {
		return locRecipient;
	}



	/**
	 * Set locRecipient.
	 *
	 * @param locRecipient セットする locRecipient
	 */
	public final void setLocRecipient(String locRecipient) {
		this.locRecipient = locRecipient;
	}



	/**
	 * Get locTel1.
	 *
	 * @return locTel1
	 */
	public final String getLocTel1() {
		return locTel1;
	}



	/**
	 * Set locTel1.
	 *
	 * @param locTel1 セットする locTel1
	 */
	public final void setLocTel1(String locTel1) {
		this.locTel1 = locTel1;
	}



	/**
	 * Get locNote.
	 *
	 * @return locNote
	 */
	public final String getLocNote() {
		return locNote;
	}



	/**
	 * Set locNote.
	 *
	 * @param locNote セットする locNote
	 */
	public final void setLocNote(String locNote) {
		this.locNote = locNote;
	}



	/**
	 * Get boxBoxOnrId.
	 *
	 * @return boxBoxOnrId
	 */
	public final String getBoxBoxOnrId() {
		return boxBoxOnrId;
	}



	/**
	 * Set boxBoxOnrId.
	 *
	 * @param boxBoxOnrId セットする boxBoxOnrId
	 */
	public final void setBoxBoxOnrId(String boxBoxOnrId) {
		this.boxBoxOnrId = boxBoxOnrId;
	}



	/**
	 * Get boxCapaInd.
	 *
	 * @return boxCapaInd
	 */
	public final String getBoxCapaInd() {
		return boxCapaInd;
	}



	/**
	 * Set boxCapaInd.
	 *
	 * @param boxCapaInd セットする boxCapaInd
	 */
	public final void setBoxCapaInd(String boxCapaInd) {
		this.boxCapaInd = boxCapaInd;
	}



	/**
	 * Get boxNote.
	 *
	 * @return boxNote
	 */
	public final String getBoxNote() {
		return boxNote;
	}



	/**
	 * Set boxNote.
	 *
	 * @param boxNote セットする boxNote
	 */
	public final void setBoxNote(String boxNote) {
		this.boxNote = boxNote;
	}



	/**
	 * Get mtMtId.
	 *
	 * @return mtMtId
	 */
	public final String getMtMtId() {
		return mtMtId;
	}



	/**
	 * Set mtMtId.
	 *
	 * @param mtMtId セットする mtMtId
	 */
	public final void setMtMtId(String mtMtId) {
		this.mtMtId = mtMtId;
	}



	/**
	 * Get mtMtKind1.
	 *
	 * @return mtMtKind1
	 */
	public final String getMtMtKind1() {
		return mtMtKind1;
	}



	/**
	 * Set mtMtKind1.
	 *
	 * @param mtMtKind1 セットする mtMtKind1
	 */
	public final void setMtMtKind1(String mtMtKind1) {
		this.mtMtKind1 = mtMtKind1;
	}



	/**
	 * Get mtMtKind2.
	 *
	 * @return mtMtKind2
	 */
	public final String getMtMtKind2() {
		return mtMtKind2;
	}



	/**
	 * Set mtMtKind2.
	 *
	 * @param mtMtKind2 セットする mtMtKind2
	 */
	public final void setMtMtKind2(String mtMtKind2) {
		this.mtMtKind2 = mtMtKind2;
	}



	/**
	 * Get mtMtNm.
	 *
	 * @return mtMtNm
	 */
	public final String getMtMtNm() {
		return mtMtNm;
	}



	/**
	 * Set mtMtNm.
	 *
	 * @param mtMtNm セットする mtMtNm
	 */
	public final void setMtMtNm(String mtMtNm) {
		this.mtMtNm = mtMtNm;
	}



	/**
	 * Get mtMtOnrId.
	 *
	 * @return mtOnrId
	 */
	public final String getMtMtOnrId() {
		return mtMtOnrId;
	}



	/**
	 * Set mtMtOnrId.
	 *
	 * @param mtMtOnrId セットする mtMtOnrId
	 */
	public final void setMtMtOnrId(String mtMtOnrId) {
		this.mtMtOnrId = mtMtOnrId;
	}



	/**
	 * Get mtTagA.
	 *
	 * @return mtTagA
	 */
	public final String getMtTagA() {
		return mtTagA;
	}



	/**
	 * Set mtTagA.
	 *
	 * @param mtTagA セットする mtTagA
	 */
	public final void setMtTagA(String mtTagA) {
		this.mtTagA = mtTagA;
	}



	/**
	 * Get mtTagB.
	 *
	 * @return mtTagB
	 */
	public final String getMtTagB() {
		return mtTagB;
	}



	/**
	 * Set mtTagB.
	 *
	 * @param mtTagB セットする mtTagB
	 */
	public final void setMtTagB(String mtTagB) {
		this.mtTagB = mtTagB;
	}



	/**
	 * Get options.
	 *
	 * @return options
	 */
	public final SelectOptions getOptions() {
		return options;
	}



	/**
	 * Set options.
	 *
	 * @param options セットする options
	 */
	public final void setOptions(SelectOptions options) {
		this.options = options;
	}



	/**
	 * Get srcLocNm.
	 *
	 * @return srcLocNm
	 */
	public final String getSrcLocNm() {
		return srcLocNm;
	}



	/**
	 * Set srcLocNm.
	 *
	 * @param prmSrcLocNm セットする srcLocNm
	 */
	public final void setSrcLocNm(String prmSrcLocNm) {
		this.srcLocNm = prmSrcLocNm;
	}



	/**
	 * Get srcBoxNm.
	 *
	 * @return srcBoxNm
	 */
	public final String getSrcBoxNm() {
		return srcBoxNm;
	}



	/**
	 * Set srcBoxNm.
	 *
	 * @param srcBoxNm セットする srcBoxNm
	 */
	public final void setSrcBoxNm(String srcBoxNm) {
		this.srcBoxNm = srcBoxNm;
	}



	/**
	 * Get srcMtrNm.
	 *
	 * @return srcMtrNm
	 */
	public final String getSrcMtrNm() {
		return srcMtrNm;
	}



	/**
	 * Set srcMtrNm.
	 *
	 * @param srcMtrNm セットする srcMtrNm
	 */
	public final void setSrcMtrNm(String srcMtrNm) {
		this.srcMtrNm = srcMtrNm;
	}



	/**
	 * Get accId.
	 *
	 * @return accId
	 */
	public final String getAccId() {
		return accId;
	}



	/**
	 * Set accId.
	 *
	 * @param accId セットする accId
	 */
	public final void setAccId(String accId) {
		this.accId = accId;
	}



}
