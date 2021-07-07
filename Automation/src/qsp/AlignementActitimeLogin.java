
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlignementActitimeLogin {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		int x1 = driver.findElement(By.id("username")).getLocation().getX();
		
		int x2=driver.findElement(By.name("pwd")).getLocation().getX();
	
		if(x1==x2) {
			System.out.println("Both username and login textbox are properly alligned");
		}
		else {
			System.out.println("Both the textbox are not alligned");
		}
		driver.close();
	}

}
