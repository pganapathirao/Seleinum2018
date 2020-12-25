package log4j;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.seleniumhq.jetty9.util.log.Logger;
import org.w3c.dom.DOMConfiguration;

public class Log4jexample {

	public static void main(String[] args) {
		
		//public static Logger logger = Logger.getLogger(Log4jexample.class);
		//PropertyConfiguration.configure("Log4j.properties");

		
		System.setProperty("webdriver.gecko.driver", "D://SeleniumWebDriver//Seleinum2018//Drivers//geckodriver//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");// open the URL
		//logger.info("Open the URL");
		//driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.manage().window().maximize();//maximize the browser window
	
        WebElement username= driver.findElement(By.name("txtUsername"));	
        username.sendKeys("Admin");
        //logger.info("Enter the user name");
        
        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
       // logger.info("Enter the password");
        driver.findElement(By.name("Submit")).click();
	}

}
