package org.sdet40.admin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");

//		driver.findElement(By.xpath("//span[text()='Flights' and @class='chNavText darkGreyText']")).click();
//		driver.findElement(By.xpath("//span[text()='DEL, Indira Gandhi International Airport India']")).click();
		
	//	driver.findElement(By.xpath("//span[text()='From']")).click();
	//	driver.findElement(By.xpath("//p[text()='Pune, India']/ancestor::ul[@class='react-autosuggest__suggestions-list']/descendant::p[text()='Pune, India']")).click();
	//	driver.findElement(By.xpath("//p[text()='Bengaluru, India']/ancestor::ul[@class='react-autosuggest__suggestions-list']/descendant::p[text()='Bengaluru, India']")).click();
	//	driver.findElement(By.xpath("//a[text()='Search']")).click();
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		driver.findElement(By.xpath("//span[text()='From']")).click();
		
		
		
		String from="BOM";
		String to="BLR";
		driver.findElement(By.xpath("//input[@placeholder=\"From\"]")).sendKeys(from);
		driver.findElement(By.xpath("//div[text()='"+from+"']")).click();
		driver.findElement(By.xpath("//span[text()='To']")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"To\"]")).sendKeys(to);
		driver.findElement(By.xpath("//div[text()='"+to+"']")).click();
		
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		
		
	}

}
