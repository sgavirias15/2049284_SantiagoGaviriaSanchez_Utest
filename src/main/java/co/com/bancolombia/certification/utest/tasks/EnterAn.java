package co.com.bancolombia.certification.utest.tasks;

import co.com.bancolombia.certification.utest.models.SignInInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.bancolombia.certification.utest.userinterfaces.SignInCredentials.*;
import static co.com.bancolombia.certification.utest.utils.Constants.CERO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterAn implements Task {

    private String firstName;
    private String lastName;
    private String email;

    public EnterAn(List<SignInInformation> signInInformationList) {
        this.firstName = signInInformationList.get(CERO).getFirstName();
        this.lastName = signInInformationList.get(CERO).getLastName();
        this.email = signInInformationList.get(CERO).getEmail();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(firstName).into(TXT_FIRSTNAME),
                Enter.theValue(lastName).into(TXT_LASTNAME),
                Enter.theValue(email).into(TXT_EMAIL)
        );
    }

    public static EnterAn invalidEmail(List<SignInInformation> dataList) {
        return instrumented(EnterAn.class, dataList);
    }
}
