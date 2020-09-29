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

}
