package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG1 {
	@BeforeMethod
	public void openBrowser() {
		System.out.println("browser is opened");
		
	}
	
	@Test
	public void enterUrl() {
		System.out.println("url is opened");
	}

	@AfterMethod
	public void closeBrowser() {
		System.out.println("browser is closed");
		
	}
	
	@Test
	public void enterUrl2() {
		System.out.println("url2 is opened");
		
	}

	@Test
	public void enterUrl3() {
		System.out.println("url3 is opened");  //changes made for github

	}
	
}
