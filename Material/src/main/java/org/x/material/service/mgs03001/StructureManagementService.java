package org.x.material.service.mgs03001;

import static org.x.material.condition.MaterialConstants.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.seasar.doma.jdbc.SelectOptions;
import org.x.material.condition.MaterialConstants.DefDelFlg;
import org.x.material.dao.MRStrctaccDao;
import org.x.material.dao.MStructAccDao;
import org.x.material.dao.MStructureDao;
import org.x.material.dao.impl.MRStrctaccDaoImpl;
import org.x.material.dao.impl.MStructAccDaoImpl;
import org.x.material.dao.impl.MStructureDaoImpl;
import org.x.material.dto.UserDto;
import org.x.material.entity.MRStrctacc;
import org.x.material.entity.MStructAcc;
import org.x.material.entity.MStructure;
import org.x.material.form.mgs03001.StructureManagementForm;

/**
 * 組織管理サービス..
 *
 * @author  nakada
 * @since   20150225.00.01
 * @version 20150225.00.01
 */
public class StructureManagementService {

	/** 取得件数. */
	private long cnt;

	/**
	 * 組織情報検索.
	 * ・アカウントIDをKEYに組織情報を検索する。
	 *
	 * @param accId アカウント
	 * @param pageno   取得ページ番号
	 * @param perpage  ページあたりの件数
	 * @return List<MStructAcc>
	 */
	public final List<MStructAcc> findByAccIdWithInsideMatching(final String accId, final String pageno, final int perpage) {

		SelectOptions options = SelectOptions.get().offset((Integer.parseInt(pageno) - 1) * perpage).limit(perpage).count();
		MStructAccDao dao = new MStructAccDaoImpl();
		List<MStructAcc> list = dao.selectByAccIdWithInsideMatching(accId, options);
		this.cnt = options.getCount();

		return list;

	}

	/**
	 * 組織情報検索.
	 * ・組織IDをKEYに組織情報を検索する。
	 *
	 * @param strctId 組織ID
	 * @param accId アカウント
	 * @return MStructAcc
	 */
	public final MStructAcc findByStrctIdAndAccId(final String strctId, final String accId) {

		MStructAccDao dao = new MStructAccDaoImpl();
		MStructAcc rec = dao.selectByStrctIdAndAccId(strctId, accId);

		return rec;

	}

	/**
	 * 組織情報登録.
	 * ・主キーをKEYに組織情報を登録する。
	 *
	 * @param prmForm 組織登録画面情報
	 * @param userDto ユーザ情報
	 */
	public final void strctInsReg(final StructureManagementForm prmForm, final UserDto userDto) {

        // aptで生成されたDaoの実装クラスを生成
		MStructureDao dao = new MStructureDaoImpl();

		MStructure newdata = new MStructure();

	    newdata.setStrctId(prmForm.getStrctId());			// 組織ID
	    newdata.setStructKind(prmForm.getStrctKind());		// 組織種別
	    newdata.setStructStat(prmForm.getStrctStatus());	// 組織ステータス
	    newdata.setStructNm(prmForm.getStrctNm());			// 組織名（名称）
	    newdata.setStructNmKana(prmForm.getStrctNmKana());	// 組織名（かな）
	    newdata.setStructNmNick(prmForm.getStrctNmNick());	// 組織名（通称）
	    newdata.setMailaddress(prmForm.getMailAddress());	// メールアドレス
	    newdata.setPassword("dummy");						// パスワード
	    newdata.setTel1(prmForm.getTel1());					// 電話番号（固定）
	    newdata.setTel2(prmForm.getTel2());					// 電話番号（携帯）
		newdata.setNote(prmForm.getNote());					// 備考
		newdata.setDefaultLocale(DEFAULTLOCALE);			// 標準ロケールID
		newdata.setExCnt(new BigDecimal("1"));				// 排他制御カウンタ
		newdata.setInsAcc(userDto.getAccid());				// 登録アカウント
		newdata.setInsDate(new Date());						// 登録日時
		newdata.setUpdAcc(userDto.getAccid());				// 更新アカウント
		newdata.setUpdDate(new Date());						// 更新日時
		newdata.setDelFlg(DefDelFlg.NOTDEL.getVal());		// 削除フラグ

		dao.insert(newdata);

	}

	/**
	 * 組織所属マスタ情報登録.
	 * ・主キーをKEYに組織情報を登録する。
	 *
	 * @param prmForm 組織登録画面情報
	 * @param userDto ユーザ情報
	 * @param prmAdminFlg 管理者フラグ 1:管理者
	 */
	public final void rstrctInsReg(final StructureManagementForm prmForm, final UserDto userDto, final String prmAdminFlg) {

        // aptで生成されたDaoの実装クラスを生成
		MRStrctaccDao dao = new MRStrctaccDaoImpl();

		MRStrctacc newdata = new MRStrctacc();

	    newdata.setStrctId(prmForm.getStrctId());		// 組織ID
	    newdata.setAccId(userDto.getAccid());			// アカウントID
	    newdata.setAdminFlg(prmAdminFlg);				// 管理者フラグ
		newdata.setNote(prmForm.getNote());				// 備考
		newdata.setDefaultLocale(DEFAULTLOCALE);		// 標準ロケールID
		newdata.setExCnt(new BigDecimal("1"));			// 排他制御カウンタ
		newdata.setInsAcc(userDto.getAccid());			// 登録アカウント
		newdata.setInsDate(new Date());					// 登録日時
		newdata.setUpdAcc(userDto.getAccid());			// 更新アカウント
		newdata.setUpdDate(new Date());					// 更新日時
		newdata.setDelFlg(DefDelFlg.NOTDEL.getVal());	// 削除フラグ

		dao.insert(newdata);

	}

	/**
     * Returns the cnt.
	 * ・検索実施後に取得する
	 *
	 * @return the cnt 件数
	 */
	public final long getCount() {
		return cnt;
	}

}
