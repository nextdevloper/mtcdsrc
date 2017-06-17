package org.x.material.common.util;

/**
 * 共通ユーティリティクラス.
 */
public final class CommonUtil {

	/**
	 * Don't let anyone instantiate this class.
	 */
	private CommonUtil() { }


	/**
	 * メッセージコードがエラーコードであるか判定する.
	 * メッセージコードの末尾が"E"の場合には、TRUEを返す。
	 * それ以外は、FALSEを返す。
	 * メッセージコードが、Nullまたはブランクの場合にはTRUEとなります。
	 * @param msgId メッセージID
	 * @return boolean チェック結果
	 */
	public static boolean isError(final String msgId) {
		//桁数チェック
		/** TODO メッセージIDの体系が決まったらチェック内容を修正*/
		if (msgId == null || msgId.length() < 1) {
			return false;
		}
		String errCd = msgId.substring(msgId.length() - 1, msgId.length());
		if ("E".equals(errCd)) {
			return true;
		}
		return false;
	}

	/**
	 * メッセージコードに接頭辞"errors."を付加して返す.
	 * @param msgId メッセージID
	 * @return メッセージID
	 */
	public static String prefixError(final String msgId) {
		StringBuilder sb = new StringBuilder();
		sb.append("errors.");
		sb.append(msgId);
		return sb.toString();
	}

	/**
	 * 文字列が空かどうかを判定する.
	 * @param prmString 検索文字列
	 * @return true:空/False:空でない
	 */
	public static Boolean isENString(final String prmString) {
		if (prmString == null) {
			return true;
		}

		if (prmString.isEmpty()) {
			return true;
		}

		return false;
	}

}
