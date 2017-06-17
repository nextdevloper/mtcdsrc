package org.x.material.dao;

import java.util.Date;
import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.x.material.condition.AppConfig;
import org.x.material.entity.TMsgSendNormal;

/**
 * メッセージ取得.
 *
 * @author  nakada
 * @since   20141029.00.01
 * @version 20141029.00.01
 */
@Dao(config = AppConfig.class)
public interface TMsgSendNormalDao {

    /**
     * メッセージ取得.
	 * ensureResult = false
     *
     * @param accId アカウントid
     * @param accIdSend 送信先アカウントid
     * @param msgNo メッセージNo
     * @return TMsgSendNormal entity
     */
    @Select(ensureResult = false)
    TMsgSendNormal selectById(String accId, String accIdSend, Long msgNo);

    /**
     * メッセージ取得.
	 * ensureResult = false
     *
     * @param accId アカウントid
     * @param accIdSend 送信先アカウントid
     * @param msgNo メッセージNo
     * @return TMsgSendNormal entity
     */
    @Select(maxRows = 100, ensureResult = false)
    List<TMsgSendNormal> selectByAccId(String accId, String accIdSend, Long msgNo);

    /**
     * メッセージ取得.
	 * ensureResult = false
     * maxROws = 100
     *
     * @param accIdSend 送信アカウントid
     * @return List<TMsgSendNormal> the Entity list
     */
    @Select(maxRows = 100, ensureResult = false)
    List<TMsgSendNormal> selectBySendId(String accIdSend);

    /**
     * メッセージ取得.
	 * ensureResult = false
     * maxROws = 100
     *
     * @param accIdSend 送信先アカウントid
     * @param startDate 開始日時
     * @param endDate 終了日時
     * @return List<TMsgSendNormal> the Entity
     */
    @Select(maxRows = 100, ensureResult = false)
    List<TMsgSendNormal> selectByIdWithPeriod(String accIdSend, Date startDate, Date endDate);

    /**
     * メッセージ登録.
	 *
     * @param entity TMsgSendNormal
     * @return affected rows
     */
    @Insert
    int insert(TMsgSendNormal entity);

    /**
     * メッセージ更新.
     *
     * @param entity TMsgSendNormal
     * @return affected rows
     */
    @Update
    int update(TMsgSendNormal entity);

    /**
     * メッセージ削除.
     *
     * @param entity TMsgSendNormal
     * @return affected rows
     */
    @Delete
    int delete(TMsgSendNormal entity);
}