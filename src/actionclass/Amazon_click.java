package actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Amazon_click {
	WebDriver driver;
	public void driveSetting2() {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("---remote-allow-origins=*");
		driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com/");
		
}
	void mouseover3() {
		WebElement mouseovr=driver.findElement(By.linkText("Today's Deals"));
		Actions action=new Actions(driver);
		action.moveToElement(mouseovr).build().perform();
		
	}
	
	void doubleclickmethod() {
		WebElement doubleclick=driver.findElement(By.linkText("Customer Service"));
		Actions action=new Actions(driver);
		action.doubleClick(doubleclick).build().perform();
		
	}
	
	void rightclickmethod() {
		WebElement rightclick=driver.findElement(By.linkText("Registry"));
		Actions action=new Actions(driver);
		action.contextClick(rightclick).build().perform();
		
	}
	public static void main(String args[]) {
		Amazon_click a=new Amazon_click ();
		a.driveSetting2();
		a.mouseover3();
		a.doubleclickmethod();
		a.rightclickmethod();
	}
}
