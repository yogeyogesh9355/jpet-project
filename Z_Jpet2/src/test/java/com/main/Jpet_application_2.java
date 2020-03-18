package com.main;

import java.io.File;
import java.io.IOException;
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

public class Jpet_application_2 {
	WebDriver driver;
	WebElement Register;

		public void signin() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT1224\\Desktop\\a\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		

			driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		

	 
			ExcelData ed = new ExcelData();	
		
			for(int i=1;i<=3;i++)
		{
			Register = driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]"));
			Register.click();
			System.out.println("click on sign In button");

			driver.findElement(By.name("username")).sendKeys(ed.excel_username(i));
			driver.findElement(By.name("password")).clear();
			driver.findElement(By.name("password")).sendKeys(ed.excel_password(i));
			
			Register= driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input"));
			Register.click();
			Thread.sleep(5000);
			Register = driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]"));
			Register.click();
		}
	}
		public void Printbill() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT1224\\Desktop\\a\\\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			
				driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		
				Register = driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]"));
				Register.click();
				System.out.println("click on sign In button");
				driver.findElement(By.name("username")).sendKeys("9");
				driver.findElement(By.name("password")).clear();
				driver.findElement(By.name("password")).sendKeys("123");
				driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input")).click();
			
				driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img")).click();
				driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();
				driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")).click();
				driver.findElement(By.xpath("//*[@id=\"Cart\"]/a")).click();
				driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input")).click();
				driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a")).click();
			
		
				//driver.findElement(By.xpath("")).click();
				//int r;
				
//				for(r=0;r<=27;r++)
//				{
						String s = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table")).getText();
						System.out.println(s+" ");
//					}
//					System.out.println();
		}
		public void removefromCart() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT1224\\Desktop\\a\\\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
	
				driver.get("https://petstore.octoperf.com/actions/Catalog.action");
			
			 
				driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img")).click();
				driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();
				driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")).click();
			
			
				driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[8]/a")).click();
		}
				public void takescreenshot2(String path) throws IOException, InterruptedException {
					TakesScreenshot image=  ((TakesScreenshot)driver);
					Thread.sleep(5000);
					File source=image.getScreenshotAs(OutputType.FILE);
					Thread.sleep(5000);
					FileUtils.copyFile(source, new File(path));
		}
		public void compare_name() throws InterruptedException {
			
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT1224\\Desktop\\a\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		
			driver.get("https://petstore.octoperf.com/actions/Catalog.action");
			
			Register = driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]"));
			Register.click();
			System.out.println("click on sign In button");

			driver.findElement(By.name("username")).sendKeys("9");
			driver.findElement(By.name("password")).clear();
			driver.findElement(By.name("password")).sendKeys("123");
			
			 driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input")).click();
			Thread.sleep(5000);
		
		 String s = driver.findElement(By.xpath("//*[@id=\"WelcomeContent\"]")).getText();
		 String ss=s.substring(8,14);
		 String sss="Yogesh";
		 //boolean a = true;
		 Assert.assertEquals(ss, sss);
		System.out.println("Compare name passed");
		}
		public void print_Myaccount()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT1224\\Desktop\\a\\\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			driver.get("https://petstore.octoperf.com/actions/Catalog.action");
			
			Register = driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]"));
			Register.click();
			System.out.println("click on sign In button");

			driver.findElement(By.name("username")).sendKeys("9");
			driver.findElement(By.name("password")).clear();
			driver.findElement(By.name("password")).sendKeys("123");
			Register= driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input"));
			Register.click();
			
			driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[3]")).click();
			driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a")).click();
			String s=driver.findElement(By.xpath("//*[@id=\"Content\"]/table/tbody")).getText();
			System.out.println(s);
			
		}
		
}
