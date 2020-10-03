package com.bridgelabz.UserReg;

import static org.junit.Assert.assertEquals;

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
    	boolean fnameValid;
		try {
			fnameValid = userReg.checkFirstName(name);
			Assert.assertEquals(true,fnameValid);
		} catch (UserRegistrationException e) {
		
			//e.printStackTrace();
		}
    	
    }
    @Test
    public void givenName_WhenLessThanThreeCharacters_ReturnFalse()
    {
    	String name = "Pr";
    	boolean fnameValid;
		try {
			fnameValid = userReg.checkFirstName(name);
		} catch (UserRegistrationException e) {
			
			System.out.println(e.getMessage());
    		assertEquals(UserRegistrationException.ExceptionType.ENTERED_INVALID, e.exceptionType);
		}
    	
    }
    @Test
    public void givenName_WhenDoesNotStartWithCapital_ReturnFalse()
    {
    	String name = "prerna";
    	boolean fnameValid;
		try {
			fnameValid = userReg.checkFirstName(name);
		} catch (UserRegistrationException e) {
			System.out.println(e.getMessage());
    		assertEquals(UserRegistrationException.ExceptionType.ENTERED_INVALID, e.exceptionType);
		}
    	
    }
    @Test
    public void givenLastName_WhenPatternMatches_ReturnTrue()
    {
    	String name = "Raghuwanshi";
    	boolean fnameValid;
		try {
			fnameValid = userReg.checkLastName(name);
			Assert.assertEquals(true,fnameValid);
		} catch (UserRegistrationException e) {
			
			//e.printStackTrace();
		}
    	
    }
    @Test
    public void givenLastName_WhenLessThanThreeCharacters_ReturnFalse()
    {
    	String name = "R";
    	boolean fnameValid;
		try {
			fnameValid = userReg.checkLastName(name);
		} catch (UserRegistrationException e) {
			System.out.println(e.getMessage());
    		assertEquals(UserRegistrationException.ExceptionType.ENTERED_INVALID, e.exceptionType);
    		}
    	
    }
    @Test
    public void givenLastName_WhenDoesNotStartWithCapital_ReturnFalse()
    {
    	String name = "raghuwanshi";
    	boolean fnameValid;
		try {
			fnameValid = userReg.checkLastName(name);
		} catch (UserRegistrationException e) {
			System.out.println(e.getMessage());
    		assertEquals(UserRegistrationException.ExceptionType.ENTERED_INVALID, e.exceptionType);
		}
    	
    }
    @Test
    public void givenMobile_WhenPatternMatches_ReturnTrue()
    {
    	String mobile = "91 9475976187";
    	boolean mobileValid;
		try {
			mobileValid = userReg.checkMobile(mobile);
			Assert.assertEquals(true,mobileValid);
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
    	
    }
    @Test
    public void givenMobile_WhenNoCountryCode_ReturnFalse()
    {
    	String mobile = "9475976187";
    	boolean mobileValid;
		try {
			mobileValid = userReg.checkMobile(mobile);
		} catch (UserRegistrationException e) {
			System.out.println(e.getMessage());
    		assertEquals(UserRegistrationException.ExceptionType.ENTERED_INVALID, e.exceptionType);
		}
    	
    }
    @Test
    public void givenMobile_WhenNotATenDigitNumber_ReturnFalse()
    {
    	String mobile = "94759761";
    	boolean mobileValid;
		try {
			mobileValid = userReg.checkMobile(mobile);
		} catch (UserRegistrationException e) {
			System.out.println(e.getMessage());
    		assertEquals(UserRegistrationException.ExceptionType.ENTERED_INVALID, e.exceptionType);
		}
    	
    }
    @Test
    public void givenPassword_WhenMinimumEightCharacters_ReturnTrue()
    {
    	String password = "asdfeR346@7h";
    	boolean passwordValid;
		try {
			passwordValid = userReg.checkPassword(password);
			Assert.assertEquals(true, passwordValid);
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
    	
    }
    @Test
    public void givenPassword_WhenNotMinimumEightCharacters_ReturnFalse()
    {
    	String password = "dfA3$";
    	boolean passwordValid;
		try {
			passwordValid = userReg.checkPassword(password);
		} catch (UserRegistrationException e) {
			System.out.println(e.getMessage());
    		assertEquals(UserRegistrationException.ExceptionType.ENTERED_INVALID, e.exceptionType);
		}
    	
    }
    @Test
    public void givenPassword_WhenAtleastOneUpperCase_ReturnTrue()
    {
    	String password = "asdfRr3467h*";
    	boolean passwordValid;
		try {
			passwordValid = userReg.checkPassword(password);
			Assert.assertEquals(true, passwordValid);
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
    	
    }
    @Test
    public void givenPassword_WhenNoUpperCase_ReturnFalse()
    {
    	String password = "asdfer3467h*";
    	boolean passwordValid;
		try {
			passwordValid = userReg.checkPassword(password);
		} catch (UserRegistrationException e) {
			System.out.println(e.getMessage());
    		assertEquals(UserRegistrationException.ExceptionType.ENTERED_INVALID, e.exceptionType);
		}
    }
    @Test
    public void givenPassword_WhenAtleastOneNumeric_ReturnTrue()
    {
    	String password = "asdfRr3467h%";
    	boolean passwordValid;
		try {
			
			passwordValid = userReg.checkPassword(password);
			Assert.assertEquals(true, passwordValid);
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
    	
    }
    @Test
    public void givenPassword_WhenNoNumeric_ReturnFalse()
    {
    	String password = "aSdfZXfd%h";
    	boolean passwordValid;
		try {
			passwordValid = userReg.checkPassword(password);
		} catch (UserRegistrationException e) {
			System.out.println(e.getMessage());
    		assertEquals(UserRegistrationException.ExceptionType.ENTERED_INVALID, e.exceptionType);
		}
    	
    }
    @Test
    public void givenPassword_WhenExactlyOneSpecialCharacter_ReturnTrue()
    {
    	String password = "asdfRr34*7h";
    	boolean passwordValid;
		try {
			passwordValid = userReg.checkPassword(password);
			Assert.assertEquals(true, passwordValid);
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
    	
    }
    @Test
    public void givenPassword_WhenNoSpecialCharacter_ReturnFalse()
    {
    	String password = "aSdfZXfd3h";
    	boolean passwordValid;
		try {
			passwordValid = userReg.checkPassword(password);
		} catch (UserRegistrationException e) {
			System.out.println(e.getMessage());
    		assertEquals(UserRegistrationException.ExceptionType.ENTERED_INVALID, e.exceptionType);
		}
    	
    }
    @Test
    public void givenPassword_WhenMoreThanOneSpecialCharacter_ReturnFalse()
    {
    	String password = "aSdfZXfd%9$h";
    	boolean passwordValid;
		try {
			passwordValid = userReg.checkPassword(password);
		} catch (UserRegistrationException e) {
			System.out.println(e.getMessage());
    		assertEquals(UserRegistrationException.ExceptionType.ENTERED_INVALID, e.exceptionType);
		}
    	
    }

	
   
}
