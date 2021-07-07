package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMyTrip_2705 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.makemytrip.com/flights/?cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|Expanded|162031058804&s_kwcid=AL!1631!3!162031058804!e!!g!!makemytrip&ef_id=CjwKCAjwzMeFBhBwEiwAzwS8zOccRyxd0274b7aCgY8SfToJywWJlGAQptuM1ypkb5YRLMDk029pJBoCfjAQAvD_BwE:G:s&gclid=CjwKCAjwzMeFBhBwEiwAzwS8zOccRyxd0274b7aCgY8SfToJywWJlGAQptuM1ypkb5YRLMDk029pJBoCfjAQAvD_BwE");
     //driver.findElement(By.xpath("//li[@class='makeFlex hrtlCenter font10 makeRelative lhUser']")).click();
	
	//driver.findElement(By.xpath("//a[@class='mmtLogo makeFlex']")).click();
	driver.findElement(By.xpath("//a[@class='active makeFlex hrtlCenter column']")).click();
   driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Bangaluru");
   Thread.sleep(2000);
   driver.findElement(By.xpath("(//p[@class='font14 appendBottom5 blackText'])[1]")).click();
   Thread.sleep(2000);
   driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Goa");
   Thread.sleep(7000);
   driver.findElement(By.xpath("(//p[@class='font14 appendBottom5 blackText'])[1]")).click();
   driver.findElement(By.xpath("//span[.='DEPARTURE']")).click();
   Thread.sleep(2000);
   driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div[2]/div[3]/div[5]/div[1]/div/p")).click();
   driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']")).click();
   
   List<WebElement> fnames = driver.findElements(By.xpath("//div[@class='makeFlex ']/span"));
  // Thread.sleep(1000);
   List<WebElement> prices = driver.findElements(By.xpath("//div[@class='priceSection']//p"));
   int count= fnames.size();
   System.out.println(count);
   for(int i=0;i<count;i++) {
	   System.out.println(fnames.get(i).getText()+"=======>  "+prices.get(i).getText() );
   }
   driver.close();
}
}
