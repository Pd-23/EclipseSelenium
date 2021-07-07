package qsp;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Qspider_Autosugg29_05 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("qspiders");
		List<WebElement> Alllinks = driver.findElements(By.xpath("//span[contains(text(),'qspider') or contains(text(),'QSpider')]"));
		int count=Alllinks.size();
		System.out.println(count);
		for (WebElement link : Alllinks) 
		{
			String text = link.getText();
			System.out.println(text);
		}
		Thread.sleep(5000);
		Alllinks.get(count-1).click();
		//driver.close();
		
		
	}

}
//li[@class='sbct' and not(@id='YMXe')]