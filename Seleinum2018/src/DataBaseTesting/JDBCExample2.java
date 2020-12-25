package DataBaseTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JDBCExample2 {

	public static void main(String[] args) throws SQLException {
		
		System.setProperty("webdriver.gecko.driver", "D://SeleniumWebDriver//Seleinum2018//Drivers//geckodriver//geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.get("https://newtours.demout.com/");
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/pdborcl","hr","hr");
	     Statement stmt=con.createStatement();
	     //String s="insert into user values(104,'mecury','mercury2')";
	     //String s="update users set uname='mer2' where userid=102";
	     String s="Select uname,passwrd from users";
	     ResultSet rs=stmt.executeQuery(s);
	     
	     while(rs.next())
	     {
	    	 String username=rs.getString("uname");
	    	 String password=rs.getString("passwrd");
	    	 
	    	 driver.findElement(By.id("txtUsername")).sendKeys("username");
	 	     driver.findElement(By.id("txtPassword")).sendKeys("password");
	 	     driver.findElement(By.id("btnLogin")).click();
	 	     
	 	     if(driver.getTitle().equals("OranheHRM")) {
	 	    	 System.out.println("test case passed");
	 	     }
	 	     else
	 	     {
	 	    	 System.out.println("test case failed");
	 	     }
	 	     
	 	     
	     }
	     con.close();
	     System.out.println("Program is existed");

	}

}
