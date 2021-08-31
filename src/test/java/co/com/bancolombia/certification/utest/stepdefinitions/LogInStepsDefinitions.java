package co.com.bancolombia.certification.utest.stepdefinitions;

import co.com.bancolombia.certification.utest.interactions.ClickOn;
import co.com.bancolombia.certification.utest.models.LogInInformation;
import co.com.bancolombia.certification.utest.questions.ObserveTheCorrect;
import co.com.bancolombia.certification.utest.questions.VerifyForgotPassword;
import co.com.bancolombia.certification.utest.questions.VerifyInvalid;
import co.com.bancolombia.certification.utest.questions.VerifySignInButton;
import co.com.bancolombia.certification.utest.tasks.AddThe;
import co.com.bancolombia.certification.utest.tasks.CopyThe;
import co.com.bancolombia.certification.utest.tasks.PressThe;
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

public class LogInStepsDefinitions {
    @Managed
    private WebDriver chrome;

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(chrome)));
        OnStage.theActorCalled("santiago");
    }
    @Given("^that the user is on the utest main page$")
    public void thatTheUserIsOnTheUtestMainPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.utest.com/"));
    }

    @When("^the user selects the log in button$")
    public void theUserSelectsTheLogInButton() {
        OnStage.theActorInTheSpotlight().attemptsTo(PressThe.logInButton());
    }



    @And("^the user fills the fields with his log in information$")
    public void theUserFillsTheFieldsWithHisLogInInformation(List <LogInInformation> dataList) {
        OnStage.theActorInTheSpotlight().attemptsTo(AddThe.logInInformation(dataList));
    }

    @Then("^The user must see that the email entered is the same as indicated on the screen$")
    public void theUserMustSeeThatTheEmailEnteredIsTheSameAsIndicatedOnTheScreen() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ObserveTheCorrect.emailInformation(), Matchers.is(true)));
    }





    @And("^the user fills the fields with invalid information$")
    public void theUserFillsTheFieldsWithInvalidInformation(List <LogInInformation> dataList) {
        OnStage.theActorInTheSpotlight().attemptsTo(CopyThe.incorrectInformation(dataList));
    }

    @Then("^the user should see the follow message (.*)$")
    public void theUserShouldSeeTheFollowMessageInvalidUsernameOrPassword(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyInvalid.emailAndOrPasswordInformation(), Matchers.equalTo(message)));
    }




    @Then("^the user should see the sign in button inactive$")
    public void theUserShouldSeeTheSignInButtonInactive() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifySignInButton.isDisabled(), Matchers.is(true)));
    }



    @Then("^the user would see the forgot password button exist$")
    public void theUserWouldSeeTheForgotPasswordButtonExist() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyForgotPassword.isEnabled(), Matchers.is(true)));
    }
}
