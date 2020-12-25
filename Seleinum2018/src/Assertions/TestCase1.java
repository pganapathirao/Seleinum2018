package Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class TestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.gecko.driver", "D://SeleniumWebDriver//Seleinum2018//Drivers//geckodriver//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement username= driver.findElement(By.name("txtUsername"));
		WebElement password= driver.findElement(By.name("txtPassword"));
		
		Assert.assertTrue(username.isDisplayed());
		username.sendKeys("Admin");
		
		Assert.assertTrue(password.isDisplayed());
		password.sendKeys("admin123");
		
		/*
		Assert.assertFalse(username.isDisplayed());
		username.sendKeys("Admin");
		
		Assert.assertFalse(password.isDisplayed());
		password.sendKeys("admin123");*/
		
		 driver.findElement(By.name("Submit")).click();
		 
		 //validation
		 String expvalue="OrangeHRM";
		Assert.assertEquals(expvalue, driver.getTitle()); //compare both titiles
		 
		 driver.close();
	}

}
