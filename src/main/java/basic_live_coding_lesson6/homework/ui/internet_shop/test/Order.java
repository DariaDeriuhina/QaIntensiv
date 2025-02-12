package basic_live_coding_lesson6.homework.ui.internet_shop.test;

import basic_live_coding_lesson6.homework.ui.internet_shop.pages.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Order {
    private ProductPage productPage;

    @BeforeClass
    public void setup(){
        productPage = new LoginPage().open().login("standard_user", "secret_sauce");
    }

    @Test
    public void userCanBuyItem(){
        productPage.addProductToCart("Sauce Labs Backpack")
                .goToCart()
                .checkOutFromCart()
                .fillPersonInfo("Daria", "Der", "61202")
                .finishShopping();
    }
}
