package Cookie;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CookieTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D://SeleniumWebDriver//Seleinum2018//Drivers//geckodriver//geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		Set <Cookie> cookies=driver.manage().getCookies(); //capture all the cookies in the browser
	
		System.out.println("Size of the cookies"+cookies.size()); //print the size of the cookie
		
		/*for(Cookie cookie:cookies) {
			System.out.println(cookie.getName() +" : "+cookie.getValue());
		}
		*/
		
		//Print Specific according to the name
		//System.out.println(driver.manage().getCookieNamed("session-id-time"));
		
		//add new cookie to the browser
		Cookie cobj=new Cookie("mycookie1234","1234567890");
		driver.manage().addCookie(cobj);
		
		System.out.println("Size of the cookies"+cookies.size()); //print the size of the cookie
		
		for(Cookie cookie:cookies) {
			System.out.println(cookie.getName() +" : "+cookie.getValue());
		}
		
		//delete the cookie
		driver.manage().deleteCookie(cobj);
		driver.manage().getCookies();
		System.out.println("Size of the cookies"+cookies.size());
		
		for(Cookie cookie:cookies) {
			System.out.println(cookie.getName() +" : "+cookie.getValue());
		}
		
		
		//Dlete all 
		driver.manage().deleteAllCookies();
		System.out.println("Size of the cookies"+cookies.size());
		driver.quit();
	}

}
