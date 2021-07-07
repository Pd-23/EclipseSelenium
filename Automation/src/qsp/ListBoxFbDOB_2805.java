package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxFbDOB_2805 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	driver.findElement(By.partialLinkText("English")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	Thread.sleep(1000);
	WebElement day = driver.findElement(By.id("day"));
	Select s=new Select(day);
	s.selectByValue("23");
	WebElement month = driver.findElement(By.id("month"));
	Select s1=new Select(month);
	s1.selectByVisibleText("Dec");
	WebElement year = driver.findElement(By.id("year"));
	Select s2= new Select(year);
	s2.selectByValue("1993");
}
}
