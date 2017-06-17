/**
 *
 */
package org.x.material.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.x.material.condition.AppConfig;
import org.x.material.entity.MBox;

/**
 * ボックス情報取得.
 *
 * @author  nakada
 * @since   20141128.00.01
 * @version 20141128.00.01
 */
@Dao(config = AppConfig.class)
public interface MBoxDao {

	/**
	 * ボックスマスタ取得.
	 * ensureResult = true
	 *
	 * @param boxId ボックスID
	 * @return MBox
	 */
    @Select(ensureResult = true)
    MBox selectByBoxIdWithEnsureResult(String delFlg, String boxId);

	/**
	 * ボックスマスタ更新.
	 * ignoreVersion = false
	 *
	 * @param mBox (not Null)
	 * @return MBox Number of UpDate
	 */
    @Update(ignoreVersion = false)
    int update(MBox mBox);

	/**
	 * ボックスマスタ登録.
	 *
	 * @param mBox (not Null)
	 * @return MBox Number of Insert
	 */
    @Insert
    int insert(MBox mBox);

}
