package base;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import pages.LandingPage;

public class TopNavigation {

	
	public void dologOut(){
		
	Page.driver.findElement(By.xpath(Page.OR.getProperty("topNavAnchorMenu"))).click();
	Page.wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Page.OR.getProperty("logout"))));
		
	}
	
	public LandingPage gotoHome(){
	
		
		
		return new LandingPage();
		
	}
	
	public void findFriends(){
		
		
	}
	
}
