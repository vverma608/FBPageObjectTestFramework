package pages;

import org.openqa.selenium.By;

import base.Page;

public class LandingPage extends Page{
	
	
	public MyProfilePage gotoProfile(){
				
		driver.findElement(By.xpath(OR.getProperty("myprofile"))).click();
	
		return new MyProfilePage();	
	}
	
	public void editProfile(){
		driver.findElement(By.xpath(OR.getProperty("edit_profile"))).click();
		
	}
	
	public void addNewPost(){
		
		
	}

}

