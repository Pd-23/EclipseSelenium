package AssignmentsAfter08june;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VTigerHackerEarth {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/");
		WebElement resourceTab = driver.findElement(By.id("navbarDocumentation"));
		Actions a = new Actions(driver);
		a.moveToElement(resourceTab).perform();
		driver.findElement(By.partialLinkText("Customers")).click();
		WebElement btn = driver.findElement(By.linkText("READ FULL STORY"));
		a.doubleClick(btn).perform();
		Thread.sleep(2000);
		String title = driver.getTitle();
		if(title.contains("HackerEarth")) {
			System.out.println("HAcker Earth page is displayed");
		}
		else {
			System.out.println("Hacker earth page is not displayed");
		}

	}
}		

