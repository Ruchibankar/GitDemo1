package vtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Amazon_login {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ruchika\\.cache\\selenium\\chromedriver\\win32\\117.0.5938.89\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("---remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
        driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://digischoolglobal.com/");
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.name("email")).sendKeys("ruchikabankar1717@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Ruchika@17");
		//driver.findElement(By.linkText("Login")).click();
		//driver.findElement(By.xpath("//div[starts-with(text(),'Login')]"));
		//driver.findElement(By.cssSelector("button.mt-4.btn-black.registerbutton.btn.bt-lg.btn-block")).click();
		driver.findElement(By.xpath("//button[@class='mt-4 btn-black registerbutton btn  bt-lg btn-block ']")).click();
		
		
	}
}