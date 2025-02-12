package basic_live_coding_lesson6.homework.ui.registration.registration_test;

import basic_live_coding_lesson6.homework.ui.registration.pages.LoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegistrationTest {
    LoginPage loginPage;

    @BeforeClass
    public void setup(){
        loginPage = new LoginPage().open().waitUntilPageIsDisplayed();
    }

    @Test(dataProvider = "createValidUserData")
    public void userCanRegister(String name, String lastName, String email, String password){
        loginPage.login(name, lastName, email, password);
    }

    @DataProvider(name = "createValidUserData")
    public Object[][] createValidUserData(){
        return new Object[][]{
                {"Daria", "Der", "dardin582@gmail.com", "2002"}
        };
    }
}
