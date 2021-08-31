package co.com.bancolombia.certification.utest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.bancolombia.certification.utest.userinterfaces.SignInCredentials.MSG_TITLE_SECOND_STEP;

public class CheckThe implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(MSG_TITLE_SECOND_STEP).viewedBy(actor).asString();
    }

    public static CheckThe tittleOfTheSecondStep() {
        return new CheckThe();
    }
}
