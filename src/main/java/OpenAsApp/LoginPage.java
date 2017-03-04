package OpenAsApp;


import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait=new WebDriverWait(driver,5000);
    }

    public void checkLogin() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[.='Apps']")));
        String actualText = driver.findElement(By.xpath("//div[.='Apps']")).getText();
        String expectedText = "Apps";
        Assert.assertEquals(expectedText, actualText);
    }

    public void logOut() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//md-icon[@class='material-icons']")));
        driver.findElement(By.xpath("//md-icon[@class='material-icons']")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//span[.='Log out']")).click();
        boolean email = driver.findElement(By.xpath("//form[@name='login.form']/md-input-container/input[@type='email']")).isDisplayed();
        Assert.assertTrue(email);
    }
}


