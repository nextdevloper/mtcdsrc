package org.x.material.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.x.material.condition.AppConfig;
import org.x.material.entity.IdNumbering;

/**
 * ID採番管理	 .
 *
 * @author  nakada
 * @since   20150905.00.01
 * @version 20150905.00.01
 */
@Dao(config = AppConfig.class)
public interface IdNumberingDao {

	/**
	 * ID採番管理一覧取得.
	 * ensureResult = false
	 *
	 * @return List<IdNumbering> the IdNumbering List
	 */
	@Select
	List<IdNumbering> selectByAll();

	/**
	 * ID採番取得（種別）.
	 * ensureResult = true
	 *
	 * @param idKind (not Null)
	 * @return IdNumbering idNumbering
	 */
	@Select(ensureResult = true)
	IdNumbering selectByIdKind(String idKind);

	/**
	 * ID採番更新（種別）.
	 * ignoreVersion = false
	 *
	 * @param IdNumbering (not Null)
	 * @return IdNumbering Number of UpDate
	 */
	@Update(ignoreVersion = false)
	int update(IdNumbering IdNumbering);

	/**
	 * ID採番登録.
	 *
	 * @param IdNumbering (not Null)
	 * @return IdNumbering Number of Insert
	 */
    @Insert
    int insert(IdNumbering IdNumbering);
}
