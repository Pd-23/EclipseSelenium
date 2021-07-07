package TestNGPrograms;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass1;

public class ProjectModuleParallel extends BaseClass1{
	@Test
	public void createProject() {
		Reporter.log("createProject",true);
	}
	@Test
	public void deleteProject() {
		Reporter.log("deleteProject",true);
	}

}
