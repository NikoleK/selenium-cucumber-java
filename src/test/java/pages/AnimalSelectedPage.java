package pages;

import elements.Button;
import elements.DropDown;

public class AnimalSelectedPage {
    private static final String XPATH_CONTINUE_BUTTON = "//button[@id='continue_button']";
    private static final String XPATH_BACK_BUTTON = "//button[@id='back_button']";
    private static final String XPATH_DROP_DOWN = "//table[@id='table1']/tbody/tr[2]/td/div/select";

    private Button continueButton;
    private Button backButton;
    private DropDown animal;

    public AnimalSelectedPage(){
        continueButton = new Button(XPATH_CONTINUE_BUTTON);
        backButton = new Button(XPATH_BACK_BUTTON);
        animal = new DropDown(XPATH_DROP_DOWN);
    }

    public FinalPage clickContinue(){
        continueButton.clickButton();
        return new FinalPage();
    }

    public WelcomePage clickBack(){
        backButton.clickButton();
        return new WelcomePage();
    }

    public void selectAnimal(String name){
        animal.selectByText(name);
    }
}
