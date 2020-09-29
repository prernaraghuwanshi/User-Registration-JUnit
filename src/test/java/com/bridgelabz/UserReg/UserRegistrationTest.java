package com.bridgelabz.UserReg;

//import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class UserRegistrationTest 
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
    	String name = "Prerna";
    	boolean fnameValid = userReg.checkFirstName(name);
    	Assert.assertEquals(true,fnameValid);
    }
    @Test
    public void givenName_WhenLessThanThreeCharacters_ReturnFalse()
    {
    	String name = "Pr";
    	boolean fnameValid = userReg.checkFirstName(name);
    	Assert.assertEquals(false,fnameValid);
    }
    @Test
    public void givenName_WhenDoesNotStartWithCapital_ReturnFalse()
    {
    	String name = "prerna";
    	boolean fnameValid = userReg.checkFirstName(name);
    	Assert.assertEquals(false,fnameValid);
    }
    @Test
    public void givenLastName_WhenPatternMatches_ReturnTrue()
    {
    	String name = "Raghuwanshi";
    	boolean fnameValid = userReg.checkFirstName(name);
    	Assert.assertEquals(true,fnameValid);
    }
    @Test
    public void givenLastName_WhenLessThanThreeCharacters_ReturnFalse()
    {
    	String name = "R";
    	boolean fnameValid = userReg.checkFirstName(name);
    	Assert.assertEquals(false,fnameValid);
    }
    @Test
    public void givenLastName_WhenDoesNotStartWithCapital_ReturnFalse()
    {
    	String name = "raghuwanshi";
    	boolean fnameValid = userReg.checkFirstName(name);
    	Assert.assertEquals(false,fnameValid);
    }
    @Test
    public void givenMobile_WhenPatternMatches_ReturnTrue()
    {
    	String mobile = "91 9475976187";
    	boolean mobileValid = userReg.checkMobile(mobile);
    	Assert.assertEquals(true,mobileValid);
    }
    @Test
    public void givenMobile_WhenNoCountryCode_ReturnFalse()
    {
    	String mobile = "9475976187";
    	boolean mobileValid = userReg.checkMobile(mobile);
    	Assert.assertEquals(false,mobileValid);
    }
    @Test
    public void givenMobile_WhenNotATenDigitNumber_ReturnFalse()
    {
    	String mobile = "94759761";
    	boolean mobileValid = userReg.checkMobile(mobile);
    	Assert.assertEquals(false,mobileValid);
    }
    @Test
    public void givenPassword_WhenMinimumEightCharacters_ReturnTrue()
    {
    	String password = "asdfeR3467h";
    	boolean passwordValid = userReg.checkPassword(password);
    	Assert.assertEquals(true, passwordValid);
    }
    @Test
    public void givenPassword_WhenNotMinimumEightCharacters_ReturnFalse()
    {
    	String password = "asdf";
    	boolean passwordValid = userReg.checkPassword(password);
    	Assert.assertEquals(false, passwordValid);
    }
    @Test
    public void givenPassword_WhenAtleastOneUpperCase_ReturnTrue()
    {
    	String password = "asdfRr3467h";
    	boolean passwordValid = userReg.checkPassword(password);
    	Assert.assertEquals(true, passwordValid);
    }
    @Test
    public void givenPassword_WhenNoUpperCase_ReturnFalse()
    {
    	String password = "asdfer3467h";
    	boolean passwordValid = userReg.checkPassword(password);
    	Assert.assertEquals(false, passwordValid);
    }

	
   
}
