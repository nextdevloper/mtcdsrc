package org.x.material.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.jdbc.SelectOptions;
import org.x.material.condition.AppConfig;
import org.x.material.entity.MLocation;

/**
 * ロケーションマスタ取得.
 *
 * @author  nakada
 * @since   20141115.00.01
 * @version 20141115.00.01
 */
@Dao(config = AppConfig.class)
public interface MLocationDao {

	/**
	 * ロケーションマスタ取得.
	 * ensureResult = false
	 *
	 * @param locOnrId ロケーションオーナーID
	 * @param locNm ロケーション名
	 * @param options SelectOptions
	 * @return List<MLocation>
	 */
    @Select(ensureResult = false)
    List<MLocation> selectByLocNmWithInsideMatching(String locOnrId, String locNm, SelectOptions options);

	/**
	 * ロケーションマスタ取得.
	 * ensureResult = true
	 *
	 * @param locId ロケーションID
	 * @return MLocation Entity
	 */
    @Select(ensureResult = true)
    MLocation selectByLocId(String delFlg, String locId);

	/**
	 * ロケーションマスタ更新.
	 * ignoreVersion = false
	 *
	 * @param mLocation (not Null)
	 * @return mLocation Number of UpDate
	 */
    @Update(ignoreVersion = false)
    int update(MLocation mLocation);

	/**
	 * ロケーションマスタ登録.
	 *
	 * @param mLocation (not Null)
	 * @return mLocation Number of Insert
	 */
    @Insert
    int insert(MLocation mLocation);

}
