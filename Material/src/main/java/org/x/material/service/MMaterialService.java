package org.x.material.service;

import java.util.List;

import org.seasar.doma.jdbc.NoResultException;
import org.seasar.doma.jdbc.NonUniqueResultException;
import org.seasar.doma.jdbc.SelectOptions;
import org.x.material.dao.MAccountAccountBlockDao;
import org.x.material.dao.MAccountBlockDao;
import org.x.material.dao.MAccountDao;
import org.x.material.dao.impl.MAccountAccountBlockDaoImpl;
import org.x.material.dao.impl.MAccountBlockDaoImpl;
import org.x.material.dao.impl.MAccountDaoImpl;
import org.x.material.entity.MAccount;
import org.x.material.entity.MAccountAccountBlock;
import org.x.material.entity.MAccountBlock;
//import org.x.material.dao.MAccountAccountBlockDao;
//import org.x.material.dao.MAccountBlockDao;
//import org.x.material.dao.MAccountDao;
//import org.x.material.dao.impl.MAccountAccountBlockDaoImpl;
//import org.x.material.dao.impl.MAccountBlockDaoImpl;
//import org.x.material.dao.impl.MAccountDaoImpl;
//import org.x.material.entity.MAccount;
//import org.x.material.entity.MAccountAccountBlock;
//import org.x.material.entity.MAccountBlock;

/**
 * MAccountテーブル情報関連サービス.
 *
 * @author  nakada
 * @since   20141026.1.0
 * @version 20141026.0.1
 */
public class MMaterialService {

	/**
	 *  取得件数.
	 */
	private long cnt;

	/**
	 * マテリアル検索.
	 * アカウントIDからアカウント情報を取得する.
	 *
	 * @param  accid 検索対象アカウント文字列
	 * @return List<MAccount>
	 */
	public final List<MAccount> find(final String accid) {
	    // aptで生成されたDaoの実装クラスを生成
	    MAccountDao dao = new MAccountDaoImpl();
		return dao.selectById(accid);
	}

	/**
	 * アカウント検索.
	 * ・アカウントIDからアカウント情報を取得する。(del_flg無視)
	 * @param accid  検索対象アカウント文字列
	 * @return List<MAccount>
	 */
	public final List<MAccount> findWithOutDelFlg(final String accid) {
	    // aptで生成されたDaoの実装クラスを生成
	    MAccountDao dao = new MAccountDaoImpl();
		return dao.selectByIdWithOutDelFlg(accid);
	}

	/**
	 * アカウント検索.
	 * ・アカウントIDからアカウント情報を取得する。
	 * @param accid  検索対象アカウント文字列
	 * @return List<MAccount>
	 */
	public final MAccount findWithEnsureResult(final String accid) {
	    // aptで生成されたDaoの実装クラスを生成
	    MAccountDao dao = new MAccountDaoImpl();
		return dao.selectByIdWithEnsureResult(accid);
	}

	/**
	 * アカウント検索.
	 * ・メールアドレスからアカウント情報を取得する。
	 * @param mailaddress 検索対象メールアドレス
	 * @return List<MAccount>
	 */
	public final List<MAccount> findBymailaddress(final String mailaddress) {
	    // aptで生成されたDaoの実装クラスを生成
	    MAccountDao dao = new MAccountDaoImpl();
		return dao.selectBymailaddress(mailaddress);
	}

	/**
	 * アカウント検索.
	 * ・アカウントをKEYにアカウント情報およびアカウントブロック情報をLike検索する。
	 * @param srcaccid 検索アカウント
	 * @param pageno   取得ページ番号
	 * @param perpage  ページあたりの件数
	 * @return List<MAccountAccountBlock>
	 */
	public final List<MAccountAccountBlock> findByAccountWithInsideMatching(final String srcaccid, final String pageno, final int perpage) {

		SelectOptions options = SelectOptions.get().offset((Integer.parseInt(pageno) - 1) * perpage).limit(perpage).count();
		MAccountAccountBlockDao dao = new MAccountAccountBlockDaoImpl();
		List<MAccountAccountBlock> list = dao.selectByAccountWithInsideMatching(srcaccid, options);
		this.cnt = options.getCount();

		return list;

	}

	/**
	 * 件数取得.
	 * ・アカウント検索（findByAccountWithInsideMatching）実施後に取得する
	 * @return long 件数
	 */
	public final long getCount() {
		return cnt;
	}

	/**
	 * アカウント検索.
	 * ・アカウントからアカウント情報を検索する.
	 * @param srcaccid 検索アカウント
	 * @return List<MAccountAccountBlock>
	 */
	public final List<MAccountAccountBlock> findByAccount(final String srcaccid) {

		MAccountAccountBlockDao dao = new MAccountAccountBlockDaoImpl();
		return dao.selectByAccont(srcaccid);

	}

	/**
	 * アカウントブロック情報検索.
	 * ・アカウントからアカウントブロック情報を検索する。
	 * @param accid アカウント
	 * @param blkaccid ブロックアカウント
	 * @return MAccountBlock
	 */
	public final MAccountBlock findByAccountBlock(final String accid, final String blkaccid) {

		MAccountBlockDao dao = new MAccountBlockDaoImpl();
		return dao.selectByaccIdblockId(accid, blkaccid);

	}

	/**
	 * アカウントブロック情報取得.
	 * ・アカウントからアカウントブロック情報を取得する。
	 * @param accid アカウント
	 * @param blkaccid 検索アカウント
	 * @return false ブロックなし:true ブロック中
	 */
	public final boolean chkAccountBlock(final String accid, final String blkaccid) {

		MAccountBlock maccountBlock = findByAccountBlock(accid, blkaccid);
		return !(maccountBlock == null);

	}

	/**
	 * アカウント存在チェック.
	 * ・アカウントIDからアカウントの存在をチェックする。
	 * @param accid 検索用アカウント文字列
	 * @return false 存在しない:true 存在する
	 */
	public final boolean chkIsAccount(final String accid) {
		try {
			findWithEnsureResult(accid);
			return true;
		} catch (NoResultException e) {
			return false;
		} catch (NonUniqueResultException e) {
			return true;
		}
	}


}
