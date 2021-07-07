package AssignmentsAfter08june;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlphabeticalOrder {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get(" file:///C:/Users/dpush/OneDrive/Desktop/Hotel.html");
		WebElement MtrListBox = driver.findElement(By.id("mtr"));		
		Select s=new Select(MtrListBox);
		ArrayList<String> al=new ArrayList<>();
		List<WebElement> alloptions = s.getOptions();
		for(int i=0;i<alloptions.size();i++) {
			String text = alloptions.get(i).getText();			
			al.add(text);
		}	
		Collections.sort(al);
		
		for(String option:al) {
			System.out.println(option);
		}
		driver.close();	
	}
}