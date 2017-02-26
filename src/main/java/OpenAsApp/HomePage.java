package OpenAsApp;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class HomePage {

    private WebDriver driver;
    private WebDriverWait wait;

    public WebDriver getDriver() {
        return driver;
    }

    public HomePage() {
        this.driver = new FirefoxDriver();
        System.setProperty("webdriver.gecko.driver", "/home/alex/IDEA/OpenAsApp/geckodriver");
        wait = new WebDriverWait(driver, 10000);
    }

    public void login(String login, String password) {

        driver.get("https://www.openasapp.net");
        driver.findElement(By.xpath("//a[@title='Sign up']")).click();
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());

        driver.switchTo().window(tabs2.get(1));

        driver.findElement(By.xpath("//form[@name='login.form']/md-input-container/input[@type='email']")).sendKeys(login);
        driver.findElement(By.xpath("//form[@name='login.form']/md-input-container/input[@type='password']")).sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

}
