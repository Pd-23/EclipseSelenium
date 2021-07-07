package qsp;

import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DDSelectAllDesectInReverseOrder_03_06 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/dpush/OneDrive/Desktop/Hotel.html");
		 WebElement optsn = driver.findElement(By.id("mtr"));
		Select s= new Select(optsn);
		List<WebElement> allop = s.getOptions();
		for (int i = 0; i < allop.size(); i++) {
			s.selectByIndex(i);
		}
		Thread.sleep(5000);
		for (int i=allop.size()-1; i>=0; i--) {
			s.deselectByIndex(i);
		}
		
		System.out.println("Sucess");
	}
}
