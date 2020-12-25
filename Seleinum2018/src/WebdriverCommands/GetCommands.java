package WebdriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:/SeleniumWebDriver/Seleinum2018/Drivers/chrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		String text= driver.findElement(By.cssSelector("body:nth-child(2) div:nth-child(1) div:nth-child(1) div:nth-child(3) > span:nth-child(1)")).getText();
		System.out.println(text);
		//driver.close(); //close the current window
		driver.quit();//close the multiple windows
	}

}
