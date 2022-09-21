package org.HMS.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonPage {
	public CommonPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
	}
	@FindBy (xpath = "//a[@class='dropdown-toggle']//following::span[@class='username']")
	private WebElement dropDownForLogout;
	@FindBy (xpath = "//a[@href='logout.php']")
	private WebElement logout;

	
	public void logoutActivity() {
		dropDownForLogout.click();
		logout.click();
	}
}

