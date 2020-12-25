package datadriventest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileOutputStream file=new FileOutputStream("D://SeleniumWebDriver//Seleinum2018//Test3.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Data");
		
		  for(int i=0;i<=5;i++) {
			XSSFRow row=sheet.createRow(i);
			for(int j=0;j<3;j++) {
				row.createCell(j).setCellValue("xyz");
			}
		}
		
		workbook.write(file);
		file.close();
		System.out.println("Writing file is completed");
	}

}
