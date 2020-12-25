package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://SeleniumWebDriver//Seleinum2018//Drivers//chrome//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement source=driver.findElement(By.id("box3"));
		WebElement dest= driver.findElement(By.id("box103"));
		
		Actions act=new Actions(driver);
		
		//act.clickAndHold(source).moveToElement(dest).release().build().perform();
		
		//single statement
		act.dragAndDrop(source, dest).build().perform();
		
	}

}
