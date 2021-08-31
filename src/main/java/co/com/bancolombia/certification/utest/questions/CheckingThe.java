package co.com.bancolombia.certification.utest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.bancolombia.certification.utest.userinterfaces.SignInCredentials.MSG_DESCRIPTION_STEP_THREE;


public class CheckingThe implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(MSG_DESCRIPTION_STEP_THREE).viewedBy(actor).asString();
    }

    public static CheckingThe stepThreeDescription() {
        return new CheckingThe();
    }
}
