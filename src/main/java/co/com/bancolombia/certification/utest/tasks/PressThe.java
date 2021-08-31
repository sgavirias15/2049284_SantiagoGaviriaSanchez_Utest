package co.com.bancolombia.certification.utest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.bancolombia.certification.utest.userinterfaces.HomePage.BTN_LOG_IN;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PressThe implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_LOG_IN)
        );
    }

    public static PressThe logInButton() {
        return instrumented(PressThe.class);
    }
}
