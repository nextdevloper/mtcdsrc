package org.x.material.action;

import java.util.List;

import javax.annotation.Resource;

import org.x.material.common.util.DateUtil;
import org.x.material.dto.UserDto;
import org.x.material.entity.TMsgSendNews;
import org.x.material.entity.TMsgSendResult;
import org.x.material.service.LeftSideMenuService;
import org.x.material.service.MDBEnviromentService;

/**
 * アクションベースクラス.
 * アクションホームのベースクラス
 *
 * <p>
 * 画面共通部の設定を行うクラス<br/>
 * ・ヘッダ<br/>
 * ・サイドメニュー<br/>
 * </p>
 * @author  nakada
 * @since   20150418.00.01
 * @version 20150418.00.01
 */
public class ActionFrame {
	/** DBの環境設定情報関連サービス. **/
	@Resource(name = "MDBEnviromentService")
	private MDBEnviromentService mdbEnvService;

	/** ユーザ情報サービスDTO. */
	@Resource
	private UserDto userDto;

    /** サイドメニュー編集サービス. */
    @Resource
	private LeftSideMenuService leftSideMenuService;

	/**
	  *  ヘッダ情報.
	  */
	/** 使用DB種別表示. */
	private String dbKindName;

    /** アカウント名. */
    private String userNameKnjLabel;

    /**
     * サイドメニュー
     */
    /** 結果報告 日付.*/
    private String resultMsgDate;

    /** 結果報告 一覧. */
    private List<TMsgSendResult> resultItems;

    /** 運営からのお知らせ 日付. */
    private String newsMsgDate;

    /** 運営からのお知らせ 一覧. */
    private List<TMsgSendNews> newsItems;

	/**
	 * ヘッダ、サイドメニュー設定.
	 */
	protected void getheadmenu() {

		/**
		 * ヘッダ：使用DB情報設定
		 */
		setDbKindName(mdbEnvService.getDbKindNme());

		/**
		 * ヘッダ：ユーザ名設定
		 */
		setUserNameKnjLabel(userDto.getAccnm());

		/**
		 * 左サイドメニュー設定
		 */
		resultMsgDate = DateUtil.toDayString();
		resultItems = leftSideMenuService.getresultMessages(userDto.getAccid(), resultMsgDate);

		newsMsgDate = DateUtil.toDayString();
		newsItems = leftSideMenuService.getnewsMessages(newsMsgDate);

	}

	/**
     * Returns the userDto.
     *
     * @return the userNameKnjLabel ログインユーザー情報リソースインスタンス
     */
	public final UserDto getUserDto() {
		return this.userDto;
	}

	/**
	 * Get dbKindName.
	 *
	 * @return dbKindName
	 */
	public final String getDbKindName() {
		return dbKindName;
	}

	/**
	 * Set dbKindName.
	 *
	 * @param prmDbKindName セットする dbKindName
	 */
	public final void setDbKindName(final String prmDbKindName) {
		this.dbKindName = prmDbKindName;
	}

	/**
     * Returns the userNameKnjLabel.
     *
     * @return the userNameKnjLabel ユーザ名称情報
     */
	public final String getUserNameKnjLabel() {
		return this.userNameKnjLabel;
	}

    /**
     * Sets the userNameKnjLabel.
     *
     * @param prmUserNameKnjLabel ユーザ名称情報
     */
	public final void setUserNameKnjLabel(final String prmUserNameKnjLabel) {
		this.userNameKnjLabel = prmUserNameKnjLabel;
	}

	/**
     * Returns the resultMsgDate.
     *
     * @return the resultMsgDate サイドメニュー結果報告情報 日付
     */
	public final String getResultMsgDate() {
		return resultMsgDate;
	}

    /**
     * Sets the resultMsgDate.
     *
     * @param prmResultMsgDate サイドメニュー結果報告情報 日付
     */
	public final void setResultMsgDate(final String prmResultMsgDate) {
		this.resultMsgDate = prmResultMsgDate;
	}

	/**
     * Returns the resultItems.
     *
     * @return the resultItems サイドメニュー結果報告情報
     */
	public final List<TMsgSendResult> getResultItems() {
		return  resultItems;
	}

    /**
     * Sets the resultItems.
     *
     * @param prmResultItems サイドメニュー結果報告情報
     */
	public final void setResultItems(final List<TMsgSendResult> prmResultItems) {
		this.resultItems = prmResultItems;
	}

	/**
     * Returns the newsMsgDate.
     *
     * @return the newsMsgDate サイドメニューおしらせ情報 日付
     */
	public final String getNewsMsgDate() {
		return newsMsgDate;
	}

    /**
     * Sets the newsMsgDate.
     *
     * @param prmNewsMsgDate サイドメニューおしらせ情報 日付
     */
	public final void setNewsMsgDate(final String prmNewsMsgDate) {
		this.newsMsgDate = prmNewsMsgDate;
	}

	/**
     * Returns the newsItems.
     *
     * @return the newsItems サイドメニューおしらせ情報
     */
	public final List<TMsgSendNews> getNewsItems() {
		return newsItems;
	}

    /**
     * Sets the newsItems.
     *
     * @param prmNewsItems サイドメニューおしらせ情報
     */
	public final void setNewsItems(final List<TMsgSendNews> prmNewsItems) {
		this.newsItems = prmNewsItems;
	}

}