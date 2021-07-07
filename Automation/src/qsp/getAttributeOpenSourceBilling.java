package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttributeOpenSourceBilling {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("http://demo.opensourcebilling.org/en/users/sign_in");
	String value = driver.findElement(By.id("email")).getAttribute("value");
	System.out.println(value);
	String pwd = driver.findElement(By.id("password")).getAttribute("value");
	System.out.println(pwd);
	driver.close();
}
}
