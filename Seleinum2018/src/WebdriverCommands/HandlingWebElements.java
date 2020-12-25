package WebdriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingWebElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D://SeleniumWebDriver//Seleinum2018//Drivers//chrome//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://testautomationpractice.blogspot.com/");
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("ABC");
		driver.findElement(By.id("RESULT_TextField-2")).sendKeys("abc");
		driver.findElement(By.id("RESULT_TextField-3")).sendKeys("abc");
		driver.findElement(By.id("RESULT_TextField-4")).sendKeys("abc");
		driver.findElement(By.id("RESULT_TextField-5")).sendKeys("abc");
		driver.findElement(By.id("RESULT_TextField-6")).sendKeys("abc");
	    //raido button selection
		System.out.println(driver.findElement(By.id("RESULT_RadioButton-7_0")).isSelected());
		driver.findElement(By.id("RESULT_RadioButton-7_0")).click();
		
		driver.findElement(By.id("RESULT_CheckBox-8_0")).click();
		WebElement drptime=driver.findElement(By.id("RESULT_RadioButton-9"));
		Select time=new Select(drptime);
		time.selectByIndex(2);
		System.out.println(time.getOptions().size()); //number items present in the dropdown
		driver.findElement(By.linkText("Software Testing Tutorials")).click();
		driver.navigate().back();
		driver.findElement(By.id("FSsubmit")).click();
		
		if(driver.getTitle()=="Sucessful Submission | Formsite") {
			System.out.println("My test is passed");
		}
		
		else
		{
			System.out.println("My test is failed");
		}
		
	}

}
