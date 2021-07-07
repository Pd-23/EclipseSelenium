package com.actitime.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;

public class ReportModule extends BaseClass
{
	@Test
public void createReport() {
	Reporter.log("createReport",true);
}
	@Test
	public void deleteReport() {
		Reporter.log("deleteReport",true);
	}
}
