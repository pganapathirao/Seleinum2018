package PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegistrationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D://SeleniumWebDriver//Seleinum2018//Drivers//geckodriver//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		//LoginPage loginpage=new LoginPage(driver);
		LoginPage2 loginpage=new LoginPage2(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		loginpage.uname("Admin");
		loginpage.pwrd("admin123");
		loginpage.LoginClick();
		
		if(driver.getPageSource().contains("OrangeHRM")) {
			System.out.println("Test is passed");
		}
		else
		{
			System.out.println("Test is failed");
		}
		
		driver.quit();
	}

	
}
