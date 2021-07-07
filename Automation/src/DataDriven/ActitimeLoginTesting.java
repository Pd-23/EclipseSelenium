package DataDriven;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actitime.generics.Filelib;

public class ActitimeLoginTesting {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
		WebDriver driver= new ChromeDriver();
		Filelib a= new Filelib();
		driver.get((a.getPropertyData("url")));
		driver.findElement(By.id("username")).sendKeys(a.getPropertyData("un"));
		driver.findElement(By.name("pwd")).sendKeys(a.getPropertyData("pwd"));
		driver.findElement(By.linkText("Login")).click();

		a.setXcelData("CreateCustomer", 1, 4, "pass");
		System.out.println(a.getExcelData("CreateCustomer", 1, 4));
		driver.close();
	}
}
