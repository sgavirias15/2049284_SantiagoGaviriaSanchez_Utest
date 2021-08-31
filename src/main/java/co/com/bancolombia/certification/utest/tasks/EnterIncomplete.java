package co.com.bancolombia.certification.utest.tasks;

import co.com.bancolombia.certification.utest.models.SignInInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.bancolombia.certification.utest.userinterfaces.SignInCredentials.*;
import static co.com.bancolombia.certification.utest.utils.Constants.CERO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterIncomplete implements Task {

    private String lastName;
    private String email;

    public EnterIncomplete(List<SignInInformation> signInInformationList) {
        this.lastName = signInInformationList.get(CERO).getLastName();
        this.email = signInInformationList.get(CERO).getEmail();
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(lastName).into(TXT_LASTNAME),
                Enter.theValue(email).into(TXT_EMAIL),
                Click.on(BTN_NEXT_STEP)
        );
    }

    public static EnterIncomplete requiredInformation(List<SignInInformation> dataList) {
        return instrumented(EnterIncomplete.class, dataList);
    }
}

