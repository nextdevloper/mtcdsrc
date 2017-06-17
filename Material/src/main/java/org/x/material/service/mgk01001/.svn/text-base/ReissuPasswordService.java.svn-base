package org.x.material.service.mgk01001;

import static org.x.material.condition.MaterialConstants.*;

import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.x.material.action.mgk01001.ReissuPasswordAction;
import org.x.material.common.util.EncryptUtil;
import org.x.material.dao.MAccountDao;
import org.x.material.dao.impl.MAccountDaoImpl;
import org.x.material.entity.MAccount;
import org.x.material.service.MAccountService;

/**
 * パスワード再交付関連サービス.
 *
 * @author  nakada
 * @since   20141026.01.00
 * @version 20141026.00.01
 */
public class ReissuPasswordService {

	/** アカウント情報一覧. */
	private List<MAccount> maccountList;

	/** パスワード. */
	private String passWord;

	/** ログ出力定義. */
	private static final Logger LOGGER = Logger.getLogger(ReissuPasswordAction.class);

	/** MAccountテーブル情報関連サービス. */
	@Resource
	private MAccountService mAccountService;

	/**
	 * メールアドレスからアカウント情報を取得.
	 *
	 * @param mailAddress メールアドレス
	 */
	public final void getMaccount(final String mailAddress) {
		LOGGER.debug("getMaccount...");
			maccountList = mAccountService.findBymailaddress(mailAddress);
	}

	/**
	 * パスワード生成.
	 *
	 */
	public final void makePassword() {
		LOGGER.debug("makePassword...");
		passWord = RandomStringUtils.randomAlphanumeric(PASSWORDMAX);
		LOGGER.debug("passWord:[" + passWord + "]");
	}

	/**
	 * パスワード更新.
	 *
	 */
	public final void reRegPassword() {
		LOGGER.debug("reRegPassword...");

		for (int i = 0; i < maccountList.size(); i++) {
			reRegAccount((MAccount) maccountList.get(i));
		}
	}

	/**
	 * パスワード更新.
	 *
	 * @param list MAccount アカウント情報
	 */
	public final void reRegAccount(final MAccount list) {
		LOGGER.debug("reRegAccount...");

        // aptで生成されたDaoの実装クラスを生成
        MAccountDao dao = new MAccountDaoImpl();
		MAccount newdata = new MAccount();

    	try {
        	newdata.setAccId(list.getAccId());
        	newdata.setAccKind(list.getAccKind());
        	newdata.setAccStat(list.getAccStat());
        	newdata.setAccNm(list.getAccNm());
        	newdata.setAccNmKana(list.getAccNmKana());
        	newdata.setAccNmNick(list.getAccNmNick());
        	newdata.setMailaddress(list.getMailaddress());
        	newdata.setPassword(EncryptUtil.encrypt(passWord));
        	newdata.setGender(list.getGender());
        	newdata.setBirthdate(list.getBirthdate());
        	newdata.setTel1(list.getTel1());
        	newdata.setTel2(list.getTel2());
        	newdata.setNote(list.getNote());
        	newdata.setDefaultLocale(list.getDefaultLocale());
        	newdata.setExCnt(list.getExCnt());
        	newdata.setInsAcc(list.getInsAcc());
        	newdata.setInsDate(list.getInsDate());
        	newdata.setUpdAcc(SYSTEMACC);
        	newdata.setUpdDate(new Date());
        	newdata.setDelFlg(list.getDelFlg());
        	newdata.setRecId(list.getRecId());

        	dao.update(newdata);
    	} catch (NoSuchAlgorithmException e) {
			/** TODO 後で実装 */
			throw new RuntimeException("encrypt fail ...", e);
    	}
	}

	/**
     * Returns the maccountList.
     *
     * @return the maccountList
     */
	public final List<MAccount> getMaccountList() {
		return maccountList;
	}

    /**
     * Sets the maccountList.
     *
     * @param prmMaccountList アカウント情報一覧
     */
	public final void setMaccountList(final List<MAccount> prmMaccountList) {
		this.maccountList = prmMaccountList;
	}

	/**
     * Returns the passWord.
     *
     * @return the passWord
     */
	public final String getPassWord() {
		return passWord;
	}

    /**
     * Sets the passWord.
     *
     * @param prmPassWord パスワード
     */
	public final void setPassWord(final String prmPassWord) {
		this.passWord = prmPassWord;
	}


}
