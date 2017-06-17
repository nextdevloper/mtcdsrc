package org.x.material.service.mgs02001;

import java.math.BigDecimal;
import java.util.Date;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.x.material.dao.MAccountBlockDao;
import org.x.material.dao.impl.MAccountBlockDaoImpl;
import org.x.material.entity.MAccountBlock;
import org.x.material.service.MAccountService;


/**
 * アカウント照会サービス..
 *
 * @author  nakada
 * @since   20141026.01.00
 * @version 20141026.00.01
 */
public class AccountSearchService {

	/** MAccountテーブル情報関連サービス. **/
	@Resource
	private MAccountService mAccountService;

	/** ログ出力定義. */
	private static final Logger LOGGER = Logger.getLogger(AccountSearchService.class);

	/**
	 * ブロック設定.
	 *
	 * @param accId アカウントID
	 * @param srcAccId ブロック先アカウントID
	 */
	public final void regAccountBlock(final String accId, final String srcAccId) {
		LOGGER.debug("regAccountBlock...");

		MAccountBlock item = mAccountService.findByAccountBlock(accId, srcAccId);
		if (item == null) {
	        // aptで生成されたDaoの実装クラスを生成
	        MAccountBlockDao dao = new MAccountBlockDaoImpl();
			MAccountBlock newdata = new MAccountBlock();

	    	newdata.setAccId(accId);
	    	newdata.setAccIdBlock(srcAccId);
	    	newdata.setDefaultLocale("jp");
	    	newdata.setExCnt(new BigDecimal(1));
	    	newdata.setInsAcc(accId);
	    	newdata.setInsDate(new Date());
	    	newdata.setUpdAcc(accId);
	    	newdata.setUpdDate(new Date());
	    	newdata.setDelFlg("0");

	    	dao.insert(newdata);
		}
	}

	/**
	 * ブロック解除.
	 *
	 * @param accId アカウントID
	 * @param srcAccId ブロック先アカウントID
	 */
	public final void regAccountBlockFree(final String accId, final String srcAccId) {
		LOGGER.debug("regAccountBlockFree...");

		MAccountBlock item = mAccountService.findByAccountBlock(accId, srcAccId);
		if (item != null) {
	        // aptで生成されたDaoの実装クラスを生成
	        MAccountBlockDao dao = new MAccountBlockDaoImpl();

	        dao.delete(item);
		}
	}
}
