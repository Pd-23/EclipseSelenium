package com.actitime.generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public WebDriver driver;
	@BeforeClass
	public void openBrowser() {
		Reporter.log("OpenBrowser",true);
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@BeforeMethod
	public void login() throws IOException {
		Reporter.log("Login",true);
		Filelib f = new Filelib();
		String url = f.getPropertyData("url");
		String username = f.getPropertyData("un");
		String password = f.getPropertyData("pwd");
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.xpath("//div[.='Login ']")).click();
	}
	@AfterMethod
	public void logout()  {
		Reporter.log("Logout",true);
		driver.findElement(By.id("logoutLink")).click();
	}
	@AfterClass  
	public void closeBrowser() {
		Reporter.log("CloseBrowser",true);
		driver.close();
	}
}
