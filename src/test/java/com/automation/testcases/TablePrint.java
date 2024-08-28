package com.automation.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TablePrint {

    @Test
    public void Test1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./Drivers/dri/chromedriver.exe");  //     "C:\\Users\\Rahul_Gupta1\\Desktop\\driver\\chromedriver.exe"
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.get("https://seleniumpractise.blogspot.com/");
        driver.manage().window().maximize();
        int i;

        List<WebElement> Com = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr/td[2]"));
        List<WebElement> Cou = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr/td[4]"));
        System.out.println("Total row = " + Com.size());

        for (i = 0; i < Com.size(); i++) {
            String Company = driver.findElement(By.xpath("//table[@id='customers']//tbody//tr[" + (i + 2) + "]/td[2]")).getText();
            String Country = driver.findElement(By.xpath("//table[@id='customers']//tbody//tr[" + (i + 2) + "]/td[4]")).getText();
            System.out.println(Company + "=" + Country);
        }

//      String company=  driver.findElement(By.xpath("//table[@id='customers']//tbody//tr[4]//td[2]")).getText();
//        System.out.println("Company = "+company);

        //       driver.findElement(By.xpath("//span[@class='a1b9d2f057 c20dffcd7d']")).click();
    }
}
