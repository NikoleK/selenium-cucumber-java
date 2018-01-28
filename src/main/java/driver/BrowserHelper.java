package driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

public class BrowserHelper {

    private static WebDriver driver;
    private static int screenshotNumber = 0;

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

    public static void takeScreenShot(){
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File("./image/" + screenshotNumber));
            screenshotNumber ++;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}