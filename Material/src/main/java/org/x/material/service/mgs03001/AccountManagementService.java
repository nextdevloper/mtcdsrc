package org.x.material.service.mgs03001;



import java.math.BigDecimal;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

import javax.annotation.Resource;

import org.x.material.common.util.EncryptUtil;
import org.x.material.dao.MAccountDao;
import org.x.material.dao.impl.MAccountDaoImpl;
import org.x.material.dto.UserDto;
import org.x.material.entity.MAccount;
import org.x.material.form.mgs03001.AccountManagementForm;
import org.x.material.service.MAccountService;
import org.x.material.service.PassDigestService;

public class AccountManagementService {

	@Resource
	MAccountService mAccountService;

	@Resource
	PassDigestService passDigestService;
    public UserDto userDto;
	public void reg(AccountManagementForm form)  {

        // aptで生成されたDaoの実装クラスを生成
        MAccountDao dao = new MAccountDaoImpl();

    	MAccount newdata = new MAccount();

    	try{
        	newdata.setAccId(userDto.getAccid());
        	newdata.setAccKind(form.user_kind);
        	//TODO 後日実装
        	newdata.setAccStat(userDto.getAccstatus());

        	newdata.setAccNm(form.user_name_knj);
        	newdata.setAccNmKana(form.user_name_kana);
        	newdata.setAccNmNick(form.user_name_nick);
        	newdata.setMailaddress(form.mail_addr);
			newdata.setPassword(EncryptUtil.encrypt(form.password));
//        	newdata.setPassword(passDigestService.encodePassdigiest(form.password));
        	newdata.setGender(form.seibetu);
        	newdata.setBirthdate(form.seinengappi_YYYY + form.seinengappi_MM + form.seinengappi_DD);
        	newdata.setTel1(form.tel_kotei);
        	newdata.setTel2(form.tel_keitai);
        	newdata.setNote(form.biko);
        	newdata.setDefaultLocale("jp");
        	newdata.setExCnt(BigDecimal.valueOf(Long.parseLong(userDto.getExCnt())));
        	newdata.setInsAcc(userDto.getInsacc());
        	newdata.setInsDate(userDto.getInsdate());
        	newdata.setUpdAcc(userDto.getAccid());
        	newdata.setUpdDate(new Date());
        	newdata.setDelFlg("0");
        	newdata.setRecId(Long.parseLong(userDto.getRecid()));

//        	dao.insert(newdata);
        	dao.update(newdata);
    	}
    	catch(NoSuchAlgorithmException e){
    		// 暗号化エラーの処理をここに書く
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
     * アカウントIDの存在チェック
     * @return
     *   false:Nothing
     *   true :exist
     */
	public boolean accountIdExistCheck(String accid) {
		return true;

/*		// 検索
		List<MAccount> list = mAccountService.find(accid);

		if(list.size() == 0){
			return false;
		} else {
			return true;
		}
*/
	}
}
