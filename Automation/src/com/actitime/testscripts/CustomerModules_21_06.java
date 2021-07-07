package com.actitime.testscripts;


import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerModules_21_06 {
	@Test
	public void testCreateCustomer() {
		Reporter.log("CreateCustomer",true);
	}
	@Test
	public void testdeleteCustomer() {
		Reporter.log("DeleteCustomer",true);
	}
	@BeforeMethod
	public void login() {
		Reporter.log("Login",true);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("Logout",true);
	}
}

