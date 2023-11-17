package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class X_pathlocator {
	public static void main(String args[]) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("---remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		//open url
		driver.navigate().to("https://www.luminoex.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 11");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

}


