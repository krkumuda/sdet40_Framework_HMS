package org.sdet40.admin;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGRetryFailDemo {
@Test
public void test1() {
	System.out.println("Im test 1");
}
@Test
public void test2() {
	System.out.println("Im test 2");
}
@Test(retryAnalyzer = TestNgDemo.RetryImpClass.class)
public void test3() {
	System.out.println("Im test 3");
	//Assert.assertTrue(0>1);
}
}
