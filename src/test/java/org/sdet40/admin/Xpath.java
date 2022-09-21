package org.sdet40.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://rmgtestingserver/domain/Hospital_Management_System/");
		driver.manage().window().maximize();
		String text = driver.findElement(By.linkText("Hospital Management system")).getText();
		if(text.equals("Hospital Management system"))
		System.out.println("same text");
		else
			System.out.println("not same");
		driver.close();
	}
	

}
