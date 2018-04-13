package OpenAsApp;


import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;


public class HomePage extends Driver {




    public void login(String login, String password) {

        driver.get("https://www.360living.de");
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
