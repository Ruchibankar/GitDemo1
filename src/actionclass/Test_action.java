package actionclass;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Test_action {
	WebDriver driver;
	public void driveSetting2() {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("---remote-allow-origins=*");
		driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.facebook.com/");
		
		WebElement txtUsername=driver.findElement(By.id("email"));
		
		Actions builder=new Actions(driver);
	org.openqa.selenium.interactions.Action seriesOfAction=(org.openqa.selenium.interactions.Action) builder
			.moveToElement(txtUsername)
			.click()
			.keyDown(txtUsername,Keys.SHIFT)
			.sendKeys(txtUsername,"hello")
			.keyUp(txtUsername,Keys.SHIFT)
			.doubleClick(txtUsername)
			.contextClick()//for right click on page
			.build();
	
	seriesOfAction.perform();
       
}
	public static void main(String[]args) {
		 Test_action t=new  Test_action();
		 t.driveSetting2();
	}
}
