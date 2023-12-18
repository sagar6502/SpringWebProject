package com.myfirstwebproject.project1.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {
	
	//private Logger objLgr = LoggerFactory.getLogger(getClass());
	
	private AuthenticationService authenticationService;

	/*
	@RequestMapping("login")
	public String goToLoginPage(@RequestParam String name, ModelMap model) {
		model.put("name", name);	
		objLgr.debug("request name {} " +name);
		objLgr.info("Request param is :: 	"+name); //Not recommmended for PROD code
		return "login.jsp";
		
	}
	*/
	
	public LoginController(AuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}

	@RequestMapping(value="login",method=RequestMethod.GET)
	public String goToLoginPage() {
		return "login.jsp";
		
	}
	
	//ss1
	
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String goToWelcomePage(@RequestParam(name = "name", defaultValue = "DefaultName") String name, @RequestParam(name = "password", defaultValue = "DefaultName") String password, ModelMap model) {
		model.put("name",name);
		model.put("password",password);
		if(authenticationService.authenticate(name, password))
		return "welcome.jsp";
		
		model.put("errorMessage", "Invalid Credentials! Please try again.");
		return "login.jsp";
		
	}
}
