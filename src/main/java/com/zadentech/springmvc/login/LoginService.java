package com.zadentech.springmvc.login;

import org.springframework.stereotype.Service;

/**
 * LoginService
 */
@Service
public class LoginService {

    public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("valdiz777") && password.equals("dummy");
	}
}