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
import org.springframework.web.bind.annotation.RequestMapping;

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

	@Autowired
	private LoginService loginService;

	@RequestMapping("/login")
	public void varifyLogin() {

	}
}
