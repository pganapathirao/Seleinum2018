package WebdriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CondiationalCommands2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D://SeleniumWebDriver//Seleinum2018//Drivers//geckodriver//geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.get("https://materializecss.com/radio-buttons.html");
	    System.out.println(driver.findElement(By.cssSelector("div.container div.row div.col.s12.m8.offset-m1.xl7.offset-xl1:nth-child(1) div.section.scrollspy:nth-child(1) form:nth-child(3) p:nth-child(2) label:nth-child(1) > span:nth-child(2)")).isSelected());
	    
	    if(driver.findElement(By.cssSelector("div.container div.row div.col.s12.m8.offset-m1.xl7.offset-xl1:nth-child(1) div.section.scrollspy:nth-child(1) form:nth-child(3) p:nth-child(2) label:nth-child(1) > span:nth-child(2)")).isSelected() ==false)
	    {
	    	driver.findElement(By.cssSelector("div.container div.row div.col.s12.m8.offset-m1.xl7.offset-xl1:nth-child(1) div.section.scrollspy:nth-child(1) form:nth-child(3) p:nth-child(2) label:nth-child(1) > span:nth-child(2)")).click();
		    
	    }
	   
	
	
	}

}
