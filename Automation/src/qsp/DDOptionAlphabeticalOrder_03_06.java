package qsp;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DDOptionAlphabeticalOrder_03_06 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/dpush/OneDrive/Desktop/Hotel.html");
		WebElement optsn = driver.findElement(By.id("mtr"));
		Select s= new Select(optsn);
		List<WebElement> allop = s.getOptions();
		
		TreeSet ts = new TreeSet();
		for(WebElement we: allop) {
			ts.add(we.getText());
//		System.out.println(ts);
		}

//		System.out.println(ts);
		System.out.println("---------------------------------------------------------");
		for(Object t:ts) {
			System.out.println(t);
		}
		driver.close();
	}

}