package Com.PackageFrameworks.BaseMethods;

import Com.PackageFrameworks.Configrations.ConfrigationLoader;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

public class Basetest2 {



 public Baseutils2 baseutils2;
 public BaseAssert baseAssert;
    public WebDriver driver;



    @BeforeSuite

    public void loadconfigration() throws IOException {
        ConfrigationLoader confrigationLoader=new ConfrigationLoader();
        confrigationLoader.loadCOnfigrationfromFramework();}



   @BeforeTest
   public void browser(){
        baseutils2=new Baseutils2(driver);
     driver=baseutils2.launchbrowser();


   }

   @AfterTest
   public void closebrowser(){
       baseutils2.close();
   }
}
