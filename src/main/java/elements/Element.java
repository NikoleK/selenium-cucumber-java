package elements;

import driver.BrowserHelper;
import exeption.ElementIsNotPresent;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Element {

    protected String xpath;
    private WebDriver driver = BrowserHelper.getDriver();

    protected Element(String xpath){
        this.xpath = xpath;
    }

    protected WebElement waitForElementPresent(){
        WebDriverWait wait = new WebDriverWait(driver, 1);
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        } catch (TimeoutException e) {
            throw new ElementIsNotPresent("Element with xpath: " + xpath + " can't be found");
        }
    }
}

