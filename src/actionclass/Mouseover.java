package actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {
	WebDriver driver;
	public void driveSetting1() {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("---remote-allow-origins=*");
		driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.luminoex.com/");
	}
	void mouseover1() {
		WebElement mobile=driver.findElement(By.linkText("Mobiles"));
		Actions action=new Actions(driver);//creating object of action class
		action.moveToElement(mobile).build().perform();
		
		//mouse overing on sports
		WebElement hnk=driver.findElement(By.linkText("Home & Kitchen"));
		action.moveToElement(hnk).build().perform();
		
		//
		WebElement beauty=driver.findElement(By.linkText("Beauty"));
		action.moveToElement(beauty).build().perform();
	}
	public static void main(String args[]) {
		 Mouseover m=new  Mouseover ();
		 m.driveSetting1();
		 m.mouseover1();
		
	}

}
