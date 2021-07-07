package AssignmentsAfter08june;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OnlyDuplicate {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get(" file:///C:/Users/dpush/OneDrive/Desktop/Hotel.html");
		WebElement MtrListBox = driver.findElement(By.id("mtr"));
		HashSet<String> hs=new HashSet<>();
		Select s=new Select(MtrListBox);
		List<WebElement> alloptions = s.getOptions();
		for(int i=0;i<alloptions.size();i++) {
			String text = alloptions.get(i).getText();
			if(hs.add(text)==false) {
			System.out.println(text);	
			}
		}		
		driver.close();
	}
}


