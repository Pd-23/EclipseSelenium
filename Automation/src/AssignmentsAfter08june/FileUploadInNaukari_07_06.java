package AssignmentsAfter08june; // HAVE TO ASK THIS ONE ElementNotInteractableException

import java.io.File;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUploadInNaukari_07_06 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option= new ChromeOptions();
		ChromeOptions nw = option.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(nw);
		driver.get("https://www.naukri.com/");
		File f = new File("./data/Resume.docx");
		String path = f.getAbsolutePath();
		System.out.println(path);
		String pwh = driver.getWindowHandle();
		Set<String> allwh = driver.getWindowHandles();
		for(String wh:allwh) {
			driver.switchTo().window(wh);
			if(!(wh.equals(pwh))){
				driver.close();		}
		}
		driver.switchTo().window(pwh);
//		driver.findElement(By.xpath("(//label[@class='btn'])[1]")).sendKeys(path);
//		driver.findElement(By.xpath("(//label[@class='btn'])[1]")).click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementById('wdgt-file-upload').value='D:\\NewFolder\\Automation\\.\\data\\Resume.docx'");
	}
}
