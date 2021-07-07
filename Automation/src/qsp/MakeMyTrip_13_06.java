package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip_13_06 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.makemytrip.com/");
	driver.findElement(By.xpath("//p[contains(.,'Login')]")).click();
//	driver.findElement(By.xpath("//label[text()='Login with Phone/Email']")).click();
	driver.findElement(By.id("username")).sendKeys("7049978437");
	driver.findElement(By.xpath("//span[.='Continue']")).click();
}
}
