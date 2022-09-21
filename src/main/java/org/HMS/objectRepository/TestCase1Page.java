package org.HMS.objectRepository;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCase1Page {

	public TestCase1Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[.=' Doctors ']")
	private WebElement docFeatAdmin;
	@FindBy(xpath = "//a[@href='add-doctor.php']/child::span[.=' Add Doctor']")
	private WebElement addDcoFeatAmin;
	@FindBy(name = "Doctorspecialization")
	private WebElement docSpecial;

//business library
	public void AddDocFeature(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(addDcoFeatAmin));
		addDcoFeatAmin.click();
	}

	public void DocFeature() {
		docFeatAdmin.click();
	}

	public void addDocFeature() {
		addDcoFeatAmin.click();
	}

	public void DocSpecail() {
		docSpecial.click();
	}
}