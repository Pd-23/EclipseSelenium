package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckWidth_FbLogin {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	int eWidth = driver.findElement(By.id("email")).getSize().getWidth();
	int lWidth= driver.findElement(By.id("pass")).getSize().getWidth();
	if(eWidth==lWidth) {
		System.out.println("Width of both Email textbox and Password textbox is same and is "+ eWidth);
	}
	else {
		System.out.println("The Width of both the textfield is not same " +";  "+ "EmailWidth Is "+ eWidth+" And "+ "LoginWidth Is "+lWidth );
	}
	driver.close();
}
}
