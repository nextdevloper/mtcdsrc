package org.x.material.form.mgk01001;

import static org.x.material.condition.MaterialConstants.*;

import java.io.Serializable;
import java.security.NoSuchAlgorithmException;

import javax.annotation.Resource;

import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;
import org.seasar.struts.annotation.IntegerType;
import org.seasar.struts.annotation.Mask;
import org.seasar.struts.annotation.Maxlength;
import org.seasar.struts.annotation.Minlength;
import org.seasar.struts.annotation.Required;
import org.x.material.common.exception.MCBusinessException;
import org.x.material.dto.UserDto;
import org.x.material.service.mgk01001.LoginService;


/**
 * Form:ログイン.
 *
 * @author  nakada
 * @since   20141026.01.00
 * @version 20160430.00.02
 */
@Component(instance = InstanceType.REQUEST)
public class LoginForm implements Serializable {

	/** シリアルバージョン番号. */
	private static final long serialVersionUID = 1L;

	/** 認証情報を格納するセッションスコープのDTO. */
	@Resource
	private UserDto userDto;

	/** 認証チェックサービス. **/
	@Resource
	private LoginService loginService;

	/** ユーザ名. */
	@Required
	@Maxlength(maxlength = USERIDMAX)
	@Mask(mask = "^[a-zA-Z0-9]+$")
	private String username;

	/** パスワード. */
	@Required
	@Minlength(minlength = PASSWORDMIN)
	@Maxlength(maxlength = PASSWORDMAX)
	@Mask(mask = "^[a-zA-Z0-9]+$")
	private String password;

	/** ログイン情報を保存. */
	@Required
	private boolean remember;

	/**
	 *  コックピット画面表示用.
	 */

	/** 一覧ページ番号. */
	@Required(target = "regSearch,locturn")
	@IntegerType
	private String locpageno;

	/** 参照検索キー1パラメータ. */
	private String srcKey1;
	/** 参照検索キー2パラメータ. */
	private String srcKey2;
	/** 参照検索キー3パラメータ. */
	private String srcKey3;


	/**
	 * Form初期化.
	 */
	public void initialize() {
	}

	/**
	 * Formクリア.
	 * 	setterが実施される前に動作します。
	 */
	public final void reset() {
		remember = false;
	}

	/**
	 * 確認チェック.
	 * 	確認項目のチェックを行います。
	 *
	 * @return errors the ActionMessages
	 */
	public final ActionMessages validateConfirm() {
		ActionMessages errors = new ActionMessages();

    	try {
	    	// ログイン実施
    		userDto.setUserInfo(loginService.attestationCheck(username, password));

    	} catch (MCBusinessException | NoSuchAlgorithmException e) {
			errors.add("login_chk", new ActionMessage("errors.loginerror"));
    	}

		return errors;
	}

	/**
     * Returns the username.
     *
     * @return the username
     */
	public final String getUsername() {
		return username;
	}

    /**
     * Sets the username.
     *
     * @param prmgetUsername ユーザ名
     */
	public final void setUsername(final String prmgetUsername) {
		this.username = prmgetUsername;
	}

	/**
     * Returns the password.
     *
     * @return the password
     */
	public final String getPassword() {
		return password;
	}

    /**
     * Sets the password.
     *
     * @param prmPassword パスワード
     */
	public final void setPassword(final String prmPassword) {
		this.password = prmPassword;
	}

	/**
     * Returns the remember.
     *
     * @return the remember
     */
	public final boolean getRemember() {
		return remember;
	}

	/**
	 * Get locpageno.
	 *
	 * @return locpageno
	 */
	public final String getLocpageno() {
		return locpageno;
	}


	/**
	 * Set locpageno.
	 *
	 * @param prmLocpageno セットする locpageno
	 */
	public final void setLocpageno(final String prmLocpageno) {
		this.locpageno = prmLocpageno;
	}


	/**
     * Returns the srcKey1.
     *
     * @return the srcKey1
     */
	public final String getSrcKey1() {
		return this.srcKey1;
	}

    /**
     * Sets the srckey1.
     *
     * @param prmSrcKey 参照検索キーパラメータ
     */
	public final void setSrcKey1(final String prmSrcKey) {
		if (prmSrcKey == null || prmSrcKey.length() <= 0) {
			this.srcKey1 = null;
		} else {
			this.srcKey1 = prmSrcKey;
		}
	}

	/**
     * Returns the srcKey2.
     *
     * @return the srcKey2
     */
	public final String getSrcKey2() {
		return this.srcKey2;
	}

    /**
     * Sets the srckey2.
     *
     * @param prmSrcKey2 参照検索キーパラメータ
     */
	public final void setSrcKey2(final String prmSrcKey) {
		if (prmSrcKey == null || prmSrcKey.length() <= 0) {
			this.srcKey2 = null;
		} else {
			this.srcKey2 = prmSrcKey;
		}
	}

	/**
     * Returns the srcKey3.
     *
     * @return the srcKey3
     */
	public final String getSrcKey3() {
		return this.srcKey3;
	}

    /**
     * Sets the srckey3.
     *
     * @param prmSrcKey3 参照検索キーパラメータ
     */
	public final void setSrcKey3(final String prmSrcKey) {
		if (prmSrcKey == null || prmSrcKey.length() <= 0) {
			this.srcKey3 = null;
		} else {
			this.srcKey3 = prmSrcKey;
		}
	}

}