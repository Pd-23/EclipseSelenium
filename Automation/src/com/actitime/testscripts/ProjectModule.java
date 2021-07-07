package com.actitime.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;

public class ProjectModule extends BaseClass{
	@Test(groups= {"SmokeTest","RegressionTest"})
	public void createProject() {
		Reporter.log("createProject",true);
	}
		@Test(groups = "RegressionTest")
		public void deleteProject() {
			Reporter.log("deleteProject",true);
		}
}
