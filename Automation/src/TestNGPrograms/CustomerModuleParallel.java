package TestNGPrograms;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass1;

public class CustomerModuleParallel extends BaseClass1{
	@Test
	public void createCustomer() {
		Reporter.log("createCustomer",true);
	}
	@Test
	public void deleteCustomer() {
		Reporter.log("deleteCustomer",true);
	}
}
