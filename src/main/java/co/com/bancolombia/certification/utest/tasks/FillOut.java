package co.com.bancolombia.certification.utest.tasks;

import co.com.bancolombia.certification.utest.models.SignInInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.bancolombia.certification.utest.userinterfaces.SignInCredentials.*;
import static co.com.bancolombia.certification.utest.utils.Constants.CERO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillOut implements Task {

    private String firstName;
    private String lastName;
    private String email;
    private String month;
    private String day;
    private String year;

    public FillOut(List<SignInInformation> dataList) {
        this.firstName = dataList.get(CERO).getFirstName();
        this.lastName = dataList.get(CERO).getLastName();
        this.email = dataList.get(CERO).getEmail();
        this.month = dataList.get(CERO).getMonth();
        this.day = dataList.get(CERO).getDay();
        this.year = dataList.get(CERO).getYear();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(firstName).into(TXT_FIRSTNAME),
                Enter.theValue(lastName).into(TXT_LASTNAME),
                Enter.theValue(email).into(TXT_EMAIL),
                SelectFromOptions.byVisibleText(month).from(TXT_MONTH),
                SelectFromOptions.byVisibleText(day).from(TXT_DAY),
                SelectFromOptions.byVisibleText(year).from(TXT_YEAR),
                Click.on(BTN_NEXT_STEP)
        );

    }

    public static FillOut someCredentials(List<SignInInformation> dataList) {
        return instrumented(FillOut.class, dataList);
    }
}
