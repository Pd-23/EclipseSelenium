package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageLoadCheckActitime {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(7, TimeUnit.SECONDS);
	//driver.get("https://demo.actitime.com/");
	try {
		driver.get("https://demo.actitime.com/");
		System.out.println("Page gets loaded succesfully within 7 seconds");
	}
	catch (TimeoutException t) {
		System.out.println("Pag not loaded in 7 seconds");
   	}
	driver.close();
}
}
