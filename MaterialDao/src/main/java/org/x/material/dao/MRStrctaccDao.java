package org.x.material.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.x.material.condition.AppConfig;
import org.x.material.entity.MRStrctacc;

/**
 * 組織所属マスタ.
 *
 * @author  nakada
 * @since   20150321.00.01
 * @version 20150321.00.01
 */
@Dao(config = AppConfig.class)
public interface  MRStrctaccDao {


	/**
	 * 組織所属マスタ登録.
	 *
	 * @param mRStrctacc (not Null)
	 * @return mRStrctacc Number of Insert
	 */
    @Insert
    int insert(MRStrctacc mRStrctacc);


}
