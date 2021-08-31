package co.com.bancolombia.certification.utest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static co.com.bancolombia.certification.utest.utils.Constants.MSG_EMPTY_FIELDS;

public class StayAt implements Question {

    private WebDriver driver;

    public StayAt(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        List<WebElement> messages = driver.findElements(By.xpath(MSG_EMPTY_FIELDS));

        if (messages.size() > 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static StayAt stepOne(WebDriver chrome) {
        return new StayAt(chrome);
    }
}
