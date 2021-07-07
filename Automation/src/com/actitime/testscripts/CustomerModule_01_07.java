package com.actitime.testscripts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.actitime.generics.BaseClass;

public class CustomerModule_01_07 extends BaseClass {
	@Test
public void createCustomer() {
	driver.findElement(By.xpath("//div[text()='Tasks']")).click();
	driver.findElement(By.xpath("//div[.='Add New']")).click();
	driver.findElement(By.xpath("//div[.='+ New Customer']")).click();
driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys("HDFC_001");
driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys("No modi, chocksay can Loot me");
driver.findElement(By.xpath("(//div[.='- Select Customer -'])[1]")).click();
driver.findElement(By.xpath("(//div[.='Our company'])[2]")).click();
driver.findElement(By.xpath("//div[.='Create Customer']")).click();
String expCust="HDFC_001";
 String actCust = driver.findElement(By.xpath("//div[@class='titleEditButtonContainer']/div")).getText();
  SoftAssert s= new SoftAssert();
  s.assertEquals(actCust, expCust);
  Reporter.log("Customer created",true);
  s.assertAll();
}
}
