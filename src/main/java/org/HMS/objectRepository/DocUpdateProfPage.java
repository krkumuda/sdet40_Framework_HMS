package org.HMS.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocUpdateProfPage {
	
	public DocUpdateProfPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}

	@FindBy(name="docfees")
	private WebElement docfeess;
	@FindBy (name="submit")
	private WebElement submitBtn;

	// business library
	public void docFeeUpdate() {
		docfeess.sendKeys("updateDocFee");
		submitBtn.click();
	}

}
