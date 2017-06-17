package org.x.material.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.x.material.condition.AppConfig;
import org.x.material.entity.MDBEnviroment;

/**
 * DB環境情報取得.
 *
 * @author  nakada
 * @since   20160604.00.01
 * @version 20160604.00.01
 */
@Dao(config = AppConfig.class)
public interface MDBEnviromentDao {

	/**
	 * 種別取得.
	 * ensureResult = false
	 *
	 * @return List<MCode> the mCode List
	 */
	@Select
	MDBEnviroment selectDbKind();


}
