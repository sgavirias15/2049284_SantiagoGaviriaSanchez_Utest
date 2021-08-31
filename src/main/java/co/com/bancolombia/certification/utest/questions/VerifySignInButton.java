package co.com.bancolombia.certification.utest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certification.utest.userinterfaces.LogInCredentials.BTN_SIGN_IN;

public class VerifySignInButton implements Question {


    @Override
    public Object answeredBy(Actor actor) {
        return BTN_SIGN_IN.resolveFor(actor).isDisabled();
    }

    public static VerifySignInButton isDisabled() {
        return new VerifySignInButton();
    }
}
