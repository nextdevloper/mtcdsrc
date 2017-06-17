package org.x.material.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.x.material.condition.AppConfig;
import org.x.material.entity.MMaterial;


/**
 * マテリアルマスタ取得.
 *
 * @author  nakada
 * @since   20141029.00.01
 * @version 20141029.00.01
 */
@Dao(config = AppConfig.class)
public interface  MMaterialDao {

	/**
	 * マテリアルマスタ取得.
	 * ensureResult = true
	 *
	 * @param materialId マテリアルID
	 * @return MMaterial
	 */
    @Select(ensureResult = true)
    MMaterial selectByMaterialIdWithEnsureResult(String delFlg, String mtId);

	/**
	 * マテリアルマスタ更新.
	 * ignoreVersion = false
	 *
	 * @param mMaterial (not Null)
	 * @return MMaterial Number of UpDate
	 */
    @Update(ignoreVersion = false)
    int update(MMaterial mMaterial);

	/**
	 * マテリアルマスタ登録.
	 *
	 * @param mMaterial (not Null)
	 * @return MMaterial Number of Insert
	 */
    @Insert
    int insert(MMaterial mMaterial);

}
