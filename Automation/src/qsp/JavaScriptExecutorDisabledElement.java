package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDisabledElement {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/dpush/OneDrive/Desktop/New%20folder%20(2)/Disabled.html");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementById(\"d1\").value='admin'");
		js.executeScript("document.getElementById(\"d2\").value='manager'");
		Thread.sleep(3000);
		driver.findElement(By.id("d3")).click();
		driver.close();
	}
}
