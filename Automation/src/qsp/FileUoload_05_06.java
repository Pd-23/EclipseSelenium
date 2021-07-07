package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUoload_05_06 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("file:///C:/Users/dpush/OneDrive/Desktop/naukari.html");
	Thread.sleep(2000);
	File f = new File("./data/Resume.docx.txt");
	String ff = f.getAbsolutePath();
	driver.findElement(By.id("cv")).sendKeys(ff);
//	driver.findElement(By.id("cv")).sendKeys("C:\\Users\\dpush\\OneDrive\\Desktop\\PushpendraResume.docx");
	Thread.sleep(2000);
	//driver.close();
}
}
