package org.x.material.service;

import java.math.BigDecimal;

import org.apache.log4j.Logger;
import org.x.material.action.mgs06001.MaterialManagementAction;
import org.x.material.dao.IdNumberingDao;
import org.x.material.dao.impl.IdNumberingDaoImpl;
import org.x.material.entity.IdNumbering;


/**
 * 採番管理サービス.
 *
 * @author  nakada
 * @since   20150905.1.0
 * @version 20150905.1.0
 */
public class NumberingService {

	/**
	 * デバッグ・ログ出力設定.
	 */
	private static final Logger LOGGER = Logger.getLogger(MaterialManagementAction.class);

	/**
	 * IDを採番するクラス.
	 * ID種類+ID番号(20桁)
	 *
	 * @param idKind 採番ID種類
	 * @return idNumber 採番された値<BR>
	 * 採番に失敗した場合、0を返す
	 */
	public String getIdNumbering(final String idKind) {
		String strId = null;

    	LOGGER.debug("getIdNumbering...");

    	// id採番管理テーブルより対象のidの現在の値を取得する。
		IdNumbering idNumRec = idNumberingFind(idKind);

		// 取得した値を +1 して採番する
		long idNum = idNumRec.getIdNumber().longValue() + 1;

		LOGGER.debug("idNum:[" + String.valueOf(idNum) + "]");

		// 採番した値で、id採番管理テーブルを更新する。
		idNumRec.setidNumber(new BigDecimal(idNum));
		int ret = setIdNumberingTbl(idNumRec);
		if (ret <= 0) {
			strId = null;	// 採番テーブル更新に失敗した場合、Nullを返す
		} else {
			// IDを編集
			String strIdNum = "00000000000000000" + String.valueOf(idNum);
			LOGGER.debug("strIdNum:[" + strIdNum + "]");
			strId = idKind + strIdNum.substring(strIdNum.length()-17, strIdNum.length());
		}

		LOGGER.debug("strid:[" + strId + "]");

		LOGGER.debug("End getIdNumbering...");

    	return strId;

	}

	/**
	 * ID採番管理テーブル検索.
	 * ・指定されたＩＤ種類より情報を取得する。
	 *   １件のみ検索
	 *
     * @param idKind 採番ID種類
     * @return the IdNumbering entity
	 */
	public final IdNumbering idNumberingFind(final String idKind) {
		// パラメータチェック
		if (idKind == null) {
			return null;
		}

		IdNumberingDao dao = new IdNumberingDaoImpl();
		return dao.selectByIdKind(idKind);
	}

	/**
	 * ID採番管理テーブル登録.
	 * ・指定されたＩＤ種類の情報を更新する。
	 *
     * @param inData 登録する情報
     * @return int 登録カウント
	 */
	public final int setIdNumberingTbl(final IdNumbering inData) {
		IdNumberingDao dao = new IdNumberingDaoImpl();

		//データ登録
		return dao.update(inData);
	}

}
