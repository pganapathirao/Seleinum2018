package datadriventest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalculationTest {

	public static void main(String as[]) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "D://SeleniumWebDriver//Seleinum2018//Drivers//chrome//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
		driver.manage().window().maximize();
		
		//Getting excel data from sheet
		
		FileInputStream file=new FileInputStream("D://SeleniumWebDriver//Seleinum2018//calData.xlsx");
		//Getting the data from workbook
		
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet sheet=book.getSheet("Sheet1");
		
		int rowcount=sheet.getLastRowNum();
		for(int i=1;i<rowcount;i++) {
			XSSFRow row=sheet.getRow(i);
			
			XSSFCell principalecell=row.getCell(0);
			int princ=(int)principalecell.getNumericCellValue();
			//int princ=(int)row.getCell(0).getNumericCellValue();
			
			XSSFCell roi=row.getCell(1);
			int rateofinterest=(int)roi.getNumericCellValue();
			
			XSSFCell period=row.getCell(2);
			int per=(int)period.getNumericCellValue();
			
			XSSFCell Frequency=row.getCell(3);
			String frq=Frequency.getStringCellValue();
			
			XSSFCell MaturityValue=row.getCell(4);
			int matv=(int)MaturityValue.getNumericCellValue();
			
			driver.findElement(By.id("principal")).sendKeys(String.valueOf(princ));
		    driver.findElement(By.id("interest")).sendKeys(String.valueOf(rateofinterest));
		    driver.findElement(By.id("tenure")).sendKeys(String.valueOf(per));
		    
			Select periodcombo=new Select (driver.findElement(By.id("tenurePeriod")));
			periodcombo.selectByVisibleText("year(s)");
			
			Select frequency=new Select (driver.findElement(By.name("frequency")));
			frequency.selectByVisibleText(frq);
			
			driver.findElement(By.xpath("//body/div[@id='mc_mainWrapper']/div[2]/div[1]/div[5]/div[1]/div[1]/div[3]/form[1]/div[2]/a[1]/img[1]")).click();
	        String actual_mvalue=driver.findElement(By.xpath("/html[1]/body[1]/div[12]/div[2]/div[1]/div[5]/div[1]/div[1]/div[4]/div[1]/div[2]/span[2]/strong[1]")).getText();
	        //String actual_mvalue=driver.findElement(By.tagName("strong")).getText();
			
	        if(Double.parseDouble(actual_mvalue)==matv) {
	        	System.out.println("Test passed");
	        }
	        else
	        {
	        	System.out.println("Test failed");
	        }
			
	       /* //Clearing
	        driver.findElement(By.id("principal")).clear();
		    driver.findElement(By.id("interest")).clear();
		    driver.findElement(By.id("tenure")).clear();*/
		    
		    driver.findElement(By.xpath("/html[1]/body[1]/div[14]/div[2]/div[1]/div[5]/div[1]/div[1]/div[3]/form[1]/div[2]/a[2]/img[1]")).clear();
		}
		
		driver.close();
		driver.quit();
		
		
		
	}
}
