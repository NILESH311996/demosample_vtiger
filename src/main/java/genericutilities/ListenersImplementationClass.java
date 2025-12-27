package genericutilities;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ListenersImplementationClass implements ITestListener {
	ExtentReports report;
	ExtentTest test;

	public static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();

	/**
	 * Invoked when a test method starts execution.
	 *
	 * @param result the result of the test method execution
	 */

	@Override
	public void onTestStart(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		test = report.createTest(methodName);
		extentTest.set(test);
		extentTest.get().log(Status.INFO, methodName + "execution starst");
	}
}
