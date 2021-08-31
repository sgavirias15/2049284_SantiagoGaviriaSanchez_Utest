package co.com.bancolombia.certification.utest.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certification.utest.userinterfaces.SignInCredentials.BTN_BACK_STEP;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectThe implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_BACK_STEP, WebElementStateMatchers.isEnabled()),
                Click.on(BTN_BACK_STEP)
        );
    }

    public static SelectThe theBackButton() {
        return instrumented(SelectThe.class);
    }
}
