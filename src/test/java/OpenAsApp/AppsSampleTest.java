package OpenAsApp;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AppsSampleTest {
    @Test(enabled = false)
    public void AppsCreating() {
        HomePage homePage = new HomePage();
        homePage.login("v--alex@mail.ru", "axaxa111");
        WebDriver driver = homePage.getDriver();
        AppsSample appsSample = new AppsSample(driver);
        appsSample.appSampleCreate();
        appsSample.SalespeopleList();
        appsSample.CreateExtension();
    }
}
