package com.automation.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SEND {

    @BeforeMethod
    public void BeforeMethod1()
    {
        System.out.println("BeforeMethod - 1");
    }

    @BeforeMethod
    public void BeforeMethod2()
    {
        System.out.println("BeforeMethod - 2");
    }

    @BeforeSuite
    public void BeforeSuite()
    {
        System.out.println("BeforeSuite");
    }

    @BeforeClass
    public void BeforeClass()
    {
        System.out.println("BeforeClass");
    }

    @Test
    public void Test1()
    {
//        System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");  //     "C:\\Users\\Rahul_Gupta1\\Desktop\\driver\\chromedriver.exe"
//       WebDriver driver=new ChromeDriver();
//        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//       driver.get("https://www.flipkart.com/");
//
//
//
//        WebElement search = driver.findElement(By.xpath("//input[@class='_3704LK']"));
//        search.sendKeys("IPHONE 10");
//
//        WebElement search_Button = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
//        search_Button.click();
        System.out.println("Test - 1");
    }

    @Test
    public void Test2()
    {
        System.out.println("Test - 2");
    }


}
