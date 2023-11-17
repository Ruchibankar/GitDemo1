package Test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class luminoex_registration {
	WebDriver driver;
	public void driveSetting() {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("---remote-allow-origins=*");
		driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.luminoex.com/");
	}
		public void register() {
			driver.findElement(By.linkText("Register")).click();
			driver.findElement(By.id("gender-female")).click();
			driver.findElement(By.id("FirstName")).sendKeys("Ruchika");
			driver.findElement(By.id("LastName")).sendKeys("Bankar");
			driver.findElement(By.id("Email")).sendKeys("ruchibankar2010@gmail.com");
			driver.findElement(By.id("Company")).sendKeys("infosys");
			driver.findElement(By.id("Password")).sendKeys("Ruchika@17");
			driver.findElement(By.id("ConfirmPassword")).sendKeys("Ruchika@17");
			driver.findElement(By.id("register-button")).click();
		}
		public static void main(String args[]) {
			luminoex_registration a=new luminoex_registration();
			a.driveSetting();
			a.register();
		}
	}



