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
    

	
   
}
