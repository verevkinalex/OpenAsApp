package OpenAsApp;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AppsSampleTest {
    @Test
    public void AppsSample() {
        HomePage homePage = new HomePage();
        homePage.login("v--alex@mail.ru", "axaxa111");
        WebDriver driver = homePage.getDriver();
        AppsSample appsSample = new AppsSample(driver);
        appsSample.appSampleCreate();
        appsSample.SalespeopleList();
        appsSample.CreateExtension();
    }

    @Test
    public void AppsSampleList() {
        HomePage homePage = new HomePage();
        homePage.login("v--alex@mail.ru", "axaxa111");
        WebDriver driver = homePage.getDriver();
        AppsSample appsSample = new AppsSample(driver);
        appsSample.appSampleCreate();
        appsSample.ListWithLocationData();
        appsSample.CreateExtension();
    }
}
