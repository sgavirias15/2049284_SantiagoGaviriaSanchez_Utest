package co.com.bancolombia.certification.utest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.bancolombia.certification.utest.userinterfaces.LogInCredentials.TXT_CHECK_THE_EMAIL;

public class ObserveTheCorrect implements Question {


    @Override
    public Object answeredBy(Actor actor) {
        if (Text.of(TXT_CHECK_THE_EMAIL).viewedBy(actor).asString().equals(actor.recall("email"))) {

            return true;
        } else {
            return false;
        }
    }

    public static ObserveTheCorrect emailInformation() {
        return new ObserveTheCorrect();
    }
}
