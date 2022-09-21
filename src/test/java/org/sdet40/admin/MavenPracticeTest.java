package org.sdet40.admin;

import org.sdet40.genericUtility.WebDriverUtility;
import org.testng.annotations.Test;

public class MavenPracticeTest {

@Test
public void step1Test() {
	String browser=System.getProperty("b");
	String url=System.getProperty("u");
	System.out.println("Browser name is"+browser);
	System.out.println("url is"+url);
	//WebDriverUtility webDriverUtility=new WebDriverUtility();
	//webDriverUtility.openApplication(null, url);
}
}
