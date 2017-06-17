package org.x.material.form.mgs07001;

import java.io.Serializable;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;
import org.seasar.struts.annotation.IntegerType;
import org.seasar.struts.annotation.Required;

/**
 * アカウント/組織照会Form.
 *
 * @author  nakada
 * @since   20151010.0.1
 * @version 20151010.0.1
 */
@Component(instance = InstanceType.SESSION)
public class MaterialCockpitForm implements Serializable {

	/** セッションシリアル番号. */
	private static final long serialVersionUID = 1L;

	/** ロケーション/ボックス/マテリアル参照検索条件 定義(LOCATION). */
	public static final String CONDLOCATION = "1";
	/** ロケーション/ボックス/マテリアル参照検索条件 定義(BOX). */
	public static final String CONDBOX = "2";

	/** 一覧ページ番号. */
	@Required
	@IntegerType
	private String locpageno;

	/** 参照検索キー1パラメータ. */
	private String srcKey1;
	/** 参照検索キー2パラメータ. */
	private String srcKey2;
	/** 参照検索キー3パラメータ. */
	private String srcKey3;

	/**
	 * 検索種別.
	 *
	 */
	/** ラジオボックス. */
//	private String selectKind;

	/**
	 * フォーム入力値　初期化.
	 *
	 */
	public void initialize() {
		srcKey1 = null;
		srcKey2 = null;
		srcKey3 = null;
	}

	/**
	 * Formクリア.
	 * 	setterが実施される前に動作します。
	 */
	public final void reset() {
//		checkbox = null;
//
//		mbox = new String[0];
//		srcKey1 = null;
//		srcKey2 = null;
//		srcKey3 = null;
	}

	/**
	 * Get locpageno.
	 *
	 * @return locpageno
	 */
	public final String getLocpageno() {
		return locpageno;
	}


	/**
	 * Set locpageno.
	 *
	 * @param prmLocpageno セットする locpageno
	 */
	public final void setLocpageno(final String prmLocpageno) {
		this.locpageno = prmLocpageno;
	}


	/**
     * Returns the srcKey1.
     *
     * @return the srcKey1
     */
	public final String getSrcKey1() {
		return this.srcKey1;
	}

    /**
     * Sets the srckey1.
     *
     * @param prmSrcKey 参照検索キーパラメータ
     */
	public final void setSrcKey1(final String prmSrcKey) {
		if (prmSrcKey == null || prmSrcKey.length() <= 0) {
			this.srcKey1 = null;
		} else {
			this.srcKey1 = prmSrcKey;
		}
	}

	/**
     * Returns the srcKey2.
     *
     * @return the srcKey2
     */
	public final String getSrcKey2() {
		return this.srcKey2;
	}

    /**
     * Sets the srckey2.
     *
     * @param prmSrcKey2 参照検索キーパラメータ
     */
	public final void setSrcKey2(final String prmSrcKey) {
		if (prmSrcKey == null || prmSrcKey.length() <= 0) {
			this.srcKey2 = null;
		} else {
			this.srcKey2 = prmSrcKey;
		}
	}

	/**
     * Returns the srcKey3.
     *
     * @return the srcKey3
     */
	public final String getSrcKey3() {
		return this.srcKey3;
	}

    /**
     * Sets the srckey3.
     *
     * @param prmSrcKey3 参照検索キーパラメータ
     */
	public final void setSrcKey3(final String prmSrcKey) {
		if (prmSrcKey == null || prmSrcKey.length() <= 0) {
			this.srcKey3 = null;
		} else {
			this.srcKey3 = prmSrcKey;
		}
	}

//	/**
//     * Returns the selectKind.
//     *
//     * @return the selectKind
//     */
//	public final String getSelectKind() {
//		if (selectKind == null || selectKind.length() < 1) {
//			selectKind = CONDLOCATION;
//		}
//		return selectKind;
//	}
//
//    /**
//     * Sets the selectKind.
//     *
//     * @param prmSelectKind ロケーション/ボックス
//     */
//	public final void setSelectKind(final String prmSelectKind) {
//		if (prmSelectKind == null || prmSelectKind.length() < 1) {
//			this.selectKind = CONDLOCATION;
//		}
//		this.selectKind = prmSelectKind;
//	}


}
