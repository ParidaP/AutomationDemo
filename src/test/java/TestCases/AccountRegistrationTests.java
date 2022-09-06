package TestCases;

import org.testng.annotations.Test;

import PageObjects.HomePage;
import TestBase.Base;

public class AccountRegistrationTests extends Base {
   
	
	@Test
	public void test_creataNewAccount() {
		HomePage homePage= new HomePage(driver);
		homePage.clickUserDropDown();
		homePage.clickCreatAccount();
		
		homePage.firstNamelabel();
		//homePage.setFrirstName();
		//homePage.setLastName("Harbor");
		//homePage.setEmail(randomString(6)+"@gmail.com");
		//homePage.setPhoneNumber("401"+ randomNumbers(7));
		//homePage.setZipCode("02901");
		
		
	}
	
	
}
