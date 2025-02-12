package basic_live_coding_lesson6.homework.ui.internet_shop.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CheckOutPage {
    private SelenideElement finishBtn;

    public CheckOutPage(){
        finishBtn = $("#finish");
        $(".title").shouldHave(text("Checkout: Overview"));
    }

    public void finishShopping(){
        finishBtn.click();
    }
}
