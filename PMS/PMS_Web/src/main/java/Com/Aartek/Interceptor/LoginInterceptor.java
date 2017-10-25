package Com.Aartek.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import Com.Aartek.Model.User;


@Component
public class LoginInterceptor extends HandlerInterceptorAdapter {
    
	private static final Logger log = Logger.getLogger(LoginInterceptor.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
            
		System.out.println("prehandler");
		String login = (String) request.getSession().getAttribute("login");
		if (login == null || login.equals("")) {
			response.sendRedirect("login.do");
			return false;
		}
        //log.info("pradeep");
		return true;
	}
	 
	@Override
	public void postHandle(
			HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
			throws Exception {
		
		System.out.println("post handler");
	}
	@Override
	public void afterCompletion(
			HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("after complition");
	}
	 
	
}
