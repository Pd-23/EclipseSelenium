package qsp; // Doubt , have to clarify with sir how to write xpath for user input

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionPrintForEach2505 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException  {
		Scanner sc=new Scanner(System.in);
		System.out.println("Type  here to search");
		String text = sc.nextLine();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys(text);
		Thread.sleep(2000);
		List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(.,text)]"));
		int count = allSugg.size();
		System.out.println(count);

		for(WebElement e: allSugg) {
			System.out.println(e.getText());
		}
		driver.close();
	}
}