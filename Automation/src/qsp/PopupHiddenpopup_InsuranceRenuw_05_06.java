package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PopupHiddenpopup_InsuranceRenuw_05_06 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("123");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).click();
		 WebElement year = driver.findElement(By.xpath("(//select)[2]"));
		Select s = new Select(year);
		s.selectByValue("1993");
		WebElement mnth = driver.findElement(By.xpath("(//select)[1]"));
		Select s1 = new Select(mnth);
		s1.selectByVisibleText("Dec");
		driver.findElement(By.xpath("//tr[4]/td[5]/a")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("9876543210");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Lets Renew']")).click();
	//	driver.close();
		
	}
}
