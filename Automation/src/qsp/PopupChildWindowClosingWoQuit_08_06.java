package qsp;// Complete it ytoday 08 06

import java.awt.AWTException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupChildWindowClosingWoQuit_08_06 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws AWTException {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		Set<String> allwh = driver.getWindowHandles();
		System.out.println(allwh.size());;
		for(String wh:allwh) {
			WebDriver cw = driver.switchTo().window(wh);
			String title = cw.getTitle();
			System.out.println(title);
			driver.close();
		}
	}
}
