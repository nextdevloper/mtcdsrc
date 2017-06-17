package org.x.material.service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.seasar.framework.util.Base64Util;

// import sun.misc.BASE64Encoder;


/**
 * パスワード暗号化(MD5)サービス.
 *
 * @author  nakada
 * @since   20141026.1.0
 * @version 20141026.0.1
 */
public class PassDigestService {
	/**
	 * パスワードをMD5で暗号化するクラス.
	 *
	 * @param password パスワード情報
	 * @return encodePassdigiest
	 * @throws NoSuchAlgorithmException アルゴリズム未登録
	 */
	public final String encodePassdigiest(final String password)
	throws NoSuchAlgorithmException {
		byte[] enclyptedHash = null;
//		String passDigest = null;

		MessageDigest md5;
		// MD5で暗号化したByte型配列を取得する
		md5 = MessageDigest.getInstance("MD5");
		md5.update(password.getBytes());
		enclyptedHash = md5.digest();

		// 暗号化されたByte型配列を、16進数表記文字列に変換する
//		BASE64Encoder encoder = new BASE64Encoder();
//		String b64digest = encoder.encodeBuffer(enclyptedHash);
//		passDigest = b64digest.trim();
//
//		return passDigest;

		return new String(Base64Util.encode(enclyptedHash));
	}
}

