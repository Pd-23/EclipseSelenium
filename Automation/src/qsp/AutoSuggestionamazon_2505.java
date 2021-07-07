package qsp;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionamazon_2505 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter here to serach..");
	String searchfor=sc.nextLine();
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchfor);
	List<WebElement> allSugg = driver.findElements(By.xpath("//div[@class='s-suggestion']"));
	for(WebElement sugg:allSugg) {
		System.out.println(sugg.getText());
	}
	allSugg.get(allSugg.size()-1).click();
	driver.close();
}
}
