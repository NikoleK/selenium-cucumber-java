package elements;

public class Label extends Element {

    public Label(String xpath) {
        super(xpath);
    }

    public String getText(){
        return waitForElementPresent().getText();
    }

}
