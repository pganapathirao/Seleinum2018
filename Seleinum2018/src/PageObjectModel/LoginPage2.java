package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {

	WebDriver driver;
	
	@FindBy(how=How.ID,using="txtUsername")
	WebElement username;
	
	//syntax2
	
	/*@FindBy(name="txtUsername");
	  WebElement username;*/
	
	
	@FindBy(how=How.ID,using ="txtPassword")
	WebElement passwrd;
	
	@FindBy(how=How.ID,using="btnLogin")
    WebElement loginbtn;
	
    LoginPage2(WebDriver d){
    	driver =d;
    	PageFactory.initElements(d, this); //addational method
    	
    }
    
    public void uname(String name) {
    	username.sendKeys(name);
    }
    
    public void pwrd(String pwd) {
    	passwrd.sendKeys(pwd);
    	
    }
    
    public void LoginClick() {
    	loginbtn.click();
    }
}
