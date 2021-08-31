package co.com.bancolombia.certification.utest.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target BTN_SIGN_UP = Target.the("Button Sign Up")
            .located(By.xpath("//a[contains(@class,'bar__sign-up')]"));

    public static final Target BTN_LOG_IN = Target.the("Button Log In")
            .located(By.xpath("//a[contains(text(),'Log In') and @class = 'unauthenticated-nav-bar__link']"));
}
