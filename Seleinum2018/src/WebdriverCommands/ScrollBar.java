package WebdriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollBar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D://SeleniumWebDriver//Seleinum2018//Drivers//geckodriver//geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
	    
	    JavascriptExecutor js= (JavascriptExecutor)driver;
	    
	    //1. Scrolling by using pixel
	    
	    //js.executeScript("window.scrollBy(0,1000)", "");
	    
	    //2. scrooling page till we find element
	  // WebElement flag =driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/table[1]/tbody[1]/tr[86]/td[1]/img[1]"));
	    
	   // js.executeScript("arguments[0].scrollIntoView();", flag);
	    
	    //3. Scroll page till bottom
	    
	    js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	    
	}

}
