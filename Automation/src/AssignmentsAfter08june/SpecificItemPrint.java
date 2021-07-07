package AssignmentsAfter08june;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpecificItemPrint {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		System.out.println("Enter the item which u want to search");
		Scanner sc=new Scanner(System.in);
		String ExpectedItem=sc.nextLine();
		WebDriver driver= new ChromeDriver();
		driver.get(" file:///C:/Users/dpush/OneDrive/Desktop/Hotel.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		Select s= new Select(mtrlistbox);
		List<WebElement> alloptions = s.getOptions();
		int counter=0;
		for(int i=0;i<alloptions.size();i++) {
			String text = alloptions.get(i).getText();
			if(text.equals(ExpectedItem)) {
				counter++;
			}
		}
		if(counter==0) {
			System.out.println(ExpectedItem+" is not present");
		}
		else if(counter==1) {
			System.out.println(ExpectedItem+" is  present without duplicate");
		}
		else {
			if(counter>1) {
				System.out.println(ExpectedItem+" is  present but with duplicate value");
			}
		}
		driver.close();
	}
}


