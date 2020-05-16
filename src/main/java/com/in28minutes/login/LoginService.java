package com.in28minutes.login;

public class LoginService {
	public boolean isUserValid(String user, String pwd){
		if(user.equals("helisson") && pwd.equals("123")){
			return true;
		}else{
			return false;
		}
	}
}
