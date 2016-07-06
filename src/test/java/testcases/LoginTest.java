package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import commonUtils.TestUtils;
import pages.HomePage;
import pages.LandingPage;

public class LoginTest extends TestUtils {
	
	@Test(priority=1)	
	public void doLogin(){
	
		HomePage home = new HomePage();
		LandingPage lp = home.doLogin("seltest645@gmail.com", "test1234@");

		Assert.assertTrue(isElementPresent(".//*[@id='pagelet_welcome_box']/ul/li[1]/div/a"));
		
		//Assert.fail();
	}

	
}
