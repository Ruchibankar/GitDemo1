package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert_handling {
	WebDriver driver;
	public void driveSetting1() {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("---remote-allow-origins=*");
		driver=new ChromeDriver(co);
		driver.manage().window().maximize();
	}
	
    void alert()throws Exception{
    	driver.get("https://www.luminoex.com/");
    	driver.findElement(By.xpath("//input[@value='Search']")).click();
    	Thread.sleep(2000);
    	
    	//creating alert class object
    	Alert alert=driver.switchTo().alert();
    	String alertText=alert.getText();
    	System.out.println(alertText);
    	
    }
    
    public static void main(String[]args) throws Exception {
    	Alert_handling a=new Alert_handling();
    	a.driveSetting1();
    	a.alert();
    }
}

//demoqa.com/alerts hw
