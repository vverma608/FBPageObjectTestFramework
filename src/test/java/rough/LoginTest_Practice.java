package rough;

import base.Page;
import pages.HomePage;
import pages.LandingPage;
import pages.MyProfilePage;

public class LoginTest_Practice {

		
	public static void main(String[] args) throws InterruptedException{
		
	HomePage home = new HomePage();
	LandingPage lp = home.doLogin("seltest645@gmail.com", "test1234@");
	MyProfilePage mp = lp.gotoProfile();
	mp.gotoFriends();	
	Page.topNav.dologOut();
	
	
	//new HomePage().doLogin("seltest645@gmail.com", "test1234@").gotoProfile().gotoFriends();

	}

}
