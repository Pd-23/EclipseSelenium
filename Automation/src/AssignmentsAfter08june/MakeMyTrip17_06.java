package AssignmentsAfter08june;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip17_06 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();

		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//p[contains(.,'Bengaluru')]")).click();

		driver.findElement(By.id("toCity")).click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Goa");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[contains(text(),'Goa')]")).click();
		driver.findElement(By.xpath("//span[.='DEPARTURE']")).click();
		driver.findElement(By.xpath("(//p[.='24'])[1]")).click();
		driver.findElement(By.xpath("//a[.='Search']")).click();
		List<WebElement> flights = driver.findElements(By.xpath("//span[@class='boldFont blackText airlineName']"));
		List<WebElement> depTime = driver.findElements(By.xpath("//p[.='Bengaluru']/../p[[1]/span"));
		for (int i = 0; i <flights.size(); i++) {
			System.out.println(flights.get(i).getText()+" Will depart at "+depTime.get(i).getText());
		}
	}
}
