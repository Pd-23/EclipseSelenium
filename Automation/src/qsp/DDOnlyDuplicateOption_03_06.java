package qsp;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DDOnlyDuplicateOption_03_06 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/dpush/OneDrive/Desktop/Hotel.html");
		WebElement ddl = driver.findElement(By.id("mtr"));
		Select s= new Select(ddl);
		List<WebElement> option = s.getOptions();
		Set ts = new HashSet();
		for(WebElement l: option) {
			if(ts.contains(l.getText())) {
				System.out.println(l.getText());
			}
			else {
				ts.add(l.getText());
			}
		}
		driver.close();
	}
}
