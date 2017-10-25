package Com.Aartek.Controller;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Com.Aartek.Interceptor.LoginInterceptor;
import Com.Aartek.Model.User;
import Com.Aartek.Service.LoginService;

@Controller
public class LoginController {

	@Autowired
	LoginService LoginService;

	private static final Logger log = Logger.getLogger(LoginController.class);

	@RequestMapping(value = "/login", method = { RequestMethod.GET, RequestMethod.POST })
	public String showlogin(@ModelAttribute("user") User user, HttpServletRequest req, HttpServletResponse response,
			Model model, Map<String, Object> map) {

		Locale locale = LocaleContextHolder.getLocale();

		System.out.println("current locale :" + locale);
		String str = req.getMethod();

		if (str.equals("GET")) {

			System.out.println("inside get method");
			map.put("user", new User());
			log.info("--------------login Controller----------");
			return "login";
		} else {

			System.out.println("inside Post method");

			List<User> singlerow = (List<User>) LoginService.userlogin1(user);

			if (singlerow.size() > 0) {

				HttpSession session = req.getSession();
				session.setAttribute("login", user.getEmail());

				return "redirect:/project.do";
			} else {

				model.addAttribute("invalid", "invalid username or password");
				return "login";

			}

		}

	}
}
