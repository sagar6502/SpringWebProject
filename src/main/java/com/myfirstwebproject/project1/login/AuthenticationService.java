package com.myfirstwebproject.project1.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String user, String password) {
		boolean isValidUserName = user.equals("sagar");
		boolean isValidPassword = password.equals("sunar");
		return isValidPassword && isValidUserName;
	}
}
