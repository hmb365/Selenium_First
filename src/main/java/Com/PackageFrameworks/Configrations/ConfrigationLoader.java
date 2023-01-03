package Com.PackageFrameworks.Configrations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.io.FileNotFoundException;

public class ConfrigationLoader {

    public static ConficOptions conficOptions;
    public Properties properties;

    public void readRLConfigFile() throws IOException {
        properties=new Properties();
        File configFile=new File(System.getProperty("user.dir")+"/src/main/resources/Configs/appConfig.properties");
        properties.load(new FileInputStream(configFile));
    }

    public String getPropetries(String Name){
        return properties.getProperty(Name);

    }

    public void loadCOnfigrationfromFramework() throws IOException {
        conficOptions=new ConficOptions();

        readRLConfigFile();
        conficOptions.setBrowserType(getPropetries("browserType"));
        conficOptions.setPageLoad(Integer.parseInt(getPropetries("pageLoad")));
        conficOptions.setImplecitwait(Integer.parseInt(getPropetries("implecitwait")));
        conficOptions.setExplicitWait(Integer.parseInt(getPropetries("explicitWait")));
        conficOptions.setTakescreenshot(Boolean.parseBoolean(getPropetries("takescreenshot")));
        conficOptions.setChromePath(getPropetries("chromePath"));
        conficOptions.setEdgePath(getPropetries("EdgePath"));
        conficOptions.setHeadless(Boolean.parseBoolean(getPropetries("headless")));
        conficOptions.setGeckoPath(getPropetries("GeckoPath"));




    }


  public static void main(String[] args) throws IOException {
      ConfrigationLoader reader = new ConfrigationLoader();
      reader.loadCOnfigrationfromFramework();
       System.out.println(conficOptions.getBrowserType());
        System.out.println(conficOptions.isHeadless());
        System.out.println(conficOptions.getEdgePath());
      System.out.println(conficOptions.getChromePath());
      System.out.println(conficOptions.getGeckoPath());
   }

  }

