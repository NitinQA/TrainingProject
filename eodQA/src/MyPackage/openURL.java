package MyPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//set property 
		System.setProperty("webdriver.chrome.driver", "F:\\Nitin\\eclipse-workspace\\eodQA\\Drivers\\chromedriver.exe");
		//launch web driver
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https:\\qa.expenseondemand.com");
		driver.manage().window().maximize();
		
		//capture page title and print
		String title=driver.getTitle();
		System.out.println("Page title is: " + title);
		System.out.println("URL of page is: " + driver.getCurrentUrl());
		driver.close();		

	}

}
