package qsp;            //Question is not exactly this

import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DDSearchSpecificOption_03_06 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the item name");
		String item = sc.nextLine();
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/dpush/OneDrive/Desktop/Hotel.html");
		WebElement optsn = driver.findElement(By.id("mtr"));
		Select s= new Select(optsn);
		List<WebElement> allop = s.getOptions();

		int count=0;
		for(WebElement we:allop) {
			String text = we.getText();
			if(item.equalsIgnoreCase(text)) {
				System.out.println("this item is availiable "+text);
				break;
			}
			else {
				count++;
			}
		}
		if(count==allop.size()) {
			System.out.println("Requested item is not avaliable");
		}

		driver.close();
	}
}