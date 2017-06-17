package org.x.material.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;
import org.x.material.condition.AppConfig;
import org.x.material.entity.MRBoxmaterial;

/**
 * ボックスマテリアル関連マスタ情報取得.
 *
 * @author  nakada
 * @since   20141128.00.01
 * @version 20141128.00.01
 */
@Dao(config = AppConfig.class)
public interface MRBoxmaterialDao {

	/**
	 * ボックスマテリアル関連マスタ更新.
	 * ignoreVersion = false
	 *
	 * @param mRBoxmaterial (not Null)
	 * @return MRBoxmaterial Number of UpDate
	 */
    @Update(ignoreVersion = false)
    int update(MRBoxmaterial mRBoxmaterial);

	/**
	 * ボックスマテリアル関連マスタ登録.
	 *
	 * @param mRBoxmaterial (not Null)
	 * @return MRBoxmaterial Number of Insert
	 */
    @Insert
    int insert(MRBoxmaterial mRBoxmaterial);

	/**
	 * ボックスマテリアル関連マスタ削除更新.
	 *
	 * @param delFlg (not Null)
	 * @param boxId
	 * @param materialId
	 * @return MRBoxmateriaru Number of Update
	 */
    @Update(sqlFile = true, ignoreVersion = true, suppressOptimisticLockException = true)
    int updateDelFlg(String delFlg, String accId, String boxId, String mtId);

}
