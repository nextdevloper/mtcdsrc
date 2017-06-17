package org.x.material.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.x.material.condition.AppConfig;
import org.x.material.entity.MStructure;

/**
 * 組織情報登録.
 *
 * @author  nakada
 * @since   20150307.00.01
 * @version 20150307.00.01
 */
@Dao(config = AppConfig.class)
public interface  MStructureDao {

	/**
	 * 組織情報マスタ登録.
	 *
	 * @param mStructure (not Null)
	 * @return mStructure Number of Insert
	 */
    @Insert
    int insert(MStructure mStructure);


}
