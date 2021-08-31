package co.com.bancolombia.certification.utest.stepdefinitions;

import co.com.bancolombia.certification.utest.interactions.ClickOn;
import co.com.bancolombia.certification.utest.interactions.SelectThe;
import co.com.bancolombia.certification.utest.models.SignInInformation;
import co.com.bancolombia.certification.utest.questions.*;
import co.com.bancolombia.certification.utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static co.com.bancolombia.certification.utest.utils.Constants.TXT_DESCRIPTION_STEP_THREE;

public class CreteAccountStepsDefinitions {

    @Managed
    private WebDriver chrome;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(chrome)));
        OnStage.theActorCalled("santiago");
    }

    @Given("^that the user is on the main page$")
    public void thatTheUserIsOnTheMainPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.utest.com/"));
    }

    @When("^the user selects the join today button$")
    public void theUserSelectsTheJoinTodayButton() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickOn.joinTodayButton());
    }

    @And("^the user fills in his personal information$")
    public void theUserFillsInHisPersonalInformation(List <SignInInformation> dataList) {
        OnStage.theActorInTheSpotlight().attemptsTo(Fill.credentials(dataList));
    }

    @Then("^the user should see the word (.*)$")
    public void theUserShouldSeeTheWordWelcome(String messageExpected) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateTextOf.successfulAcountCreation(), Matchers.containsString(messageExpected)));
    }





    @And("^the user enters the email with a incorrect format$")
    public void theUserEntersTheEmailWithAIncorrectFormat(List <SignInInformation> dataList) {
        OnStage.theActorInTheSpotlight().attemptsTo(EnterAn.invalidEmail(dataList));
    }

    @Then("^the user would see the following sentence (.*)$")
    public void theUserWouldSeeTheFollowingSentenceEnterValidEmail(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CheckA.wrongEmail(), Matchers.equalTo(message)));
    }




    @And("^the user leaves empty fields in the form$")
    public void theUserLeavesEmptyFieldsInTheForm(List <SignInInformation> dataList) {
        OnStage.theActorInTheSpotlight().attemptsTo(EnterIncomplete.requiredInformation(dataList));
    }

    @Then("^the user will not be able to continue to the next step$")
    public void theUserWillNotBeAbleToContinueToTheNextStep() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(StayAt.stepOne(chrome), Matchers.is(true)));
    }






    @And("^the user leaves empty some fields in the form$")
    public void theUserLeavesEmptySomeFieldsInTheForm(List <SignInInformation> dataList) {
        OnStage.theActorInTheSpotlight().attemptsTo(EnterIncomplete.requiredInformation(dataList));
    }

    @Then("^the user should see next step button disabled$")
    public void theUserShouldSeeNextStepButtonDisabled() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CheckNextStepButton.isInactive(), Matchers.is(true)));
    }





    @And("^the user fills in all his personal information$")
    public void theUserFillsInAllHisPersonalInformation(List <SignInInformation> dataList) {
        OnStage.theActorInTheSpotlight().attemptsTo(FillOut.someCredentials(dataList));
    }

    @Then("^the user would see the second form named (.*)$")
    public void theUserWouldSeeTheSecondFormNamedAddYourAddress(String title) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CheckThe.tittleOfTheSecondStep(), Matchers.equalTo(title)));
    }




    @And("^the user fills in his information$")
    public void theUserFillsInHisInformation(List <SignInInformation> dataList) {
        OnStage.theActorInTheSpotlight().attemptsTo(FillOut.someCredentials(dataList));
    }

    @And("^the user clicks on the back button$")
    public void theUserClicksOnTheBackButton() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectThe.theBackButton());
    }

    @Then("^the user should see the first form named (.*)$")
    public void theUserShouldSeeTheFirstFormNamedTellUsAboutYourself(String title) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ObserveThe.titleOfTheFirstStep(), Matchers.equalTo(title)));
    }






    @And("^the user fills in all the personal information of the steps one and two$")
    public void theUserFillsInAllThePersonalInformationOfTheStepsOneAndTwo(List <SignInInformation> dataList) {
        OnStage.theActorInTheSpotlight().attemptsTo(FillInThe.informationUpToStepThree(dataList));
    }

    @Then("^the user would see the following description$")
    public void theUserWouldSeeTheFollowingDescription() {
        String description = TXT_DESCRIPTION_STEP_THREE;
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CheckingThe.stepThreeDescription(), Matchers.equalTo(description)));
    }





    @And("^the user fills in all the personal information of the steps one two and three$")
    public void theUserFillsInAllThePersonalInformationOfTheStepsOneTwoAndThree(List <SignInInformation> dataList) {
        OnStage.theActorInTheSpotlight().attemptsTo(EnterThe.informationUpToStepFour(dataList));
    }

    @Then("^the user should see that the passwords match$")
    public void theUserShouldSeeThatThePasswordsMatch() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CheckThePasswords.matchEachOther(), Matchers.is(false)));
    }





    @And("^the user fills in all the personal information up to step four$")
    public void theUserFillsInAllThePersonalInformationUpToStepFour(List <SignInInformation> dataList) {
        OnStage.theActorInTheSpotlight().attemptsTo(EnterInformation.upToLastStep(dataList));
    }

    @Then("^the user should see that it is not possible to continue if he does not select the checks$")
    public void theUserShouldSeeThatItIsNotPossibleToContinueIfHeDoesNotSelectTheChecks() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CheckThatIsNotPossible.continueIfHasNotSelectTheChecks(), Matchers.is(true)));
    }
}
