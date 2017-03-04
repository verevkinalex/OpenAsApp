package OpenAsApp;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginLogOutTest {
    @Test(enabled = false)
    public void loginTest ()
    {
        HomePage homePage = new HomePage();
        homePage.login ("v--alex@mail.ru", "axaxa111");
        WebDriver driver =homePage.getDriver();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.checkLogin();
        loginPage.logOut();
    }
}
