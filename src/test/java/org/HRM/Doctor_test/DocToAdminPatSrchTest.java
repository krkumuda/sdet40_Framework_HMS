package org.HRM.Doctor_test;

	import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.sdet40.genericUtility.BaseClass;
import org.sdet40.genericUtility.IConstantPath;
import org.testng.Assert;
import org.testng.annotations.Test;
	public class DocToAdminPatSrchTest extends BaseClass {
	@Test
	public void DocPatSrch() throws EncryptedDocumentException, IOException {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
	String patientName = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "PatientSearch", 1, 0);
	String patientContact = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "PatientSearch", 1, 1);
	String patientEmail = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "PatientSearch", 1, 2);
	String patientAddress = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "PatientSearch", 1, 3);
	String patientAge = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "PatientSearch", 1, 4);
	String patientMedicalHistory = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "PatientSearch", 1, 5);
	String patientSearch = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "PatientSearch", 1, 6);
	
	String expectedResult =patientName+random;
	System.out.println(expectedResult);
	loginPage.clickDoc();
//	String docUsername = fileUtil.getPropertyKeyValue("doctorusername");
//	String docPassword = fileUtil.getPropertyKeyValue("doctorpassword");
	loginPage.docLoginActivity(userName, password);
	docDashboard.patFeature();
	docDashboard.patientAdd(driver);
   addPatientPage.addPatientActivity(patientName+random, patientContact, patientEmail+random, patientAddress, patientAge,patientSearch, patientMedicalHistory);
	addPatientPage.clickButton();
	commonPage.logoutActivity();
	loginPage.clickAdmin();

	String adminLoginUserName = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "Admin", 1, 0);
	String adminLoginPassword = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "Admin", 1, 1);
    loginPage.adminLoginActivity(adminLoginUserName, adminLoginPassword);
   patientsearchh.patSearch1();
   patientsearchh.searchData(expectedResult);
   patientsearchh.submitButtn();
   
   String fetchedtext = managePatient.getTextOfDynamicEle(expectedResult, driver);
	Assert.assertEquals(fetchedtext, expectedResult);
	
	
	
	
	
	
	
	
	
//   String actual = driver.findElement(By.xpath("//td[.='"+expectedResult+"']")).getText();
//	System.out.println(actual);
//	Assert.assertEquals(actual, expectedResult);
	
	
	
	//String actualResult = managePatient.patExpected();
//	 if (expectedResult.equals(actualResult)) {
//	 System.out.println("Test Pass");
//	 } else {
//	 System.out.println("Test Failed");
//	 }
//	Assert.assertEquals(actualResult, expectedResult);
	}
	}

