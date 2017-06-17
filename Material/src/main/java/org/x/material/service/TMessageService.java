package org.x.material.service;

import static org.x.material.condition.MaterialConstants.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.x.material.dao.TMsgSendNewsDao;
import org.x.material.dao.TMsgSendNormalDao;
import org.x.material.dao.TMsgSendResultDao;
import org.x.material.dao.impl.TMsgSendNewsDaoImpl;
import org.x.material.dao.impl.TMsgSendNormalDaoImpl;
import org.x.material.dao.impl.TMsgSendResultDaoImpl;
import org.x.material.entity.TMsgSendNews;
import org.x.material.entity.TMsgSendNormal;
import org.x.material.entity.TMsgSendResult;

/**
 * メッセージ送信履歴関連サービス.
 *
 * @author  nakada
 * @since   20141026.01.00
 * @version 20141026.00.01
 */
public class TMessageService {

	/**
	 * メッセージ送信履歴（通常メッセージ）検索.
	 * ・メッセージ番号から通常メッセージ情報を取得する。
	 *   １件のみ検索
     * @param msgNo メッセージ番号
     * @return the TMsgSendNormal entity
	 */
	public final TMsgSendNormal normalFindMsgNo(final Long msgNo) {

		// パラメータチェック
		if (msgNo == null) {
			return null;
		}

		TMsgSendNormalDao dao = new TMsgSendNormalDaoImpl();
		return dao.selectById(null, null, msgNo);
	}

	/**
	 * メッセージ送信履歴（通常メッセージ）検索.
	 * ・送信先アカウントIDから通常メッセージ情報を取得する。
     * @param accIdSend 送信先アカウントID
     * @param startDate 開始日時
     * @param endDate 終了日時
     * @return List<TMsgSendNormal> 通常メッセージ一覧
	 */
	public final List<TMsgSendNormal> findAccId(final String accIdSend, final Date startDate, final Date endDate) {

		TMsgSendNormalDao dao = new TMsgSendNormalDaoImpl();
		return dao.selectByIdWithPeriod(accIdSend, startDate, endDate);
	}

	/**
	 * メッセージ送信履歴（通常メッセージ）自送信履歴検索.
	 * ・アカウントIDから通常メッセージ情報を取得する。
     * @param accId アカウントID
     * @return List<TMsgSendNormal> 通常メッセージ一覧
	 */
	public final List<TMsgSendNormal> findAccId(final String accId) {

		TMsgSendNormalDao dao = new TMsgSendNormalDaoImpl();
		return dao.selectByAccId(accId, null, null);

	}

	/**
	 * メッセージ送信履歴（通常メッセージ）登録.
	 * ・通常メッセージ情報を登録する。
	 *
     * @param insData TMsgSendNormalEntity 通常メッセージ情報(DefaultLocale, ExCnt,InsAcc,InsDate,UpdAcc,UpdDate,DelFlg以外)
     * @param accId アカウントID
     * @return int 登録カウント
	 */
	public final int regIns(final TMsgSendNormal insData, final String accId) {
		TMsgSendNormalDao dao = new TMsgSendNormalDaoImpl();
		insData.setDefaultLocale(DEFAULTLOCALE);
		insData.setExCnt(new BigDecimal(1));
		insData.setInsAcc(accId);
		insData.setInsDate(new Date());
		insData.setUpdAcc(accId);
		insData.setUpdDate(new Date());
		insData.setDelFlg("0");

		return dao.insert(insData);
	}

	/**
	 * メッセージ送信履歴（お知らせ）検索.
	 * ・メッセージ番号からお知らせ情報を取得する。
	 *   １件のみ検索
	 *
     * @param msgNo メッセージ番号
     * @return the TMsgSendNews entity
	 */
	public final TMsgSendNews newsFindMsgNo(final Long msgNo) {
		// パラメータチェック
		if (msgNo == null) {
			return null;
		}

		TMsgSendNewsDao dao = new TMsgSendNewsDaoImpl();
		return dao.selectById(null, null, msgNo);
	}

	/**
	 * メッセージ送信履歴（お知らせ）検索.
	 * ・お知らせ情報を取得する。
     * @param accIdSend 送信先アカウントID
     * @param startDate 開始日時
     * @param endDate 終了日時
     * @return List<TMsgSendNews> お知らせ一覧
	 */
	public final List<TMsgSendNews> newsFindAccId(final String accIdSend, final Date startDate, final Date endDate) {

		TMsgSendNewsDao dao = new TMsgSendNewsDaoImpl();
		return dao.selectByIdWithPeriod(accIdSend, startDate, endDate);
	}

	/**
	 * メッセージ送信履歴（お知らせ）登録.
	 * ・お知らせ情報を登録する。
     * @param insData TMsgSendNewsEntity お知らせ情報(DefaultLocale, ExCnt,InsAcc,InsDate,UpdAcc,UpdDate,DelFlg以外)
     * @param accId アカウントID
     * @return int 登録カウント
	 */
	public final int newsRegIns(final TMsgSendNews insData, final String accId) {
		TMsgSendNewsDao dao = new TMsgSendNewsDaoImpl();
		insData.setDefaultLocale(DEFAULTLOCALE);
		insData.setExCnt(new BigDecimal(1));
		insData.setInsAcc(accId);
		insData.setInsDate(new Date());
		insData.setUpdAcc(accId);
		insData.setUpdDate(new Date());
		insData.setDelFlg("0");

		return dao.insert(insData);
	}

	/**
	 * メッセージ送信履歴（結果報告）検索.
	 * ・メッセージ番号から結果報告情報を取得する。
	 *   １件のみ検索
	 *
     * @param msgNo メッセージ番号
     * @return the TMsgSendNews entity
	 */
	public final TMsgSendResult resultFindMsgNo(final Long msgNo) {
		// パラメータチェック
		if (msgNo == null) {
			return null;
		}

		TMsgSendResultDao dao = new TMsgSendResultDaoImpl();
		return dao.selectById(null, null, msgNo);
	}

	/**
	 * メッセージ送信履歴（結果報告）検索.
	 * ・送信先アカウントIDから結果報告情報を取得する。
	 *
     * @param accIdSend 送信先アカウントID
     * @param startDate 開始日時
     * @param endDate 終了日時
     * @return List<TMsgSendResult> 結果報告一覧
	 */
	public final List<TMsgSendResult> resultFindAccId(final String accIdSend, final Date startDate, final Date endDate) {

		TMsgSendResultDao dao = new TMsgSendResultDaoImpl();
		return dao.selectByIdWithPeriod(accIdSend, startDate, endDate);
	}

	/**
	 * メッセージ送信履歴（結果報告）登録.
	 * ・結果報告情報を登録する。
	 *
     * @param accId		送信者アカウント
     * @param accIdSend	送信先アカウント
     * @param msgTitle	メッセージタイトル
     * @param msgNote	メッセージ内容
     * @return int 登録メッセージ件数
	 */
	public final int setResultMessage(final String accId, final String accIdSend, final String msgTitle, final String msgNote) {
		TMsgSendResult tmsg = new TMsgSendResult();

		tmsg.setAccId(accId);
		tmsg.setAccIdSend(accIdSend);
		tmsg.setMsgTitle(msgTitle);
		tmsg.setMsgNote(msgNote);

		return resultRegIns(tmsg, accId);

	}

	/**
	 * メッセージ送信履歴（結果報告）登録.
	 * ・結果報告情報を登録する。
     * @param insData TMsgSendResultEntity 結果報告情報(DefaultLocale, ExCnt,InsAcc,InsDate,UpdAcc,UpdDate,DelFlg以外)
     * @param accId アカウントID
     * @return the TMsgSendNews entity
	 */
	public final int resultRegIns(final TMsgSendResult insData, final String accId) {
		TMsgSendResultDao dao = new TMsgSendResultDaoImpl();
		insData.setDefaultLocale(DEFAULTLOCALE);
		insData.setExCnt(new BigDecimal(1));
		insData.setInsAcc(accId);
		insData.setInsDate(new Date());
		insData.setUpdAcc(accId);
		insData.setUpdDate(new Date());
		insData.setDelFlg("0");

		return dao.insert(insData);
	}
}
