package WebdriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CondiationalCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D://SeleniumWebDriver//Seleinum2018//Drivers//geckodriver//geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    WebElement username=driver.findElement(By.xpath("//input[@id='txtUsername']"));
	    WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
	    
	    if(username.isDisplayed() && username.isEnabled() ) {
	    	
	    	username.sendKeys("Admin");
	    }
	    
		if(password.isDisplayed() && password.isEnabled() ) {
			password.sendKeys("admin123");
		}
	}

}
