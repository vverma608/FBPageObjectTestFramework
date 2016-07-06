package testcases;

import org.testng.annotations.Test;

import base.Page;
import pages.LandingPage;
import pages.MyProfilePage;

public class TestFriends {

	@Test(priority=2)	
	public void gotoFriend() throws InterruptedException{
	LandingPage lp = Page.topNav.gotoHome();
	MyProfilePage mp = lp.gotoProfile();
	mp.gotoFriends();	
	Page.topNav.dologOut();
		
	}
}
