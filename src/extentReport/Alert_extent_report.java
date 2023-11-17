package extentReport;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Alert_extent_report { //used to generate report
	WebDriver driver;
	ExtentHtmlReporter htmlreport;
	ExtentReports reports;
	ExtentTest logger;

	@Test(priority=1)
	public void driverSetting() {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("---remote-allow-origins=*");
		driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		String timestamp=new SimpleDateFormat("yyyy_dd_mm_hh_mm_ss").format(new Date());
		
		htmlreport=new ExtentHtmlReporter("C:\\selenium jar\\ExtentReport\\reports_"+timestamp+".html");
		
		reports=new ExtentReports();
		reports.attachReporter(htmlreport);
		
	  
	}
	  @Test(priority=2)
	  public void testAlert()throws InterruptedException{
		  String ExpectedResult="please enter a valid";
		  
		  logger=reports.createTest("Alert Test");
		  
		  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		  
		  logger.log(Status.INFO,"Navigate to website");
		  driver.findElement(By.name("proceed")).click();
		  
		  Alert alert=driver.switchTo().alert();
		  
		  logger.log(Status.INFO,"Alert created sucessfully");
		  String actResult=alert.getText();
		  alert.accept();
		  
		  logger.log(Status.INFO,"Alert accepted sucessfully");
		  
		  if(ExpectedResult.equals(actResult)) {
			  logger.log(Status.PASS,"text match");
		  }else {
			  logger.log(Status.FAIL,"text not match");
			  
		  }
	  }
	  @Test(priority=3)
	  void m1() {
		  reports.createTest("Alert Test");
		  reports.flush();
	  }
	  //emailable-reports.html
	  //index.html
	
}
