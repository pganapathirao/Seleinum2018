package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	By username=By.id("txtUsername");
	By password=By.id("txtPassword");
	By loginbtn=By.id("btnLogin");
	
	LoginPage(WebDriver d){
		
		driver=d;
	}
	
	public void uname(String name) {
		driver.findElement(username).sendKeys(name);
	}
	
	public void pwrd(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void LoginClick() {
		driver.findElement(loginbtn).click();
	}
	
}
