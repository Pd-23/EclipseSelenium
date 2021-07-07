package qsp;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_FileUploadPopup_ResumeInNaukari_07_06 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		//driver.get("https://www.naukri.com/nlogin/login?URL=https://www.naukri.com/mnjuser/homepage");
		driver.findElement(By.xpath("//div[.='Login']")).click();
		driver.findElement(By.id("[id='block']")).click();
		driver.findElement(By.id("usernameField")).sendKeys("dpushpendra2312@gmail.com");
		driver.findElement(By.id("passwordField")).sendKeys("232328pd");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.xpath("//div[text()='UPDATE PROFILE']")).click();

		File f=new File("./data/Resume.docx");
		String path = f.getAbsolutePath();
		System.out.println(path);
		Thread.sleep(1000);
		driver.findElement(By.id("attachCV")).sendKeys(path);
		//	driver.close();
	}
}
