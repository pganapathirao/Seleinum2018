package WebdriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertwithOkCancelButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://SeleniumWebDriver//Seleinum2018//Drivers//chrome//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		//Alert with Okay Cancel button
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
		
		//Click the button to display a confirm box
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]")).click();
	
		String ExpTextOK="You pressed Ok";
		String ExpTextCancel="You Pressed Cancel";
		
		driver.switchTo().alert().accept();
		String ActText=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/p[1]")).getText();
		
		if(ExpTextOK.equals(ActText)==true) {
			System.out.println("Test passed");
		}
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]")).click();
		driver.switchTo().alert().dismiss();
		String ActText1=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/p[1]")).getText();
		
		if(ExpTextCancel.equals(ActText1)==true) {
			System.out.println("Test canceled");
		}
		
		driver.close();
		
	}

}
