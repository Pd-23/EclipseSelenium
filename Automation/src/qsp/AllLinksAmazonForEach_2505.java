package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksAmazonForEach_2505 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in/");
	  List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
	 for(WebElement l: allLinks) {
		 System.out.println(l.getText());
	 }
	 driver.close();
}
}
