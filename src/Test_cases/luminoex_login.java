package Test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class luminoex_login {
	WebDriver driver;
	public void driveSetting1() {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("---remote-allow-origins=*");
		driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.luminoex.com/");
	}
	public void login() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("ruchibankar2010@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Ruchika@17");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	public static void main(String args[]) {
		luminoex_login p=new luminoex_login();
		p.driveSetting1();
		p.login();
	}

}
