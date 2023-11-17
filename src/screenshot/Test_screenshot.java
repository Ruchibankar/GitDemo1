package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class Test_screenshot {
	WebDriver driver;
	public void driveSetting1() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("---remote-allow-origins=*");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	void screenshot() {
		driver.get("https://www.luminoex.com/");
		//typecasting two interfaces takescreenshots & webdriver
		File source=(File) ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File target=new File("D:\\Selenium\\Workspace\\selenium\\seleniumscreenshot\\luminoex.png");
		try {
			Files.copy(source, target);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[]args) {
		Test_screenshot s=new Test_screenshot();
		s.driveSetting1();
		s.screenshot();
	}
   
    	  
    	  
      }


