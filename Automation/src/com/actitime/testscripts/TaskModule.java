package com.actitime.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;

public class TaskModule extends BaseClass {
	@Test(groups = {"SomkeTest", "RegressionTest"} )
	public void createTask() {
		Reporter.log("taskCreated",true);
	}
	@Test
	public void deleteTask() {
		Reporter.log("deleteTask",true);
	}
}
