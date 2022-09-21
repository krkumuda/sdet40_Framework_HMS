package org.sdet40.admin;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerTest {
	//if we are having more than 20 steps in test case-->Store all the testcases in module wise package-->className =testcasename, testAnnotationMethodName=stepName
	//if you are having 5 to 10 steps in tc-->storing all the testcases in single package-->className=modulename, testAnnotationMehtodName=testcaseName
		@BeforeMethod
		public void createCustomerTes() {
			System.out.println("print customer details");
}
		@Test(priority=-1)
		public void modifyCustomerTest() {
			System.out.println("modify customer");
		}

		@Test(priority=2)
		public void deleteCustomerTest() {
			System.out.println("delete customer");
		}
}
