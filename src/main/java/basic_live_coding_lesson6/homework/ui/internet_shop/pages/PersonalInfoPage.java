package basic_live_coding_lesson6.homework.ui.internet_shop.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class PersonalInfoPage {
    private SelenideElement firstNameInput;
    private SelenideElement lastNameInput;
    private SelenideElement zipCodeInput;
    private SelenideElement continueBtn;

    public PersonalInfoPage(){
        firstNameInput = $("#first-name");
        lastNameInput = $("#last-name");
        zipCodeInput = $("#postal-code");
        continueBtn = $("input[id='continue']");
        $(".title").shouldHave(text("Checkout: Your Information"));
    }

    public CheckOutPage fillPersonInfo(String name, String lastName, String zipCode){
        firstNameInput.sendKeys(name);
        lastNameInput.sendKeys(lastName);
        zipCodeInput.sendKeys(zipCode);
        continueBtn.click();
        return new CheckOutPage();
    }
}
