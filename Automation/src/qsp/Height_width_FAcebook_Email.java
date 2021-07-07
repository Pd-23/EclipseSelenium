package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Height_width_FAcebook_Email {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
//	int height = driver.findElement(By.id("email")).getSize().getHeight();
//	int width = driver.findElement(By.id("email")).getSize().getWidth();
	 Dimension emailtxtb = driver.findElement(By.id("email")).getSize();
	 int height=emailtxtb.getHeight();
	int width=emailtxtb.getWidth();
	System.out.println("height = "+height);
	System.out.println("width = "+width);
	driver.close();
	
	
}
}
