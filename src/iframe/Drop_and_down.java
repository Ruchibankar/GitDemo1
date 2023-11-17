package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Drop_and_down {
	WebDriver driver;
	public void driveSetting2() {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("---remote-allow-origins=*");
		driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);

		//or -To handle frame
		//WebElement iframe=driver.findElement(By.className("demo-frame"));
		//driver.switchTo().frame(iframe);
		
		WebElement sourceElement=driver.findElement(By.id("draggable"));
		
		WebElement targetElement=driver.findElement(By.id("droppable"));
		
	
		Actions action=new Actions(driver);
		action.dragAndDrop(sourceElement, targetElement).build().perform();
		
		
		//action.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();
		
}
	public static void main(String args[]) {
		Drop_and_down d=new Drop_and_down();
		d.driveSetting2();
		
		
	}

}
