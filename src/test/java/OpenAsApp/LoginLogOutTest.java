package OpenAsApp;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class LoginLogOutTest {

    private WebDriver driver;
    private HomePage homePage;

    @BeforeTest
    public void beforeTest() throws MalformedURLException {
        homePage = new HomePage();
        driver = homePage.getDriver();
    }

    @Test
    public void loginTest() {
        homePage.login("v--alex@mail.ru", "axaxa111");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.checkLogin();
        loginPage.logOut();
    }

    @AfterTest
    public void afterTest()
    {
        driver.quit();
    }
}
