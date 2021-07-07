package qsp;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickActitime_10_06 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws AWTException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		WebElement actiLink = driver.findElement(By.linkText("actiTIME Inc."));
		Actions a = new Actions(driver);
		a.contextClick(actiLink).perform();
		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_W); //to open in same tab
		r.keyPress(KeyEvent.VK_T); //to open in new tab
		driver.quit();
	}
}
