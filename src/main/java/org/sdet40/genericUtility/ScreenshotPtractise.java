package org.sdet40.genericUtility;

import org.testng.annotations.Test;

public class ScreenshotPtractise {
	@Test
	public void screenShot() {
		ListenerImplementation.stest.assignAuthor("Kumuda");
		ListenerImplementation.stest.assignCategory("smoke");
		ListenerImplementation.stest.info("Browser launched successfully");
		ListenerImplementation.stest.info("Login successfully");
		ListenerImplementation.stest.info("Homepage displayed successfully");
		
	}
}
