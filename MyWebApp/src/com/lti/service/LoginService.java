package com.lti.service;

import java.util.HashMap;

public class LoginService {

	private HashMap<String, String> users = new HashMap();

	public LoginService() {
		users.put("sapna", "111");
		users.put("pooja", "222");
		users.put("lti", "333");

	}

	public boolean isValidUser(String username, String password) {

		if (users.containsKey(username))
			if (users.get(username).equals(password))
				return true;
		return false;
	}

}
