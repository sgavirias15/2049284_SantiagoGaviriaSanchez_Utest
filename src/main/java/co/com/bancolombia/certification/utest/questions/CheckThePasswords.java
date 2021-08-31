package co.com.bancolombia.certification.utest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certification.utest.userinterfaces.SignInCredentials.MSG_CONFIRM_PASS;

public class CheckThePasswords implements Question {


    @Override
    public Object answeredBy(Actor actor) {
        return MSG_CONFIRM_PASS.resolveFor(actor).isVisible();
    }

    public static CheckThePasswords matchEachOther() {
        return new CheckThePasswords();
    }
}
