package qsp; //Recheck this 

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAllSuggestionNamePrice_2805 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("(//button)[2]")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 11" + Keys.ENTER);
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		List<WebElement> name = driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone 11') or contains(text(),'APPLE iPhone 11')]"));
		List<WebElement> price = driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone 11') or contains(text(),'APPLE iPhone 11')]/../../div[2]/div[1]/div[1]/div[1]"));
		Thread.sleep(5000);
		int count= name.size();
		for(int i=0; i<count;i++) {
			System.out.println(name.get(i).getText()+" =========>  "+price.get(i).getText());
		}
		driver.close();
	}
}



// price without using index  : //div[contains(text(),'Apple iPhone 11') or contains(text(),'APPLE iPhone 11')]/../..//div[contains(@class,'jeq')]