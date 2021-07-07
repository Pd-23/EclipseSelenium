package com.actitime.generics;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Generic class For Webdriver library
 * @author dvdpd
 *
 */
public class webDriverCommonLib {
	/**
	 * Explicity wait for element
	 * @param driver
	 */
	public void waitForElement(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	/**
	 * Explicity wait for element
	 * @param driver
	 * @param element
	 */
	public void waitForElement(WebDriver driver,WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	/**
	 * Custom wait for Enabled Element
	 * @param element
	 */
	public void customWaitForEnabledElement(WebElement element) {
		int i=0;
		while(i<=1000) {
			try {
				element.isEnabled();
				break;
			}
			catch (NoSuchElementException e) {
				i++;
			}
		}
	}
	/**
	 * select the option from list box based on index
	 * @param element
	 * @param index
	 */
	public void selectOptions(WebElement element,int index){
		Select s= new Select(element);
		s.selectByIndex(index);
	}
	/**
	 * select the option from list box based on Visible text
	 * @param element
	 * @param text
	 */
	public void selectOption(WebElement element,String text){
		Select s= new Select(element);
		s.selectByValue(text);
	}

}

