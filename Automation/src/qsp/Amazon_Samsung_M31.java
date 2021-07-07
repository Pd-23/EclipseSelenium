package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Samsung_M31 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/s?k=mi+band&ref=nb_sb_noss");//go to amazon
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();// clear the search box if anything is already
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsung m31");// type samsung m31
		driver.findElement(By.id("nav-search-submit-button")).click();// click on search button
		  WebElement price = driver.findElement(By.xpath("(//span[contains(text(),'Samsung Galaxy M31')])[1]/../../../../div[3]/div/div/div/div/a/span[1]/span[1]"));// get the price of samsung m31 (Space black)
		System.out.println(price.getText());
		driver.close(); 
	}

}
