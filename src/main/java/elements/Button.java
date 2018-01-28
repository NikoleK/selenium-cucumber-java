package elements;

public class Button extends Element {


    public Button(String xpath) {
        super(xpath);
    }

    public void clickButton() {
        waitForElementPresent().click();
    }

    public boolean isEnabled(){
        return waitForElementPresent().isEnabled();
    }
}
