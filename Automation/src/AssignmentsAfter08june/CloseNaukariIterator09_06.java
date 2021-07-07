package AssignmentsAfter08june;

import java.awt.AWTException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseNaukariIterator09_06 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws AWTException {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		Set<String> allwh = driver.getWindowHandles();
		Iterator<String> itr = allwh.iterator();
		while(itr.hasNext()) {
			WebDriver cw=driver.switchTo().window(itr.next());
			String title = cw.getTitle();
			System.out.println(title);
			driver.close();

		}
	}

}
