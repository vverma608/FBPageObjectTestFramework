package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeSuite;




public class Page {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static TopNavigation topNav;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static Properties OR = new Properties();
	public static Properties Config = new Properties();
	public static FileInputStream fis;
	
	//Defining the constructor of page class.
	public Page(){
		
		if(driver==null){
		driver = new FirefoxDriver();
		log.debug("Firefox browser launched!!!");
		driver.get("http://facebook.com");
		topNav = new TopNavigation(); 
		wait = new WebDriverWait(driver, 10L);
		
		}
		
	
	}

	@BeforeSuite
	public void setUp(){
		
	//Loading the config file.
		
		try {
			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\Config.properties");
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}

		try {
			Config.load(fis);
			log.debug("Config file has been loaded!");
			
		} catch (IOException e) {
			log.debug("Couln't load the Config file...!!!");
			e.printStackTrace();
		}
		
	//Loading the OR file.
		
		try {
			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.properties");
						
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			OR.load(fis);
			log.debug("Object refrence file has been loaded!");
		
		} catch (IOException e) {
			log.debug("Couln't load the Object refrence file...!!!");
			e.printStackTrace();
		}
		
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		
	}
		
	
	
	@AfterSuite
	public void tearDown(){
		
		driver.quit();
		log.debug("Quitting the driver, The test suite execution is over...!!!");
	}

}
