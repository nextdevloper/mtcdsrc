package org.x.material.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.jdbc.SelectOptions;
import org.x.material.condition.AppConfig;
import org.x.material.entity.MAccountAccountBlock;

/**
 * アカウントマスタ取得.
 *
 * @author  nakada
 * @since   XXXXXXXX.01.00
 * @version 20141029.00.01
 */
@Dao(config = AppConfig.class)
public interface  MAccountAccountBlockDao {

	/**
	 * アカウントマスタ取得.
	 * ensureResult = true
	 *
	 * @param srcAccId the accId
	 * @return List<MAccountAccountBlock>
	 */
    @Select(ensureResult = true)
    List<MAccountAccountBlock> selectByAccont(String srcAccId);

	/**
	 * アカウントマスタ取得.
	 * ensureResult = true
	 *
	 * @param srcAccId the accId
	 * @param options the options
	 * @return List<MAccountAccountBlock>
	 */
    @Select(ensureResult = true)
    List<MAccountAccountBlock> selectByAccountWithInsideMatching(String srcAccId, SelectOptions options);

}
