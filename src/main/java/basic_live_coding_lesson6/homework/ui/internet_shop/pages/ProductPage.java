package basic_live_coding_lesson6.homework.ui.internet_shop.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProductPage {
    private SelenideElement title;
    private SelenideElement cartIcon;
    private ElementsCollection productNames;

    public ProductPage(){
        title = $(".title");
        productNames = $$(".inventory_item_name");
        cartIcon = $(".shopping_cart_link");
        title.shouldHave(text("Products"));
    }

    public ProductPage addProductToCart(String productName) {
        productNames.findBy(text(productName))
                .closest(".inventory_item")
                .find("button")
                .click();
        return this;
    }

    public CartPage goToCart(){
        cartIcon.click();
        return new CartPage();
    }
}
