package TestNgDemo;

import org.testng.annotations.Test;

public class GroupDemo {
	@Test(groups = { "regression", "smoke" })
	  public void testMethod1() {
		 System.out.println("method1");
	  }
	 
	  @Test(groups = {"regression" } )
	  public void testMethod2() {
		  System.out.println("method2");
	  }
	 
	  @Test(groups = { "smoke" })
	  public void testMethod3() {
		  System.out.println("method3");
	  }
	}


