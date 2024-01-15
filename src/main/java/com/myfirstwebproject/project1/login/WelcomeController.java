package com.myfirstwebproject.project1.login;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class WelcomeController {
	
	//private Logger objLgr = LoggerFactory.getLogger(getClass());
	

	/*
	@RequestMapping("login")
	public String goToLoginPage(@RequestParam String name, ModelMap model) {
		model.put("name", name);	
		objLgr.debug("request name {} " +name);
		objLgr.info("Request param is :: 	"+name); //Not recommmended for PROD code
		return "login.jsp";
		
	}
	*/
	

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String goToWelcomePage(ModelMap model) {
		model.put("name", getLoggedinUserName());
		return "welcome.jsp";
		
	}
	
	private String getLoggedinUserName() {
		Authentication authentication =
				SecurityContextHolder.getContext().getAuthentication();
		
		return authentication.getName();
	}
	
	//ss1
	
//	@RequestMapping(value="login",method=RequestMethod.POST)
//	public String goToWelcomePage(@RequestParam(name = "name", defaultValue = "DefaultName") String name, @RequestParam(name = "password", defaultValue = "DefaultName") String password, ModelMap model) {
//		model.put("name",name);
//		model.put("password",password);
//		if(authenticationService.authenticate(name, password))
//		return "welcome.jsp";
//		
//		model.put("errorMessage", "Invalid Credentials! Please try again.");
//		return "login.jsp";
//		
//	}
}
