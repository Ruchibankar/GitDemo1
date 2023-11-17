package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Luminox_register {
	public static void main(String[]args){
		ChromeOptions options=new ChromeOptions();
		options.addArguments("---remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://www.luminoex.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Ruchika");
		driver.findElement(By.id("LastName")).sendKeys("Bankar");
		driver.findElement(By.id("Email")).sendKeys("rahulbankar123@gmail.com");
		driver.findElement(By.id("Company")).sendKeys("infosys");
		driver.findElement(By.id("Password")).sendKeys("bankar@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("bankar@123");
		driver.findElement(By.id("register-button")).click();
        }
}
