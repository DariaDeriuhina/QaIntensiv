package basic_live_coding_lesson6.homework.ui.internet_shop.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CartPage {
    private SelenideElement checkoutBtn;
    private SelenideElement title;

    public CartPage(){
        checkoutBtn = $("button[id='checkout']");
        title = $(".title");
        title.shouldHave(text("Your Cart"));
    }

    public PersonalInfoPage checkOutFromCart(){
        checkoutBtn.click();
        return new PersonalInfoPage();
    }
}
