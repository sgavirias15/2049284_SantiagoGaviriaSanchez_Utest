package co.com.bancolombia.certification.utest.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SignInCredentials {


    public static final Target TXT_FIRSTNAME = Target.the("First name field")
            .located(By.id("firstName"));

    public static final Target TXT_LASTNAME = Target.the("Last name field")
            .located(By.id("lastName"));

    public static final Target TXT_EMAIL = Target.the("Email field")
            .located(By.id("email"));

    public static final Target TXT_MONTH = Target.the("Birth month field")
            .located(By.cssSelector("#birthMonth"));

    public static final Target TXT_DAY = Target.the("Birth day field")
            .located(By.id("birthDay"));

    public static final Target TXT_YEAR = Target.the("Birth year field")
            .located(By.id("birthYear"));

    public static final Target BTN_NEXT_STEP = Target.the("Button next step")
            .located(By.cssSelector("a[class^='btn btn-blue']"));

    public static final Target TXT_CITY = Target.the("City field")
            .located(By.id("city"));

    public static final Target TXT_ZIP = Target.the("Zip field")
            .located(By.id("zip"));

    public static final Target TXT_PASS = Target.the("Password field")
            .located(By.id("password"));

    public static final Target TXT_CONFIRM_PASS = Target.the("Confirm password field")
            .located(By.id("confirmPassword"));

    public static final Target CHK_STATE_INFORMED = Target.the("Check State informed")
            .located(By.name("newsletterOptIn"));

    public static final Target CHK_TERMS = Target.the("Check terms of use")
            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[5]/label[1]"));

    public static final Target CHK_PRIVACY = Target.the("Check privacy")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target MSG_WELCOME = Target.the("Welcome Message")
            .located(By.xpath("//h1[contains(text(),'Welcome')]"));

    public static final Target MSG_INVALID_EMAIL = Target.the("Enter Valid Email Message")
            .located(By.id("emailError"));

    public static final Target MSG_TITLE_SECOND_STEP = Target.the("Step 2 title")
            .located(By.xpath("//span[contains(text(),'Add your address')]"));

    public static final Target MSG_TITLE_FIRST_STEP = Target.the("Step 1 title")
            .located(By.xpath("//span[contains(text(),'Tell us about yourself')]"));

    public static final Target BTN_BACK_STEP = Target.the("Back Button")
            .located(By.xpath("//i[contains(text(),'chevron_left')]"));

    public static final Target MSG_DESCRIPTION_STEP_THREE = Target.the("Description Step 3")
            .located(By.xpath("//div[contains(text(),'When you')]"));

    public static final Target MSG_CONFIRM_PASS = Target.the("Password mismatch message")
            .located(By.xpath("//span[contains(text(),'Password mismatch')]"));

    public static final Target MSG_UNSELECTED_CHECKS = Target.the("Password mismatch message")
            .located(By.xpath("//span[@class='error-msg' and contains(text(), 'You must accept')]"));

}
