package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAddToCart03 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.amazon.in/?ie=UTF8&ext_vrnc=hi&tag=googhydrabk-21&ascsubtag=_k_Cj0KCQjwnueFBhChARIsAPu3YkSPi7HNLnkBpcGM3F2l3MGq71w8HvrYrkCNviVww-G6GUqVXK_LAiMaAl1FEALw_wcB_k_&ext_vrnc=hi&gclid=Cj0KCQjwnueFBhChARIsAPu3YkSPi7HNLnkBpcGM3F2l3MGq71w8HvrYrkCNviVww-G6GUqVXK_LAiMaAl1FEALw_wcB");
 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone",Keys.ENTER);
driver.findElement(By.xpath("(//span[contains(.,'iPhone 11 (128GB) - Purple')])[3]")).click();
Thread.sleep(3000);
System.out.println(driver.getTitle());
//driver.findElement(By.id("buy-now-button")).click();
driver.findElement(By.xpath("//span[@id='submit.add-to-cart-announce']")).click();

System.out.println("Success");
}
}
//input[@id='add-to-cart-button']