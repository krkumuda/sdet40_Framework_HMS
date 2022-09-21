package org.sdet40.admin;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PatientToAdmin {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://rmgtestingserver/domain/Hospital_Management_System/");
		
		driver.findElement(By.xpath("//a[@href='hms/user-login.php']")).click();
		
		driver.findElement(By.name("username")).sendKeys("test@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Test@123");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("//span[text()=' Book Appointment ']")).click();
		WebElement ad=driver.findElement(By.name("Doctorspecialization"));
		Select s=new Select(ad);
		s.selectByIndex(2);
		
		WebElement doc=driver.findElement(By.xpath("//select[@name='doctor']"));
		Select s1=new Select(doc);
		s1.selectByIndex(15);
		
		driver.findElement(By.name("fees"));
		driver.findElement(By.xpath("//input[@name='appdate']")).click();
		driver.findElement(By.xpath("//tbody/child::tr/following-sibling::tr/child::td[.='31']")).click();
		
		driver.findElement(By.id("timepicker1")).click();
		driver.findElement(By.name("submit")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		driver.findElement(By.xpath("//span[contains(text(),'patient123')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
		
		driver.findElement(By.xpath("//a[@href='hms/admin']")).click();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("//span[text()=' Appointment History ']")).click();
		
	}

}
