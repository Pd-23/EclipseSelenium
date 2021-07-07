package com.actitime.generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageMock {
@FindBy(id="username")
private WebElement untxb; 
@FindBy(name="pwd")
private WebElement pwdtxb;
@FindBy(xpath="//div[.='Login ']")
private WebElement lgbtn;
public LoginPageMock(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void setLogin(String un, String pw) {
	untxb.sendKeys(un);
	pwdtxb.sendKeys(pw);
	lgbtn.click();
}
}
