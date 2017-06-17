/**
 *
 */
package org.x.material.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.seasar.extension.unit.S2TestCase;

/**
 * @author MiNakada
 *
 */
public class DateUtilTest extends S2TestCase {

//	/**
//	 * 事前処理.
//	 */
//	protected void setup() throws Exception {
//
//		super.setUp();
//		include("app.dicon");
//
//	}

	/**
	 * {@link org.x.material.common.util.DateUtil#checkDate(java.lang.String)} のためのテスト・メソッド。
	 */
	public void testCheckDate() {
//		fail("まだ実装されていません");
		// null check
		assertTrue(DateUtil.checkDate(null));
		assertTrue(DateUtil.checkDate(""));

		// 桁数 check
		assertTrue(DateUtil.checkDate("2014/01/10"));
		assertFalse(DateUtil.checkDate("2014/1/10"));
		assertFalse(DateUtil.checkDate("2014/12/10 01:01:01"));

		// 日付フォーマット check
		assertTrue(DateUtil.checkDate("2014/12/10"));
		assertTrue(DateUtil.checkDate("2014-12-10"));
		assertFalse(DateUtil.checkDate("2014*12*10"));
		assertFalse(DateUtil.checkDate("2014+12+10"));
		assertFalse(DateUtil.checkDate("2014011015"));

		// 日付妥当性 check
		assertTrue(DateUtil.checkDate("2014/12/10"));
		assertTrue(DateUtil.checkDate("2999/01/01"));
		assertTrue(DateUtil.checkDate("2016/02/29"));
		assertFalse(DateUtil.checkDate("2014/13/10"));
		assertFalse(DateUtil.checkDate("2014/12/32"));
		assertFalse(DateUtil.checkDate("2014/02/29"));

	}

	/**
	 * {@link org.x.material.common.util.DateUtil#toDate(java.lang.String, java.lang.String)} のためのテスト・メソッド。
	 */
	public void testToDateStringString() throws ParseException {
//		fail("まだ実装されていません");

		// null check
		assertNull(DateUtil.toDate(null, null));

		// date change check
		SimpleDateFormat sdf;
		Date cmpDate;

		sdf = new SimpleDateFormat("yyyy/MM/dd");
		cmpDate = sdf.parse("2014/01/01");
		assertEquals(DateUtil.toDate("2014/01/01", "yyyy/MM/dd"), cmpDate);

		sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		cmpDate = sdf.parse("2014/01/01 01:10:20");
		assertEquals(DateUtil.toDate("2014/01/01 01:10:20", "yyyy/MM/dd HH:mm:ss"), cmpDate);

		// date not change check
		assertNull(DateUtil.toDate("2014/13/32", "yyyy/MM/dd"));

	}

	/**
	 * {@link org.x.material.common.util.DateUtil#toDate(java.lang.String)} のためのテスト・メソッド。
	 */
	public void testToDateString() throws ParseException {
//		fail("まだ実装されていません");

		// date change check
		SimpleDateFormat sdf;
		Date cmpDate;

		sdf = new SimpleDateFormat("yyyy/MM/dd");
		cmpDate = sdf.parse("2014/01/01");
		assertEquals(DateUtil.toDate("2014/01/01"), cmpDate);

		// date not change check
		assertNull(DateUtil.toDate("2014/13/32"));

	}

	/**
	 * {@link org.x.material.common.util.DateUtil#toDateTimestamp(java.lang.String)} のためのテスト・メソッド。
	 */
	public void testToDateTimestamp() throws ParseException {
//		fail("まだ実装されていません");
		// date change check
		SimpleDateFormat sdf;
		Date cmpDate;

		sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		cmpDate = sdf.parse("2014/01/01 12:10:10");
		assertEquals(DateUtil.toDateTimestamp("2014/01/01 12:10:10"), cmpDate);

		// date not change check
		assertNull(DateUtil.toDateTimestamp("2014/13/32 12:10:10"));
		assertNull(DateUtil.toDateTimestamp("2014/01/01 12:70:10"));

	}

	/**
	 * {@link org.x.material.common.util.DateUtil#toDate(java.lang.String, java.lang.String, java.lang.String)} のためのテスト・メソッド。
	 */
	public void testToDateStringStringString() throws ParseException {
//		fail("まだ実装されていません");
		// date change check
		SimpleDateFormat sdf;
		Date cmpDate;

		sdf = new SimpleDateFormat("yyyy/MM/dd");
		cmpDate = sdf.parse("2014/01/10");
		assertEquals(DateUtil.toDate("2014", "01", "10"), cmpDate);

		// date not change check
		assertNull(DateUtil.toDate("2014", "13", "32"));

	}

	/**
	 * {@link org.x.material.common.util.DateUtil#toDate(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)} のためのテスト・メソッド。
	 */
	public void testToDateStringStringStringStringStringString() throws ParseException {
//		fail("まだ実装されていません");
		// date change check
		SimpleDateFormat sdf;
		Date cmpDate;

		sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		cmpDate = sdf.parse("2014/01/01 12:10:10");
		assertEquals(DateUtil.toDate("2014", "01", "01", "12", "10", "10"), cmpDate);

		// date not change check
		assertNull(DateUtil.toDate("2014", "13", "32", "12", "10", "10"));
		assertNull(DateUtil.toDate("2014", "01", "01", "12", "70", "10"));

	}

//	/**
//	 * {@link org.x.material.common.util.DateUtil#toTimeStamp(java.lang.String)} のためのテスト・メソッド。
//	 */
//	public void testToTimeStamp() {
////		fail("まだ実装されていません");
//	}

	/**
	 * {@link org.x.material.common.util.DateUtil#toStartDate(java.lang.String)} のためのテスト・メソッド。
	 */
	public void testToStartDateString() throws ParseException {
//		fail("まだ実装されていません");
		// date change check
		SimpleDateFormat sdf;
		Date cmpDate;

		sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		cmpDate = sdf.parse("2014/01/10 00:00:00");
		assertEquals(DateUtil.toStartDate("2014/01/10"), cmpDate);

		// date not change check
		assertNull(DateUtil.toStartDate("2014/13/32"));

	}

	/**
	 * {@link org.x.material.common.util.DateUtil#toStartDate(java.lang.String, java.lang.String, java.lang.String)} のためのテスト・メソッド。
	 */
	public void testToStartDateStringStringString() throws ParseException {
//		fail("まだ実装されていません");
		// date change check
		SimpleDateFormat sdf;
		Date cmpDate;

		sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		cmpDate = sdf.parse("2014/01/10 00:00:00");
		assertEquals(DateUtil.toStartDate("2014", "01", "10"), cmpDate);

		// date not change check
		assertNull(DateUtil.toStartDate("2014", "13", "32"));

	}

	/**
	 * {@link org.x.material.common.util.DateUtil#toEndDate(java.lang.String)} のためのテスト・メソッド。
	 */
	public void testToEndDateString() throws ParseException {
//		fail("まだ実装されていません");
		// date change check
		SimpleDateFormat sdf;
		Date cmpDate;

		sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		cmpDate = sdf.parse("2014/01/10 23:59:59");
		assertEquals(DateUtil.toEndDate("2014/01/10"), cmpDate);

		// date not change check
		assertNull(DateUtil.toEndDate("2014/13/32"));

	}

	/**
	 * {@link org.x.material.common.util.DateUtil#toEndDate(java.lang.String, java.lang.String, java.lang.String)} のためのテスト・メソッド。
	 */
	public void testToEndDateStringStringString() throws ParseException {
//		fail("まだ実装されていません");
		// date change check
		SimpleDateFormat sdf;
		Date cmpDate;

		sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		cmpDate = sdf.parse("2014/01/10 23:59:59");
		assertEquals(DateUtil.toEndDate("2014", "01", "10"), cmpDate);

		// date not change check
		assertNull(DateUtil.toEndDate("2014", "13", "32"));

	}

	/**
	 * {@link org.x.material.common.util.DateUtil#toDateFormatString(java.lang.String, java.lang.String, java.lang.String)} のためのテスト・メソッド。
	 */
	public void testToDateFormatString() {
//		fail("まだ実装されていません");
		// String change check
		assertEquals(DateUtil.toDateFormatString("2014", "01", "10"), "2014/01/10");

	}

	/**
	 * {@link org.x.material.common.util.DateUtil#toTimeStampFormatString(java.lang.String, java.lang.String, java.lang.String)} のためのテスト・メソッド。
	 */
	public void testToTimeStampFormatString() {
//		fail("まだ実装されていません");
		// String change check
		assertEquals(DateUtil.toTimeStampFormatString("01", "10", "58"), "01:10:58");

	}

//	/**
//	 * {@link org.x.material.common.util.DateUtil#toDayString()} のためのテスト・メソッド。
//	 * 当日日付の文字列変換は、後続の日付の文字列変換でＯＫのため、不要
//	 */
//	public void testToDayString() {
////		fail("まだ実装されていません");
//		// String change check
//		assertEquals(DateUtil.toDayString("01", "10", "58"), "01:10:58");
//
//	}

	/**
	 * {@link org.x.material.common.util.DateUtil#toDateString(java.util.Date)} のためのテスト・メソッド。
	 */
	public void testToDateString1() throws ParseException {
//		fail("まだ実装されていません");
		// String change check
		SimpleDateFormat sdf;
		Date cmpDate;

		sdf = new SimpleDateFormat("yyyy/MM/dd");
		cmpDate = sdf.parse("2014/01/10");
		assertEquals(DateUtil.toDateString(cmpDate), "2014/01/10");

	}

	/**
	 * {@link org.x.material.common.util.DateUtil#toDateTimestampString(java.util.Date)} のためのテスト・メソッド。
	 */
	public void testToDateTimestampString() throws ParseException {
//		fail("まだ実装されていません");
		// String change check
		SimpleDateFormat sdf;
		Date cmpDate;

		sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		cmpDate = sdf.parse("2014/01/10 23:59:59");
		assertEquals(DateUtil.toDateTimestampString(cmpDate), "2014/01/10 23:59:59");

	}

}
