package com.bridgelabz.UserReg;

import java.util.regex.Pattern;

public class UserRegistration {
	
	public void welcomeMessage()
	{
		System.out.println("Welcome to User Registration!");
	}
	
	public boolean checkFirstName(String s) throws UserRegistrationException {
		
		try 
		{
			if(s.length()==0)
			{
				throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_EMPTY, "First Name has to have minimum 3 characters");
			}
			Pattern FNAME_PATTERN = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
			boolean firstNameValid = FNAME_PATTERN.matcher(s).matches();
			
			if(firstNameValid == false)
			{
				throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID_FIRSTNAME, "First Name starts with a capital letter and has minimum 3 characters.");
			}
			return firstNameValid;
		}
		catch(NullPointerException e)
		{
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL, "First Name cannot be NULL");
		}
        
        
    }
	
	public boolean checkLastName(String s) throws UserRegistrationException {
		
		try 
		{
			if(s.length()==0)
			{
				throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_EMPTY, "Last Name has to have minimum 3 characters");
			}
			Pattern LNAME_PATTERN = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
			boolean lastNameValid = LNAME_PATTERN.matcher(s).matches();
			
			if(lastNameValid == false)
			{
				throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID_LASTNAME, "Last Name starts with a capital letter and has minimum 3 characters.");
			}
			return lastNameValid;
		}
		catch(NullPointerException e)
		{
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL, "Last Name cannot be NULL");
		}
		
    }
	public boolean checkMobile(String s) throws UserRegistrationException {
		
		try 
		{
			if(s.length()==0)
			{
				throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_EMPTY, "Mobile has to be of the format <2 digit countrycode><*space*><10 digit number>");
			}
			Pattern MOBILE_PATTERN = Pattern.compile("^[0-9]{2} [0-9]{10}$");
			boolean mobileValid = MOBILE_PATTERN.matcher(s).matches();
			
			if(mobileValid == false)
			{
				throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID_MOBILE, "Mobile has to be of the format <2 digit countrycode><*space*><10 digit number>");
			}
			return mobileValid;
		}
		catch(NullPointerException e)
		{
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL, "Mobile cannot be NULL");
		}
	
	}
	public boolean checkPassword(String s) throws UserRegistrationException {
		
		try 
		{
			if(s.length()==0)
			{
				throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_EMPTY, "Password has to have minimum of 8 characters.");
			}
			Pattern PASSWORD_PATTERN1 = Pattern.compile("[A-Za-z0-9]*[^A-Za-z0-9 ]{1}[A-Za-z0-9]*");
			Pattern PASSWORD_PATTERN = Pattern.compile("^(?=.*?[A-Z])(?=.*?[0-9]).{8,}$");
			boolean passwordValid = PASSWORD_PATTERN1.matcher(s).matches()&&PASSWORD_PATTERN.matcher(s).matches();
			
			if(passwordValid == false)
			{
				throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID_PASSWORD, "Password to have minimum of 8 characters with atleast one capital letter, atleast one digit and exactly one special character.");
			}
			return passwordValid;
		}
		catch(NullPointerException e)
		{
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL, "Password cannot be NULL");
		}
		
	}
	public boolean checkEmail(String s) throws UserRegistrationException {
		
		try 
		{
			if(s.length()==0)
			{
				throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_EMPTY, "Email cannot be empty");
			}
			Pattern EMAIL_PATTERN = Pattern.compile("^[a-z0-9]+[_+-\\.]{0,1}[a-z0-9]+@[a-z0-9]+\\.[a-z]{2,}(\\.[a-z]{2,}){0,1}$");   
			boolean emailValid = EMAIL_PATTERN.matcher(s).matches();
			
			if(emailValid == false)
			{
				throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID_EMAIL, "Valid email E.g. abc.xyz@bl.co.in. Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions");
			}
			return emailValid;
		}
		catch(NullPointerException e)
		{
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL, "Email cannot be NULL");
		}
		
	}
    

}
