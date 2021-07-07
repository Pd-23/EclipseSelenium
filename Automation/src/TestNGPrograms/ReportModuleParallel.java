package TestNGPrograms;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass1;

public class ReportModuleParallel extends BaseClass1 {
	@Test
	public void createReport() {
		Reporter.log("Createreport",true);
	}
	public void deleteReport() {
		Reporter.log("deleteReport",true);
	}
}
