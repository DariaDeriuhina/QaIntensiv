package basic_live_coding_lesson6.homework.ui.registration.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public static String BASE_URL = "https://courses.ultimateqa.com/users/sign_up?test=true";

    private SelenideElement firstNameInput;
    private SelenideElement lastNameInput;
    private SelenideElement emailInput;
    private SelenideElement passwordInput;
    private SelenideElement termsCheckbox;
    private SelenideElement signUpBnt;

    public LoginPage(){
        firstNameInput = $("[id='user[first_name]']");
        lastNameInput = $("[id='user[last_name]'");
        emailInput = $("[id='user[email]'");
        passwordInput = $("[id='user[password]'");
        termsCheckbox = $("[id='user[terms]'");
        signUpBnt = $("button[type='submit']");
    }

    public LoginPage open(){
        Selenide.open(BASE_URL);
        return this;
    }

    public void login(String name, String lastName, String email, String password){
        firstNameInput.setValue(name);
        lastNameInput.setValue(lastName);
        emailInput.setValue(email);
        passwordInput.setValue(password);
        termsCheckbox.click();
        signUpBnt.click();
    }

    public LoginPage waitUntilPageIsDisplayed() {
        $(".logo.img-responsive").shouldBe(visible, Duration.ofSeconds(30));
        return this;
    }

}
