package InterviewQuest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAutoSug {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("selenium");
	
	List<WebElement> allsugg = driver.findElements(By.xpath("//span[contains(.,'selenium')]"));
	int count=allsugg.size();
	for (int i = 0; i < allsugg.size(); i++) {
		String sugg = allsugg.get(i).getText();
		System.out.println(sugg);
		
	}
	allsugg.get(count-1).click();
}
}
