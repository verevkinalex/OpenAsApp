package OpenAsApp;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AppsSample {
    private WebDriver driver;
    private WebDriverWait wait;

    public AppsSample(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10000);
    }

    public void appSampleCreate() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[.='Apps']")));
        String actualText = driver.findElement(By.xpath("//div[.='Apps']")).getText();
        String expectedText = "Apps";
        Assert.assertEquals(expectedText, actualText);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//md-icon[@class='material-icons']")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//span[.='App Creator']")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void SalespeopleList() {
        driver.findElement(By.xpath("//a[@class='wa-promotion-card promo-samples wa-big-button md-button md-ink-ripple layout-row flex-gt-sm-50 flex-none']")).click();
        driver.findElement(By.xpath("(//span[.='Use'])[1]")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void ListWithLocationData() {
        driver.findElement(By.xpath("//a[@class='wa-promotion-card promo-samples wa-big-button md-button md-ink-ripple layout-row flex-gt-sm-50 flex-none']")).click();
        driver.findElement(By.xpath("(//span[.='Use'])[2]")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void CreateExtension() {
        driver.findElement(By.xpath("//button[@class='md-raised md-accent wa-app-wizard-navigation-button right md-button']")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//button[@class='md-raised md-accent wa-app-wizard-navigation-button right md-button']")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("(//span[.='Ok'])[1]")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("(//span[.='Ok'])[1]")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("//button[@class='md-raised md-accent wa-app-wizard-navigation-button right md-button']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h2[@class='wa-view-subtitle wa-bold ng-scope']")));
        String actualText = driver.findElement(By.xpath("//h2[@class='wa-view-subtitle wa-bold ng-scope']")).getText();
        String expectedText = "Congratulations!";
        Assert.assertEquals(expectedText, actualText);
        driver.quit();
    }

}
