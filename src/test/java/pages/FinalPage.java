package pages;

import elements.Button;
import elements.Label;

public class FinalPage {
    private static final String XPATH_BACK_TO_HOME_BUTTON = "//button[@id='back_button']";
    private static final String XPATH_THANK_YOU_TEXT = "//table[@id='table1']/tbody/tr[2]/td/div/p";

    private Button continueButton;
    private Label thankYouLabel;

    public FinalPage(){
        thankYouLabel = new Label(XPATH_THANK_YOU_TEXT);
        continueButton = new Button(XPATH_BACK_TO_HOME_BUTTON);
    }
    public String getLabelText(){
        return thankYouLabel.getText();
    }
    public void clickHome(){
        continueButton.clickButton();
    }


}
