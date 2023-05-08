package com.techeqt.todoTracker.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String username, String password) {
		boolean isValidUsername=username.equalsIgnoreCase("jk");
		boolean isValidPassword=password.equalsIgnoreCase("jk");
		return isValidUsername&&isValidPassword;
	}

}
