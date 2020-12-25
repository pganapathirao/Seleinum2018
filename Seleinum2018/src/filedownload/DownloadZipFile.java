package filedownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadZipFile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.gecko.driver", "D://SeleniumWebDriver//Seleinum2018//Drivers//geckodriver//geckodriver.exe");
	 
	    
	    //Creating browser profile
	    FirefoxProfile profile=new FirefoxProfile();
	    profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip"); //set MIME Types
	    profile.setPreference("browser.download.manager.showWhenStarting",false);
	    
	    FirefoxOptions option=new FirefoxOptions();
	    option.setProfile(profile);
	    WebDriver driver=new FirefoxDriver(option);
	    driver.get("https://testingmasters.com/student-corner/downloads/");
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")).click();
	    
	}

}
