/**
 * @Title: LoginService.java
 * @Package: com.pan.fs.service
 * @Description: TODO
 * @Author: Pan
 * @Date: 2017年7月13日
 */
package com.pan.fs.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pan.fs.bean.User;
import com.pan.fs.dao.UserMapper;

/**
 * @ClassName: LoginService
 * @Description: TODO
 * @author Pan
 * @date 2017年7月13日
 *
 */
@Service
public class LoginService {

	@Autowired
	private UserMapper userMapper;

	public String varifyLogin(User user) {
		// TODO Auto-generated method stub
		System.out.println("==========进入LoginService==========");
		String msg = "";

		User u =  userMapper.selectByLognameAndPassword(user);
		if (u == null) {
			msg = "用户不存在！！！";
			return msg;
		}
		msg = "登陆成功！！！";
		u.setLastLog(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		userMapper.updateByPrimaryKeySelective(u);
		return msg;
	}

}
