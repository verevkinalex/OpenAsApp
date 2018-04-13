package OpenAsApp;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class AppsTest {
    @Test
    public void AppsCreating() throws MalformedURLException {
        HomePage homePage = new HomePage();
        homePage.login("v--alex@mail.ru", "axaxa111");

        //AppsCreating appsCreating = new AppsCreating(driver);
        //appsCreating.appCreat();
    }
}


