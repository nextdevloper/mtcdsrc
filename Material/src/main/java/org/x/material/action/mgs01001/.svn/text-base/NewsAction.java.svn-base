package org.x.material.action.mgs01001;

//import org.seasar.sastruts.example.annotation.Auth;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import org.x.material.action.ActionFrame;
import org.x.material.common.annotation.Auth;
import org.x.material.common.util.CommonUtil;
import org.x.material.common.util.DateUtil;
import org.x.material.entity.TMsgSendNews;
import org.x.material.entity.TMsgSendNormal;
import org.x.material.entity.TMsgSendResult;
import org.x.material.form.mgs01001.NewsForm;
import org.x.material.service.MAccountService;
import org.x.material.service.TMessageService;
import org.x.material.service.mgs01001.NewsService;
//import org.x.material.common.util.LogUtil;

/**
 * お知らせ/タイムラインアクション.
 *
 * @author  nakada
 * @since   20141029.00.01
 * @version 20160514.00.02
 */
public class NewsAction  extends ActionFrame {
	/** 画面 - GM01. */
	private static final String GM01 = "news.jsp";

	/**
	 * デバッグ・ログ出力設定.
	 */
	private static final Logger LOGGER = Logger.getLogger(NewsAction.class);

	/**
	 * アクションフォーム.
	 */
    @Resource
    @ActionForm
	private NewsForm newsForm;

	/**
	 * タイムラインサービス.
	 */
    @Resource
	private NewsService newsService;

    /**
	 * メッセージ送信履歴サービス.
	 */
    @Resource
	private TMessageService tMessageService;

    /**
     * アカウントサービス.
     */
    @Resource
	private MAccountService mAccountService;

    /** お知らせ／タイムライン（おしらせ）. */
    private List<TMsgSendNews> timelinenewsItem;
    /** お知らせ／タイムライン（結果報告）. */
    private List<TMsgSendResult> timelineresultItem;
    /** お知らせ／タイムライン（メッセージ）. */
    private List<TMsgSendNormal> timelinenormalItem;
    /** お知らせ／タイムライン送信履歴（メッセージ）. */
    private List<TMsgSendNormal> timelinenormalHistoryItem;


	/** お知らせ／タイムライン明細（おしらせ）. */
    private TMsgSendNews dnitemnews;
    /** お知らせ／タイムライン明細（結果報告）. */
    private TMsgSendResult dnitemresult;
    /** お知らせ／タイムライン明細（メッセージ）. */
    private TMsgSendNormal dnitemnormal;
    /** お知らせ／タイムライン明細送信履歴（メッセージ）. */
    private TMsgSendNormal dnitemnormalhistory;

    /** 宛先アカウント指定. */
    private String defaultAccId;

    /**
	 * 初期表示.
	 * @return news.jsp
	 */
	@Auth
    @Execute(validator = false)
	public final String init() {
		LOGGER.debug("NewsAction Start");

		// フォーム初期化
		newsForm.initialize();

		// 照会画面より宛先アカウントが指定されてきたかどうかチェックする
		if (newsForm.getKey() != null && this.newsForm.getKey().length() > 0) {
			setDefaultAccId(newsForm.getKey());
		}

		newsForm.setResultSrcCond("none");
		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		/**
		 * 一覧取得
		 */
		getoutline();

		/**
		 * 条件設定表示
		 */
		setSrcCondition();

		LOGGER.debug("NewsAction End");
		return GM01;
    }

    /**
	 * 初期表示(結果報告過去条件表示).
	 * @return news.jsp
	 */
	@Auth
    @Execute(validator = false)
	public final String initresult() {
		LOGGER.debug("NewsAction Start");

		// フォーム初期化
		newsForm.initialize();

		// 照会画面より宛先アカウントが指定されてきたかどうかチェックする
		if (newsForm.getKey() != null && this.newsForm.getKey().length() > 0) {
			setDefaultAccId(newsForm.getKey());
		}

		/**
		 * 結果報告過去検索条件表示
		 */
		newsForm.setResultSrcCond("block");

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		/**
		 * 一覧取得
		 */
		getoutline();

		LOGGER.debug("NewsAction End");
		return GM01;
    }

    /**
	 * 初期表示(メッセージ過去条件表示).
	 * @return news.jsp
	 */
	@Auth
    @Execute(validator = false)
	public final String initnormal() {
		LOGGER.debug("NewsAction Start");

		// フォーム初期化
		newsForm.initialize();

		// 照会画面より宛先アカウントが指定されてきたかどうかチェックする
		if (newsForm.getKey() != null && this.newsForm.getKey().length() > 0) {
			setDefaultAccId(newsForm.getKey());
		}

		/**
		 * メッセージ過去検索条件表示
		 */
		newsForm.setNormalSrcCond("none");

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		/**
		 * 一覧取得
		 */
		getoutline();

		LOGGER.debug("NewsAction End");
		return GM01;
    }

	/**
	 *  照会取得.
	 * @return news.jsp
	 */
	@Auth
    @Execute(validator = true, input = "inquiryError")
	public final String inquiry() {

		LOGGER.debug("inquiry Start...");

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		/**
		 * 一覧取得
		 */
		getoutline();

		LOGGER.debug("inquiry End");

		return GM01;
	}

    /**
	 * 照会エラー表示.
	 * @return news.jsp
	 */
	@Auth
    @Execute(validator = false)
	public final String inquiryError() {
		LOGGER.debug("inquiryError...");

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		/**
		 * 条件設定表示
		 */
		setSrcCondition();

		return GM01;

	}

	/**
	 * お知らせ明細取得.
	 * @return news.jsp
	 */
	@Auth
    @Execute(validator = false)
	public final String selnewsmsgdt() {

		LOGGER.debug("selnewsmsgdt...");

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		/**
		 * 一覧取得
		 */
		getoutline();

		/**
		 * お知らせ明細の取得
		 */
		getnewsdetail();

		/**
		 * 条件設定表示
		 */
		setSrcCondition();

		return GM01;

	}

	/**
	 * 結果報告明細取得.
	 * @return news.jsp
	 */
	@Auth
    @Execute(validator = true, input = GM01)
	public final String selresultmsg() {

		LOGGER.debug("selresultmsg...");

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		/**
		 * 一覧取得
		 */
		getoutline();

		/**
		 * 結果報告明細の取得
		 */
		getresultdetail();

		/**
		 * 条件設定表示
		 */
		setSrcCondition();

		LOGGER.debug("selresultmsg End");

		return GM01;

	}

	/**
	 * メッセージ明細取得.
	 * @return news.jsp
	 */
	@Auth
	@Execute(validator = false, input = GM01)
	public final String selnormalmsg() {
		LOGGER.debug("selnormalmsg...");

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		/**
		 * 一覧取得
		 */
		getoutline();

		/**
		 * メッセージ明細の取得
		 */
		getnormaldetail();

		/**
		 * 条件設定表示
		 */
		setSrcCondition();

		LOGGER.debug("selnormalmsg End");

		return GM01;

	}

	/**
	 * メッセージ明細取得.
	 * @return news.jsp
	 */
	@Auth
	@Execute(validator = false, input = GM01)
	public final String selnormalhistorymsg() {
		LOGGER.debug("selnormalhistorymsg...");

		/**
		 * ヘッダ、サイドメニュー設定
		 */
		getheadmenu();

		/**
		 * 一覧取得
		 */
		getoutline();

		/**
		 * メッセージ明細の取得
		 */
		getnormalhistorydetail();

		/**
		 * 条件設定表示
		 */
		setSrcCondition();

		LOGGER.debug("selnormalhistorymsg End");

		return GM01;

	}

	/**
	 * メッセージ送信.
	 * @return news.jsp
	 */
	@Auth
	@Execute(validator = true, input = GM01)
	public final String sndnmsg() {

		/**
		 * メッセージ送信履歴登録.
		 */
		newsService.regMsgSnd(newsForm, getUserDto().getAccid());

		/**
		 * ヘッダ、サイドメニュー設定 .
		 */
		getheadmenu();

		/**
		 * 一覧取得.
		 */
		getoutline();

		/**
		 * フォーム初期化.
		 */
		newsForm.initialize();

		/**
		 * 条件設定表示
		 */
		setSrcCondition();

		return GM01;
	}

	/**
	 * メッセージ送信チェック.
	 * 	メッセージ送信時の状態チェックを行います。
	 * @return ActionMessages
	 */
	public final ActionMessages chkSendMessageVlidate() {
		ActionMessages errors = new ActionMessages();

		/**
		 * メッセージ送信先の存在チェック.
		 */
		if (!mAccountService.chkIsAccount(newsForm.getSendaccid())) {
			errors.add("sndmessageErr", new ActionMessage(CommonUtil.prefixError("M00001E")));
			return errors;
		}

		/**
		 * メッセージ送信先のブロックチェック.
		 */
		if (mAccountService.chkAccountBlock(newsForm.getSendaccid(), getUserDto().getAccid())) {
			errors.add("sndmessageErr", new ActionMessage(CommonUtil.prefixError("M00002E")));
			return errors;
		}

		return errors;

	}

	/**
	 * 一覧取得.
	 */
	private void getoutline() {
		Date stDate, edDate;

		LOGGER.debug("getoutline...");

		/**
		 *  お知らせ一覧取得
		 */
		timelinenewsItem = tMessageService.newsFindAccId(null, null, null);

		/**
		 * 結果報告一覧取得
		 */
		newsForm.setResultSrcCond("none");
		stDate = null;
		if (newsForm.chkInputResultConditionStart() == false) {
			stDate = DateUtil.toDate(newsForm.getStartYearResult(), newsForm.getStartMonResult(), newsForm.getStartDayResult(),
									 newsForm.getStartHourResult(), newsForm.getStartMinitResult(), newsForm.getStartSecResult());
			newsForm.setResultSrcCond("block");
		}
		LOGGER.debug("ResultSrcCond:" + newsForm.getResultSrcCond());
		edDate = null;
		if (newsForm.chkInputResultConditionEnd() == false) {
			edDate = DateUtil.toDate(newsForm.getEndYearResult(), newsForm.getEndMonResult(), newsForm.getEndDayResult(),
									 newsForm.getEndHourResult(), newsForm.getEndMinitResult(), newsForm.getEndSecResult());
			newsForm.setResultSrcCond("block");
		}

		timelineresultItem = tMessageService.resultFindAccId(getUserDto().getAccid(), stDate, edDate);

		/**
		 * メッセージ一覧取得
		 */
		newsForm.setNormalSrcCond("none");
		stDate = null;
		if (newsForm.chkInputNormalConditionStart() == false) {
			LOGGER.debug("chkInputNormalConditionStart()=true");
			stDate = DateUtil.toDate(newsForm.getStartYearNormal(), newsForm.getStartMonNormal(), newsForm.getStartDayNormal(),
									 newsForm.getStartHourNormal(), newsForm.getStartMinitNormal(), newsForm.getStartSecNormal());
			newsForm.setNormalSrcCond("block");
		}
		edDate = null;
		if (newsForm.chkInputNormalConditionEnd() == false) {
			LOGGER.debug("chkInputNormalConditionEnd()=true");
			edDate = DateUtil.toDate(newsForm.getEndYearNormal(), newsForm.getEndMonNormal(), newsForm.getEndDayNormal(),
									 newsForm.getEndHourNormal(), newsForm.getEndMinitNormal(), newsForm.getEndSecNormal());
			newsForm.setNormalSrcCond("block");
		}

		timelinenormalItem = tMessageService.findAccId(getUserDto().getAccid(), stDate, edDate);

		/**
		 * メッセージ送信履歴一覧取得
		 */
		timelinenormalHistoryItem = tMessageService.findAccId(getUserDto().getAccid());

	}

	/**
	 * お知らせ明細取得.
	 */
	private void getnewsdetail() {
		if (newsForm.getNewsmsgno() != null) {
			setDnitemnews(tMessageService.newsFindMsgNo(Long.parseLong(newsForm.getNewsmsgno())));
		}
	}

	/**
	 * 結果報告明細取得.
	 */
	private void getresultdetail() {
		if (newsForm.getResultmsgno() != null) {
			setDnitemresult(tMessageService.resultFindMsgNo(Long.parseLong(newsForm.getResultmsgno())));
		}
	}

	/**
	 * メッセージ明細取得.
	 */
	private void getnormaldetail() {
		if (newsForm.getNormalmsgno() != null) {
			setDnitemnormal(tMessageService.normalFindMsgNo(Long.parseLong(newsForm.getNormalmsgno())));
		}
	}

	/**
	 * メッセージ送信履歴明細取得.
	 */
	private void getnormalhistorydetail() {
		if (newsForm.getNormalhistorymsgno() != null) {
			setDnitemnormalhistory(tMessageService.normalFindMsgNo(Long.parseLong(newsForm.getNormalhistorymsgno())));
		}
	}

	/**
	 * 検索条件表示設定.
	 */
	private void setSrcCondition() {
		LOGGER.debug("setSrcCondition Start...");

		// 結果報告検索条件表示設定
		newsForm.setResultSrcCond("none");
		if (newsForm.chkInputResultConditionStart() == false) {
			newsForm.setResultSrcCond("block");
		}
		if (newsForm.chkInputResultConditionEnd() == false) {
			newsForm.setResultSrcCond("block");
		}

		// 	メッセージ検索条件表示設定
		newsForm.setNormalSrcCond("none");
		if (newsForm.chkInputNormalConditionStart() == false) {
			newsForm.setNormalSrcCond("block");
		}
		if (newsForm.chkInputNormalConditionEnd() == false) {
			newsForm.setNormalSrcCond("block");
		}

		LOGGER.debug("setSrcCondition End.");
	}

	/**
     * Returns the timelinenewsItem.
     *
     * @return the timelinenewsItem
     */
	public final List<TMsgSendNews> getTimelinenewsItem() {
		return timelinenewsItem;
	}

    /**
     * Sets the timelinenewsItem.
     *
     * @param prmTimelinenewsItem お知らせ情報
     */
	public final void setTimelinenewsItem(final List<TMsgSendNews> prmTimelinenewsItem) {
		this.timelinenewsItem = prmTimelinenewsItem;
	}

	/**
     * Returns the timelineresultItem.
     *
     * @return the timelineresultItem
     */
	public final List<TMsgSendResult> getTimelineresultItem() {
		return timelineresultItem;
	}

    /**
     * Sets the timelineresultItem.
     *
     * @param prmTimelineresultItem 結果報告情報
     */
	public final void setTimelineresultItem(final List<TMsgSendResult> prmTimelineresultItem) {
		this.timelineresultItem = prmTimelineresultItem;
	}

	/**
     * Returns the timelinenormalItem.
     *
     * @return the timelinenormalItem
     */
	public final List<TMsgSendNormal> getTimelinenormalItem() {
		return timelinenormalItem;
	}

    /**
     * Sets the timelinenormalItem.
     *
     * @param prmTimelinenormalItem メッセージ情報
     */
	public final void setTimelinenormalItem(final List<TMsgSendNormal> prmTimelinenormalItem) {
		this.timelinenormalItem = prmTimelinenormalItem;
	}

	/**
     * Returns the dnitemnews.
     *
     * @return the dnitemnews
     */
	public final TMsgSendNews getDnitemnews() {
		return dnitemnews;
	}

    /**
     * Sets the dnitemnews.
     *
     * @param prmDnitemnews おしらせ明細情報
     */
	public final void setDnitemnews(final TMsgSendNews prmDnitemnews) {
		this.dnitemnews = prmDnitemnews;
	}

	/**
     * Returns the dnitemresult.
     *
     * @return the dnitemresult
     */
	public final TMsgSendResult getDnitemresult() {
		return dnitemresult;
	}

    /**
     * Sets the dnitemresult.
     *
     * @param prmDnitemresult おしらせ明細情報
     */
	public final void setDnitemresult(final TMsgSendResult prmDnitemresult) {
		this.dnitemresult = prmDnitemresult;
	}

	/**
     * Returns the dnitemnormal.
     *
     * @return the dnitemnormal
     */
	public final TMsgSendNormal getDnitemnormal() {
		return dnitemnormal;
	}

    /**
     * Sets the dnitemnormal.
     *
     * @param prmDnitemnormal メッセージ明細情報
     */
	public final void setDnitemnormal(final TMsgSendNormal prmDnitemnormal) {
		this.dnitemnormal = prmDnitemnormal;
	}

	/**
     * Returns the defaultAccId.
     *
     * @return the defaultAccId
     */
	public final String getDefaultAccId() {
		return defaultAccId;
	}

    /**
     * Sets the defaultAccId.
     *
     * @param prmDefaultAccId メッセージ送信宛先情報
     */
	public final void setDefaultAccId(final String prmDefaultAccId) {
		this.defaultAccId = prmDefaultAccId;
	}

    /**
     * Returns the timelinenormalHistoryItem.
     *
	 * @return timelinenormalHistoryItem
	 */
	public final List<TMsgSendNormal> getTimelinenormalHistoryItem() {
		return timelinenormalHistoryItem;
	}

	/**
     * Sets the timelinenormalHistoryItem.
     *
	 * @param prmTimelinenormalHistoryItem セットする timelinenormalHistoryItem
	 */
	public final void setTimelinenormalHistoryItem(final List<TMsgSendNormal> prmTimelinenormalHistoryItem) {
		this.timelinenormalHistoryItem = prmTimelinenormalHistoryItem;
	}

	/**
     * Returns the dnitemnormalhistory.
     *
	 * @return dnitemnormalhistory
	 */
	public final TMsgSendNormal getDnitemnormalhistory() {
		return dnitemnormalhistory;
	}

	/**
     * Sets the dnitemnormalhistory.
     *
	 * @param prmDnitemnormalhistory セットする dnitemnormalhistory
	 */
	public final void setDnitemnormalhistory(final TMsgSendNormal prmDnitemnormalhistory) {
		this.dnitemnormalhistory = prmDnitemnormalhistory;
	}

}
