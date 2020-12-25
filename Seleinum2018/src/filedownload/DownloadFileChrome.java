package filedownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFileChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D://SeleniumWebDriver//Seleinum2018//Drivers//chrome//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		driver.findElement(By.id("textbox")).sendKeys("This is the file download");
		driver.findElement(By.id("createTxt")).click(); //generate text file
		driver.findElement(By.id("link-to-download")).click(); //display download link
		//driver.quit();
		
		driver.findElement(By.id("pdfbox")).sendKeys("PDF FILE DOWNLOAD");
		driver.findElement(By.id("pdf-link-to-download")).click();
		driver.findElement(By.id("pdf-link-to-download")).click();
		
		
		
	}

}
