package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RiniGSelenium {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone");
		Thread.sleep(5000);
		List<WebElement> AllSugg = driver.findElements(By.xpath("//div[@class='lrtEPN _17d0yO']"));
		Thread.sleep(5000);
    
		int count = AllSugg.size();
		System.out.println(count);
		
		Thread.sleep(5000);
		for(int i=0;i < count;i++) {
			WebElement Sugg = AllSugg.get(i);
			//Thread.sleep(5000);
			String text=Sugg.getText();
			System.out.println(text);
			//driver.close();
		}

		driver.close();

	}

}