package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoB {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		DemoA.testA(driver);
		WebDriver driver1=new ChromeDriver();
		driver1.navigate().to("http://www.google.com/");
		driver1.get("http://www.gmail.com/");
		String title = driver1.getTitle();
		driver1.navigate().back();
		driver1.navigate().forward();
		driver1.navigate().refresh();
		driver1.close();
		System.out.println(title);
	}
}
//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");