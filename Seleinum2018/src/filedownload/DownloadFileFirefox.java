package filedownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadFileFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D://SeleniumWebDriver//Seleinum2018//Drivers//geckodriver//geckodriver.exe");
	 
	    
	    //Creating browser profile
	    FirefoxProfile profile=new FirefoxProfile();
	    profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/plain"); //set MIME Types
	    profile.setPreference("browser.download.manager.showWhenStarting",false);
	    
	    FirefoxOptions option=new FirefoxOptions();
	    option.setProfile(profile);
	    WebDriver driver=new FirefoxDriver(option);
	    
	    driver.get("http://demo.automationtesting.in/FileDownload.html");
		driver.findElement(By.id("textbox")).sendKeys("This is the file download");
		driver.findElement(By.id("createTxt")).click(); //generate text file
		driver.findElement(By.id("link-to-download")).click(); //display download link
	}

}
