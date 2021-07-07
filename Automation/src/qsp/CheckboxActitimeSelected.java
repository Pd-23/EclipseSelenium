package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxActitimeSelected {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	boolean selected = driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
	if(selected) {
		System.out.println("CheckBox is checked");
	}
	else {
		System.out.println("CheckBox is not checked");
	}
	driver.close();
	}
}
