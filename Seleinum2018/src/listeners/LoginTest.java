package listeners;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class LoginTest {

	@Test
	void loginByEmail() {
		
		System.out.println("Login by Email");
		Assert.assertEquals("pavan", "pavan"); //true
		
	}
	
	@Test
	void loginByFacebook() {
		System.out.println("Login by facebook");
		Assert.assertEquals("pavan", "kumar"); //false
	}
}
