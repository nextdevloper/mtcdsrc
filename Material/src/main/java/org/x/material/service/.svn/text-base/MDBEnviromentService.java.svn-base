package org.x.material.service;

import org.x.material.dao.MDBEnviromentDao;
import org.x.material.dao.impl.MDBEnviromentDaoImpl;

/**
 * DBの環境設定情報関連サービス.
 *
 * @author  nakada
 * @since   20160604.00.01
 * @version 20160604.00.01
 */
public class MDBEnviromentService {

	/**
	 * 種別取得.
	 * ・DBの種別情報を取得する。
	 *
	 * @return String getDdKindName
	 */
	public final String getDbKindNme() {

	    // aptで生成されたDaoの実装クラスを生成
		MDBEnviromentDao dao = new MDBEnviromentDaoImpl();
        // 主キーでエンティティを検索
    	return dao.selectDbKind().getDbKind();
	}


}
