package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allignment_FbLogin {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		int x1 = driver.findElement(By.id("email")).getLocation().getX();
		int x2= driver.findElement(By.id("pass")).getLocation().getY();
		if(x1==x2) {
			System.out.println("Both the textbox are properly alligned");
		}
		else {
			System.out.println("Both the textfields are not alligned");
		}
		driver.close();
	}

}
