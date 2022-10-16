import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.DecimalFormat;
import java.util.List;

public class CurrencyTest extends BaseTests {
    WebBase base = new WebBase();
    WebActions actions = new WebActions();
    public static String[] curr = {"GBP","INR","EUR","AED","CAD"};
    public static double[] actual = {0.89,82.29,1.03,3.67,1.39};

    @Test(description = "USD to different currency conversion test")
    public void enterCurrencyData() throws InterruptedException {
        actions.waitForElement(ConversionPageUI.close);
        actions.clickOnElement(ConversionPageUI.close);
        Thread.sleep(2000);
        for (int i = 0; i < 5; i++) {
            actions.waitForElement(ConversionPageUI.enterAmount);
            actions.clearTextField(ConversionPageUI.enterAmount);
            Thread.sleep(200);
            actions.enterTextWithXpath(ConversionPageUI.enterAmount, "1");
            actions.clickOnElement(ConversionPageUI.selectFrom);
            actions.waitForElement(ConversionPageUI.selectTo);
            actions.clickOnElement(ConversionPageUI.selectTo);
            actions.enterTextWithXpath(ConversionPageUI.selectTo, curr[i]);
            Thread.sleep(200);
            actions.clickOnCurrency(curr[i]);
            Thread.sleep(200);
            actions.waitForElement(ConversionPageUI.convertButton);
            actions.clickOnElement(ConversionPageUI.convertButton);
            String getValue = actions.getText();
            String removeChar = getValue.substring(0,5);
            double expected = Double.parseDouble(removeChar);
            int num = 2;
            expected = Math.round(expected * Math.pow(10, num))
                    / Math.pow(10, num);
            System.out.println("Conversion value of USD to " +curr[i] + " is 1 USD = " + expected +" " + curr[i]);
            Assert.assertEquals(actual[i],expected,"Same conversion value not found");
            actions.waitForElement(ConversionPageUI.convertTab);
            actions.clickOnElement(ConversionPageUI.convertTab);
            Thread.sleep(200);
        }
    }


}
