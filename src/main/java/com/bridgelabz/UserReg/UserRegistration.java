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
		Pattern PASSWORD_PATTERN = Pattern.compile("^(?=.*?[A-Z]).{8,}$");
		return PASSWORD_PATTERN.matcher(s).matches();
	}

}
