package org.x.material.common.util;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ExceptionHandler;
import org.apache.struts.config.ExceptionConfig;
import org.seasar.framework.log.Logger;


/**
 * Global ExceptionHandler.
 *
 * @author  nakada
 * @since   20141026.01.00
 * @version 20141026.00.01
 */
public class GlobalExceptionHandler extends ExceptionHandler {

	/** ログ出力定義. */
	private static final Logger LOGGER = Logger.getLogger(GlobalExceptionHandler.class);

	/**
	 * エラー発生時のエラーハンドラー.
	 *
	 * @param ex Exception
	 * @param ae ExceptionConfig
	 * @param mapping ActionMapping
	 * @param formInstance ActionForm
	 * @param request HttpServletRequest
	 * @param response HttpServletResponse
	 * @return execute
	 * @throws ServletException the Exception
	 */
	@Override
	public final ActionForward execute(final Exception ex, final ExceptionConfig ae,
			final ActionMapping mapping, final ActionForm formInstance,
			final HttpServletRequest request, final HttpServletResponse response)
		throws ServletException {

			// エラーログを出力
		LOGGER.error("エラーがはっせいしました。", ex);

			// エラー画面に遷移
			return super.execute(ex, ae, mapping, formInstance, request, response);

	}
}
