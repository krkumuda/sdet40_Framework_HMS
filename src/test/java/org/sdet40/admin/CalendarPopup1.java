package org.sdet40.admin;

import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarPopup1 {

//	public static void main(String[] args) {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		String requiredDate="20"; //DD
//		String requiredMonth="October"; //MMMM-->FEBRUARY, MM-->02, MMM-->FEB
//		String requiredYear="2020"; //YYYY
//		
//		int requiredMonthInNum=DateTimeFormatter.ofPattern("MMMM").
//				withLocale(Locale.ENGLISH).parse(requiredMonth).get(ChronoField.MONTH_OF_YEAR);
//		
//		int requiredYearInNum=Integer.parseInt(requiredYear);
//		
//		driver.get("https://testleaf.herokuapp.com/pages/Calendar.html");
//		driver.findElement(By.id("datepicker")).click();
//		
//		String actualMonthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
//		
//		String[] str=actualMonthYear.split(" ");
//		
//		String actualMonth=str[0];
//		String actualYear=str[1];
//		
//		 int actualMonthInNum = DateTimeFormatter.ofPattern("MMMM")
//				 .withLocale(Locale.ENGLISH)
//				 .parse(actualMonth)
//				 .get(ChronoField.MONTH_OF_YEAR);
//		 
//		int actualYearInNum=Integer.parseInt(actualYear);
//		
//		while(requiredMonthInNum>actualMonthInNum || requiredYearInNum>actualYearInNum) 
//		{
//			driver.findElement(By.xpath("//span[text()='Next']")).click();
//			
//			actualMonthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
//			
//			str=actualMonthYear.split(" ");
//			 actualMonth=str[0];
//			 actualYear=str[1];
//			 
//			 actualMonthInNum = DateTimeFormatter .ofPattern("MMMM")
//					 .withLocale(Locale.ENGLISH)
//					 .parse(actualMonth)
//					 .get(ChronoField.MONTH_OF_YEAR);
//			 
//		actualYearInNum=Integer.parseInt(actualYear);
//		}
//		while(requiredMonthInNum<actualMonthInNum || requiredYearInNum<actualYearInNum) 
//		{
//			driver.findElement(By.xpath("//span[text()='Prev']")).click();
//			
//			actualMonthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
//			
//			str=actualMonthYear.split(" ");
//			 actualMonth=str[0];
//			 actualYear=str[1];
//			 
//			 actualMonthInNum = DateTimeFormatter .ofPattern("MMMM")
//					 .withLocale(Locale.ENGLISH)
//					 .parse(actualMonth)
//					 .get(ChronoField.MONTH_OF_YEAR);
//			 
//		actualYearInNum=Integer.parseInt(actualYear);
//		}
//		driver.findElement(By.xpath("//a[text()='"+requiredDate+"']")).click();
//	}
//	}
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String requireddate = "24"; //DD
		String requiredmonth = "October"; //MMMM
		String requiredyear = "2023"; //YYYY
		int RequiredMonthInNum = DateTimeFormatter.ofPattern("MMMM").
		withLocale(Locale.ENGLISH).
		parse(requiredmonth).get(ChronoField.MONTH_OF_YEAR);
		int RequiredYearInNum = Integer.parseInt(requiredyear);
		driver.get("http://testleaf.herokuapp.com/pages/Calendar.html");
		driver.findElement(By.id("datepicker")).click();
		String actualmonthyear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		String[] str = actualmonthyear.split(" ");
		String actualmonth = str[0];
		String actualyear = str[1];
		int actualmonthInNum = DateTimeFormatter.ofPattern("MMMM").
		withLocale(Locale.ENGLISH).
		parse(actualmonth).get(ChronoField.MONTH_OF_YEAR);
		int actualyearInNum = Integer.parseInt(actualyear);
		while(RequiredMonthInNum>actualmonthInNum || RequiredYearInNum>actualyearInNum )
		{
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		actualmonthyear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		str = actualmonthyear.split(" ");
		actualmonth = str[0];
		actualyear = str[1];
		actualmonthInNum = DateTimeFormatter.ofPattern("MMMM").
		withLocale(Locale.ENGLISH).
		parse(actualmonth).get(ChronoField.MONTH_OF_YEAR);
		actualyearInNum = Integer.parseInt(actualyear);
		}
		driver.findElement(By.xpath("//a[text()='"+requireddate+"']")).click();
		while(RequiredMonthInNum<actualmonthInNum || RequiredYearInNum<actualyearInNum )
		{
		driver.findElement(By.xpath("//span[text()='Prev']")).click();
		actualmonthyear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		str = actualmonthyear.split(" ");
		actualmonth = str[0];
		actualyear = str[1];
		actualmonthInNum = DateTimeFormatter.ofPattern("MMMM").
		withLocale(Locale.ENGLISH).
		parse(actualmonth).get(ChronoField.MONTH_OF_YEAR);
		actualyearInNum = Integer.parseInt(actualyear);
		}
		driver.findElement(By.xpath("//a[text()='"+requireddate+"']")).click();
		}
		}



	


