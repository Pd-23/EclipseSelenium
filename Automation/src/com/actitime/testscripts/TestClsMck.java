package com.actitime.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.actitime.generics.LoginPageMock;

public class TestClsMck {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
@Test
public void testlogin() {
	WebDriver driver= new ChromeDriver();
	driver.get("https://demo.actitime.com/");
	LoginPageMock l= new LoginPageMock(driver);
	l.setLogin("admin", "manager");
	
}
}
