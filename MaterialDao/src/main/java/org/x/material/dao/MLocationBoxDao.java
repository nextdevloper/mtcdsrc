package org.x.material.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.jdbc.SelectOptions;
import org.x.material.condition.AppConfig;
import org.x.material.entity.MLocationBox;

/**
 * ロケーションボックス情報取得.
 *
 * @author  nakada
 * @since   20141124.00.01
 * @version 20141129.00.02
 */
@Dao(config = AppConfig.class)
public interface MLocationBoxDao {

	/**
	 * ロケーションボックスマスタ一覧取得.
	 * ensureResult = false
	 *
	 * @param locOnrId ロケーションオーナーID
	 * @param srcBoxNm ボックス名
	 * @param locId ロケーションID
	 * @param options SelectOptions
	 * @return List<MLocation>
	 */
    @Select(ensureResult = false)
    List<MLocationBox> selectByBoxNmWithInsideMatching(String locOnrId, String srcBoxNm, String locId, SelectOptions options);

	/**
	 * ロケーションボックスマスタ取得.
	 * ensureResult = true
	 *
	 * @param srcBoxId ボックスID
	 * @return MLocationBox Entity
	 */
    @Select(ensureResult = true)
    MLocationBox selectByBoxId(String srcBoxId);

}
