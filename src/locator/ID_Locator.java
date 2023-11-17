package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ID_Locator {
	public static void main(String[]args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("---remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("9112618750");
		driver.findElement(By.id("pass")).sendKeys("rahulsadhana");
	}
	

}
