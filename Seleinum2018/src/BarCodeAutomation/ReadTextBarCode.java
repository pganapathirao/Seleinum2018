package BarCodeAutomation;


import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;


import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class ReadTextBarCode {

	public static void main(String[] args) throws IOException, NotFoundException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D://SeleniumWebDriver//Seleinum2018//Drivers//geckodriver//geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.get("https://worldbarcodes.com/sample-barcode-images/");
	    String barcodeurl=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/p[5]/a[1]/img[1]")).getAttribute("src");
	    System.out.println(barcodeurl);
	    
	    URL url=new URL(barcodeurl);
	    BufferedImage bufferedimage=ImageIO.read(url);
	    
	    LuminanceSource luminancesource=new BufferedImageLuminanceSource(bufferedimage);
	    BinaryBitmap binaryBitmap=new BinaryBitmap(new HybridBinarizer(luminancesource));
	    Result result=new MultiFormatReader().decode(binaryBitmap);
	    System.out.println(result.getText());
	    
	}

}
