package co.com.bancolombia.certification.utest.tasks;

import co.com.bancolombia.certification.utest.models.SignInInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.bancolombia.certification.utest.userinterfaces.SignInCredentials.*;
import static co.com.bancolombia.certification.utest.utils.Constants.CERO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterInformation implements Task {

    private String firstName;
    private String lastName;
    private String email;
    private String month;
    private String day;
    private String year;
    private String city;
    private String zip;
    private String password;
    private String confirmPassword;

    public EnterInformation(List<SignInInformation> signInInformationList) {
        this.firstName = signInInformationList.get(CERO).getFirstName();
        this.lastName = signInInformationList.get(CERO).getLastName();
        this.email = signInInformationList.get(CERO).getEmail();
        this.month = signInInformationList.get(CERO).getMonth();
        this.day = signInInformationList.get(CERO).getDay();
        this.year = signInInformationList.get(CERO).getYear();
        this.city = signInInformationList.get(CERO).getCity();
        this.zip = signInInformationList.get(CERO).getZip();
        this.password = signInInformationList.get(CERO).getPassword();
        this.confirmPassword = signInInformationList.get(CERO).getConfirmPassword();

    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(firstName).into(TXT_FIRSTNAME),
                Enter.theValue(lastName).into(TXT_LASTNAME),
                Enter.theValue(email).into(TXT_EMAIL),
                SelectFromOptions.byVisibleText(month).from(TXT_MONTH),
                SelectFromOptions.byVisibleText(day).from(TXT_DAY),
                SelectFromOptions.byVisibleText(year).from(TXT_YEAR),
                Click.on(BTN_NEXT_STEP),
                Enter.theValue(city).into(TXT_CITY),
                Hit.the(Keys.ARROW_DOWN).into(TXT_CITY),
                Hit.the(Keys.TAB).into(TXT_CITY),
                Enter.theValue(zip).into(TXT_ZIP),
                Click.on(BTN_NEXT_STEP),
                Click.on(BTN_NEXT_STEP),
                Enter.theValue(password).into(TXT_PASS),
                Enter.theValue(confirmPassword).into(TXT_CONFIRM_PASS),
                /*Click.on(CHK_TERMS),
                Click.on(CHK_PRIVACY)*/
                Click.on(BTN_NEXT_STEP)

        );
    }

    public static EnterInformation upToLastStep(List<SignInInformation> dataList) {
        return instrumented(EnterInformation.class, dataList);
    }
}
