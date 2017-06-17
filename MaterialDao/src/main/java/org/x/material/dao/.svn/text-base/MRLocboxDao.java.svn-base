package org.x.material.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;
import org.x.material.condition.AppConfig;
import org.x.material.entity.MRLocbox;

/**
 * ロケーションボックス関連マスタ情報取得.
 *
 * @author  nakada
 * @since   20141128.00.01
 * @version 20141128.00.01
 */
@Dao(config = AppConfig.class)
public interface MRLocboxDao {

	/**
	 * ロケーションボックス関連マスタ更新.
	 * ignoreVersion = false
	 *
	 * @param mRLocbox (not Null)
	 * @return MRLocbox Number of UpDate
	 */
    @Update(ignoreVersion = false)
    int update(MRLocbox mRLocbox);

	/**
	 * ロケーションボックス関連マスタ登録.
	 *
	 * @param mRLocbox (not Null)
	 * @return MRLocbox Number of Insert
	 */
    @Insert
    int insert(MRLocbox mRLocbox);

	/**
	 * ロケーションボックス関連マスタ削除更新.
	 *
	 * @param delFlg (not Null)
	 * @param locId
	 * @param boxId
	 * @return MRLocbox Number of Update
	 */
    @Update(sqlFile = true, ignoreVersion = true, suppressOptimisticLockException = true)
    int updateDelFlg(String delFlg, String accId, String locId, String boxId);

}
