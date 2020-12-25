package datadriventest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream("D://SeleniumWebDriver//Seleinum2018//data.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1"); //providing sheet name
		//XSSFSheet sheet=workbook.getSheetAt(0); //providing index of the sheet
		int rowcount=sheet.getLastRowNum();// return the row count
		int colcount=sheet.getRow(0).getLastCellNum(); //return the column/cell count
		
		for(int i=0;i<rowcount;i++) {
			XSSFRow currentrow=sheet.getRow(i); //focused on curren row
			
			for(int j=0;j<colcount;j++) {
				String value=currentrow.getCell(j).toString(); //Read the value from cell
				System.out.print("     "  +value);
			}
			
			System.out.println();
		}
		
		
		
	}
}
