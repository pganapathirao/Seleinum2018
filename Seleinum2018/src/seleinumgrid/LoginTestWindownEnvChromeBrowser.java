package seleinumgrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class LoginTestWindownEnvChromeBrowser {

	WebDriver driver;
	@Test(priority=1)
	void setup() throws MalformedURLException {
		
		String nodeURL="http://192.168.0.100:7160/wd/hub";
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN10);
		System.setProperty("webdriver.chrome.driver", "D://SeleniumJarFiles//chromedriver_win32//chromedriver.exe");
	    driver=new RemoteWebDriver(new URL(nodeURL),cap);
	    
	  
	}
	
	@Test(priority=2)
	void login() {
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		if(driver.getTitle()=="OrangeHRM") {
			System.out.println("Test is passed");
		}
		else
		{
			System.out.println("Test is failed");
		}
		
		driver.close();
	}
}
