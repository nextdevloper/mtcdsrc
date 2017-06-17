package org.x.material.dao;

import java.util.Date;
import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.x.material.condition.AppConfig;
import org.x.material.entity.TMsgSendNews;

/**
 * お知らせメッセージ取得.
 *
 * @author  nakada
 * @since   20141029.00.01
 * @version 20141029.00.01
 */
@Dao(config = AppConfig.class)
public interface TMsgSendNewsDao {

    /**
     * お知らせメッセージ取得.
	 * ensureResult = false
     *
     * @param accId アカウントid
     * @param accIdSend 送信先アカウントid
     * @param msgNo メッセージNo
     * @return the TMsgSendNews entity
     */
    @Select(ensureResult = false)
    TMsgSendNews selectById(String accId, String accIdSend, Long msgNo);

    /**
     * お知らせメッセージ取得.
	 * ensureResult = false
     *
     * @param msgNo メッセージNo
     * @return the TMsgSendNews entity
     */
    @Select(ensureResult = false)
    TMsgSendNews selectByMsgNo(Long msgNo);

    /**
     * お知らせメッセージ取得.
	 * ensureResult = false
     *
     * @param accIdSend 送信先アカウントid
     * @return List<TMsgSendNews> Entity List
     */
    @Select
    List<TMsgSendNews> selectBySendId(String accIdSend);

    /**
     * お知らせメッセージ取得.
	 * ensureResult = false
     *
     * @return List<TMsgSendNews entity>
     */
    @Select
    List<TMsgSendNews> selectByAll();

    /**
     * お知らせメッセージ取得.
	 * ensureResult = false
     * maxROws = 100
     *
     * @param accIdSend 送信先アカウントid
     * @param startDate 開始日時
     * @param endDate 終了日時
     * @return List<TMsgSendNews entity>
     */
    @Select(maxRows = 100, ensureResult = false)
    List<TMsgSendNews> selectByIdWithPeriod(String accIdSend, Date startDate, Date endDate);

    /**
     * お知らせメッセージ登録.
	 *
     * @param entity TMsgSendNews
     * @return affected rows
     */
    @Insert
    int insert(TMsgSendNews entity);

    /**
     * お知らせメッセージ更新.
	 *
     * @param entity TMsgSendNews
     * @return affected rows
     */
    @Update
    int update(TMsgSendNews entity);

    /**
     * お知らせメッセージ削除.
	 *
     * @param entity TMsgSendNews
     * @return affected rows
     */
    @Delete
    int delete(TMsgSendNews entity);
}