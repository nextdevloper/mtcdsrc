package org.x.material.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.x.material.condition.AppConfig;
import org.x.material.entity.MAccount;


/**
 * アカウントマスタ取得.
 *
 * @author  nakada
 * @since   20141029.00.01
 * @version 20141029.00.01
 */
@Dao(config = AppConfig.class)
public interface  MAccountDao {

	/**
	 * アカウントマスタ取得.
	 * ensureResult = false
	 *
	 * @param accId (not Null)
	 * @return List<MAccount>
	 */
    @Select(ensureResult = false)
    List<MAccount> selectById(String accId);

	/**
	 * アカウントマスタ取得(delflg無).
	 * ensureResult = false
	 *
	 * @param accId (not Null)
	 * @return List<MAccount>
	 */
    @Select(ensureResult = false)
    List<MAccount> selectByIdWithOutDelFlg(String accId);

	/**
	 * アカウントマスタ取得.
	 * ensureResult = true
	 *
	 * @param accId (not Null)
	 * @return MAccount Entity
	 */
    @Select(ensureResult = true)
    MAccount selectByIdWithEnsureResult(String accId);

	/**
	 * アカウントマスタ取得.
	 * ensureResult = true
	 *
	 * @param mailaddress (not Null)
	 * @return List<MAccount>
	 */
    @Select(ensureResult = true)
    List<MAccount> selectBymailaddress(String mailaddress);

	/**
	 * アカウントマスタ更新.
	 * ignoreVersion = false
	 *
	 * @param mAccount (not Null)
	 * @return MAccount Number of UpDate
	 */
    @Update(ignoreVersion = false)
    int update(MAccount mAccount);

	/**
	 * アカウントマスタ登録.
	 *
	 * @param mAccount (not Null)
	 * @return MAccount Number of Insert
	 */
    @Insert
    int insert(MAccount mAccount);

}
