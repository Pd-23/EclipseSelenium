package qsp;// optimizr the xpaths

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Scanner;

public class AutoSuggestionFlipkart_2505 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException  {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the item you want to search ");
		String searchfor = sc.nextLine();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys(searchfor);
		Thread.sleep(2000); 
		List<WebElement> allsug = driver.findElements(By.xpath("//li[@class='Y5N33s']"));
		int count=allsug.size();
		//allsug.get(count-1).click();  // Here we will get exception StaleElementReferenceException 

		System.out.println(count);
		for(WebElement e:allsug) {
			System.out.println(e.getText());
		}
		allsug.get(count-1).click();
		System.out.println("LAst link was clicked successfully");
		driver.close();
	}
}
