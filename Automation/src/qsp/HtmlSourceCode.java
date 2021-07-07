package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlSourceCode {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
 public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	String title = driver.getTitle();
	System.out.println(title);
	String html = driver.getPageSource();
	System.out.println(html);
	driver.close();
} 
}

// was to print the source code of the  web page