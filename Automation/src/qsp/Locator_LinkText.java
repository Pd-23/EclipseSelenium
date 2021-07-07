package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_LinkText {
static{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
 WebDriver driver= new ChromeDriver();
 driver.get("file:///C:/Users/dpush/OneDrive/Desktop/Google.html");
 driver.findElement(By.linkText("Google")).click();
 driver.close();
}
}
