package org.x.material.common.exception;

/**
 * ランタイム例外クラス.
 *
 * @author  nakada
 * @since   xxxxxxxx.01.00
 * @version 20141026.00.01
 */
public class MCRuntimeException extends RuntimeException {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;
	/** エラーキー. */
	private String key;
	/** エラー値. */
	private Object[] values;

	/**
	 * ランタイム例外クラス設定.
	 *
	 * @param prmKey エラーキー
	 * @param prmValues エラー値
	 */
	public MCRuntimeException(final String prmKey, final Object[] prmValues) {
		this.key = prmKey;
		this.values = prmValues;
	}

	/**
     * Returns the key.
     *
     * @return the key
     */
	public final String getKey() {
		return key;
	}

    /**
     * Sets the key.
     *
     * @param prmKey エラーキー
     */
	public final void setKey(final String prmKey) {
		this.key = prmKey;
	}

	/**
     * Returns the values.
     *
     * @return the values
     */
	public final Object[] getValues() {
		return values;
	}

    /**
     * Sets the values.
     *
     * @param prmValues エラーキー
     */
	public final void setValues(final Object[] prmValues) {
		this.values = prmValues;
	}

	/**
     * Returns the serialVersionUID.
     *
     * @return the serialVersionUID
     */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
