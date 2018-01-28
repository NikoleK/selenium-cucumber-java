package cucumber.steps;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.BrowserHelper;
import pages.AnimalSelectedPage;
import pages.FinalPage;
import pages.WelcomePage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ZooAdoptionStepsDefinition {

    private WelcomePage welcomePage;
    private AnimalSelectedPage secondPage;
    private FinalPage finalPage;

    @After
    public void tearDown(){
        BrowserHelper.closeWindow();
    }

    @Given("^Open url \"([^\"]*)\"$")
    public void openUrl(String url) {
        BrowserHelper.openWindow(url);
        welcomePage = new WelcomePage();
    }

    @When("^I fill field of first page with \"([^\"]*)\"$")
    public void enterNameOnWelcomePage(String name) {
        welcomePage.fillForm(name);
    }

    @Then("^\"([^\"]*)\" displayed below the text enter field$")
    public void checkNameOnWelcomePage(String expectedName) {
        assertEquals(expectedName, welcomePage.getLabelText());
    }

    @Given("^I click continue button on first page$")
    public void clickContinueButtonOnWelcomePage() {
       secondPage = welcomePage.clickContinue();
    }

    @Given("^I select \"([^\"]*)\" from drop down$")
    public void selectDropDownOnSelectionPage(String selection) {
        secondPage.selectAnimal(selection);
    }

    @Then(("^I click back button on second page$"))
    public void clickBackButtonOnSecondPage(){ secondPage.clickBack();}

    @When("^I click continue button on second page$")
    public void clickContinueButtonOnSelectionPage() {
        finalPage = secondPage.clickContinue();
    }

    @Then("^displayed text equals to the \"([^\"]*)\"$")
    public void checkTextOnFinalPage(String expectedTest) {
        assertEquals(expectedTest, finalPage.getLabelText());
    }

    @Then("^I click home button on final page$")
    public void clickHomeButtonOnFinalPage(){
        finalPage.clickHome();
    }

    @Then("^continue button disabled$")
    public void checkThatContinueButtonDisabled(){
        assertTrue(!welcomePage.continueButtonEnabled());
    }

}
