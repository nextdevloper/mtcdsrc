package org.x.material.form.mgs02001;

import static org.x.material.condition.MaterialConstants.*;

import java.io.Serializable;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;
import org.seasar.struts.annotation.IntegerType;
import org.seasar.struts.annotation.Mask;
import org.seasar.struts.annotation.Maxlength;
import org.seasar.struts.annotation.Required;

/**
 * アカウント/組織照会Form.
 *
 * @author  nakada
 * @since   20141026.1.0
 * @version 20141026.0.1
 */
@Component(instance = InstanceType.SESSION)
public class AccountSearchForm  implements Serializable {
	/** セッションシリアル番号. */
	private static final long serialVersionUID = 1L;

	/** アカウントID. */
	@Required
	@Maxlength(maxlength = USERIDMAX)
	@Mask(mask = "^[a-zA-Z0-9]+$")
	private String srcUserId;

	/** 一覧見出しチェックボックス. */
	private String checkbox;

	/** 一覧マルチチェックボックス. */
	private String[] mbox;

	/** 明細表示用サーチキー. */
	private String srckey;

	/** ページ番号. */
	@Required
	@IntegerType
	private String pageno;

	/**
	 * Form初期化.
	 */
	public void initialize() {
	}

	/**
	 * Formクリア.
	 * 	setterが実施される前に動作します。
	 */
	public final void reset() {
		checkbox = null;

		mbox = new String[0];
		srckey = null;
	}

	/**
     * Returns the srcUserId.
     *
     * @return the srcUserId
     */
	public final String getSrcUserId() {
		return srcUserId;
	}

    /**
     * Sets the srcUserId.
     *
     * @param prmSrcUserId アカウントID
     */
	public final void setSrcUserId(final String prmSrcUserId) {
		this.srcUserId = prmSrcUserId;
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
     * Returns the mbox.
     *
     * @return the mbox
     */
	public final String[] getMbox() {
		return mbox;
	}

    /**
     * Sets the mbox.
     *
     * @param prmMbox 一覧マルチチェックボックス
     */
	public final void setMbox(final String[] prmMbox) {
		this.mbox = prmMbox;
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
     * @param prmSrckey 明細表示用サーチキー
     */
	public final void setSrckey(final String prmSrckey) {
		this.srckey = prmSrckey;
	}

	/**
     * Returns the pageno.
     *
     * @return the pageno
     */
	public final String getPageno() {
		if (this.pageno == null) {
			pageno = "1";
		}

		return this.pageno;
	}

    /**
     * Sets the pageno.
     *
     * @param pageNo ページ番号
     */
	public final void setPageno(final String pageNo) {
		this.pageno = pageNo;
	}

}
