package AssignmentsAfter08june;

import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SpecificBrowserClose_11_06 {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		Scanner sc= new Scanner(System.in);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.naukri.com/");
		Set<String> allwh = driver.getWindowHandles();
		String pwh = driver.getWindowHandle();
		System.out.println(allwh.size());
		for(String wh:allwh) {
			if(wh.equals(pwh)) {
				driver.switchTo().window(wh);
				String title = driver.getTitle();
				System.out.println(title);
			}
		}

	}
}
// complete it in the morning