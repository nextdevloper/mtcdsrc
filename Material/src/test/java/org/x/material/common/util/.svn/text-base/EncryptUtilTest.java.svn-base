package org.x.material.common.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.seasar.extension.unit.S2TestCase;
import org.seasar.framework.util.Base64Util;

/**
 * EncryptUtilTest
 *
 * @author MiNakada
 *
 */
public class EncryptUtilTest extends S2TestCase {


	/**
	 * 事前処理.
	 */
//	protected void setup() throws Exception {
//
//		super.setUp();
//		include("app.dicon");
//
//	}

	public void testEncrypt() throws NoSuchAlgorithmException {
//		fail("まだ実装されていません");
		String strPasswd = "abcdefghij123456";
		String encstr;

		MessageDigest messageDigest = MessageDigest.getInstance(EncryptUtil.ENCRYPT_TYPE_MD5);
		byte[] bytes = strPasswd.getBytes();
		byte[] digest = messageDigest.digest(bytes);
		String cmpEncStr = new String(Base64Util.encode(digest));

		encstr = EncryptUtil.encrypt(strPasswd, EncryptUtil.ENCRYPT_TYPE_MD5);
		assertEquals(cmpEncStr, encstr);

}

	public void testToHex() {
//		fail("まだ実装されていません");

		byte[] bval = {0x7F, 0x08};
		String cmpHexStr = "7F08";

		String srcHexStr = EncryptUtil.toHex(bval);

		assertEquals(cmpHexStr, srcHexStr);

	}

}
