package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class First_Script {
	public static void main(String[]args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("---remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		//webdriver-interface
		//driver-refrence
		//chromedriver-class
		driver.manage().window().maximize(); //open window of chrome in full window
		driver.get("https://www.facebook.com/login.php");//open facebook page
		driver.navigate().to("https://www.amazon.in/");//to navigate other site
		String title=driver.getTitle();//for getting title of website
		System.out.println(title);
		driver.navigate().to("https://www.google.com") //change made for github
		//driver.getCurrenturl();
		System.out.println(driver.getCurrentUrl());
		driver.close();
		}

}//toolsqa.com for notes
