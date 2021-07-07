package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CleartripFlightDetails {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/flights?utm_source=google&utm_medium=cpc&utm_campaign=BR_Cleartrip-Desktab&dxid=Cj0KCQjwhr2FBhDbARIsACjwLo0diRcM5g9O61j8zXbiNsEIeRnZjQlbfq9jo8nrQwNKFz37OllxLvUaAjXuEALw_wcB&gclid=Cj0KCQjwhr2FBhDbARIsACjwLo0diRcM5g9O61j8zXbiNsEIeRnZjQlbfq9jo8nrQwNKFz37OllxLvUaAjXuEALw_wcB");

		driver.findElement(By.id("FromTag")).clear();
	Thread.sleep(1000);
		driver.findElement(By.id("FromTag")).sendKeys("bangalore");
	 Thread.sleep(1000);
		driver.findElement(By.xpath("//ul[@id='ui-id-1']/li/a")).click();
		//  String text = driver.findElement(By.xpath("//ul[@id='ui-id-1']/li/a")).getText();
		//  System.out.println(text);
		driver.findElement(By.id("ToTag")).clear();
		driver.findElement(By.id("ToTag")).sendKeys("Goa");
	Thread.sleep(2000);
		driver.findElement(By.xpath("(//ul[@id='ui-id-2']/li/a)")).click();
		//   String t2= driver.findElement(By.xpath("(//ul[@id='ui-id-2']/li/a)")).getText();
		//   System.out.println(t2);
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.xpath("(//tr[4]/td[@data-month='5'])[7]")).click();
	 Thread.sleep(1000);
		driver.findElement(By.id("SearchBtn")).submit();
		System.out.println( driver.getTitle());
		System.out.println("Reach here anyhow.....try for next page");
		//driver.close();;

	}
}
//ul[@id='ui-id-2']/li/a)[1]