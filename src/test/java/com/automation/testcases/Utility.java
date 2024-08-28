package com.automation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility {

    static WebDriver driver;

    public static WebDriver dri()
    {
        return  driver=new ChromeDriver();
    }

}
