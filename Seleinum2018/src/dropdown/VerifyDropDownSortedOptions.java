package dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyDropDownSortedOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D://SeleniumWebDriver//Seleinum2018//Drivers//chrome//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://testautomationpractice.blogspot.com/");
		
		WebElement element=driver.findElement(By.id("animals"));
		Select se=new Select(element);
		List originalList=new ArrayList();
		List tempList=new ArrayList();
		List <WebElement>options=se.getOptions();
		
		for(WebElement e:options)
		{
			originalList.add(e.getText());
			tempList.add(e.getText());
		}
		
		System.out.println("Before sorting original list"+originalList);
		System.out.println("before sorting templist"+tempList);
		
		Collections.sort(tempList);
		System.out.println("After sorting original list"+originalList);
		System.out.println("After sorting"+tempList);
		
		if(originalList==tempList) {
			System.out.println("Dropdown is sorted");
		}
		else
		{
			System.out.println("Dropdown is not sorted");
		}
		driver.close();
	}
	

}
