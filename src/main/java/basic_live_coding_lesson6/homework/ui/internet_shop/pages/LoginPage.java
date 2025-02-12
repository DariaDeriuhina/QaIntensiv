package basic_live_coding_lesson6.homework.ui.internet_shop.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private SelenideElement userName;
    private SelenideElement passwordInput;
    private SelenideElement loginButton;

    public LoginPage(){
        userName = $("#user-name");
        passwordInput = $("#password");
        loginButton = $("#login-button");
    }

    public LoginPage open(){
        Selenide.open("https://www.saucedemo.com/");
        return this;
    }

    public ProductPage login(String name, String password){
        userName.setValue(name);
        passwordInput.setValue(password);
        loginButton.click();
        return new ProductPage();
    }
}
