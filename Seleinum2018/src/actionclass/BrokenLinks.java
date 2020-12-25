package actionclass;



import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D://SeleniumWebDriver//Seleinum2018//Drivers//chrome//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Implicit wait for 10 sec
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		
		//open the URL of the application
		driver.get("https://www.zlti.com/");
		//wait
		
		Thread.sleep(50000);
		
		//capture links from a webpage
	 List<WebElement > links=driver.findElements(By.tagName("a"));
	   //no of links
	   System.out.println(links.size());
	   for(int i=0;i<links.size();i++) {
		   
		   //by using href attribute we can get URL of required link
		   
		  WebElement element= links.get(i);
		  String url=element.getAttribute("href");
		  URL link=new URL(url);
		  
		  HttpURLConnection httpconn=(HttpURLConnection)link.openConnection();
		  Thread.sleep(2000);
		  //establish the connection
		  httpconn.connect();
		 int rescode= httpconn.getResponseCode();
		 if(rescode>=400) {
			 System.out.println(url +" broken link");
		 }
		 else
		 {
			 System.out.println(url +" is valid link");
		 }
	   }
	   
	   
	}

}
