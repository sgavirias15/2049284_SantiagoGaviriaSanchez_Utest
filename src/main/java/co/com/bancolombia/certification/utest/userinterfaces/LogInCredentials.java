package co.com.bancolombia.certification.utest.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LogInCredentials {

    public static final Target TXT_EMAIL_ADRESS = Target.the("Email Adress field")
            .located(By.id("username"));

    public static final Target TXT_PASSWORD = Target.the("Password field")
            .located(By.id("password"));

    public static final Target BTN_SIGN_IN = Target.the("Sign In Button")
            .located(By.id("kc-login"));

    public static final Target TXT_CHECK_THE_EMAIL = Target.the("Validate the email text")
            .located(By.xpath("//*[@id=\"kc-form-wrapper\"]/div/section/div[1]/span"));

    public static final Target TXT_INVALID_INFORMATION = Target.the("Invalid username or password text")
            .located(By.xpath("//span[contains(text(),'Invalid username or password.')]"));

    public static final Target BTN_FORGOT_PASSWORD = Target.the("Forgot password button")
            .located(By.xpath("//a[contains(text(),'Forgot Password?')]"));
}
