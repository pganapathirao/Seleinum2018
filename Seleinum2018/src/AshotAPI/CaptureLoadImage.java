package AshotAPI;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;



public class CaptureLoadImage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D://SeleniumWebDriver//Seleinum2018//Drivers//geckodriver//geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    WebElement logoImageElement=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/img[1]"));
	    
	   Screenshot logoImageScreenshot=new AShot().takeScreenshot(driver, logoImageElement);
	   ImageIO.write(logoImageScreenshot.getImage(), "png", new File("d://SeleniumJarFiles/ImageCompareJars/OrangeHRMlogo.png"));
	   
	   File f=new File("d://SeleniumJarFiles/ImageCompareJars/OrangeHRMlogo.png");
	   
	   if(f.exists()) {
		   System.out.println("Image file captured");
	   }
	   
	   else
	   {
		   System.out.println("Image file captured");
	   }

	}

}
