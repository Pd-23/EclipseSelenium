package com.actitime.generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass1 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}

public WebDriver driver;
@BeforeClass
public void openBrowser(String browser) {
	Reporter.log("openbrowser", true);
	if(browser.equals("chrome")) {
		driver= new ChromeDriver();
	}
	else if(browser.equals("firefox")) {
		driver= new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
@AfterClass
public void closeBrowser() {
	Reporter.log("Closebrowser", true);
	driver.close();
}
@BeforeMethod
public void login() throws IOException {
	Reporter.log("login", true);
	Filelib f= new Filelib();
	String url = f.getPropertyData("url");
	String username= f.getPropertyData("un");
	String password = f.getPropertyData("pwd");
	driver.get(url);
	driver.findElement(By.id("username")).sendKeys(username);
	driver.findElement(By.name("pwd")).sendKeys(password+Keys.ENTER);
}
@AfterMethod
public void logout() {
	Reporter.log("logout", true);
	driver.findElement(By.id("logoutLink")).click();
}
}
