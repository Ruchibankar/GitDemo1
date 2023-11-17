package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert_handling3 {
	WebDriver driver;
	public void driveSetting4() {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("---remote-allow-origins=*");
		driver=new ChromeDriver(co);
		driver.manage().window().maximize();
	}
	void alert()throws Exception{
    	driver.get("https://demoqa.com/alerts");
    	driver.findElement(By.xpath("//button[@id='promtButton']")).click();
    	Thread.sleep(2000);
    	
    	//creating alert class object
    	Alert alert=driver.switchTo().alert();
    	String alertText=alert.getText();
    	System.out.println(alertText);
    	
    	alert.sendKeys("Hello");
    	alert.accept(); //for click ok button
    	
   
	}
	public static void main(String[]args) throws Exception {
		Alert_handling3 f=new Alert_handling3 ();
		f.driveSetting4();
		f.alert();
	}
}


