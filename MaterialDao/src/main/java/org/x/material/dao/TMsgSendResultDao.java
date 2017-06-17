package org.x.material.dao;

import java.util.Date;
import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.x.material.condition.AppConfig;
import org.x.material.entity.TMsgSendResult;

/**
 * 結果報告取得.
 *
 * @author  nakada
 * @since   20141029.00.01
 * @version 20141029.00.01
 */
@Dao(config = AppConfig.class)
public interface TMsgSendResultDao {

    /**
     * 結果報告取得.
	 * ensureResult = false
     *
     * @param accId アカウントid
     * @param accIdSend 送信先アカウントid
     * @param msgNo メッセージNo
     * @return TMsgSendResult entity
     */
    @Select
    TMsgSendResult selectById(String accId, String accIdSend, Long msgNo);

    /**
     * 結果報告取得.
	 * ensureResult = false
	 *
     * @param accIdSend 送信先アカウントid
     * @return List<TMsgSendResult> entity
     */
    @Select
    List<TMsgSendResult> selectBySendId(String accIdSend);

    /**
     * 結果報告取得.
	 * ensureResult = false
     * maxROws = 100
	 *
     * @param accIdSend アカウントid
     * @param startDate 開始日時
     * @param endDate 終了日時
     * @return List<TMsgSendResult> entity list
     */
    @Select(maxRows = 100, ensureResult = false)
    List<TMsgSendResult> selectByIdWithPeriod(String accIdSend, Date startDate, Date endDate);

    /**
     * 結果報告登録.
     *
     * @param entity TMsgSendResult
     * @return affected rows
     */
    @Insert
    int insert(TMsgSendResult entity);

    /**
     * 結果報告更新.
     *
     * @param entity TMsgSendResult
     * @return affected rows
     */
    @Update
    int update(TMsgSendResult entity);

    /**
     * 結果報告削除.
     *
     * @param entity TMsgSendResult
     * @return affected rows
     */
    @Delete
    int delete(TMsgSendResult entity);
}