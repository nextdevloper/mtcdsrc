package org.x.material.intercepter;

import javax.annotation.Resource;

import org.aopalliance.intercept.MethodInvocation;
import org.seasar.framework.aop.interceptors.AbstractInterceptor;
import org.seasar.struts.annotation.Execute;
import org.x.material.dto.UserDto;

/**
 * ログイン確認インターセプタ.
 *
 * @author  nakada
 * @since   XXXXXXXX.01.00
 * @version 20141029.00.01
 */
public class LoginConfirmInterceptor extends AbstractInterceptor {

	/** シリアルバージョン番号. */
	private static final long serialVersionUID = 1L;

	/** 認証情報を格納するセッションスコープのDTO. */
	@Resource
	private UserDto userDto;

	/** 画面 - GM01. */
	private static final String GM01 = "login.jsp";

	/**
	 * AbstractInterceptorを継承する際に、実装する必要のあるメソッド.
	 * 割り込ませる処理を記述。
	 *
	 * @param invocation the MethodInvocation
	 * @return invoke
	 * @throws Throwable the throws
	 */
	@Override
	public final Object invoke(final MethodInvocation invocation) throws Throwable {
		/** 両方の条件を満たしていない場合、Loginページへ飛ばす. */
		if (!isExecuteMethod(invocation) || isLoggedIn()) {
			return invocation.proceed();
		} else {
			return GM01;
		}
	}

	/**
	 * 実行されたActionに@Executeがついていたかどうか.
	 *
	 * @param invocation the MethodInvocation
	 * @return アノテーションがついていればtrue
	 */
	private boolean isExecuteMethod(final MethodInvocation invocation) {
		return invocation.getMethod().isAnnotationPresent(Execute.class);
	}

	/**
	 * セッション上にDtoがあるか、あった場合その中にuserInfoListは保持されているか.
	 *
	 * @return 上記の条件を両方満たしていればtrue
	 */
	private boolean isLoggedIn() {
		return (userDto != null && userDto.getAccid() != null);
	}


}
