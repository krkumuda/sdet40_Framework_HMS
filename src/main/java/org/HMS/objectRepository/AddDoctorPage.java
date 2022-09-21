package org.HMS.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddDoctorPage {
	public  AddDoctorPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
//	@FindBy(xpath="//span[.=' Doctors ']")
//	private WebElement docFeatAdmin;
//	@FindBy(xpath = "//span[text()=' Add Doctor']")
//	private WebElement addDoc;
	@FindBy(xpath = "//span[.=' Doctors ']")
	private WebElement docFea;
	@FindBy(xpath = "//span[text()=' Add Doctor']")
	private WebElement addDoc;
	@FindBy (name = "Doctorspecialization")
	private WebElement docspecializ;
	@FindBy (name="docname")
	private WebElement docNameTxt;
	@FindBy(name="clinicaddress")
	private WebElement clinicAddTxt;
	@FindBy(name="docfees")
	private WebElement docFeesTxt;
	@FindBy(name="doccontact")
	private WebElement docContTxt;
	@FindBy(id="docemail")
	private WebElement docMailTxt;
	@FindBy(name="npass")
	private WebElement pwdTxt;
	@FindBy(name="cfpass")
	private WebElement cfrmPwdTxt;
	
	@FindBy(name="submit")
	private WebElement submit;
	
	//business library
	public void addDoctor(int random,String docName,String clinicAddress,String docFee,String docContact, String docMail,String docpwdTxt,String confirmpwd ) {
		docNameTxt.sendKeys(docName+random);
		clinicAddTxt.sendKeys(clinicAddress);
		docFeesTxt.sendKeys(docFee);
		docContTxt.sendKeys(docContact);
		docMailTxt.sendKeys(docMail);
		pwdTxt.sendKeys(docpwdTxt);
		cfrmPwdTxt.sendKeys(confirmpwd);
		submit.click();
}
	public WebElement docSpecialization() {
		return docspecializ;
		
	}
	public void docFeature() {
		docFea.click();
	}
	public void addDoctorFea() {
		addDoc.click();
	}
//	public void docFeature() {
//		docFeatAdmin.click();
//	}
//	public void addDoctorFea() {
//		addDoc.click();
	//}


	}
