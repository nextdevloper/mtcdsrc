package org.x.material.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.jdbc.SelectOptions;
import org.x.material.condition.AppConfig;
import org.x.material.entity.MBoxMaterial;

/**
 * ボックスマテリアル情報取得.
 *
 * @author  nakada
 * @since   20141124.00.01
 * @version 20141129.00.02
 */
@Dao(config = AppConfig.class)
public interface MBoxMaterialDao {

	/**
	 * ボックスマテリアルマスタ一覧取得.
	 * ensureResult = false
	 *
	 * @param locOnrId ロケーションオーナーID
	 * @param srcMaterialNm ボックス名
	 * @param options SelectOptions
	 * @return List<MBoxMaterial>
	 */
    @Select(ensureResult = false)
    List<MBoxMaterial> selectByMaterialNmWithInsideMatching(String boxOnrId, String srcMaterialNm, String boxId, SelectOptions options);

	/**
	 * ロケーションボックスマスタ取得.
	 * ensureResult = true
	 *
	 * @param boxId ボックスID
	 * @return MLocationBox Entity
	 */
    @Select(ensureResult = true)
    MBoxMaterial selectByMaterialId(String srcMaterialId);

}
