import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class WebActions {

    public void enterText(String element, String text) {
        WebBase.driver.findElement(By.id(element)).sendKeys(text);
    }

    public void enterTextWithXpath(String element, String text) {
        WebBase.driver.findElement(By.xpath(element)).sendKeys(text);
    }

    public void clickOnElement(String element) {
        WebBase.driver.findElement(By.xpath(element)).click();
    }

    public boolean isDisplayedOnUI(String element) {
        return WebBase.driver.findElement(By.xpath(element)).isDisplayed();
    }


    public void clickOnCurrency(String name){
        WebBase.driver.findElement(By.xpath("//*[text() ='"+name+"']")).click();
    }


    public void waitForElement(String element){
        WebDriverWait wait = new WebDriverWait(WebBase.driver,20);
        //wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(element)));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));

    }
    public String getText(){
        return WebBase.driver.findElement(By.xpath("//table[@class='currency-conversion-tables__ConverterTable-sc-3fg8ob-5 jESrzS']/tbody/tr[1]/td[2]")).getText();
    }
//
    public void getScreenShot() throws IOException {
        File file = ((TakesScreenshot) WebBase.driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("C:\\Download\\Sample.png"));
    }


    public void refreshPage() throws InterruptedException {
        WebBase.driver.navigate().refresh();
        Thread.sleep(200);
    }

    public void clearTextField(String element){
        WebBase.driver.findElement(By.xpath(element)).clear();
    }


}