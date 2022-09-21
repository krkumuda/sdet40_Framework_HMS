package org.sdet40.genericUtility;

import java.io.IOException;

import org.HMS.objectRepository.AddDoctorPage;
import org.HMS.objectRepository.AddPatientPage_DocPage;
import org.HMS.objectRepository.AdminDashboardPage;
import org.HMS.objectRepository.CommonPage;
import org.HMS.objectRepository.DocUpdateProfPage;
import org.HMS.objectRepository.Doc_ManagePatientsPage;
import org.HMS.objectRepository.DoctorDashboardPage;
import org.HMS.objectRepository.LoginPage;
import org.HMS.objectRepository.ManageDocPage;
import org.HMS.objectRepository.PatientSearchInAdminPage;
import org.HMS.objectRepository.TestCase1Page;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	protected WebDriver driver;
	// Object Creation for Lib/
	protected String userName;
	protected String password;
	protected String adminusername;
	protected String adminpassword;
	protected String url;
	protected String browser;
	protected JavaUtility javaUtil;
	protected WebDriverUtility webdriverUtil;
	protected ExcelUtility excelUtil;
	protected FileUtility fileUtil;
	protected CommonPage commonPage;
	protected AddPatientPage_DocPage addPatientPage;
	protected Doc_ManagePatientsPage managePatient;
	protected DoctorDashboardPage docDashboard;
	protected LoginPage loginPage;
	protected int random;
	protected AdminDashboardPage adminDashPage;
	protected AddDoctorPage addDoc;
	protected DocUpdateProfPage docUpdatefee;
	protected PatientSearchInAdminPage patientsearchh;
	protected TestCase1Page adminDocFea;
	protected ManageDocPage mngDocPge;
	public static WebDriver sdriver;
	public static JavaUtility sjavaUtil;

	@BeforeClass
	public void configBC() throws IOException {
		javaUtil = new JavaUtility();
		webdriverUtil = new WebDriverUtility();
		excelUtil = new ExcelUtility();
		fileUtil = new FileUtility();
		userName = fileUtil.getPropertyKeyValue("doctorusername");
		password = fileUtil.getPropertyKeyValue("doctorpassword");
		String url = fileUtil.getPropertyKeyValue("url");
		String browser = fileUtil.getPropertyKeyValue("browser");
		driver=webdriverUtil.commonForAll(browser, url);
		addPatientPage = new AddPatientPage_DocPage(driver);
		managePatient = new Doc_ManagePatientsPage(driver);
		docDashboard = new DoctorDashboardPage(driver);
		patientsearchh = new PatientSearchInAdminPage(driver);
		adminDocFea = new TestCase1Page(driver);
		loginPage = new LoginPage(driver);
		random = javaUtil.getRanDomNum(1000);
		adminDashPage = new AdminDashboardPage(driver);
		addDoc = new AddDoctorPage(driver);
		docUpdatefee = new DocUpdateProfPage(driver);
		commonPage = new CommonPage(driver);
		mngDocPge=new ManageDocPage(driver);
	}
	@AfterClass
	public void configAC() {

		commonPage.logoutActivity();
		System.out.println("=============Close the Browser=======");
		driver.quit();
	}
}
