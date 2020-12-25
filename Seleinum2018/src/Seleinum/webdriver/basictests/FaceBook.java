package Seleinum.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBook {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D://SeleniumWebDriver//Seleinum2018//Drivers//geckodriver//geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.get("https://www.facebook.com/");
	    driver.findElement(By.name("email")).sendKeys("xxxxxxx");
	    driver.findElement(By.name("pass")).sendKeys("xxxxxxxx");
	    driver.findElement(By.name("login")).click();
	    
	    String expected="Facebook";
	    String actual=driver.getTitle();
	    System.out.println(driver.getTitle());
	    
	    if(expected.equalsIgnoreCase(actual)) {
	    	System.out.println("Test is passed");
	    }
	    else
	    {
	    	System.out.println("Test is failed");
	    }
	    
	    driver.close();
	}
	
	
}
