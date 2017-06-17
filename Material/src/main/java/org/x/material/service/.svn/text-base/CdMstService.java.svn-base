package org.x.material.service;

import java.util.List;

import org.x.material.dao.MCodeDao;
import org.x.material.dao.impl.MCodeDaoImpl;
import org.x.material.entity.MCode;


/**
 * コードマスタテーブル情報関連サービス.
 *
 * @author  nakada
 * @since   20141026.01.00
 * @version 20141026.00.01
 */
public class CdMstService {
	/**
	 * コードマスタ検索.
	 * ・コードからマスタ情報を取得する。
	 *
	 * @param  cd 検索対象コード
	 * @return List<MCode>
	 */
	public final List<MCode> find(final String cd) {

	    // aptで生成されたDaoの実装クラスを生成
	    MCodeDao dao = new MCodeDaoImpl();
        // 主キーでエンティティを検索
    	return dao.selectByCodeKind(cd);

	}

	/**
	 * コードマスタ検索.
	 * ・プルダウンなど選択値から表示情報を取得する。
	 *
	 * @param cd 検索対象コード
	 * @param no 検索対象番号
	 * @return MCode
	 */
	public final MCode find(final String cd, final String no) {
	    // aptで生成されたDaoの実装クラスを生成
	    MCodeDao dao = new MCodeDaoImpl();
		return dao.selectByCodeKindCodeId(cd, no);
	}

}
