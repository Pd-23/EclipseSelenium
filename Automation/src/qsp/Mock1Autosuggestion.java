package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mock1Autosuggestion {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
driver.get("https://www.google.com/");
driver.findElement(By.name("q")).sendKeys("Selenium");
Thread.sleep(2000);
List<WebElement> autosug = driver.findElements(By.xpath("//span[contains(text(),'Selenium')]"));
int count= autosug.size();
for(WebElement e: autosug) {
	System.out.println(e.getText());
}
Thread.sleep(2000);
autosug.get(count-1).click();
driver.close();
}

}
