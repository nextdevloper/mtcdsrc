package org.x.material.service;

import java.util.List;

import javax.annotation.Resource;

import org.x.material.common.util.DateUtil;
import org.x.material.entity.TMsgSendNews;
import org.x.material.entity.TMsgSendResult;

/**
 * Left Side Menu情報関連サービス.
 *
 * @author  nakada
 * @since   20141026.01.00
 * @version 20141026.00.01
 */
public class LeftSideMenuService {
    /** メッセージ送信履歴関連サービス. */
    @Resource
	private TMessageService tMessageService;


	/**
	 * 結果報告メッセージ取得.
	 *
	 * @param accid アカウントID
	 * @param stringDate 対象日時
	 * @return List<TMsgSendResult> 結果報告メッセージ一覧
	 */
	public final List<TMsgSendResult> getresultMessages(final String accid, final String stringDate) {
		return tMessageService.resultFindAccId(accid, DateUtil.toStartDate(stringDate), DateUtil.toEndDate(stringDate));
	}

	/**
	 * お知らせメッセージ取得.
	 *
	 * @param stringDate 対象日時
	 * @return List<TMsgSendNews> お知らせメッセージ一覧
	 */
	public final List<TMsgSendNews> getnewsMessages(final String stringDate) {
		return tMessageService.newsFindAccId(null, DateUtil.toStartDate(stringDate), DateUtil.toEndDate(stringDate));
	}

}
