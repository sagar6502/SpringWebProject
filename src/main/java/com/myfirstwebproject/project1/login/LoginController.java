package com.myfirstwebproject.project1.login;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	private Logger objLgr = LoggerFactory.getLogger(getClass());

	@RequestMapping("login")
	public String goToLoginPage(@RequestParam String name, ModelMap model) {
		model.put("name", name);	
		objLgr.debug("request name {} " +name);
		objLgr.info("Request param is :: 	"+name); //Not recommmended for PROD code
		return "login.jsp";
		
	}
}
