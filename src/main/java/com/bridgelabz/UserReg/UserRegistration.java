package com.bridgelabz.UserReg;

import java.util.regex.Pattern;

public class UserRegistration {
	
	public void welcomeMessage()
	{
		System.out.println("Welcome to User Registration!");
	}
	
	public boolean checkFirstName(String s) {
		Pattern FNAME_PATTERN = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        return FNAME_PATTERN.matcher(s).matches();
    }
	
	public boolean checkLastName(String s) {
		Pattern LNAME_PATTERN = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        return LNAME_PATTERN.matcher(s).matches();
    }
	public boolean checkMobile(String s) {
		Pattern MOBILE_PATTERN = Pattern.compile("^[0-9]{2} [0-9]{10}$");
		return MOBILE_PATTERN.matcher(s).matches();
	}
	public boolean checkPassword(String s) {
		Pattern PASSWORD_PATTERN1 = Pattern.compile("[A-Za-z0-9]*[^A-Za-z0-9 ]{1}[A-Za-z0-9]*");
		Pattern PASSWORD_PATTERN = Pattern.compile("^(?=.*?[A-Z])(?=.*?[0-9]).{8,}$");
		return PASSWORD_PATTERN1.matcher(s).matches()&&PASSWORD_PATTERN.matcher(s).matches();
	}
	public boolean checkEmail(String s) {
		Pattern EMAIL_PATTERN = Pattern.compile("^[a-z0-9]+[_+-\\.]{0,1}[a-z0-9]+@[a-z0-9]+\\.[a-z]{2,}(\\.[a-z]{2,}){0,1}$");
        return EMAIL_PATTERN.matcher(s).matches();
	}
    

}
