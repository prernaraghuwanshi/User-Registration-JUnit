package com.bridgelabz.UserReg;

public class UserRegistrationException extends Exception
{
	enum ExceptionType{
		ENTERED_NULL,ENTERED_EMPTY,INVALID_FIRSTNAME, INVALID_LASTNAME, INVALID_EMAIL, INVALID_MOBILE, INVALID_PASSWORD, ENTERED_INVALID 
	}
	
	ExceptionType exceptionType;
	public UserRegistrationException(ExceptionType exceptionType, String message)
	{	
		super(message);
		this.exceptionType = exceptionType;	
	}

}
