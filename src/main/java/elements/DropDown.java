package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DropDown extends Element {

    public DropDown(String xpath) {
        super(xpath);
    }

    public List<String> getValues(){
        Select select = new Select(waitForElementPresent());
        List<String> res = new ArrayList<String>(select.getOptions().size());
        for(WebElement e : select.getOptions()){
            res.add(e.getText());
        }
        return res;
    }

    public void selectByText(String text){
        Select select = new Select(waitForElementPresent());
        select.selectByVisibleText(text);
    }
}
