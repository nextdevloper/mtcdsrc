package org.x.material.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.x.material.condition.AppConfig;
import org.x.material.entity.MCode;

/**
 * コードマスタ取得.
 *
 * @author  nakada
 * @since   20141029.00.01
 * @version 20141029.00.01
 */
@Dao(config = AppConfig.class)
public interface MCodeDao {

	/**
	 * コードマスタ一覧取得.
	 * ensureResult = false
	 *
	 * @param codeKind (not Null)
	 * @return List<MCode> the mCode List
	 */
	@Select
	List<MCode> selectByCodeKind(String codeKind);

	/**
	 * コードマスタ取得.
	 * ensureResult = true
	 *
	 * @param codeKind (not Null)
	 * @param codeId (not Null)
	 * @return MCode mCode
	 */
	@Select(ensureResult = true)
	MCode selectByCodeKindCodeId(String codeKind, String codeId);

}
