/**
 * @Title: LoginController.java
 * @Package: com.pan.fs.controller
 * @Description: TODO
 * @Author: Pan
 * @Date: 2017年7月13日
 */
package com.pan.fs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.pan.fs.bean.User;
import com.pan.fs.service.LoginService;

/**
 * @ClassName: LoginController
 * @Description: TODO
 * @author Pan
 * @date 2017年7月13日
 *
 */
@Controller
public class LoginController {

	public static final String SUCCESS = "登陆成功！！！";

	public static final String FAILED = "用户不存在！！！";

	@Autowired
	private LoginService loginService;

	@RequestMapping("/")
	public String goToLogin() {
		return "views/login";
	}

	@RequestMapping("/home")
	public String goToIndex(User user, Model model) {
		System.out.println("=========进入登录验证==========");
		System.out.println(user.toString());
		String msg = loginService.varifyLogin(user);
		String feedback = "";
		if (msg != null && msg.equals(FAILED)) {
			feedback = "登录失败！请检查账号名或者密码是否正确！！！";
			model.addAttribute("msg", feedback);
			return "views/login";
		} else {
			model.addAttribute("msg", feedback);
			return "views/home";
		}
		//		mv.setViewName("home");

	}

}
