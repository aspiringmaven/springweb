package me.sumitkawatra.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AppUserInterceptor extends HandlerInterceptorAdapter {
	
	
	
	/**
	 * 
	 */
	public AppUserInterceptor() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		System.out.println(super.preHandle(request, response, handler));
		System.out.println("interceptor > preHandle !! calls before controller method");
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

		super.postHandle(request, response, handler, modelAndView);
		System.out.println(
				"interceptor > postHandle !! calls after controller method" + request.getRequestURI().toString());
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		super.afterCompletion(request, response, handler, ex);
		System.out
				.println("interceptor > afterCompletion !! after view generation" + request.getRequestURI().toString());
	}

}
