package AshotAPI;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class CompareImage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D://SeleniumWebDriver//Seleinum2018//Drivers//geckodriver//geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    BufferedImage expectedImage= ImageIO.read(new File("D://SeleniumJarFiles//ImageCompareJars/OrangeHRMlogo.png"));
	    
	    WebElement logoImageElement=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/img[1]"));
	    Screenshot logoImageScreenshot=new AShot().takeScreenshot(driver, logoImageElement);
	    
	    BufferedImage actualImage=logoImageScreenshot.getImage();
	    
	    ImageDiffer imgdiff=new ImageDiffer();
	    ImageDiff diff=imgdiff.makeDiff(expectedImage, actualImage);
	    
	    if(diff.hasDiff()==true) //this will compare 2 images
	    {
	    	
	    	System.out.println("Images are not same");
	    }
	    
	    else
	    {
	    	System.out.println("Images are same");
	    }
	    
	    driver.quit();
	}

}
