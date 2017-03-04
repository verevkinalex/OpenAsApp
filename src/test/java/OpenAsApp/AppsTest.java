package OpenAsApp;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AppsTest {
    @Test(enabled = false)
    public void AppsCreating() {
        HomePage homePage = new HomePage();
        homePage.login("v--alex@mail.ru", "axaxa111");
        WebDriver driver = homePage.getDriver();
        AppsCreating appsCreating = new AppsCreating(driver);
        appsCreating.appCreat();
    }
}


