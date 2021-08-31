package co.com.bancolombia.certification.utest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.bancolombia.certification.utest.userinterfaces.SignInCredentials.MSG_TITLE_FIRST_STEP;

public class ObserveThe implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(MSG_TITLE_FIRST_STEP).viewedBy(actor).asString();
    }

    public static ObserveThe titleOfTheFirstStep() {
        return new ObserveThe();
    }
}
