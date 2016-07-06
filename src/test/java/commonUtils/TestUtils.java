package commonUtils;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

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
	
	//Capturing the error screenshot	
	
	public static String mailscreenshotpath;
	public static void captureScreenshot(){
			
		Calendar cal = new GregorianCalendar();
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		int sec = cal.get(Calendar.SECOND);
		int min = cal.get(Calendar.MINUTE);
		int date = cal.get(Calendar.DATE);
		int day = cal.get(Calendar.HOUR_OF_DAY);
		
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    try {
	    	String mailscreenshotpath = System.getProperty("user.dir")+"\\screenshot\\"+year+"_"+date+"_"+(month+1)+"_"+day+"_"+min+"_" +sec+".jpeg";
			FileUtils.copyFile(scrFile, new File(mailscreenshotpath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	
	}
}
