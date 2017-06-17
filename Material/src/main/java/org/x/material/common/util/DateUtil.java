package org.x.material.common.util;

import static org.x.material.condition.MaterialConstants.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日付関連のユーティリティ.
 *
 * @author  nakada
 * @since   20141026.00.01
 * @version 20141121.00.02
 */
public final class DateUtil {

	/**
	 * Don't let anyone instantiate this class.
	 */
	private DateUtil() { }

	/** 日付文字列長定義. */
	private static final int DATE_LENGTH = 10;

	/**
	 * 日付の妥当性チェックを行います.
	 * 指定した日付文字列（yyyy/MM/dd or yyyy-MM-dd）が
	 * カレンダーに存在するかどうかを返します.
	 * @param prmDate チェック対象の文字列
	 * @return 存在する日付の場合true
	 */
	public static boolean checkDate(final String prmDate) {
	    if (prmDate == null || prmDate.length() == 0) {
	    	return true;
	    }
	    if (prmDate.length() != DATE_LENGTH) {
	    	return false;
	    }
	    String strDate = prmDate.replace('-', '/');
	    DateFormat format = DateFormat.getDateInstance();
	    // 日付/時刻解析を厳密に行うを設定する。
	    format.setLenient(false);
	    try {
	        format.parse(strDate);
	        return true;
	    } catch (Exception e) {
	        return false;
	    }

	}

    /**
     * 指定されたパターン文字列の文字列を Date オブジェクトにして返します.
     * Date オブジェクトとして有効でない場合は null を返します.
     *
     * @param value 日付を表す文字列
     * @param prmformat 日付を表す文字列のパターン書式 (yyyy/MM/dd など)
     * @return 日付を表す文字列の Date オブジェクト
     */
	public static Date toDate(final String value, final String prmformat) {

	    if (value == null || value.length() <= DEFINTZERO) {
	        return null;
	    }

	    String format = prmformat;
	    if (format == null || format.length() <= DEFINTZERO) {
	        format = "yyyy/MM/dd";
	    }

	    // 日付フォーマットを作成
	    SimpleDateFormat dateFormat = new SimpleDateFormat(format);

	    // 日付の厳密チェックを指定
	    dateFormat.setLenient(false);

	    try {
	        // 日付値を返す
	        return dateFormat.parse(value);
	    } catch (ParseException e) {
	        // 日付値なしを返す
	        return null;
	    } finally {
	        dateFormat = null;
	    }
	}

	/**
	 * 指定されたパターン文字列(yyyy/MM/dd)の文字列を Date オブジェクトにして返します.
	 * Date オブジェクトとして有効でない場合は null を返します.
	 *
	 * @param value 日付を表す文字列
	 * @return 日付を表す文字列の Date オブジェクト
	 */
	public static Date toDate(final String value) {
	    return toDate(value , "yyyy/MM/dd");
	}

	/**
	 * 指定されたパターン文字列(yyyy/MM/dd hh:mm:ss)の文字列を Date オブジェクトにして返します.
	 * Date オブジェクトとして有効でない場合は null を返します.
	 *
	 * @param value 日付を表す文字列
	 * @return 日付を表す文字列の Date オブジェクト
	 */
	public static Date toDateTimestamp(final String value) {
	    return toDate(value , "yyyy/MM/dd HH:mm:ss");
	}

	/**
	 * 指定された 年（YYYY)、月（MM)、日（DD)の文字列を Date オブジェクトにして返します.
	 * Date オブジェクトとして有効でない場合は null を返します。
	 *
	 * @param valYear 年を表す文字列
	 * @param valMonth 月を表す文字列
	 * @param valDay 日を表す文字列
	 * @return 日付を表す文字列の Date オブジェクト
	 */
	public static Date toDate(final String valYear, final String valMonth, final String valDay) {
		return toDate(String.format("%s/%s/%s", valYear, valMonth, valDay));
	}

	/**
	 * 指定された 年（YYYY)、月（MM)、日（DD)、時(HH)、分(mm)、秒(ss)の文字列を Date オブジェクトにして返します.
	 * Date オブジェクトとして有効でない場合は null を返します.
	 *
	 * @param valYear 年を表す文字列
	 * @param valMonth 月を表す文字列
	 * @param valDay 日を表す文字列
	 * @param valHour 時間を表す文字列
	 * @param valMin 分を表す文字列
	 * @param valSs 秒を表す文字列
	 * @return 日付を表す文字列の Date オブジェクト
	 */
	public static Date toDate(final String valYear, final String valMonth, final String valDay,
								final String valHour, final String valMin, final String valSs) {
		return toDateTimestamp(String.format("%s/%s/%s %s:%s:%s", valYear, valMonth, valDay, valHour, valMin, valSs));
	}

	/**
	 * 指定されたパターン文字列の日付を開始日時(日付に、00:00:00 を追加)として Date オブジェクトにして返します.
	 * Date オブジェクトとして有効でない場合は null を返します。
	 *
	 * @param value 日付を表す文字列
	 * @return 日付を表す文字列の Date オブジェクト
	 */
	public static Date toStartDate(final String value) {
		return toDateTimestamp(String.format("%s 00:00:00", value));
	}

	/**
	 * 指定された 年（YYYY)、月（MM)、日（DD)の文字列を、開始日時(日付に、00:00:00 を追加)として Date オブジェクトにして返します.
	 * Date オブジェクトとして有効でない場合は null を返します。
	 *
	 * @param valYear 年を表す文字列
	 * @param valMonth 月を表す文字列
	 * @param valDay 日を表す文字列
	 * @return 日付を表す文字列の Date オブジェクト
	 */
	public static Date toStartDate(final String valYear, final String valMonth, final String valDay) {
		return toStartDate(String.format("%s/%s/%s", valYear, valMonth, valDay));
	}

	/**
	 * 指定されたパターン文字列の日付を終了日時(日付に、23:59:59 を追加)として Date オブジェクトにして返します.
	 * Date オブジェクトとして有効でない場合は null を返します。
	 *
	 * @param value 日付を表す文字列
	 * @return 日付を表す文字列の Date オブジェクト
	 */
	public static Date toEndDate(final String value) {
	    return toDate(String.format("%s 23:59:59", value), "yyyy/MM/dd HH:mm:ss");
	}

	/**
	 * 指定された 年（YYYY)、月（MM)、日（DD)の文字列を、終了日時(日付に、23:59:59 を追加)として Date オブジェクトにして返します.
	 * Date オブジェクトとして有効でない場合は null を返します。
	 *
	 * @param valYear 年を表す文字列
	 * @param valMonth 月を表す文字列
	 * @param valDay 日を表す文字列
	 * @return 日付を表す文字列の Date オブジェクト
	 */
	public static Date toEndDate(final String valYear, final String valMonth, final String valDay) {
		return toEndDate(String.format("%s/%s/%s", valYear, valMonth, valDay));
	}

	/**
	 * 指定された 年（YYYY)、月（MM)、日（DD)の文字列を   日付フォーマット(YYYY/MM/DD)にして返します.
	 *
	 * @param valYear 年を表す文字列
	 * @param valMonth 月を表す文字列
	 * @param valDay 日を表す文字列
	 * @return 日付を表す文字列
	 */
	public static String toDateFormatString(final String valYear, final String valMonth, final String valDay) {
		return String.format("%s/%s/%s", valYear, valMonth, valDay);
	}

	/**
	 * 指定された 時（HH)、分（mm)、秒（SS)の文字列を   時間フォーマット(HH:mm:DD)にして返します.
	 *
	 * @param valHour 時を表す文字列
	 * @param valMin 分を表す文字列
	 * @param valSec 秒を表す文字列
	 * @return 日付を表す文字列の Date オブジェクト
	 */
	public static String toTimeStampFormatString(final String valHour, final String valMin, final String valSec) {
		return String.format("%s:%s:%s", valHour, valMin,  valSec);
	}

	/**
	 * 当日日付を、YYYY/MM/DDの文字列で返します.
	 * @return String 当日日付を表す文字列
	 */
	public static String toDayString() {
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
		return sdf1.format(new Date());
	}

	/**
	 * 日付を、YYYY/MM/DDの文字列で返します.
	 *
	 * @param prmDate Date型日付
	 * @return String 当日日付を表す文字列
	 */
	public static String toDateString(final Date prmDate) {
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
		return sdf1.format(prmDate);
	}

	/**
	 * 日時を、YYYY/MM/DD HH:mm:ssの文字列で返します.
	 *
	 * @param prmDate Date型日付
	 * @return String 当日日時を表す文字列
	 */
	public static String toDateTimestampString(final Date prmDate) {
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		return sdf1.format(prmDate);
	}

}
