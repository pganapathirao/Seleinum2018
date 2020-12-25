package headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D://SeleniumWebDriver//Seleinum2018//Drivers//geckodriver//geckodriver.exe");
		FirefoxOptions options=new FirefoxOptions();
		options.setHeadless(true);
		WebDriver driver=new FirefoxDriver(options);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getTitle());
		driver.close();
	}

}
