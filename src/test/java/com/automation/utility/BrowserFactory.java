package com.automation.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserFactory {

        public static WebDriver startApplication(WebDriver driver ,String browsername , String appurl)
        {
                if (browsername.equals("chrome"))
                {
                        System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");  //     "C:\\Users\\Rahul_Gupta1\\Desktop\\driver\\chromedriver.exe"
                        driver=new ChromeDriver();
                }
                else if (browsername.equals("Firefox"))
                {}
                else if (browsername.equals("IE"))
                { }
                else
                {
                   System.out.println("We do not support");
                }

                driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
                driver.manage().window().maximize();
                driver.get(appurl);
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                return driver;
        }

        public static void quitBroser(WebDriver driver)
        {
                driver.quit();
        }


}