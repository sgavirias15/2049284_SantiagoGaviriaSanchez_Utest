package co.com.bancolombia.certification.utest.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.bancolombia.certification.utest.userinterfaces.HomePage.BTN_SIGN_UP;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickOn implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_SIGN_UP)
        );
    }

    public static ClickOn joinTodayButton() {
        return instrumented(ClickOn.class);
    }
}
