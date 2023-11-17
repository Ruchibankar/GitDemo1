package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook_login {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ruchika\\.cache\\selenium\\chromedriver\\win32\\117.0.5938.89\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("---remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Ruchika");
		driver.findElement(By.name("lastname")).sendKeys("Bankar");
        driver.findElement(By.name("reg_email__")).sendKeys("9112618750");
        driver.findElement(By.id("password_step_input")).sendKeys("Ruchika@17");
        driver.findElement(By.linkText("Female")).click();
  }
}
