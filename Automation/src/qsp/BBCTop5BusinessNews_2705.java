package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBCTop5BusinessNews_2705 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.bbc.com/");
		List<WebElement> BusinessNews = driver.findElements(By.xpath("(//div[@class='top-list'])[1]//h3"));
		for(WebElement news:BusinessNews) {
			System.out.println(news.getText());
		}
		driver.close();
	}
}