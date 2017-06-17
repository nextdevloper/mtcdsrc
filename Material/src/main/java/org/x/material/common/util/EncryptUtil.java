package org.x.material.common.util;

import static org.x.material.condition.MaterialConstants.*;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.seasar.framework.util.Base64Util;
import org.seasar.framework.util.ResourceUtil;

/**
 * 暗号化ユーティティ.
 * <p>
 * 与えられた文字列を、暗号化する。
 * </p>
 *
 * @author  nakada
 * @since   20141026.00.00
 * @version 20150216.00.01
 */
public final class EncryptUtil {

	/** 暗号化種別 SHA-1. */
	public static final String ENCRYPT_TYPE_SHA1 	= "SHA-1";
	/** 暗号化種別 SHA-256. */
	public static final String ENCRYPT_TYPE_SHA256 = "SHA-256";
	/** 暗号化種別 SHA-384. */
	public static final String ENCRYPT_TYPE_SHA384 = "SHA-384";
	/** 暗号化種別 SHA-512. */
	public static final String ENCRYPT_TYPE_SHA512 = "SHA-512";
	/** 暗号化種別 MD5. */
	public static final String ENCRYPT_TYPE_MD5 	= "MD5";
	/** 値：FF. */
	public static final int HEX_0XFF = 0xff;

	/**
	 * Don't let anyone instantiate this class.
	 */
	private EncryptUtil() { }

	/**
	 * 文字列を暗号化.
	 * <p>
	 * 指定された文字列を、暗号化します。<br>
	 * </p>
	 *
	 * @param enc 暗号化対象文字列
	 * @return String 暗号化文字列
	 * @throws NoSuchAlgorithmException アルゴリズム未登録エラー
	 */
	public static String encrypt(final String enc)
	throws NoSuchAlgorithmException {

		return encrypt(enc, ResourceUtil.getProperties(MATERIALPROPERTY).getProperty("EncryptType"));

	}

	/**
	 * 文字列を暗号化.
	 * <p>
	 * 指定された文字列を、指定された暗号タイプで、暗号化します。<br>
	 * </p>
	 *
	 * @param enc 暗号化対象文字列
	 * @param encKind 暗号化種別 (SHA-1,SHA-256,SHA-384,SHA-512,MD5)
	 * @return String 暗号化文字列
	 * @throws NoSuchAlgorithmException アルゴリズム未登録エラー
	 */
	public static String encrypt(final String enc, final String encKind)
	throws NoSuchAlgorithmException {

		MessageDigest messageDigest = MessageDigest.getInstance(encKind);
		byte[] bytes = enc.getBytes();
		byte[] digest = messageDigest.digest(bytes);
		String digestStr = toBase64(digest);

		return digestStr;
	}

	/**
	 * byte文字の文字列化.
	 * <p>
	 * 指定されたバイトを、HEX文字列に変換します。<br>
	 * </p>
	 *
	 * @param buf バイト文字
	 * @return String HEX文字列
	 */
	public static String toHex(final byte[] buf) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < buf.length; i++) {
			//ダンプ
			String hexStr = Integer.toHexString(buf[i] & HEX_0XFF);
			if (hexStr.length() == 1) {
				// 1桁の場合には、2桁目に0xffを挿入
				sb.append('0');
			}
			sb.append(hexStr);
		}
		return sb.toString().toUpperCase();
	}

	/**
	 * byte文字のbase64エンコード文字列化.
	 * <p>
	 * 指定されたバイトを、base64エンコード化します。<br>
	 * </p>
	 *
	 * @param buf バイト文字
	 * @return String base64文字列
	 */
	public static String toBase64(final byte[] buf) {
		return new String(Base64Util.encode(buf));
	}

}
