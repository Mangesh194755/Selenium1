package testNGPractice1;

import org.testng.annotations.Test;

public class TestNG5 {
	
	@Test(invocationCount = 5)
	public void type() {
		System.out.println("Hello, this should repeat");
	}

}
