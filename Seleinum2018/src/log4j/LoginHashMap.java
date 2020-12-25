package log4j;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginHashMap {

	static HashMap <String,String> logindata(){
		HashMap <String,String> hm=new HashMap <String,String>();
		hm.put("Admin", "admin123");
		hm.put("y", "mercury1");
		hm.put("z", "mercury2");
		
		return hm;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D://SeleniumWebDriver//Seleinum2018//Drivers//geckodriver//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		logindata();
		
	}

}
