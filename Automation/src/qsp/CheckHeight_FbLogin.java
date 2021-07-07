package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckHeight_FbLogin {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	int eHieght = driver.findElement(By.id("email")).getSize().getHeight();
	int lHeight= driver.findElement(By.id("pass")).getSize().getHeight();
	if(eHieght==lHeight) {
		System.out.println("Height of both Email textbox and Password textbox is same and is "+ lHeight);
	}
	else {
		System.out.println("The hieght of both the textfield is not same " +" "+ "EmailHeight "+ eHieght+" "+ "LoginHeight "+lHeight );
	}
	driver.close();
}
}
