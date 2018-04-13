package OpenAsApp;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class LoginLogOutTest {

    private HomePage homePage;

    @BeforeTest
    public void beforeTest() throws MalformedURLException {
        System.out.println("Start");
        homePage = new HomePage();
        System.out.println("Start1");
    }

    @Test
    public void loginTest() {
        System.out.println("Start3");
        homePage.login("v--alex@mail.ru", "axaxa111");
        LoginPage loginPage = new LoginPage();
        loginPage.checkLogin();
        loginPage.logOut();
    }

}
