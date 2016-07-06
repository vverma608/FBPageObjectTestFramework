package pages;

import org.openqa.selenium.By;

import base.Page;

public class HomePage extends Page {
	
	//FB login case
	public LandingPage doLogin(String username, String password){
		
		driver.findElement(By.xpath(OR.getProperty("username"))).sendKeys("seltest645@gmail.com");
		driver.findElement(By.xpath(OR.getProperty("password"))).sendKeys("test1234@");
		driver.findElement(By.xpath(OR.getProperty("login"))).click();
		
		return new LandingPage();
	
	}
	
	public void createAccount(){
		
		
	}
}
