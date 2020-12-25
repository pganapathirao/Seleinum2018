package UploadandDownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		// TODO Auto-generated method stub

		//Download the sikuli jar file
		//https://launchpad.net/sikuli/+milestone/2.0.3
		
		System.setProperty("webdriver.chrome.driver", "D://SeleniumWebDriver//Seleinum2018//Drivers//chrome//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[3]/div[2]/input[1]")).click();
		String imagesFilePath="D:\\SeleniumWebDriver\\Seleinum2018\\";
		String inputFilePath="D:\\SeleniumWebDriver\\Seleinum2018\\";
		
		Screen s=new Screen();
		Pattern fileinputTextbox=new Pattern(imagesFilePath+"1.PNG");
		Pattern openbutton=new Pattern(imagesFilePath+"2.PNG");
		
		Thread.sleep(5000);
		
		s.wait(fileinputTextbox, 20);
		s.type(fileinputTextbox,inputFilePath+"MyPhoto.jpg");
		s.click(openbutton);
		
		
	}
	

}
