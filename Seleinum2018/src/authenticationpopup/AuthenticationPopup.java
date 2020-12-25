package authenticationpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D://SeleniumWebDriver//Seleinum2018//Drivers//chrome//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("http://the-internet.herokuapp.com/basic_auth");
		
		//http://username:password@test.com 
		//Handing authentication popup
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		String text=driver.findElement(By.tagName("p")).getText();
		System.out.println(text);
		
	}

}
