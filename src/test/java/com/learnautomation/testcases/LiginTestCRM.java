package com.learnautomation.testcases;

import com.learnautomation.pages.Baseclass;
import com.learnautomation.pages.LoginPage;
import com.learnautomation.utility.BrowserFactory;
import com.learnautomation.utility.ExcelDataProvider;
import com.learnautomation.utility.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LiginTestCRM extends Baseclass  {

//    @Test      
//    public void loginApp()
//    {
//        logger = report.createTest("Login to CRM");
//        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
//        logger.info("Starting Application");
//        loginPage.clickLogin(excel.getStringData("Login",0,0),excel.getStringData("Login",0,1));
//        logger.pass("Login Sucessfull");
//
//    }

// Facebook
    @Test
    public void loginFaceBook()
    {
       logger = report.createTest("Login to CRM");
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        logger.info("Starting Application");
        loginPage.loginFaceBook("Raj","JJJ","xssscccs","cdadaddjnj");
        logger.pass("Login Sucessfull");
    }

//    @Test
//    public void loginFaceBook1()
//    {
//        logger = report.createTest("Fail");
//            logger.fail("Login Fail");
//    }





}
