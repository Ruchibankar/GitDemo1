package pratice_program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Make_my_trip {
	WebDriver driver;
	public void driveSetting2() {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("---remote-allow-origins=*");
		driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
        driver.findElement(By.xpath("//a[@class='makeFlex hrtlCenter column active']")).click();	
	}
        
        public void bookflight(){
        	WebElement fromtext=driver.findElement(By.id("fromCity"));
        
        	
        	Actions builder=new Actions(driver);
        	org.openqa.selenium.interactions.Action seriesOfAction=(org.openqa.selenium.interactions.Action) builder
        			.moveToElement(fromtext)
        			.click()
        			.keyDown(fromtext,Keys.ARROW_DOWN)
                   
        			.sendKeys(fromtext,"Pune India")
        			.sendKeys(Keys.ARROW_DOWN)
        			.sendKeys(Keys.ENTER)
        			.build();
        	
        	   
        	
        	seriesOfAction.perform();
        	
   
    }

	public static void main(String args[]) {
		Make_my_trip t=new Make_my_trip();
		t.driveSetting2();
		t.bookflight();
		
	}


}
