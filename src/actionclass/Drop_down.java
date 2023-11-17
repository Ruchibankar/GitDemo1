package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;



public class Drop_down {
		WebDriver driver;
		void driverSetting() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("---remote-allow-origins=*");
	    driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		
		}  	
		
			void dropDowm()throws Exception{
			
			driver.get("https://www.facebook.com/");
			driver.findElement(By.id("email")).sendKeys("9112618750");
			driver.findElement(By.id("pass")).sendKeys("rahulsadhana");
			driver.findElement(By.linkText("Create new account")).click();
			Thread.sleep(2000);
	        driver.findElement(By.name("firstname")).sendKeys("Ruchika");
			driver.findElement(By.name("lastname")).sendKeys("Bankar");
			driver.findElement(By.name("reg_email__")).sendKeys("ruchikabankar1717@gmail.com");
			driver.findElement(By.name("reg_email_confirmation__")).sendKeys("ruchikabankar1717@gmail.com");
			driver.findElement(By.name("reg_passwd__")).sendKeys("sadhana11");
	        driver.findElement(By.xpath("//input[@value='1']")).click();
	        
	        //webelement 
	  
	        
	        //for selecting day from dropdown
	        WebElement day=driver.findElement(By.name("birthday_day"));
	        Thread.sleep(2000);
	        Select select1=new Select(day);
	        select1.selectByValue("25");
	        
	        WebElement month=driver.findElement(By.name("birthday_month"));
	        Thread.sleep(2000);
	        Select select2=new Select(month);
	        select2.selectByValue("6");
	        
	        WebElement year=driver.findElement(By.name("birthday_year"));
	        Thread.sleep(2000);
	        Select select3=new Select(year);
	        select3.selectByValue("2022");
			}   
	        public static void main(String[]args)throws Exception{
	        	Drop_down f=new Drop_down();
	        	f.driverSetting();
	        	f.dropDowm();
	        	
	        	
	   
	        }  
	        //chromedriver is a child class of webdriver
	        //webdriver is a parentclass predefined class in selenium
	        
			}








