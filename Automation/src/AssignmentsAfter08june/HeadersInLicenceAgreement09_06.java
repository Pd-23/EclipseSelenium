package AssignmentsAfter08june;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeadersInLicenceAgreement09_06 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
		driver.findElement(By.linkText("About your actiTIME")).click();
		driver.findElement(By.linkText("Read Service Agreement")).click();
		String pwh = driver.getWindowHandle();
		Set<String> allwh = driver.getWindowHandles();
		for(String wh:allwh) {
			if(!(pwh.equals(wh))){
				driver.switchTo().window(wh);
				List<WebElement> head = driver.findElements(By.tagName("h2"));
				Iterator<WebElement> itr = head.iterator();
				while(itr.hasNext()) {
					System.out.println(itr.next().getText());
				}
				//				for(WebElement header:head) {
				//					String text = header.getText();
				//					System.out.println(text);

				driver.close();
			}
		}
		driver.switchTo().window(pwh);
		driver.close();

	}
}
