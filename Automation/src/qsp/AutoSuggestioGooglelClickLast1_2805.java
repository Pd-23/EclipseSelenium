package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestioGooglelClickLast1_2805 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
 ChromeDriver driver= new ChromeDriver();
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 driver.navigate().to("https://www.google.com/");
 driver.manage().window().maximize();
 driver.findElement(By.name("q")).sendKeys("Qspiders");
 Thread.sleep(1000);
 List<WebElement> AllSugg = driver.findElements(By.xpath("//li[@class='sbct'  and not (@id='YMXe')]"));
 int count=AllSugg.size();
 System.out.println(count);
 for(WebElement s: AllSugg) {
	 String sugg=s.getText();
	 System.out.println(sugg);
 }
AllSugg.get(count-1).click();
driver.close();
}
}
//li[@class='sbct']/div/div/div[1]/span