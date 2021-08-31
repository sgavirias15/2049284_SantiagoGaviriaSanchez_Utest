package co.com.bancolombia.certification.utest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.bancolombia.certification.utest.userinterfaces.SignInCredentials.MSG_WELCOME;

public class ValidateTextOf implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(MSG_WELCOME).viewedBy(actor).asString();
    }

    public static ValidateTextOf successfulAcountCreation() {
        return new ValidateTextOf();
    }
}
