package Com.PackageFrameworks.Configrations;

public class ConficOptions {


    private   String browserType;
    private     int implecitwait;
    private   int pageLoad;
    private    int explicitWait;
    private    boolean takescreenshot;
    private  String chromePath;
    private   String EdgePath;
    private    boolean headless;
    private String geckoPath;

    public String getGeckoPath() {
        return geckoPath;
    }

    public void setGeckoPath(String geckoPath) {
        this.geckoPath = geckoPath;
    }








    public  String getBrowserType() {
        return browserType;
    }

    public  void setBrowserType(String browserType) {
        this.browserType = browserType;
    }

    public  int getImplecitwait() {
        return implecitwait;
    }

    public  void setImplecitwait(int implecitwait) {
        this.implecitwait = implecitwait;
    }

    public  int getPageLoad() {
        return pageLoad;
    }

    public  void setPageLoad(int pageLoad) {
        this.pageLoad = pageLoad;
    }

    public  int getExplicitWait() {
        return explicitWait;
    }

    public  void setExplicitWait(int explicitWait) {
        this.explicitWait = explicitWait;
    }

    public  boolean isTakescreenshot() {
        return takescreenshot;
    }

    public  void setTakescreenshot(boolean takescreenshot) {
        this.takescreenshot = takescreenshot;
    }

    public  String getChromePath() {
        return chromePath;
    }

    public  void setChromePath(String chromePath) {
        this.chromePath = chromePath;
    }

    public  String getEdgePath() {
        return EdgePath;
    }

    public  void setEdgePath(String edgePath) {
        this.EdgePath = edgePath;
    }

    public  boolean isHeadless() {
        return headless;
    }

    public  void setHeadless(boolean headless) {
        this.headless = headless;
    }









}
