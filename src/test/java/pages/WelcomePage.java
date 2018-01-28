package pages;

import elements.Button;
import elements.Input;
import elements.Label;

public class WelcomePage {

    private static final String XPATH_CONTINUE_BUTTON = "//button[@id='continue_button']";
    private static final String XPATH_TABLE_DIV = "//table[@id='table1']/tbody/tr[2]/td/div";
    private static final String XPATH_NAME_INPUT = XPATH_TABLE_DIV + "/p/input";
    private static final String XPATH_NAME_LABEL = XPATH_TABLE_DIV + "/h2";

    private Button continueButton;
    private Input nameInput;
    private Label nameLabel;

    public WelcomePage(){
        continueButton = new Button(XPATH_CONTINUE_BUTTON);
        nameInput = new Input(XPATH_NAME_INPUT);
        nameLabel = new Label(XPATH_NAME_LABEL);
    }

    public AnimalSelectedPage clickContinue(){
        continueButton.clickButton();
        return new AnimalSelectedPage();
    }

    public void fillForm(String name){
        nameInput.type(name);
    }

    public String getLabelText(){
        return nameLabel.getText();
    }

    public boolean continueButtonEnabled() {
        return continueButton.isEnabled();
    }
}
