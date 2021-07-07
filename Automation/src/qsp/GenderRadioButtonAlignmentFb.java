package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenderRadioButtonAlignmentFb {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(1000);
		int y1=driver.findElement(By.xpath("//label[.='Female']")).getLocation().getY();
		int y2=driver.findElement(By.xpath("//label[.='Male']")).getLocation().getY();
		int y3=driver.findElement(By.xpath("//label[.='Custom']")).getLocation().getY();
		if(y1==y2&& y2==y3) {
			System.out.println("All are aligned Properly"+" y: "+y3);
		}
		else {
			System.out.println("All are not alligned properly: "+" y1: "+y1+" y2: "+y2+" y3: "+y3 );
		}
		driver.close();
	}
}
