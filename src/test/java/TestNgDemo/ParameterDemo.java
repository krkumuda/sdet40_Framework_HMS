package TestNgDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo {
	@Test
	@Parameters("peru")
public void Test1(String peru) {
	System.out.println("My name is "+peru);
}
}
