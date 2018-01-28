package elements;

import org.openqa.selenium.WebElement;

public class Input extends Element {

    public Input (String xpath){
        super(xpath);
    }

    public void type(String text){
        WebElement element = waitForElementPresent();
        element.clear();
        element.sendKeys(text);
    }
}

