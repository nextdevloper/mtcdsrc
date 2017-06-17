package org.x.material.service.mgs01001;

import javax.annotation.Resource;

import org.x.material.entity.TMsgSendNormal;
import org.x.material.form.mgs01001.NewsForm;
import org.x.material.service.TMessageService;

/**
 * お知らせ/タイムライン　サービス.
 *
 * @author  nakada
 * @since   XXXXXXXX.01.00
 * @version 20141029.00.01
 *
 */
public class NewsService {

	/** メッセージ制御サービス. */
	@Resource
	private TMessageService tMessageService;

	/**
	 * メッセージ送信履歴（通常メッセージ）登録.
	 * ・通常メッセージ情報を登録する。
	 *
     * @param news NewsForm Entity
     * @param accId 送信元アカウント
     * @return regMsgSnd OK or NG
     *
	 */
	public final boolean regMsgSnd(final NewsForm news, final String accId) {
		TMsgSendNormal tmsg = new TMsgSendNormal();

		/**
		 * メッセージ登録情報セット
		 */
		tmsg.setAccId(accId);	// 送信元アカウントID
		tmsg.setAccIdSend(news.getSendaccid());	// 送信先アカウントID
		tmsg.setMsgTitle(news.getMsgtitle());	// メッセージタイトル
		tmsg.setMsgNote(news.getTxtmsg());	// メッセージ

		/**
		 * メッセージ送信履歴登録
		 */
		int cnt = tMessageService.regIns(tmsg, accId);
		return !(cnt == 0);
	}
}
