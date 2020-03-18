package com.main;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.excelutilities.ExcelData;

public class Jpet_application_1 {
	WebDriver driver;
	WebElement Register;

	public void register() throws IOException 
	{
		ExcelData ed = new ExcelData();	
		for(int i=1;i<=3;i++)	
		{
			// To launch Chrome browser
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT1224\\Desktop\\a\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		// To open application homepage
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");	
		// To click on signin button
			Register = driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]"));
			Register.click();
			System.out.println("click on sign In button");
		// To click on register now button
			Register = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a"));
			Register.click();
			System.out.println("click on register now button");
		// To get data from Excel	
			
			driver.findElement(By.name("username")).sendKeys(ed.excel_username(i));
			driver.findElement(By.name("password")).sendKeys(ed.excel_password(i));
			driver.findElement(By.name("repeatedPassword")).sendKeys(ed.excel_password(i));
			driver.findElement(By.name("account.firstName")).sendKeys(ed.Firstname(i));
			driver.findElement(By.name("account.lastName")).sendKeys(ed.Lastname(i));
			driver.findElement(By.name("account.email")).sendKeys(ed.Email(i));
			driver.findElement(By.name("account.phone")).sendKeys(ed.Phone(i));
			driver.findElement(By.name("account.address1")).sendKeys(ed.Address1(i));
			driver.findElement(By.name("account.address2")).sendKeys(ed.Address2(i));
			driver.findElement(By.name("account.city")).sendKeys(ed.City(i));
			driver.findElement(By.name("account.state")).sendKeys(ed.State(i));
			driver.findElement(By.name("account.zip")).sendKeys(ed.Zip(i));
			driver.findElement(By.name("account.country")).sendKeys(ed.Country(i));
			driver.findElement(By.name("account.listOption")).click();
			driver.findElement(By.name("account.bannerOption")).click();
			driver.findElement(By.name("newAccount")).click();
			driver.close();
	}
	}
	public void addtocart() {
		// To launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT1224\\Desktop\\a\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	// To open application homepage
			driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		
		// To proceed add to cart function
			driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img")).click();
			driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")).click();
	}
		public void takescreenshot1(String path) throws IOException, InterruptedException 
		{
			// To take screenshot for add to cart function
			TakesScreenshot image=  ((TakesScreenshot)driver);
			Thread.sleep(5000);
			File source=image.getScreenshotAs(OutputType.FILE);
			Thread.sleep(5000);
			FileUtils.copyFile(source, new File(path));
			driver.close();
		}
		public void printtable() {
			// To launch chrome browser
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT1224\\Desktop\\a\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			// To open application homepage
			
				driver.get("https://petstore.octoperf.com/actions/Catalog.action");
			// To print product table
				driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img")).click();
			
						String s = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody")).getText();
						System.out.println(s+" ");
						driver.close();
					}

		public void search() 
		{
			//To launch chrome browser
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT1224\\Desktop\\a\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
	// To open application homepage
				driver.get("https://petstore.octoperf.com/actions/Catalog.action");
			
			// To search for products
				driver.findElement(By.xpath("//*[@id=\"SearchContent\"]/form/input[1]")).sendKeys("Angelfish");;
				driver.findElement(By.name("searchProducts")).click();
		}
			public void takescreenshot6(String path) throws IOException, InterruptedException 
			{
				// To take screenshot for search function
				TakesScreenshot image=  ((TakesScreenshot)driver);
				Thread.sleep(5000);
				File source=image.getScreenshotAs(OutputType.FILE);
				Thread.sleep(5000);
				FileUtils.copyFile(source, new File(path));
				driver.close();
			}
			public void Checkforlink() {
			//To go to application homepage
					driver.get("https://petstore.octoperf.com/actions/Catalog.action");
				
				// To check for link
					List<WebElement> link = driver.findElements(By.xpath("//*[@id=\"PoweredBy\"]/a"));
					int a=link.size();
						System.out.println("Checking link Persent :"+link.size());
						
						boolean c=false;
						if(a>0) {
							c=true;
							System.out.println("The link is present");
							Assert.assertTrue(c);
							
						}
						else {
							System.out.println("The link is not present");
							Assert.assertFalse(c);
							
						}
						driver.close();
				}
			
					
	}	
	






//
//public void language(String lang) {
//WebElement language = driver.findElement(By.name("account.languagePreference"));
//Select select=new Select(language);
//select.selectByVisibleText(lang);
//}
//public void favorite_category(String category) {
//WebElement favorite = driver.findElement(By.name("account.languagePreference"));
//Select select=new Select(favorite);
//select.selectByVisibleText(category);
//}