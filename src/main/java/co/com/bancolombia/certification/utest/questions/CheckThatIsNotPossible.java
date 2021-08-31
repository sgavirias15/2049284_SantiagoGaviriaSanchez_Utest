package co.com.bancolombia.certification.utest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certification.utest.userinterfaces.SignInCredentials.MSG_UNSELECTED_CHECKS;

public class CheckThatIsNotPossible implements Question {


    @Override
    public Object answeredBy(Actor actor) {
        return MSG_UNSELECTED_CHECKS.resolveFor(actor).isVisible();

    }

    public static CheckThatIsNotPossible continueIfHasNotSelectTheChecks() {
        return new CheckThatIsNotPossible();
    }

}
