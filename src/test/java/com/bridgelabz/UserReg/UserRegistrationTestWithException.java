package com.bridgelabz.UserReg;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

//import junit.framework.Assert;

public class UserRegistrationTestWithException 
{
	
	UserRegistration userReg = null;
    
    @Before
    public void intialize()
    {
    	userReg = new UserRegistration();
    }
    
    @Test
    public void givenName_WhenPatternMatches_ReturnTrue()
    {
    	boolean fnameValid;
    	try
    	{
    		fnameValid = userReg.checkFirstName("Prerna");
    		assertEquals(true, fnameValid);
    	}
    	catch(UserRegistrationException e)
    	{
    		e.printStackTrace();
    	}
    	
    }
    @Test
    public void givenName_WhenInvalid_Exception()
    {
    	boolean fnameValid;
    	try
    	{
    		fnameValid = userReg.checkFirstName("pr");
    	}
    	catch(UserRegistrationException e)
    	{
    		System.out.println(e.getMessage());
    		assertEquals(UserRegistrationException.ExceptionType.INVALID_FIRSTNAME, e.exceptionType);
    	}
    }
    @Test
    public void givenName_WhenEmpty_Exception()
    {
    	boolean fnameValid;
    	try
    	{
    		fnameValid = userReg.checkFirstName("");
    	}
    	catch(UserRegistrationException e)
    	{
    		System.out.println(e.getMessage());
    		assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.exceptionType);
    	}
    }
    @Test
    public void givenName_WhenNull_Exception()
    {
    	boolean fnameValid;
    	try
    	{
    		fnameValid = userReg.checkFirstName(null);
    	}
    	catch(UserRegistrationException e)
    	{
    		System.out.println(e.getMessage());
    		assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.exceptionType);
    	}
    }
    @Test
    public void givenLastName_WhenPatternMatches_ReturnTrue()
    {
    	boolean lnameValid;
    	try
    	{
    		lnameValid = userReg.checkLastName("Prerna");
    		assertEquals(true, lnameValid);
    	}
    	catch(UserRegistrationException e)
    	{
    		e.printStackTrace();
    	}
    	
    }
    @Test
    public void givenLastName_WhenInvalid_Exception()
    {
    	boolean lnameValid;
    	try
    	{
    		lnameValid = userReg.checkLastName("pr");
    	}
    	catch(UserRegistrationException e)
    	{
    		System.out.println(e.getMessage());
    		assertEquals(UserRegistrationException.ExceptionType.INVALID_LASTNAME, e.exceptionType);
    	}
    }
    @Test
    public void givenLastName_WhenEmpty_Exception()
    {
    	boolean lnameValid;
    	try
    	{
    		lnameValid = userReg.checkLastName("");
    	}
    	catch(UserRegistrationException e)
    	{
    		System.out.println(e.getMessage());
    		assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.exceptionType);
    	}
    }
    @Test
    public void givenLastName_WhenNull_Exception()
    {
    	boolean lnameValid;
    	try
    	{
    		lnameValid = userReg.checkLastName(null);
    	}
    	catch(UserRegistrationException e)
    	{
    		System.out.println(e.getMessage());
    		assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.exceptionType);
    	}
    }
    @Test
    public void givenMobile_WhenPatternMatches_ReturnTrue()
    {
    	boolean mobileValid;
    	try
    	{
    		mobileValid = userReg.checkMobile("91 9475976187");
    		assertEquals(true, mobileValid);
    	}
    	catch(UserRegistrationException e)
    	{
    		e.printStackTrace();
    	}
    	
    }
    @Test
    public void givenMobile_WhenInvalid_Exception()
    {
    	boolean mobileValid;
    	try
    	{
    		mobileValid = userReg.checkMobile("90876635");
    	}
    	catch(UserRegistrationException e)
    	{
    		System.out.println(e.getMessage());
    		assertEquals(UserRegistrationException.ExceptionType.INVALID_MOBILE, e.exceptionType);
    	}
    }
    @Test
    public void givenMobile_WhenEmpty_Exception()
    {
    	boolean mobileValid;
    	try
    	{
    		mobileValid = userReg.checkMobile("");
    	}
    	catch(UserRegistrationException e)
    	{
    		System.out.println(e.getMessage());
    		assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.exceptionType);
    	}
    }
    @Test
    public void givenMobile_WhenNull_Exception()
    {
    	boolean mobileValid;
    	try
    	{
    		mobileValid = userReg.checkMobile(null);
    	}
    	catch(UserRegistrationException e)
    	{
    		System.out.println(e.getMessage());
    		assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.exceptionType);
    	}
    }
    @Test
    public void givenEmail_WhenPatternMatches_ReturnTrue()
    {
    	boolean emailValid;
    	try
    	{
    		emailValid = userReg.checkEmail("abc.xyz@bl.com");
    		assertEquals(true, emailValid);
    	}
    	catch(UserRegistrationException e)
    	{
    		e.printStackTrace();
    	}
    	
    }
    @Test
    public void givenEmail_WhenInvalid_Exception()
    {
    	boolean emailValid;
    	try
    	{
    		emailValid = userReg.checkEmail("abc@gmail@gm.com");
    	}
    	catch(UserRegistrationException e)
    	{
    		System.out.println(e.getMessage());
    		assertEquals(UserRegistrationException.ExceptionType.INVALID_EMAIL, e.exceptionType);
    	}
    }
    @Test
    public void givenEmail_WhenEmpty_Exception()
    {
    	boolean emailValid;
    	try
    	{
    		emailValid = userReg.checkEmail("");
    	}
    	catch(UserRegistrationException e)
    	{
    		System.out.println(e.getMessage());
    		assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.exceptionType);
    	}
    }
    @Test
    public void givenEmail_WhenNull_Exception()
    {
    	boolean emailValid;
    	try
    	{
    		emailValid = userReg.checkEmail(null);
    	}
    	catch(UserRegistrationException e)
    	{
    		System.out.println(e.getMessage());
    		assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.exceptionType);
    	}
    }
    @Test
    public void givenPassword_WhenPatternMatches_ReturnTrue()
    {
    	boolean pValid;
    	try
    	{
    		pValid = userReg.checkPassword("abcA6gdf@");
    		assertEquals(true, pValid);
    	}
    	catch(UserRegistrationException e)
    	{
    		e.printStackTrace();
    	}
    	
    }
    @Test
    public void givenPassword_WhenInvalid_Exception()
    {
    	boolean pValid;
    	try
    	{
    		pValid = userReg.checkPassword("abcAgdg%^2");
    	}
    	catch(UserRegistrationException e)
    	{
    		System.out.println(e.getMessage());
    		assertEquals(UserRegistrationException.ExceptionType.INVALID_PASSWORD, e.exceptionType);
    	}
    }
    @Test
    public void givenPassword_WhenEmpty_Exception()
    {
    	boolean pValid;
    	try
    	{
    		pValid = userReg.checkPassword("");
    	}
    	catch(UserRegistrationException e)
    	{
    		System.out.println(e.getMessage());
    		assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.exceptionType);
    	}
    }
    @Test
    public void givenPassword_WhenNull_Exception()
    {
    	boolean pValid;
    	try
    	{
    		pValid = userReg.checkPassword(null);
    	}
    	catch(UserRegistrationException e)
    	{
    		System.out.println(e.getMessage());
    		assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.exceptionType);
    	}
    }
    


}
