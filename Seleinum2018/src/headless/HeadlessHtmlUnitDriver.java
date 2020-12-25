package headless;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessHtmlUnitDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HtmlUnitDriver driver=new HtmlUnitDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("Titile of the page:"+driver.getTitle());
		System.out.println("URL of the page:" +driver.getCurrentUrl());

	}

}
