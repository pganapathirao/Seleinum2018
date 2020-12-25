package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D://SeleniumWebDriver//Seleinum2018//Drivers//chrome//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		Actions act=new Actions(driver);
		WebElement admin=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/b[1]"));
		WebElement usermg=driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));
		WebElement users=driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));
		
		act.moveToElement(admin).build().perform();//mouse over
		act.moveToElement(usermg).build().perform();
		act.moveToElement(users).click().build().perform();//mouse over to users and click on the users
	    
		//redusing the code above 3 statements
		
		//act.moveToElement(admin).moveToElement(usermg).moveToElement(users).click().build().perform();
	
	}

}
