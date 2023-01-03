package first_program;

import Com.PackageFrameworks.BaseMethods.Basetest2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners(Com.PackageFrameworks.XxResults.Listners.class)
public class TikTac extends Basetest2 {

    WebDriver driver;

    @Test (groups = {"X"})

    //VerifyWinningCombinationOf

    public void VerifyWinningCombinationOfX123() throws InterruptedException {

        baseutils2.launchURL("https://localline.github.io/QA-Automation-Specialist-Challenge/");
        Thread.sleep(5000);

        baseutils2.clickon("xpath:/html/body/section/div/div[1]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[4]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[2]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[5]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[3]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[3]");
        Thread.sleep(2000);

        WebElement X1= baseutils2.elementfind("xpath","/html/body/section/h2");
        String X11=X1.getText();
        String result="Player X has won!";
        String result1=X11;

        if (result==result1){
            System.out.println("Test Case Passed");
        }
        else {
            System.out.println("Result is not as Expected");
        }

        Assert.assertEquals(X11,result);
    }


    @Test (groups = "X")

    public void VerifyWinningCombinationOfX456() throws InterruptedException {

        baseutils2.launchURL("https://localline.github.io/QA-Automation-Specialist-Challenge/");
        Thread.sleep(5000);

        baseutils2.clickon("xpath:/html/body/section/div/div[4]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[1]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[5]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[3]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[6]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[9]");
        Thread.sleep(2000);

        WebElement X1= baseutils2.elementfind("xpath","/html/body/section/h2");
        String X11=X1.getText();
        String result="Player X has won!";
        String result1=X11;

        if (result==result1){
            System.out.println("Test Case Passed");
        }
        else {
            System.out.println("Result is not as Expected");
        }

        Assert.assertEquals(X11,result);

    }

    @Test (groups = {"X"})

    public void VerifyWinningCombinationOfX789() throws InterruptedException {

        baseutils2.launchURL("https://localline.github.io/QA-Automation-Specialist-Challenge/");
        Thread.sleep(5000);

        baseutils2.clickon("xpath:/html/body/section/div/div[7]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[1]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[8]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[4]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[9]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[3]");
        Thread.sleep(2000);

        WebElement X1= baseutils2.elementfind("xpath","/html/body/section/h2");
        String X11=X1.getText();
        String result="Player X has won!";
        String result1=X11;

        if (result==result1){
            System.out.println("Test Case Passed");
        }
        else {
            System.out.println("Result is not as Expected");
        }

        Assert.assertEquals(X11,result);

    }

    @Test (groups = {"X"})

    public void VerifyWinningCombinationOfX147() throws InterruptedException {

        baseutils2.launchURL("https://localline.github.io/QA-Automation-Specialist-Challenge/");
        Thread.sleep(5000);

        baseutils2.clickon("xpath:/html/body/section/div/div[1]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[5]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[4]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[9]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[7]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[2]");
        Thread.sleep(2000);

        WebElement X1= baseutils2.elementfind("xpath","/html/body/section/h2");
        String X11=X1.getText();
        String result="Player X has won!";
        String result1=X11;

        if (result==result1){
            System.out.println("Test Case Passed");
        }
        else {
            System.out.println("Result is not as Expected");
        }

        Assert.assertEquals(X11,result);

    }

    @Test (groups = {"X"})

    public void VerifyWinningCombinationOfX258() throws InterruptedException {

        baseutils2.launchURL("https://localline.github.io/QA-Automation-Specialist-Challenge/");
        Thread.sleep(5000);

        baseutils2.clickon("xpath:/html/body/section/div/div[5]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[1]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[2]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[9]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[8]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[3]");
        Thread.sleep(2000);

        WebElement X1= baseutils2.elementfind("xpath","/html/body/section/h2");
        String X11=X1.getText();
        String result="Player X has won!";
        String result1=X11;

        if (result==result1){
            System.out.println("Test Case Passed");
        }
        else {
            System.out.println("Result is not as Expected");
        }

        Assert.assertEquals(X11,result);

    }

    @Test (groups = {"X"})

    public void VerifyWinningCombinationOfX369() throws InterruptedException {

        baseutils2.launchURL("https://localline.github.io/QA-Automation-Specialist-Challenge/");
        Thread.sleep(5000);

        baseutils2.clickon("xpath:/html/body/section/div/div[9]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[1]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[3]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[7]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[6]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[5]");
        Thread.sleep(2000);

        WebElement X1= baseutils2.elementfind("xpath","/html/body/section/h2");
        String X11=X1.getText();
        String result="Player X has won!";
        String result1=X11;

        if (result==result1){
            System.out.println("Test Case Passed");
        }
        else {
            System.out.println("Result is not as Expected");
        }

        Assert.assertEquals(X11,result);

    }

    @Test (groups = {"X"})

    public void VerifyWinningCombinationOfX159() throws InterruptedException {

        baseutils2.launchURL("https://localline.github.io/QA-Automation-Specialist-Challenge/");
        Thread.sleep(5000);

        baseutils2.clickon("xpath:/html/body/section/div/div[9]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[3]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[1]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[7]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[5]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[3]");
        Thread.sleep(2000);

        WebElement X1= baseutils2.elementfind("xpath","/html/body/section/h2");
        String X11=X1.getText();
        String result="Player X has won!";
        String result1=X11;

        if (result==result1){
            System.out.println("Test Case Passed");
        }
        else {
            System.out.println("Result is not as Expected");
        }

        Assert.assertEquals(X11,result);

    }

    @Test (groups = {"X"})

    public void VerifyWinningCombinationOfX753() throws InterruptedException {

        baseutils2.launchURL("https://localline.github.io/QA-Automation-Specialist-Challenge/");
        Thread.sleep(5000);

        baseutils2.clickon("xpath:/html/body/section/div/div[5]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[2]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[3]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[9]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[7]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[3]");
        Thread.sleep(2000);

        WebElement X1= baseutils2.elementfind("xpath","/html/body/section/h2");
        String X11=X1.getText();
        String result="Player X has won!";
        String result1=X11;

        if (result==result1){
            System.out.println("Test Case Passed");
        }
        else {
            System.out.println("Result is not as Expected");
        }

        Assert.assertEquals(X11,result);

    }
//_____________________________________________________________________________________________________________
    @Test (groups = {"O"})

    public void VerifyWinningCombinationOfO123() throws InterruptedException {

        baseutils2.launchURL("https://localline.github.io/QA-Automation-Specialist-Challenge/");
        Thread.sleep(5000);

        baseutils2.clickon("xpath:/html/body/section/div/div[5]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[1]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[4]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[2]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[7]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[3]");
        Thread.sleep(2000);

        WebElement X1= baseutils2.elementfind("xpath","/html/body/section/h2");
        String X11=X1.getText();
        String result="Player O has won!";
        String result1=X11;

        if (result==result1){
            System.out.println("Test Case Passed");
        }
        else {
            System.out.println("Result is not as Expected");
        }

        Assert.assertEquals(X11,result);

    }

    @Test (groups = {"O"})

    public void VerifyWinningCombinationOfO456() throws InterruptedException {

        baseutils2.launchURL("https://localline.github.io/QA-Automation-Specialist-Challenge/");
        Thread.sleep(5000);

        baseutils2.clickon("xpath:/html/body/section/div/div[2]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[4]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[7]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[6]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[1]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[5]");
        Thread.sleep(2000);

        WebElement X1= baseutils2.elementfind("xpath","/html/body/section/h2");
        String X11=X1.getText();
        String result="Player O has won!";
        String result1=X11;

        if (result==result1){
            System.out.println("Test Case Passed");
        }
        else {
            System.out.println("Result is not as Expected");
        }

        Assert.assertEquals(X11,result);

    }

    @Test (groups = {"O"})

    public void VerifyWinningCombinationOfO789() throws InterruptedException {

        baseutils2.launchURL("https://localline.github.io/QA-Automation-Specialist-Challenge/");
        Thread.sleep(5000);

        baseutils2.clickon("xpath:/html/body/section/div/div[4]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[8]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[2]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[9]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[1]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[7]");
        Thread.sleep(2000);

        WebElement X1= baseutils2.elementfind("xpath","/html/body/section/h2");
        String X11=X1.getText();
        String result="Player O has won!";
        String result1=X11;

        if (result==result1){
            System.out.println("Test Case Passed");
        }
        else {
            System.out.println("Result is not as Expected");
        }

        Assert.assertEquals(X11,result);


    }

    @Test (groups = {"O"})

    public void VerifyWinningCombinationOfO147() throws InterruptedException {

        baseutils2.launchURL("https://localline.github.io/QA-Automation-Specialist-Challenge/");
        Thread.sleep(5000);

        baseutils2.clickon("xpath:/html/body/section/div/div[9]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[7]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[5]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[1]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[8]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[4]");
        Thread.sleep(2000);

        WebElement X1= baseutils2.elementfind("xpath","/html/body/section/h2");
        String X11=X1.getText();
        String result="Player O has won!";
        String result1=X11;

        if (result==result1){
            System.out.println("Test Case Passed");
        }
        else {
            System.out.println("Result is not as Expected");
        }

        Assert.assertEquals(X11,result);


    }

    @Test (groups = {"O"})

    public void VerifyWinningCombinationOfO258() throws InterruptedException {

        baseutils2.launchURL("https://localline.github.io/QA-Automation-Specialist-Challenge/");
        Thread.sleep(5000);

        baseutils2.clickon("xpath:/html/body/section/div/div[6]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[5]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[7]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[8]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[1]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[2]");
        Thread.sleep(2000);

        WebElement X1= baseutils2.elementfind("xpath","/html/body/section/h2");
        String X11=X1.getText();
        String result="Player O has won!";
        String result1=X11;

        if (result==result1){
            System.out.println("Test Case Passed");
        }
        else {
            System.out.println("Result is not as Expected");
        }

        Assert.assertEquals(X11,result);


    }

    @Test (groups = {"O"})

    public void VerifyWinningCombinationOfO369() throws InterruptedException {

        baseutils2.launchURL("https://localline.github.io/QA-Automation-Specialist-Challenge/");
        Thread.sleep(5000);

        baseutils2.clickon("xpath:/html/body/section/div/div[2]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[9]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[8]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[6]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[1]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[3]");
        Thread.sleep(2000);

        WebElement X1= baseutils2.elementfind("xpath","/html/body/section/h2");
        String X11=X1.getText();
        String result="Player O has won!";
        String result1=X11;

        if (result==result1){
            System.out.println("Test Case Passed");
        }
        else {
            System.out.println("Result is not as Expected");
        }

        Assert.assertEquals(X11,result);


    }

    @Test (groups = {"O"})

    public void VerifyWinningCombinationOfO159() throws InterruptedException {

        baseutils2.launchURL("https://localline.github.io/QA-Automation-Specialist-Challenge/");
        Thread.sleep(5000);

        baseutils2.clickon("xpath:/html/body/section/div/div[2]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[9]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[7]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[1]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[6]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[5]");
        Thread.sleep(2000);

        WebElement X1= baseutils2.elementfind("xpath","/html/body/section/h2");
        String X11=X1.getText();
        String result="Player O has won!";
        String result1=X11;

        if (result==result1){
            System.out.println("Test Case Passed");
        }
        else {
            System.out.println("Result is not as Expected");
        }

        Assert.assertEquals(X11,result);


    }

    @Test (groups = {"O"})

    public void VerifyWinningCombinationOfO753() throws InterruptedException {


        baseutils2.launchURL("https://localline.github.io/QA-Automation-Specialist-Challenge/");
        Thread.sleep(5000);

        baseutils2.clickon("xpath:/html/body/section/div/div[8]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[5]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[2]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[3]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[1]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[7]");
        Thread.sleep(2000);

        WebElement X1= baseutils2.elementfind("xpath","/html/body/section/h2");
        String X11=X1.getText();
        String result="Player O has won!";
        String result1=X11;

        if (result==result1){
            System.out.println("Test Case Passed");
        }
        else {
            System.out.println("Result is not as Expected");
        }

        Assert.assertEquals(X11,result);


    }

    //-----------------------------------------------------------------------------------------------------------

    @Test (groups = {"N"})

    public void N1() throws InterruptedException {


        baseutils2.launchURL("https://localline.github.io/QA-Automation-Specialist-Challenge/");
        Thread.sleep(5000);

        baseutils2.clickon("xpath:/html/body/section/div/div[9]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[8]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[6]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[5]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[2]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[1]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[4]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[3]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[7]");
        Thread.sleep(2000);

        WebElement X1= baseutils2.elementfind("xpath","/html/body/section/h2");
        String X11=X1.getText();
        System.out.println("Result of the Game:" +  X11);

    }

    @Test (groups = {"N"})

    public void N2() throws InterruptedException {

        //Match Draw

        baseutils2.launchURL("https://localline.github.io/QA-Automation-Specialist-Challenge/");
        Thread.sleep(5000);

        baseutils2.clickon("xpath:/html/body/section/div/div[1]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[4]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[7]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[2]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[5]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[8]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[3]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[9]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[6]");
        Thread.sleep(2000);

        WebElement X1= baseutils2.elementfind("xpath","/html/body/section/h2");
        String X11=X1.getText();
        System.out.println("Result of the Game:" +  X11);

    }

    @Test (groups = {"N"})

    public void N3() throws InterruptedException {

        // O 158

        baseutils2.launchURL("https://localline.github.io/QA-Automation-Specialist-Challenge/");
        Thread.sleep(5000);

        baseutils2.clickon("xpath:/html/body/section/div/div[7]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[1]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[2]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[8]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[6]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[9]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[3]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[5]");
        Thread.sleep(2000);

        baseutils2.clickon("xpath:/html/body/section/div/div[2]");
        Thread.sleep(2000);

        WebElement X1= baseutils2.elementfind("xpath","/html/body/section/h2");
        String X11=X1.getText();
        System.out.println("Result of the Game:" +  X11);

    }


}
