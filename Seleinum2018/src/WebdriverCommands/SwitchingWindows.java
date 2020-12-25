package WebdriverCommands;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://SeleniumWebDriver//Seleinum2018//Drivers//chrome//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/button[1]")).click();
		//System.out.println(driver.getTitle());
		Set <String>s=driver.getWindowHandles();
		for(String i:s) {
		
			String title=driver.switchTo().window(i).getTitle();
			if(title.contains("SeleniumHQ Browser Automation"))
			{
				driver.close();
			}
		}
	}

}
