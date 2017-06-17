package org.x.material.service.mgk01001;



import static org.x.material.condition.MaterialConstants.*;

import java.math.BigDecimal;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.x.material.common.util.EncryptUtil;
import org.x.material.dao.MAccountDao;
import org.x.material.dao.impl.MAccountDaoImpl;
import org.x.material.entity.MAccount;
import org.x.material.form.mgk01001.NewAccountForm;
import org.x.material.service.MAccountService;

/**
 * アカウント登録サービス.
 *
 * @author  nakada
 * @since   20141026.01.00
 * @version 20141026.00.01
 */
public class NewAccountService {

	/** MAccountテーブル情報関連 サービス. */
	@Resource
	private MAccountService mAccountService;

	/**
	 * アカウントマスタ登録.
	 *
	 * @param prmForm the NewAccountForm
	 */
	public final void reg(final NewAccountForm prmForm)  {

        // aptで生成されたDaoの実装クラスを生成
        MAccountDao dao = new MAccountDaoImpl();

    	MAccount newdata = new MAccount();

    	try {
	    	newdata.setAccId(prmForm.getUserId());
			newdata.setAccKind(prmForm.getUserKind());
			newdata.setAccStat(prmForm.getUserStatus());
			newdata.setAccNm(prmForm.getUserNameKnj());
			newdata.setAccNmKana(prmForm.getUserNameKana());
			newdata.setAccNmNick(prmForm.getUserNameNick());
			newdata.setMailaddress(prmForm.getMailAddr());
			newdata.setPassword(EncryptUtil.encrypt(prmForm.getPassword()));
			newdata.setGender(prmForm.getSeibetu());
			newdata.setBirthdate(prmForm.getSeinengappiYYYY() + prmForm.getSeinengappiMM() + prmForm.getSeinengappiDD());
			newdata.setTel1(prmForm.getTelKotei());
			newdata.setTel2(prmForm.getTelKeitai());
			newdata.setNote(prmForm.getBiko());
			newdata.setDefaultLocale(DEFAULTLOCALE);
			newdata.setExCnt(new BigDecimal(1));
			newdata.setInsAcc(SYSTEMACC);
			newdata.setInsDate(new Date());
			newdata.setUpdAcc(SYSTEMACC);
			newdata.setUpdDate(new Date());
			newdata.setDelFlg("0");

			dao.insert(newdata);

		} catch (NoSuchAlgorithmException e) {
			/** TODO 後で実装 */
			throw new RuntimeException("encrypt fail ...", e);
		}

/*
		//Beanコピー(全項目入力がないと、更新の場合にはNull値が登録されてしまう)
		//フィールド及び、getter/setterの項目名が一致しないとコピーできない。
		//複雑な場合には、無理にコピーせずに個々に設定したほうがわかり易くメンテしやすい。

		//全コピーの場合
		//System.out.println("★form.user_id="+form.user_id);
		//System.out.println("★form.user_name_knj="+form.user_name_knj);
		//UserInfo userInfo = Beans.createAndCopy(UserInfo.class, form).execute();
		//System.out.println("★form.user_id="+userInfo.getUser_id());
		//System.out.println("★form.user_name_knj="+userInfo.getUser_name_knj());

		//部分コピーの場合
		UserInfo userInfo = new UserInfo();
		//password 以外をコピー
		Beans.copy(form, userInfo).excludes("password").execute();

		//パスワード暗号化
		String enc = EncryptUtil.encrypt(form.password);
		userInfo.setPassword(enc);

		//日付など分割項目は項目名が一致しないため対象外
		StringBuilder seinengappiYmd = new StringBuilder();
		seinengappiYmd.append(form.seinengappi_YYYY);
		seinengappiYmd.append(form.seinengappi_MM);
		seinengappiYmd.append(form.seinengappi_DD);
		userInfo.setSeinengappi_ymd(seinengappiYmd.toString());

		userInfoDao.persist(userInfo);
*/

	}

    /**
     * アカウントIDの存在チェック.
     *
     * @param accid アカウントID
     * @return
     *   false:Nothing
     *   true :exist
     */
	public final boolean accountIdExistCheck(final String accid) {

		// 検索(DEL_FLGを無視して検索結果取得）
		List<MAccount> list = mAccountService.findWithOutDelFlg(accid);

		return !(list.size() == 0);

	}
}
