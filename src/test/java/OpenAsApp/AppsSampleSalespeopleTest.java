package OpenAsApp;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class AppsSampleSalespeopleTest {
    @Test
    public void AppsSampleSalespeople() throws MalformedURLException {
        HomePage homePage = new HomePage();
        homePage.login("v--alex@mail.ru", "axaxa111");
        WebDriver driver = homePage.getDriver();
        AppsSample appsSample = new AppsSample(driver);
        appsSample.appSampleCreate();
        appsSample.SalespeopleList();
        appsSample.CreateExtension();
    }
}
