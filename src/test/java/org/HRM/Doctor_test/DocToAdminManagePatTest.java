package org.HRM.Doctor_test;

import java.io.IOException;

import org.sdet40.genericUtility.BaseClass;
import org.sdet40.genericUtility.IConstantPath;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DocToAdminManagePatTest extends BaseClass{

	@Test
	public void patientSrchTest() throws IOException, InterruptedException {
		String patientName = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "PatientSearch", 1, 0);
		String patientContact = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "PatientSearch", 1, 1);
		String patientEmail = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "PatientSearch", 1, 2);
		String patientAddress = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "PatientSearch", 1, 3);
		String patientAge = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "PatientSearch", 1, 4);
		String patientMedicalHistory = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "PatientSearch", 1, 5);
		String patientSearch = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "PatientSearch", 1, 6);
		String expectedResult = patientName+random;
		System.out.println(expectedResult);
		loginPage.clickDoc();
		loginPage.docLoginActivity(userName, password);
		docDashboard.patFeature();
		docDashboard.patientAdd(driver);
		addPatientPage.addPatientActivity(patientName+random, patientContact, random+patientEmail, patientAddress, patientAge,	patientSearch, patientMedicalHistory);
		addPatientPage.clickButton();
		docDashboard.searchPatFeature();
		managePatient.searchPattxt(patientName+random);
		managePatient.submitButton();
		commonPage.logoutActivity();
		loginPage.clickAdmin();
		String adminLoginUserName = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "Admin", 1, 0);
		String adminLoginPassword = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "Admin", 1, 1);
	    loginPage.adminLoginActivity(adminLoginUserName, adminLoginPassword);
	    adminDashPage.AdminPagePatient();
	    webdriverUtil.implicitForElement();
	    adminDashPage.ManagePatInAdmin();
	    
	    String fetchedtext = managePatient.getTextOfDynamicEle(expectedResult, driver);
		Assert.assertEquals(fetchedtext, expectedResult);
		
		
		
}
}
