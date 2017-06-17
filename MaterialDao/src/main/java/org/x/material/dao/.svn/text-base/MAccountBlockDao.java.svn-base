package org.x.material.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.x.material.condition.AppConfig;
import org.x.material.entity.MAccountBlock;

/**
 * アカウントマスタ（ブロック）取得.
 *
 * @author  nakada
 * @since   20141029.00.01
 * @version 20141029.00.01
 */
@Dao(config = AppConfig.class)
public interface MAccountBlockDao {

	/**
	 * アカウントマスタ（ブロック）取得.
	 * ensureResult = true
	 *
	 * @param accId (not Null)
	 * @return List<MAccountBlock>
	 */
    @Select(ensureResult = true)
    List<MAccountBlock> selectByaccId(String accId);

	/**
	 * アカウントマスタ（ブロック）取得.
	 * ensureResult = true
	 *
	 * @param accId (not Null)
	 * @param accIdBlock (not Null)
	 * @return MAccountBlock
	 */
    @Select
    MAccountBlock selectByaccIdblockId(String accId, String accIdBlock);

	/**
	 * アカウントマスタ（ブロック）更新.
	 * ignoreVersion = false
	 *
	 * @param mAccountBlock (not Null)
	 * @return MAccountBlock Number of UpDate
	 */
    @Update(ignoreVersion = false)
    int update(MAccountBlock mAccountBlock);

	/**
	 * アカウントマスタ（ブロック）登録.
	 *
	 * @param mAccountBlock (not Null)
	 * @return MAccountBlock Number of Insert
	 */
    @Insert
    int insert(MAccountBlock mAccountBlock);

	/**
	 * アカウントマスタ（ブロック）削除.
	 *
	 * @param mAccountBlock (not Null)
	 * @return MAccountBlock Number of Delete
	 */
    @Delete
    int delete(MAccountBlock mAccountBlock);

}
