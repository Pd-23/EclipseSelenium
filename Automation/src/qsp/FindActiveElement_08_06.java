package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindActiveElement_08_06 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.com/");
	  driver.switchTo().activeElement().sendKeys("Java");
	WebElement active = driver.switchTo().activeElement();
	System.out.println(active);
}
}
