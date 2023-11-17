package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Luminoex_TestNG {
	WebDriver driver;
	public void driveSetting2() {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("---remote-allow-origins=*");
		driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("http://www.luminoex.com/");
		
}
	public void login() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("rahulbankar123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("bankar@123");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		
	}
	
   public void logout() {
	   driver.findElement(By.linkText("Log out")).click();
	   
   }
   public void closebrowser() {
	   driver.close();
   }
	public static void main(String[]args) {
		Luminoex_TestNG t=new Luminoex_TestNG();
		t.driveSetting2();
		t.login();
		t.logout();
		t.closebrowser();
	}
	
}