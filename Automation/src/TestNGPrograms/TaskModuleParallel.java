package TestNGPrograms;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass1;

public class TaskModuleParallel extends BaseClass1{
	@Test
	public void createTask() {
		Reporter.log("createTAsk",true);
	}
	@Test
	public void deleteTAsk() {
		Reporter.log("deleteTAsk",true);
	}

}
