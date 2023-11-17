package scollup_down;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scroll {
	WebDriver driver;
	public void driveSetting1() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("---remote-allow-origins=*");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	void scrolling()throws Exception{
		driver.get("https://www.facebook.com/");
		//page scroll down
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)","");
		Thread.sleep(3000);
		//page scroll up
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-100)","");
		
	}
	public static void main(String[]args) throws Exception {
		Scroll s=new Scroll();
		s.driveSetting1();
		s.scrolling();
	}
}
