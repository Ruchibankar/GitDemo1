package actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_click {
	WebDriver driver;
	public void driveSetting2() {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("---remote-allow-origins=*");
		driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.flipkart.com/");

}
	
	void rightclickmethod() {
		Actions action=new Actions(driver);
		WebElement rightclk=driver.findElement(By.xpath("//img[@alt='Grocery']"));
		action.contextClick(rightclk).build().perform();
	}
	
	void doubleclickmethod() {
		Actions action=new Actions(driver);
		WebElement doubleclk=driver.findElement(By.xpath("//img[@alt='Appliances']"));
		action.doubleClick(doubleclk).build().perform();
		
	}
	public static void main(String args[]) {
		Flipkart_click f=new Flipkart_click();
		f.driveSetting2();
		f.rightclickmethod();
	    f.doubleclickmethod();
		
	}
}