package co.com.bancolombia.certification.utest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certification.utest.userinterfaces.SignInCredentials.BTN_NEXT_STEP;

public class CheckNextStepButton implements Question {


    @Override
    public Object answeredBy(Actor actor) {
        return BTN_NEXT_STEP.resolveFor(actor).isDisabled();
    }

    public static CheckNextStepButton isInactive() {
        return new CheckNextStepButton();
    }
}
