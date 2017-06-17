package org.x.material.service.mgk01001;

import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.annotation.Resource;

import org.x.material.common.exception.MCBusinessException;
import org.x.material.common.util.EncryptUtil;
import org.x.material.entity.MAccount;
import org.x.material.service.MAccountService;
import org.x.material.service.PassDigestService;

/**
 * ログインサービス.
 *
 * @author  nakada
 * @since   20141026.1.0
 * @version 20141026.0.1
 */
public class LoginService {

	/**  アカウント情報サービス. **/
	@Resource
	private MAccountService mAccountService;

	/** パスワード暗号化サービス. **/
	@Resource
	private PassDigestService passDigestService;

	/**
	 * ログイン認証チェック.
	 * アカウント情報を取得およびパスワードチェック
	 *
	 * @param accId ユーザID
	 * @param password パスワード
	 * @return List<MAccount>
	 * @throws MCBusinessException 業務例外クラスエラー
	 * @throws NoSuchAlgorithmException アルゴリズム未登録エラー
	 */
	public final List<MAccount> attestationCheck(final String accId, final String password)
		throws MCBusinessException, NoSuchAlgorithmException {

		// 検索
		List<MAccount> list = getUserInfomation(accId);

		// ユーザ情報が見つからない場合には認証失敗
		if (list.size() == 0) {
			//return "MGK10000E";
			//ActionMessagesException は入力エラーのみ利用しかできなそう。
			//			ActionMessages errors = new ActionMessages();
			//			errors.add(ActionMessages.GLOBAL_MESSAGE,
			//					new ActionMessage("MGK10000E"));
			//			throw new ActionMessagesException();
			throw new MCBusinessException("MGK10000E", null);
		}

		// パスワードチェック
		//暗号化タイプの取得
		String psw = list.get(0).getPassword();
		String inpswd = EncryptUtil.encrypt(password);

		// パスワードが一致しない場合には認証失敗
		if (!psw.equals(inpswd)) {
			//return "MGK10001E";
			//throw new ActionMessagesException("MGK10001E",true);
			throw new MCBusinessException("MGK10000E", null);
		}

		return list;
	}

	/**
	 * アカウント情報の取得.
	 *
	 * @param accId アカウントID
	 * @return List<MAccount>　アカウント情報一覧
	 * @throws MCBusinessException 業務例外クラスエラー
	 * @throws NoSuchAlgorithmException アルゴリズム未登録エラー
	 */
	public final List<MAccount> getUserInfomation(final String accId)
		throws MCBusinessException, NoSuchAlgorithmException {

		// 検索
		List<MAccount> list = mAccountService.find(accId);

		// ユーザ情報が見つからない場合には失敗
		if (list.size() == 0) {
			//return "MGK10000E";
			//ActionMessagesException は入力エラーのみ利用しかできなそう。
			//			ActionMessages errors = new ActionMessages();
			//			errors.add(ActionMessages.GLOBAL_MESSAGE,
			//					new ActionMessage("MGK10000E"));
			//			throw new ActionMessagesException();
			throw new MCBusinessException("MGK10000E", null);
		}

		return list;

	}
}
