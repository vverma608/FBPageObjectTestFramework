package pages;

import org.openqa.selenium.By;

import base.Page;

public class MyProfilePage extends Page {

		
	public MyProfilePage gotoFriends(){
		
		driver.findElement(By.partialLinkText("Friends")).click();
		
		return this;
	}
	
	public void gotoPhotos(){
		
		driver.findElement(By.partialLinkText("Photos")).click();
		
	}
	
	public void updateInfo(){
	
		driver.findElement(By.xpath(".//*[@id='pagelet_timeline_profile_actions']/a")).click();
		
		
	}

}

