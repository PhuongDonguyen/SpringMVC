package ptit.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@RequestMapping("user/form")
	public String showForm() {
		return "user/login";
	}

	@RequestMapping("user/login")
	public String login(HttpServletRequest req) {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		if (username.equals("admin") && password.equals("admin")) {
			req.setAttribute("uid", username);
			req.setAttribute("pwd", password);
			return "user/info";
		}

		req.setAttribute("message", "Invalid username or password!");
		return "user/login";
	}
}
