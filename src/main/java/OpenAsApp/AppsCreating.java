package OpenAsApp;


import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppsCreating {
    private WebDriver driver;
    private WebDriverWait wait;

    public AppsCreating(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10000);
    }

    public void appCreat() {
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[.='Apps']")));
            String actualText = driver.findElement(By.xpath("//div[.='Apps']")).getText();
            String expectedText = "Apps";
            Assert.assertEquals(expectedText, actualText);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            driver.findElement(By.xpath("//*[.='add']")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            driver.findElement(By.xpath("//span[.='App Creator']")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//button[@ng-click='ds.openFileUrlInput()']")).click();
        driver.findElement(By.xpath("//md-input-container[@class='md-block md-input-has-placeholder']")).sendKeys("https://www.dropbox.com/s/7shfv62ygg9gcxz/ExampleXLS.xlsx?dl=0");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        JavascriptExecutor javaScriptExecutor = (JavascriptExecutor) driver;
        javaScriptExecutor.executeScript("function getElementByXpath(path) {\n" +
                "  return document.evaluate(path, document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;\n" +
                "}\n" +
                "element = getElementByXpath(\"//span[.='Ok']/..\");\n" +
                "element.click();");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("(//md-icon[@class='ng-binding ng-scope material-icons'])[1]")).click();

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
        driver.findElement(By.xpath("//input[@ng-model='wizardInfo.app.dto.name']")).sendKeys("ExampleApp");
        driver.findElement(By.xpath("//textarea[@ng-model='wizardInfo.app.dto.description']")).sendKeys("MyApp");
        driver.findElement(By.xpath("//span[.='Create my app']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h2[@class='wa-view-subtitle wa-bold ng-scope']")));
        actualText = driver.findElement(By.xpath("//h2[@class='wa-view-subtitle wa-bold ng-scope']")).getText();
        expectedText = "Congratulations!";
        Assert.assertEquals(expectedText, actualText);
    }
}