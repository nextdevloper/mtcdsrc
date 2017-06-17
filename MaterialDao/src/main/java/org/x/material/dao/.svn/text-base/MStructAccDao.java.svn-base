package org.x.material.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.jdbc.SelectOptions;
import org.x.material.condition.AppConfig;
import org.x.material.entity.MStructAcc;

/**
 * 組織情報（管理者）取得.
 *
 * @author  nakada
 * @since   20150225.00.01
 * @version 20150225.00.01
 */
@Dao(config = AppConfig.class)
public interface  MStructAccDao {

//	/**
//	 * 組織情報マスタ（管理者）取得.
//	 * ensureResult = true
//	 *
//	 * @param srcAccId the accId
//	 * @return List<MAccountAccountBlock>
//	 */
//    @Select(ensureResult = true)
//    List<MStructAcc> selectByAccId(String srcAccId);

	/**
	 * 組織情報マスタ（管理者）取得.
	 * ensureResult = false 0件 OK
	 *
	 * @param accId the accId
	 * @param options the options
	 * @return List<MStructAcc>
	 */
    @Select(ensureResult = false)
    List<MStructAcc> selectByAccIdWithInsideMatching(String accId, SelectOptions options);

	/**
	 * 組織情報マスタ（管理者）取得.
	 * ensureResult = false 0件 OK
	 *
	 * @param srcStrctId the strctId
	 * @param accId the accId
	 * @return MStructAcc
	 */
    @Select(ensureResult = true)
    MStructAcc selectByStrctIdAndAccId(String srcStrctId, String accId);

}
