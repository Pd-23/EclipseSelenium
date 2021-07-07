package qsp;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DDNoDuplicateofListPrint_03_06 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("file:///C:/Users/dpush/OneDrive/Desktop/Hotel.html");
	 WebElement optsn = driver.findElement(By.id("mtr"));
	Select s= new Select(optsn);
	List<WebElement> allop = s.getOptions();
//	for(WebElement w: allop) {
//		System.out.println(w.getText());
//	}
//	System.out.println("============================");
	
      HashSet hs = new HashSet();
	for(WebElement we:allop) {
		String item = we.getText();
		hs.add(item);
	}
	for(Object h:hs) {
		System.out.println(h);
	}
  driver.close();
}
}
