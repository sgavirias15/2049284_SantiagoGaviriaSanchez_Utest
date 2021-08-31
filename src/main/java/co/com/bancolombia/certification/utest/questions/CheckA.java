package co.com.bancolombia.certification.utest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.bancolombia.certification.utest.userinterfaces.SignInCredentials.MSG_INVALID_EMAIL;

public class CheckA implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(MSG_INVALID_EMAIL).viewedBy(actor).asString();
    }

    public static CheckA wrongEmail() {
        return new CheckA();
    }
}
