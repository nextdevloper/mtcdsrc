package org.x.material.form.mgs01001;

import static org.x.material.condition.MaterialConstants.*;

import java.io.Serializable;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;
import org.seasar.struts.annotation.DateType;
import org.seasar.struts.annotation.IntRange;
import org.seasar.struts.annotation.Mask;
import org.seasar.struts.annotation.Maxlength;
import org.seasar.struts.annotation.Msg;
import org.seasar.struts.annotation.Required;
import org.seasar.struts.annotation.Validwhen;
import org.x.material.common.util.CommonUtil;

/**
 * お知らせ/タイムラインForm.
 *
 * @author  nakada
 * @since   20141026.1.0
 * @version 20141026.0.1
 */
@Component(instance = InstanceType.SESSION)
public class NewsForm implements Serializable {
	/** セッションシリアル番号. */
	private static final long serialVersionUID = 1L;

	/** 時間の最大値. */
	private static final int MAXHOUR = 24;
	/** 分の最大値. */
	private static final int MAXMINUTES = 59;
	/** 秒の最大値. */
	private static final int MAXSECOUND = 59;


	/**
	 * 結果報告検索条件（開始時刻）
	 */
	/** 年. */
	@DateType(datePattern = "yyyy")
	@Mask(mask = "[0-9]{4}")
	@Validwhen(test = "((startMonResult == null) or (*this* != null))",
    msg = @Msg(key = "errors.required.other"))
	private String startYearResult;

	/** 月. */
	@DateType(datePattern = "MM")
	@Mask(mask = "[0-9]{2}")
	@Validwhen(test = "((startDayResult == null) or (*this* != null))",
    msg = @Msg(key = "errors.required.other"))
	private String startMonResult;

	/** 日. */
	@DateType(datePattern = "dd")
	@Mask(mask = "[0-9]{2}")
	@Validwhen(test = "((startHourResult == null) or (*this* != null))",
	msg = @Msg(key = "errors.required.other"))
	private String startDayResult;

	/** 時. */
	@Mask(mask = "[0-9]{2}")
	@IntRange(min = 0, max = MAXHOUR)
	@Validwhen(test = "((startMinitResult == null) or (*this* != null))",
	msg = @Msg(key = "errors.required.other"))
	private String startHourResult;
	/** 分. */
	@Mask(mask = "[0-9]{2}")
	@IntRange(min = 0, max = MAXMINUTES)
	@Validwhen(test = "((startSecResult == null) or (*this* != null))",
	msg = @Msg(key = "errors.required.other"))
	private String startMinitResult;
	/** 秒. */
	@Mask(mask = "[0-9]{2}")
	@IntRange(min = 0, max = MAXSECOUND)
	@Validwhen(test = "((startYearResult == null) or (*this* != null))",
	msg = @Msg(key = "errors.required.other"))
	private String startSecResult;

	/**
	 * 結果報告検索条件（終了時刻）.
	 */
	/** 年. */
	@DateType(datePattern = "yyyy")
	@Mask(mask = "[0-9]{4}")
	@Validwhen(test = "((endMonResult == null) or (*this* != null))",
    msg = @Msg(key = "errors.required.other"))
	private String endYearResult;

	/** 月. */
	@DateType(datePattern = "MM")
	@Mask(mask = "[0-9]{2}")
	@Validwhen(test = "((endDayResult == null) or (*this* != null))",
    msg = @Msg(key = "errors.required.other"))
	private String endMonResult;

	/** 日. */
	@DateType(datePattern = "dd")
	@Mask(mask = "[0-9]{2}")
	@Validwhen(test = "((endHourResult == null) or (*this* != null))",
	msg = @Msg(key = "errors.required.other"))
	private String endDayResult;

	/** 時. */
	@Mask(mask = "[0-9]{2}")
	@IntRange(min = 0, max = MAXHOUR)
	@Validwhen(test = "((endMinitResult == null) or (*this* != null))",
	msg = @Msg(key = "errors.required.other"))
	private String endHourResult;
	/** 分. */
	@Mask(mask = "[0-9]{2}")
	@IntRange(min = 0, max = MAXMINUTES)
	@Validwhen(test = "((endSecResult == null) or (*this* != null))",
	msg = @Msg(key = "errors.required.other"))
	private String endMinitResult;
	/** 秒. */
	@Mask(mask = "[0-9]{2}")
	@IntRange(min = 0, max = MAXSECOUND)
	@Validwhen(test = "((endYearResult == null) or (*this* != null))",
	msg = @Msg(key = "errors.required.other"))
	private String endSecResult;

	/**
	 * メッセージ検索条件（開始時刻）.
	 */
	/** 年. */
	@DateType(datePattern = "yyyy")
	@Mask(mask = "[0-9]{4}")
	@Validwhen(test = "((startMonNormal == null) or (*this* != null))",
    msg = @Msg(key = "errors.required.other"))
	private String startYearNormal;

	/** 月. */
	@DateType(datePattern = "MM")
	@Mask(mask = "[0-9]{2}")
	@Validwhen(test = "((startDayNormal == null) or (*this* != null))",
    msg = @Msg(key = "errors.required.other"))
	private String startMonNormal;

	/** 日. */
	@DateType(datePattern = "dd")
	@Mask(mask = "[0-9]{2}")
	@Validwhen(test = "((startHourNormal == null) or (*this* != null))",
	msg = @Msg(key = "errors.required.other"))
	private String startDayNormal;

	/** 時. */
	@Mask(mask = "[0-9]{2}")
	@IntRange(min = 0, max = MAXHOUR)
	@Validwhen(test = "((startMinitNormal == null) or (*this* != null))",
	msg = @Msg(key = "errors.required.other"))
	private String startHourNormal;
	/** 分. */
	@Mask(mask = "[0-9]{2}")
	@IntRange(min = 0, max = MAXMINUTES)
	@Validwhen(test = "((startSecNormal == null) or (*this* != null))",
	msg = @Msg(key = "errors.required.other"))
	private String startMinitNormal;
	/** 秒. */
	@Mask(mask = "[0-9]{2}")
	@IntRange(min = 0, max = MAXSECOUND)
	@Validwhen(test = "((startYearNormal == null) or (*this* != null))",
	msg = @Msg(key = "errors.required.other"))
	private String startSecNormal;

	/**
	 * メッセージ検索条件（終了時刻）.
	 */
	/** 年. */
	@DateType(datePattern = "yyyy")
	@Mask(mask = "[0-9]{4}")
	@Validwhen(test = "((endMonNormal == null) or (*this* != null))",
    msg = @Msg(key = "errors.required.other"))
	private String endYearNormal;

	/** 月. */
	@DateType(datePattern = "MM")
	@Mask(mask = "[0-9]{2}")
	@Validwhen(test = "((endDayNormal == null) or (*this* != null))",
    msg = @Msg(key = "errors.required.other"))
	private String endMonNormal;

	/** 日. */
	@DateType(datePattern = "dd")
	@Mask(mask = "[0-9]{2}")
	@Validwhen(test = "((endHourNormal == null) or (*this* != null))",
	msg = @Msg(key = "errors.required.other"))
	private String endDayNormal;

	/** 時. */
	@Mask(mask = "[0-9]{2}")
	@IntRange(min = 0, max = MAXHOUR)
	@Validwhen(test = "((endMinitNormal == null) or (*this* != null))",
	msg = @Msg(key = "errors.required.other"))
	public String endHourNormal;
	/** 分. */
	@Mask(mask = "[0-9]{2}")
	@IntRange(min = 0, max = MAXMINUTES)
	@Validwhen(test = "((endSecNormal == null) or (*this* != null))",
	msg = @Msg(key = "errors.required.other"))
	private String endMinitNormal;
	/** 秒. */
	@Mask(mask = "[0-9]{2}")
	@IntRange(min = 0, max = MAXSECOUND)
	@Validwhen(test = "((endYearNormal == null) or (*this* != null))",
	msg = @Msg(key = "errors.required.other"))
	private String endSecNormal;

	/** 送信先アカウントID. */
	@Required(target = "sndnmsg")
	@Maxlength(maxlength = USERIDMAX)
	@Mask(mask = "^[a-zA-Z0-9]+$")
	private String sendaccid;

	/** メッセージタイトル. */
	@Required(target = "sndnmsg")
	@Maxlength(maxlength = MSGTITLEMAX)
	private String msgtitle;

	/** メッセージ. */
	@Required(target = "sndnmsg")
	@Maxlength(maxlength = TXTMSGMAX)
	private String txtmsg;

	/** データ取得キー（アカウントID）. */
	private String key;

	/** お知らせ　メッセージ番号. */
	private String newsmsgno;

	/** 結果報告　メッセージ番号. */
	private String resultmsgno;

	/** メッセージ　メッセージ番号. */
	private String normalmsgno;

	/** メッセージ送信履歴　メッセージ番号. */
	private String normalhistorymsgno;

	/** 結果報告検索条件表示状態設定. */
	private String resultSrcCond;

	/** メッセージ検索条件表示状態設定. */
	private String normalSrcCond;

	/**
	 * Form初期化.
	 */
	public final void initialize() {
		sendaccid = null;
		msgtitle = null;
		txtmsg = null;

		startYearResult = null;
		startMonResult = null;
		startDayResult = null;
		startHourResult = null;
		startMinitResult = null;
		startSecResult = null;
		endYearResult = null;
		endMonResult = null;
		endDayResult = null;
		endHourResult = null;
		endMinitResult = null;
		endSecResult = null;

		startYearNormal = null;
		startMonNormal = null;
		startDayNormal = null;
		startHourNormal = null;
		startMinitNormal = null;
		startSecNormal = null;
		endYearNormal = null;
		endMonNormal = null;
		endDayNormal = null;
		endHourNormal = null;
		endMinitNormal = null;
		endSecNormal = null;

	}

	/**
	 * Formクリア.
	 * 	setterが実施される前に動作します。
	 */
	public final void reset() {

		newsmsgno = null;
		resultmsgno = null;
		normalmsgno = null;
		normalhistorymsgno = null;

		key = null;
		resultSrcCond = "none";
		normalSrcCond = "none";
	}

	/**
	 * 結果報告検索条件（開始時刻）  入力有無チェック.
	 *
	 * @return chkInputResultConditionStart 入力有:false、無:true
	 */
	public final boolean chkInputResultConditionStart() {
		return CommonUtil.isENString(startYearResult)
			&& CommonUtil.isENString(startMonResult)
			&& CommonUtil.isENString(startDayResult)
			&& CommonUtil.isENString(startHourResult)
			&& CommonUtil.isENString(startMinitResult)
			&& CommonUtil.isENString(startSecResult);
	}

	/**
	 * 結果報告検索条件（終了時刻）  入力有無チェック.
	 *
	 * @return chkInputResultConditionEnd 入力有:true、無:false
	 */
	public final boolean chkInputResultConditionEnd() {
		return CommonUtil.isENString(endYearResult)
				&& CommonUtil.isENString(endMonResult)
				&& CommonUtil.isENString(endDayResult)
				&& CommonUtil.isENString(endHourResult)
				&& CommonUtil.isENString(endMinitResult)
				&& CommonUtil.isENString(endSecResult);
	}

	/**
	 * メッセージ検索条件（開始時刻）  入力有無チェック.
	 *
	 * @return chkInputNormalConditionStart 入力有:true、無:false
	 */
	public final boolean chkInputNormalConditionStart() {
		return CommonUtil.isENString(startYearNormal)
				&& CommonUtil.isENString(startMonNormal)
				&& CommonUtil.isENString(startDayNormal)
				&& CommonUtil.isENString(startHourNormal)
				&& CommonUtil.isENString(startMinitNormal)
				&& CommonUtil.isENString(startSecNormal);
	}

	/**
	 * メッセージ検索条件（終了時刻）  入力有無チェック.
	 *
	 * @return chkInputNormalConditionEnd 入力有:true、無:false
	 */
	public final boolean chkInputNormalConditionEnd() {
		return CommonUtil.isENString(endYearNormal)
				&& CommonUtil.isENString(endMonNormal)
				&& CommonUtil.isENString(endDayNormal)
				&& CommonUtil.isENString(endHourNormal)
				&& CommonUtil.isENString(endMinitNormal)
				&& CommonUtil.isENString(endSecNormal);
	}

	/**
     * Returns the startYearResult.
     *
     * @return the startYearResult
     */
	public final String getStartYearResult() {
		return startYearResult;
	}

    /**
     * Sets the startYearResult.
     *
     * @param prmStartYearResult 結果報告検索条件（開始時刻）年情報
     */
	public final void setStartYearResult(final String prmStartYearResult) {
		this.startYearResult = prmStartYearResult;
	}

	/**
     * Returns the startMonResult.
     *
     * @return the startMonResult
     */
	public final String getStartMonResult() {
		return startMonResult;
	}

    /**
     * Sets the startMonResult.
     *
     * @param prmStartMonResult 結果報告検索条件（開始時刻）月情報
     */
	public final void setStartMonResult(final String prmStartMonResult) {
		this.startMonResult = prmStartMonResult;
	}

	/**
     * Returns the startDayResult.
     *
     * @return the startDayResult
     */
	public final String getStartDayResult() {
		return startDayResult;
	}

    /**
     * Sets the startDayResult.
     *
     * @param prmStartDayResult 結果報告検索条件（開始時刻）月情報
     */
	public final void setStartDayResult(final String prmStartDayResult) {
		this.startDayResult = prmStartDayResult;
	}

	/**
     * Returns the endYearResult.
     *
     * @return the endYearResult
     */
	public final String getEndYearResult() {
		return endYearResult;
	}

    /**
     * Sets the endYearResult.
     *
     * @param prmEndYearResult 結果報告検索条件（終了時刻）年情報
     */
	public final void setEndYearResult(final String prmEndYearResult) {
		this.endYearResult = prmEndYearResult;
	}

	/**
     * Returns the endMonResult.
     *
     * @return the endMonResult
     */
	public final String getEndMonResult() {
		return endMonResult;
	}

    /**
     * Sets the endMonResult.
     *
     * @param prmEndMonResult 結果報告検索条件（終了時刻）月情報
     */
	public final void setEndMonResult(final String prmEndMonResult) {
		this.endMonResult = prmEndMonResult;
	}

	/**
     * Returns the endDayResult.
     *
     * @return the endDayResult
     */
	public final String getEndDayResult() {
		return endDayResult;
	}

    /**
     * Sets the endDayResult.
     *
     * @param prmEndDayResult 結果報告検索条件（終了時刻）日情報
     */
	public final void setEndDayResult(final String prmEndDayResult) {
		this.endDayResult = prmEndDayResult;
	}

	/**
	 * Get endHourResult.
	 *
	 * @return endHourResult
	 */
	public final String getEndHourResult() {
		return endHourResult;
	}

	/**
	 * Set endHourResult.
	 *
	 * @param prmEndHourResult セットする endHourResult
	 */
	public final void setEndHourResult(final String prmEndHourResult) {
		this.endHourResult = prmEndHourResult;
	}

	/**
	 * Get endMinitResult.
	 *
	 * @return endMinitResult
	 */
	public final String getEndMinitResult() {
		return endMinitResult;
	}

	/**
	 * Set endMinitResult.
	 *
	 * @param prmEndMinitResult セットする endMinitResult
	 */
	public final void setEndMinitResult(final String prmEndMinitResult) {
		this.endMinitResult = prmEndMinitResult;
	}

	/**
	 * Get endSecResult.
	 *
	 * @return endSecResult
	 */
	public final String getEndSecResult() {
		return endSecResult;
	}

	/**
	 * Set endSecResult.
	 *
	 * @param prmEndSecResult セットする endSecResult
	 */
	public final void setEndSecResult(final String prmEndSecResult) {
		this.endSecResult = prmEndSecResult;
	}

	/**
     * Returns the startYearNormal.
     *
     * @return the startYearNormal
     */
	public final String getStartYearNormal() {
		return startYearNormal;
	}

    /**
     * Sets the startYearNormal.
     *
     * @param prmStartYearNormal メッセージ検索条件（開始時刻）年情報
     */
	public final void setStartYearNormal(final String prmStartYearNormal) {
		this.startYearNormal = prmStartYearNormal;
	}

	/**
     * Returns the startMonNormal.
     *
     * @return the startMonNormal
     */
	public final String getStartMonNormal() {
		return startMonNormal;
	}

    /**
     * Sets the startMonNormal.
     *
     * @param prmStartMonNormal メッセージ検索条件（開始時刻）月情報
     */
	public final void setStartMonNormal(final String prmStartMonNormal) {
		this.startMonNormal = prmStartMonNormal;
	}

	/**
     * Returns the startDayNormal.
     *
     * @return the startDayNormal
     */
	public final String getStartDayNormal() {
		return startDayNormal;
	}

    /**
     * Sets the startDayNormal.
     *
     * @param prmStartDayNormal メッセージ検索条件（開始時刻）日情報
     */
	public final void setStartDayNormal(final String prmStartDayNormal) {
		this.startDayNormal = prmStartDayNormal;
	}

	/**
	 * Get startHourNormal.
	 *
	 * @return startHourNormal
	 */
	public final String getStartHourNormal() {
		return startHourNormal;
	}

	/**
	 * Set startHourNormal.
	 *
	 * @param prmStartHourNormal セットする startHourNormal
	 */
	public final void setStartHourNormal(final String prmStartHourNormal) {
		this.startHourNormal = prmStartHourNormal;
	}

	/**
	 * Get startMinitNormal.
	 *
	 * @return startMinitNormal
	 */
	public final String getStartMinitNormal() {
		return startMinitNormal;
	}

	/**
	 * Set startMinitNormal.
	 *
	 * @param prmStartMinitNormal セットする startMinitNormal
	 */
	public final void setStartMinitNormal(final String prmStartMinitNormal) {
		this.startMinitNormal = prmStartMinitNormal;
	}

	/**
	 * Get startSecNormal.
	 *
	 * @return startSecNormal
	 */
	public final String getStartSecNormal() {
		return startSecNormal;
	}

	/**
	 * Set startSecNormal.
	 *
	 * @param prmStartSecNormal セットする startSecNormal
	 */
	public final void setStartSecNormal(final String prmStartSecNormal) {
		this.startSecNormal = prmStartSecNormal;
	}

	/**
	 * Get startHourResult.
	 *
	 * @return startHourResult
	 */
	public final String getStartHourResult() {
		return startHourResult;
	}

	/**
	 * Set startHourResult.
	 *
	 * @param prmStartHourResult セットする startHourResult
	 */
	public final void setStartHourResult(final String prmStartHourResult) {
		this.startHourResult = prmStartHourResult;
	}

	/**
	 * Get startMinitResult.
	 *
	 * @return startMinitResult
	 */
	public final String getStartMinitResult() {
		return startMinitResult;
	}

	/**
	 * Set startMinitResult.
	 *
	 * @param prmStartMinitResult セットする startMinitResult
	 */
	public final void setStartMinitResult(final String prmStartMinitResult) {
		this.startMinitResult = prmStartMinitResult;
	}

	/**
	 * Get startSecResult.
	 *
	 * @return startSecResult
	 */
	public final String getStartSecResult() {
		return startSecResult;
	}

	/**
	 * Set startSecResult.
	 *
	 * @param prmStartSecResult セットする startSecResult
	 */
	public final void setStartSecResult(final String prmStartSecResult) {
		this.startSecResult = prmStartSecResult;
	}

	/**
     * Returns the endYearNormal.
     *
     * @return the endYearNormal
     */
	public final String getEndYearNormal() {
		return endYearNormal;
	}

    /**
     * Sets the endYearNormal.
     *
     * @param prmEndYearNormal メッセージ検索条件（終了時刻）年情報
     */
	public final void setEndYearNormal(final String prmEndYearNormal) {
		this.endYearNormal = prmEndYearNormal;
	}

	/**
     * Returns the endMonNormal.
     *
     * @return the endMonNormal
     */
	public final String getEndMonNormal() {
		return endMonNormal;
	}

    /**
     * Sets the endMonNormal.
     *
     * @param prmEndMonNormal メッセージ検索条件（終了時刻）月情報
     */
	public final void setEndMonNormal(final String prmEndMonNormal) {
		this.endMonNormal = prmEndMonNormal;
	}

	/**
     * Returns the endDayNormal.
     *
     * @return the endDayNormal
     */
	public final String getEndDayNormal() {
		return endDayNormal;
	}

    /**
     * Sets the endDayNormal.
     *
     * @param prmEndDayNormal メッセージ検索条件（終了時刻）日情報
     */
	public final void setEndDayNormal(final String prmEndDayNormal) {
		this.endDayNormal = prmEndDayNormal;
	}

	/**
	 * Get endHourNormal.
	 *
	 * @return endHourNormal
	 */
	public final String getEndHourNormal() {
		return endHourNormal;
	}

	/**
	 * Set endHourNormal.
	 *
	 * @param prmEndHourNormal セットする endHourNormal
	 */
	public final void setEndHourNormal(final String prmEndHourNormal) {
		this.endHourNormal = prmEndHourNormal;
	}

	/**
	 * Get endMinitNormal.
	 *
	 * @return endMinitNormal
	 */
	public final String getEndMinitNormal() {
		return endMinitNormal;
	}

	/**
	 * Set endMinitNormal.
	 *
	 * @param prmEndMinitNormal セットする endMinitNormal
	 */
	public final void setEndMinitNormal(final String prmEndMinitNormal) {
		this.endMinitNormal = prmEndMinitNormal;
	}

	/**
	 * Get endSecNormal.
	 *
	 * @return endSecNormal
	 */
	public final String getEndSecNormal() {
		return endSecNormal;
	}

	/**
	 * Set endSecNormal.
	 *
	 * @param prmEndSecNormal セットする endSecNormal
	 */
	public final void setEndSecNormal(final String prmEndSecNormal) {
		this.endSecNormal = prmEndSecNormal;
	}

	/**
     * Returns the sendaccid.
     *
     * @return the sendaccid
     */
	public final String getSendaccid() {
		return sendaccid;
	}

    /**
     * Sets the sendaccid.
     *
     * @param prmSendaccid 送信先アカウントID情報
     */
	public final void setSendaccid(final String prmSendaccid) {
		this.sendaccid = prmSendaccid;
	}

	/**
     * Returns the msgtitle.
     *
     * @return the msgtitle
     */
	public final String getMsgtitle() {
		return msgtitle;
	}

    /**
     * Sets the msgtitle.
     *
     * @param prmMsgtitle メッセージタイトル情報
     */
	public final void setMsgtitle(final String prmMsgtitle) {
		this.msgtitle = prmMsgtitle;
	}

	/**
     * Returns the txtmsg.
     *
     * @return the txtmsg
     */
	public final String getTxtmsg() {
		return txtmsg;
	}

    /**
     * Sets the txtmsg.
     *
     * @param prmTxtmsg メッセージ情報
     */
	public final void setTxtmsg(final String prmTxtmsg) {
		this.txtmsg = prmTxtmsg;
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
     * @param prmKey データ取得キー（アカウントID）情報
     */
	public final void setKey(final String prmKey) {
		this.key = prmKey;
	}

	/**
     * Returns the newsmsgno.
     *
     * @return the newsmsgno
     */
	public final String getNewsmsgno() {
		return newsmsgno;
	}

    /**
     * Sets the newsmsgno.
     *
     * @param prmNewsmsgno お知らせ　メッセージ番号情報
     */
	public final void setNewsmsgno(final String prmNewsmsgno) {
		this.newsmsgno = prmNewsmsgno;
	}

	/**
     * Returns the resultmsgno.
     *
     * @return the resultmsgno
     */
	public final String getResultmsgno() {
		return resultmsgno;
	}

    /**
     * Sets the resultmsgno.
     *
     * @param prmResultmsgno 結果報告　メッセージ番号情報
     */
	public final void setResultmsgno(final String prmResultmsgno) {
		this.resultmsgno = prmResultmsgno;
	}

	/**
     * Returns the normalmsgno.
     *
     * @return the normalmsgno
     */
	public final String getNormalmsgno() {
		return normalmsgno;
	}

    /**
     * Sets the normalmsgno.
     *
     * @param prmNormalmsgno メッセージ　メッセージ番号情報
     */
	public final void setNormalmsgno(final String prmNormalmsgno) {
		this.normalmsgno = prmNormalmsgno;
	}

	/**
     * Returns the normalhistorymsgno.
     *
     * @return the normalhistorymsgno
     */
	public final String getNormalhistorymsgno() {
		return normalhistorymsgno;
	}

    /**
     * Sets the normalhistorymsgno.
     *
     * @param prmNormalhistorymsgno メッセージ送信履歴　メッセージ番号情報
     */
	public final void setNormalhistorymsgno(final String prmNormalhistorymsgno) {
		this.normalhistorymsgno = prmNormalhistorymsgno;
	}

	/**
     * Returns the resultSrcCond.
     *
     * @return the resultSrcCond
     */
	public final String getResultSrcCond() {
		return resultSrcCond;
	}

	/**
     * Sets the resultSrcCond.
     *
     * @param prmgetResultSrcCond 結果報告検索条件表示状態設定情報
     */
	public final void setResultSrcCond(final String prmgetResultSrcCond) {
		this.resultSrcCond = prmgetResultSrcCond;
	}

	/**
     * Returns the normalSrcCond.
     *
     * @return the normalSrcCond
     */
	public final String getNormalSrcCond() {
		return normalSrcCond;
	}

    /**
     * Sets the normalsrccond.
     *
     * @param prmNormalSrcCond メッセージ検索条件表示状態設定情報
     */
	public final void setNormalSrcCond(final String prmNormalSrcCond) {
		this.normalSrcCond = prmNormalSrcCond;
	}

}
