package Seleinum.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {

	public static void main(String[] args) {
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver","D://SeleniumWebDriver//Seleinum2018//Drivers//geckodriver//geckodriver.exe");
		
		//FirefoxDriver driver=new FirefoxDriver();
		WebDriver driver= new FirefoxDriver(); //invoke the browser
		driver.get("https://opensource-demo.orangehrmlive.com/");// open the URL
		//driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.manage().window().maximize();//maximize the browser window
	
        WebElement username= driver.findElement(By.name("txtUsername"));	
        username.sendKeys("Admin");
        
        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
        driver.findElement(By.name("Submit")).click();
        
        String exptitle="OrangeHRM";
        String actual=driver.getTitle(); //Returns the title of the page
        
        if(exptitle.equalsIgnoreCase(actual))
        {
        	System.out.println("Test is passed");
        }
        
        else
        {
        	System.out.println("Test is failed");
        }

        driver.close(); //close the browser
        
	}

}
