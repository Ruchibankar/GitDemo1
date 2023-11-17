package actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {
	WebDriver driver;
	public void driveSetting2() {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("---remote-allow-origins=*");
		driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/buttons");
		
		//Instantiate Action class
		Actions actions=new Actions(driver);
		
		//retrieve WebElements to perform right click
		WebElement doubleclick=driver.findElement(By.id("doubleClickBtn"));
		Actions action=new Actions(driver);
		action.contextClick(doubleclick).build().perform();
	
		
		//retrieve WebElements to perform double click
		/*WebElement rightclk=driver.findElement(By.id("rightClickBtn"));
		action.contextClick(rightclk).build().perform();
				*/
	}
	
	public static void main(String args[]) {
		Doubleclick p=new Doubleclick();
		p.driveSetting2();
		
	}

}
