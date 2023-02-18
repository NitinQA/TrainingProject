package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class userLogin {

	public static void main(String[] args) throws InterruptedException {

		//ExpenseOnDemandLoginTest obj = new ExpenseOnDemandLoginTest();
		System.setProperty("webdriver.chrome.driver", "F:\\Nitin\\eclipse-workspace\\eodQA\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://qa.expenseondemand.com");
		//Enter User login email
		driver.findElement(By.xpath("//input[@formcontrolname='username']")).clear();
		driver.findElement(By.xpath("//input[@formcontrolname='username']")).sendKeys("qanow@yopmail.com");
		//Enter User login password
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@formcontrolname='password']")).click();
		driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("Aa123456");
		driver.findElement(By.xpath("//div[@class='margin-top-5 btn-login']//button[1]")).click();
		System.out.println("Url before Login : " + driver.getCurrentUrl());
		Thread.sleep(5000);	
		System.out.println("Url after Login : " + driver.getCurrentUrl());
		Thread.sleep(5000);
		System.out.println("CHECK LOGIN AND NAVIGATION PAGES FOR " + driver.getTitle().toUpperCase());
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//button[@class='btn btn-outline-secondary border-color-warning text-mustard height-38px ng-tns-c77-0']"))).build().perform();
		act.click().build().perform();
		//System.out.println(act.click());
		act.moveToElement(driver.findElement(By.xpath("//i[@class='fas fa-cog']"))).build().perform();
		act.click().build().perform();
		Thread.sleep(9000);
		System.out.println("Url after clicking settings icon : " + driver.getCurrentUrl());
		Thread.sleep(5000);
		act.moveToElement(driver.findElement(By.xpath("//a[@id='navbarDropdown6']"))).build().perform();
		act.click().build().perform();
		
		//System.out.println("Closing the DRIVER INSTANCE NOW");
		Thread.sleep(5000);
		System.out.println("Url after clicking Dashboard tab : " + driver.getCurrentUrl());
		//driver.manage().window().minimize();
		act.moveToElement(driver.findElement(By.xpath("//i[@class='fas fa-user-circle f-25']"))).build().perform();
		act.click().build().perform();
		/*
		//string with multiple comma seperated values can be split using split(regex) function which will return a String Array based on seperator type
	\
		String s="Java,Selenium,TestNG,Maven,Cucumber";
		String str[]=s.split(",");
		for(int i=0;i<str.length;i++)
		{
			System.out.println("Value stored in String array" + i + " " + str[i]);
		}
		/*
		String st1="ABC";
		String st2="DEF";
		String st3="GHI";
		
		//concatanate the Strings st1,st2 and st3 in 2 statements
		String sn1=st1.concat(st2);
		String sn2=sn1.concat(st3);
		System.out.println(sn2);
		//OR
		String scon=st1.concat(st2).concat(st3); //in a single statement
		System.out.println(scon);
		*/
		

	}

}
