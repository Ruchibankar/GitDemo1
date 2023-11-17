package testNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestSuite {
	@BeforeSuite
	
	public void openBrowser() {
		System.out.println("browser is opened");
	}
	
	@Test(priority=2)
	public void enterUrl1() {
		System.out.println("url is opened");
	}
	
	@AfterSuite
    public void closeBrowser() {
		System.out.println("browser is closed");
	}
	
	@Test(priority=1)
	public void enterUrl2() {
		System.out.println("url2 is opened");
	}
	
	
}
