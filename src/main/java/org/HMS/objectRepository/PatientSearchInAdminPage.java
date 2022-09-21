package org.HMS.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientSearchInAdminPage {
	public PatientSearchInAdminPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[.=' Patient Search ']")
	private WebElement patSearchText;
	@FindBy(id="searchdata")
	private WebElement serachDataText;
	@FindBy(id="submit")
	private WebElement submitButton;
	//business library
	
	public void patSearch1() {
		patSearchText.click();
	}
	public void searchData(String searchName) {
		serachDataText.sendKeys(searchName);
	}
	public void submitButtn() {
		submitButton.click();
	}
	

}
