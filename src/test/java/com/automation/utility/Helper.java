package com.automation.utility;

import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Helper {
    static WebDriver driver;
    public static WebDriver getDriver() {
        return driver;
    }

    public void explicitWait(By locator)
    {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public static String captureScreenshot(WebDriver driver)
        {
          File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
          String screenshotsPath=System.getProperty("user.dir")+"/Screenshots/FreeCRM_"+getCurrentDateTime()+".png";

                try {
                        FileHandler.copy(src, new File(screenshotsPath));
                        System.out.println("Screenshot Captured ");
                    }
                catch(IOException e)
                    {
                        System.out.println("Unable to capture Screen : "+e.getMessage());
                    }
                return screenshotsPath;
        }

        public static String getCurrentDateTime()
        {
            DateFormat customformate = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
            Date currentDate = new Date();
           return customformate.format(currentDate);
        }

    public void sendText(WebElement elem,String text) {
        try {
            try {
                if (elem.isDisplayed() & elem.isEnabled())
                    elem.sendKeys(text);
            } catch (Exception e) {
                throw new AssertionError("There is no such element or the element is not available.", e);
            }
        } catch (TimeoutException e) {
            throw new AssertionError(
                    "Timeout to the presence of the element is reached.", e);
        }
        }

    public void clickButton(WebElement elem) {
        try {
            try {
                elem.click();
            } catch (Exception e) {
                throw new AssertionError(
                        "There is no such element or the element is not clickable.", e);
            }
        } catch (TimeoutException e) {
            throw new AssertionError(
                    "Timeout to the presence of the element is reached.", e);
        }
    }

    // Function overload
    public void clickButton(By elemLocator) {
        try {
            try {
                getDriver().findElement(elemLocator).click();
            } catch (Exception e) {
                throw new AssertionError(
                        "There is no such element or the element is not clickable.", e);
            }
        } catch (TimeoutException e) {
            throw new AssertionError(
                    "Timeout to the presence of the element is reached.", e);
        }
    }

    public void scrollTo(WebElement elem) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollTo(" + elem.getLocation().x + "," + (elem.getLocation().y - 100) + ");");
    }

    public String getTitle() {
        return getDriver().getTitle();
    }








}