package AssignmentsAfter08june;

import java.awt.Desktop.Action;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.omg.PortableServer.THREAD_POLICY_ID;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class YatraFlight_12_06 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.yatra.com/");
		Thread.sleep(1000);
		driver.findElement(By.id("BE_flight_origin_city")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(.,'BLR')]")).click();
		driver.findElement(By.id("BE_flight_arrival_city")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(.,'GOI')]")).click();
		driver.findElement(By.id("BE_flight_origin_date")).click();
		driver.findElement(By.id("19/06/2021")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("BE_flight_flsearch_btn")).click();
		List<WebElement> flights = driver.findElements(By.xpath("//span[@class='i-b text ellipsis']"));
		Thread.sleep(2000);
		List<WebElement> fare = driver.findElements(By.xpath("//span[@class='i-b text ellipsis']/../../../../div[4]//label/div/p"));
		int count=flights.size();
		Thread.sleep(2000);
		for (int i = 0; i < count; i++) {
			System.out.println(flights.get(i).getText()+"===========>"+fare.get(i).getText());
		}
		driver.close();

	}
}
/*
//span[@class='i-b text ellipsis']/../../../../div[4]/div/div/div
//span[@class='i-b text ellipsis']/../../../../div[4]/div/div/div/label/div/p

both the xpath at line no 51 and 52 are same 
 */