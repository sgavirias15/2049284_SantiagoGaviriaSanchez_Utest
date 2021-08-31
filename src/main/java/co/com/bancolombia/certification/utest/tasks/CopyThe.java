package co.com.bancolombia.certification.utest.tasks;

import co.com.bancolombia.certification.utest.models.LogInInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.bancolombia.certification.utest.userinterfaces.LogInCredentials.*;
import static co.com.bancolombia.certification.utest.utils.Constants.CERO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CopyThe implements Task {
    private String email;
    private String password;

    public CopyThe(List<LogInInformation> logInInformation) {
        this.email = logInInformation.get(CERO).getEmail();
        this.password = logInInformation.get(CERO).getPassword();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(email).into(TXT_EMAIL_ADRESS),
                Enter.theValue(password).into(TXT_PASSWORD),
                Click.on(BTN_SIGN_IN)
        );
    }

    public static CopyThe incorrectInformation(List<LogInInformation> dataList) {
        return instrumented(CopyThe.class, dataList);
    }
}
