package Robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotAPIDemo {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D://SeleniumWebDriver//Seleinum2018//Drivers//geckodriver//geckodriver.exe");
		   WebDriver driver=new FirefoxDriver();
		   driver.get("https://spreadsheetpage.com/calendar/yearly/");
		   driver.findElement(By.linkText("Download this template for free")).click();
		   Robot robot=new Robot();
		   Thread.sleep(3000);
		   
		   /* down array
		    * 3 times tab
		    * Enter
		    * 
		    */
		   
		   robot.keyPress(KeyEvent.VK_DOWN); //press down arrow key
		   Thread.sleep(3000);
		   robot.keyPress(KeyEvent.VK_TAB); //Click Tab
		   Thread.sleep(3000);
		   robot.keyPress(KeyEvent.VK_TAB); //Click Tab
		   Thread.sleep(3000);
		   robot.keyPress(KeyEvent.VK_TAB); //Click Tab
		   Thread.sleep(3000);
		   robot.keyPress(KeyEvent.VK_ENTER); //Enter Key
		   
	}

}
