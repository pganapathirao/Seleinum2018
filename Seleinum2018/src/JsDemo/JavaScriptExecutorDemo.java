package JsDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D://SeleniumWebDriver//Seleinum2018//Drivers//geckodriver//geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.get("https://www.twoplugs.com/");
	    driver.manage().window().maximize();
	    WebElement joinfree=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/ul[1]/li[2]/a[1]/span[1]"));
	    
	    //Flashing
	   // JavaScriptUtil.flash(joinfree, driver);
	    //Drawing Boarder && screenshot
	    JavaScriptUtil.drawBoarder(joinfree, driver);
	    File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    File trg= new File("c://screenshot/twoplugs.png");
	    FileUtils.copyFile(src,trg);
	    
	    //Capture of the titile of the page
	    //System.out.println(driver.getTitle());
	    
	    String title=JavaScriptUtil.getTitleByJS(driver);
	    System.out.println(title);
	    
	    //Clicking on Element
	    WebElement loginbtn=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/ul[1]/li[1]/a[1]/span[1]"));
	    //loginbtn.click();
	    JavaScriptUtil.clickElementByJS(loginbtn, driver);
	    //Generation of Alert run time
	   
	    // JavaScriptUtil.generateAlert(driver, "You clicked on login button"); 
	    
	    //Refreshing page
	    //driver.navigate().refresh();
	    JavaScriptUtil.refreshBrowserByJS(driver); 
	   
	}

}
