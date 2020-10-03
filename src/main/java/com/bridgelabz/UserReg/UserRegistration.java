package com.bridgelabz.UserReg;

import java.util.regex.Pattern;

@FunctionalInterface
interface IValidateFunction{
	boolean validate(String s, Pattern p) throws UserRegistrationException;
}

public class UserRegistration {
	Pattern FNAME_PATTERN = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
	Pattern LNAME_PATTERN = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
	Pattern MOBILE_PATTERN = Pattern.compile("^[0-9]{2} [0-9]{10}$");
	Pattern EMAIL_PATTERN = Pattern.compile("^[a-z0-9]+[_+-\\.]{0,1}[a-z0-9]+@[a-z0-9]+\\.[a-z]{2,}(\\.[a-z]{2,}){0,1}$"); 
	Pattern PASSWORD_PATTERN = Pattern.compile("([A-Za-z0-9]*[^A-Za-z0-9 ]{1}[A-Za-z0-9]*) && (^(?=.*?[A-Z])(?=.*?[0-9]).{8,}$)");
	//Pattern PASSWORD_PATTERN2 = Pattern.compile("^(?=.*?[A-Z])(?=.*?[0-9]).{8,}$");
	//Pattern PASSWORD_PATTERN = PASSWORD_PATTERN1 && PASSWORD_PATTERN2;
	
	IValidateFunction lambdaFunction = (s,p) -> {
		try 
		{
			if(s.length()==0)
			{
				throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_EMPTY, "Input cannot be empty");
			}
			//Pattern FNAME_PATTERN = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
			boolean valid = p.matcher(s).matches();
			
			if(valid == false)
			{
				throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_INVALID, "Input is invalid");
			}
			return valid;
		}
		catch(NullPointerException e)
		{
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL, "Input cannot be NULL");
		}
		
	};
	public void welcomeMessage()
	{
		System.out.println("Welcome to User Registration!");
	}
	
	public boolean checkFirstName(String s) throws UserRegistrationException {
		
		return lambdaFunction.validate(s, FNAME_PATTERN);
        
        
    }
	
	public boolean checkLastName(String s) throws UserRegistrationException {
		
		return lambdaFunction.validate(s, LNAME_PATTERN);
		
    }
	public boolean checkMobile(String s) throws UserRegistrationException {
		
		return lambdaFunction.validate(s, MOBILE_PATTERN);
	
	}
	public boolean checkPassword(String s) throws UserRegistrationException {
		
		return lambdaFunction.validate(s, PASSWORD_PATTERN);
		
	}
	public boolean checkEmail(String s) throws UserRegistrationException {
		
		return lambdaFunction.validate(s, EMAIL_PATTERN);
	}

}
