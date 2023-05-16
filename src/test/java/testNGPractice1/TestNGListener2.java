package testNGPractice1;

import org.testng.ITestListener;
import org.testng.ITestResult;

public  class TestNGListener2 implements ITestListener {
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Testcases failed "+ result.getName());
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Testcases skipped "+ result.getName());
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("Testcases start "+ result.getName());
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Testcases successed "+ result.getName());
	}
	
}