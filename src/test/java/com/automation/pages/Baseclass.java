package com.automation.pages;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.automation.utility.BrowserFactory;
import com.automation.utility.ConfigeDataProvider;
import com.automation.utility.ExcelDataProvider;
import com.automation.utility.Helper;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;

public class Baseclass {
    public WebDriver driver;
    public ExcelDataProvider excel;
    public ConfigeDataProvider config;
    public ExtentReports report;
    public ExtentTest logger;

    @BeforeSuite
    public  void setUpSuite()
    {
        Reporter.log("Setting up and reporta and Test is getting Ready",true);
         excel = new ExcelDataProvider();
         config =new ConfigeDataProvider();
        ExtentHtmlReporter extent =new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/Reports/FreeCRM_"+ Helper.getCurrentDateTime()+".html"));
        report =new ExtentReports();
        report.attachReporter(extent);

        Reporter.log("Setting Down- Test can be started ",true);
    }

    @BeforeClass
    public void setup()
    {
        Reporter.log("Trying to start browser and Application getting  Ready",true);

        driver= BrowserFactory.startApplication(driver , config.getBrowser() , config.getStagingURL());

        Reporter.log("Browser and Application is up and running ",true);
    }

    @AfterClass
    public void tearDown()
    {
        BrowserFactory.quitBroser(driver);
    }

    @AfterMethod
    public void tearDownMethod(ITestResult result) throws IOException {
        Reporter.log("Test  is about to end",true);

        if (result.getStatus()==ITestResult.FAILURE)
        {
            Helper.captureScreenshot(driver);
            logger.fail("Test Failed", MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(driver)).build());
        }
          else if (result.getStatus()==ITestResult.SUCCESS)
          {
            logger.pass("Test Passed", MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(driver)).build());
          }
         report.flush();

        Reporter.log("Test Completed >>> Report Generated  ",true);
    }



}
