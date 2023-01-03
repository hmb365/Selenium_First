package Com.PackageFrameworks.XxResults;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners implements ITestListener {
    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("****** Test Started: " + iTestResult);
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("****** Test Success: " + iTestResult);
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("****** Test Fail: " + iTestResult);
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("****** Test Skipped: " + iTestResult);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        System.out.println("****** Test SuccessPercentage: " + iTestResult);
    }

    @Override
    public void onStart(ITestContext iTestContext) {
        System.out.println("****** Test has Started: " + iTestContext);
    }

    @Override
    public void onFinish(ITestContext iTestContext) {

        System.out.println("****** Test has Finished: " + iTestContext);

    }
}
