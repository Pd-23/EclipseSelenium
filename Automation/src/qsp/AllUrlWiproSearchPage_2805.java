package qsp;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllUrlWiproSearchPage_2805 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Type here to search...");
	String searchfor = sc.nextLine();
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.navigate().to("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys(searchfor,Keys.ENTER);
	List<WebElement> Alllinks = driver.findElements(By.xpath("//a"));
	for(WebElement urls: Alllinks) {
		String url = urls.getAttribute("href");
		System.out.println(url);
	}
	driver.close();
}
}
