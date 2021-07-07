package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeDemo {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");

		driver.findElement(By.name("pwd")).sendKeys("manager");

		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(1000);
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("actiTIME - Enter Time-Track")) {
			System.out.println("Succesfully login");
		}
		else {
			System.out.println("Sorry shaktiman");
		}
		driver.close();
	}
}
