package co.com.bancolombia.certification.utest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certification.utest.userinterfaces.LogInCredentials.BTN_FORGOT_PASSWORD;

public class VerifyForgotPassword implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return BTN_FORGOT_PASSWORD.resolveFor(actor).isEnabled();
    }

    public static VerifyForgotPassword isEnabled() {
        return new VerifyForgotPassword();
    }
}
