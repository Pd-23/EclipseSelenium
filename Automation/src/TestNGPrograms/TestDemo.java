package TestNGPrograms;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestDemo {
	@Test(priority = 0,invocationCount =1 )
	public void createCustomer() {
		Reporter.log("createCustomer",true);
	}
	@Test(priority =1,dependsOnMethods ="createCustomer")
	public void modifyCustomer() {
		Reporter.log("modifyCustomer",true);
	}
	@Test(priority =2, dependsOnMethods ="createCustomer" )
	public void deleteCustomer() {
		Reporter.log("deleteCustomer",true);
	}
	/*
	 * to disable test method.
	 * use: enabled= false  or invocation count =0 or negative number.
	 */
}
