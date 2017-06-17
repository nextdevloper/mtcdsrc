package org.x.material.common.util;

/**
 * リスト表示関連のユーティリティ.
 *
 * @author  nakada
 * @since   20141115.00.01
 * @version 20141115.00.01
 */
public final class ListUtil {

	/**
	 * Don't let anyone instantiate this class.
	 */
	private ListUtil() { }


    /**
	 * ページリンク文字列（HTML)を返す.
	 * @param srcHref リンク先情報
	 * @param currentPageNo カレントのページ番号
	 * @param totalRecNum 総レコード数
	 * @param perPage １ページあたりのレコード数
	 * @return ページリンク文字列
	 */
	public static String makePagingLink(final String srcHref, final int currentPageNo, final int totalRecNum, final int perPage) {
		/**
		 *  総ページ数を求める.
		 *  	--総ページ数が、1ページ以内はリンクは表示しない
		 *  		ページ数が、1ページ以下の場合、
		 *  			ページリンクは表示しない
		 *  		総ページ数が1ページで、あまりがない場合
		 *  			ページリンクは表示しない
		 *  	--総件数/1ページあたりの件数にあまりがある場合、商に1ページ加えたものを総ページ数とする）
		 *  		総ページ数が1ページ以上で、あまりがある場合、
		 *  			総ページ数に＋１する
		 */

		int pageNum = totalRecNum / perPage;
		int modNum = totalRecNum % perPage;

		if ((pageNum == 1) && (modNum == 0)) {
			pageNum = 0;
		} else if ((pageNum >= 1) && (modNum > 0)) {
			pageNum = pageNum + 1;
		}
		String[] links = new String[pageNum];

		for (int i = 1; i <= pageNum; i++) {
			if (i == currentPageNo) {
				links[i - 1] = String.format("<span class=\"pagelink-fontsize\"><b>%d</b></span>", currentPageNo);
			} else {
				links[i - 1] = String.format("<a class=\"pagelink-fontsize\" title=\"Page %d\" href=\"%s%d\">%d</a>", i, srcHref, i, i);
			}
		}

		return implobe(" ", links);
	}

    /**
     * 配列要素を文字列により連結する.
     *
     * @param glue 連結文字列
     * @param pieces 連結したい文字列の配列。
     * @return すべての配列要素の順序を変えずに、各要素間に glue  文字列をはさんで 1 つの文字列にして返します。
     */
	public static String implobe(final String glue, final String[] pieces) {
		StringBuffer buf = new StringBuffer();

		if (pieces.length > 0) {
	        for (int i = 0;; i++) {
	            buf.append(pieces[i]);
	            if (i >= pieces.length - 1) {
	                break;
	            }
	            buf.append(glue);
	        }
		} else {
			buf.append(glue);
		}
        return buf.toString();
	}

}
