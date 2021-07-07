package com.actitime.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;

public class CustomerModule extends BaseClass {
	@Test(groups = {"SomkeTest", "RegressionTest"})
	public void createCustomer() {
		Reporter.log("CreatedCustomer",true);
	}
	@Test
	public void deleteCustomer() {
		Reporter.log("deleteCustomer",true);
	}
}
