package commonUtils;

import org.openqa.selenium.By;

import base.Page;

public class TestUtils extends Page {
	
	//Defining a function to validate the existence of a webElement;
	public boolean isElementPresent(String xpath){
		
		try {
			
			driver.findElement(By.xpath(xpath));
			return true;
			
		}catch(Throwable t){
			
			return false;
		}
	}	
	

}
