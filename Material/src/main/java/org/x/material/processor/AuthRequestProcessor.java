package org.x.material.processor;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.seasar.framework.container.SingletonS2Container;
import org.seasar.struts.action.S2RequestProcessor;
import org.seasar.struts.config.S2ExecuteConfig;
import org.seasar.struts.util.S2ExecuteConfigUtil;
import org.x.material.common.annotation.Auth;
import org.x.material.dto.UserDto;

/**
 * ログインチェックを行う<code>S2RequestProcessor</code>の拡張です.
 *
 *
 * @author  nakada
 * @since   20141026.01.00
 * @version 20141026.00.01
 */
public class AuthRequestProcessor extends S2RequestProcessor {

	/** 戻り先定義:login. */
	private static final String FORWARD_PATH = "/WEB-INF/view/mgk01001/login/login.jsp";

	/**
	 * 認証されているかどうかのチェック.
	 * ・S2RequestProcessor
	 *
	 * @param request HttpServletRequest
	 * @param response HttpServletResponse
	 * @param mapping ActionMapping
	 * @return boolean ログイン有無
	 * @throws IOException IOエラー
	 * @throws ServletException サーブレットエラー
	 */
	@Override
	protected final boolean processRoles(final HttpServletRequest request,
			final HttpServletResponse response, final ActionMapping mapping)
			throws IOException, ServletException {

		//Object action = ((S2ActionMapping) mapping).getAction();
		S2ExecuteConfig executeConfig = S2ExecuteConfigUtil.getExecuteConfig();

		// アノテーションを取得
		Auth auth = executeConfig.getMethod().getAnnotation(Auth.class);

		if (auth != null) {
			// UserDtoを取得
			UserDto userDto = SingletonS2Container.getComponent(UserDto.class);

			// UserDtoのisLogin()メソッドの戻り値をチェック
			boolean isLogin = userDto.isLogin();

			// ログインしていなかったら例外を投げる
			if (!isLogin) {
//				throw new RuntimeException("ログインしていません。");
				ActionForward forward = new ActionForward(FORWARD_PATH, false);
                super.processForwardConfig(request, response, forward);
                return false;

			}
		}

		return super.processRoles(request, response, mapping);
	}

}
