package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import base.Page;
import commonUtils.TestUtils;

public class CustomListener implements ITestListener{
	
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}
 
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {
		
		Page.log.debug("Test Failed...!!!"); //re-directing the failure message in log.
				
		TestUtils.captureScreenshot(); //Calling the capture screenshot method from TestUtils class.
		
		System.setProperty("org.uncommons.reportng.escape-output", "false");
        
		   Reporter.log("<a  target='_blank' href=' TestUtils.mailscreenshotpath ' >screenshot</a><br><br>");
		     
		   String pathToScreen = TestUtils.mailscreenshotpath;
	        String path = ("<a  target='_blank' href='" + TestUtils.mailscreenshotpath + "' ><img height=200, width=200, src=\"file://" + pathToScreen + "\" alt=\"\"/></img></a>");
	        Reporter.log(path);
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
