package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {
	WebDriver driver;
	public void driveSetting1() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("---remote-allow-origins=*");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
    void testexplicitw8() {
    	driver.get("https://www.luminoex.com/");
    	WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Emailcc"))).sendKeys("abc@gmail.com");
    	
    }
    public static void main(String[]args) {
    	Explicit_Wait e=new Explicit_Wait();
    	e.driveSetting1();
    	e.testexplicitw8();
    }
}
