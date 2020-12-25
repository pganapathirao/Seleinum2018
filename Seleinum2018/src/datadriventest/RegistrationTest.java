package datadriventest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D://SeleniumWebDriver//Seleinum2018//Drivers//chrome//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//Geeting Data From Excell sheet
		FileInputStream file=new FileInputStream("D://SeleniumWebDriver//Seleinum2018//Registration.xlsx");
		//Getting the workbook from the xls file
		
		XSSFWorkbook book=new XSSFWorkbook(file);
		
		//Get the sheet from work book
		XSSFSheet sheet=book.getSheet("Sheet1");
		//Get First row from the sheet
		int noOfRows=sheet.getLastRowNum();
		System.out.println("No of Records in the excel sheet is     " +   noOfRows);
		for(int row=1;row<=noOfRows;row++) {
			
			    XSSFRow current_row=sheet.getRow(row);
			    String UserName=current_row.getCell(0).getStringCellValue();
			    String Password=current_row.getCell(1).getStringCellValue();
			//Login Process
			    
			driver.findElement(By.id("txtUsername")).sendKeys(UserName);
			driver.findElement(By.id("txtPassword")).sendKeys(Password);
			driver.findElement(By.id("btnLogin")).click();
			
			if(driver.getTitle().contains("OrangeHRM")) {
				System.out.println("Login is sucessfull for" +   row +    "record");
			}
			else
			{
			     System.out.println("Login Failed for the" +row + "record");
			}
		}
		
		driver.close();
		driver.quit();
		file.close();
	}

}
