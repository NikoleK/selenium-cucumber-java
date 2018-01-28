package driver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserHelper {

    private static WebDriver driver;

    public static void openWindow(String url){
        driver = new FirefoxDriver();
        driver.manage().window().setSize(new Dimension(1382,744));
        driver.manage().deleteAllCookies();
        driver.get(url);
    }

    public static void closeWindow(){
        driver.close();
    }

    public static WebDriver getDriver(){
        return driver;
    }

}