package co.com.bancolombia.certification.utest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.bancolombia.certification.utest.userinterfaces.LogInCredentials.TXT_INVALID_INFORMATION;

public class VerifyInvalid implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(TXT_INVALID_INFORMATION).viewedBy(actor).asString();
    }

    public static VerifyInvalid emailAndOrPasswordInformation() {
        return new VerifyInvalid();
    }
}
