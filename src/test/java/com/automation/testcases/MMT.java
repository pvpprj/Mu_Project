package com.automation.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;
import java.io.File;
import java.lang.reflect.Array;
import java.security.Key;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class MMT {

    @Test
    public void Test1() throws InterruptedException {

//        ChromeOptions options = new ChromeOptions();
//        options.setExperimentalOption("excludeSwitces", Arrays.asList("disable-popup-blocking"));

        System.setProperty("webdriver.chrome.driver", "./Drivers/dri/chromedriver.exe");  //     "C:\\Users\\Rahul_Gupta1\\Desktop\\driver\\chromedriver.exe"
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.booking.com/");

    //    driver.findElement(By.xpath("//span[@class='a1b9d2f057 c20dffcd7d']")).click();
        driver.findElement(By.xpath("//span[text()='Flights']")).click();
        driver.findElement(By.xpath("//div[text()='One way']")).click();
        driver.findElement(By.xpath("//button[@data-ui-name='input_location_from_segment_0']//span[2]")).click();
       WebElement textCity = driver.findElement(By.xpath("//input[@placeholder='Airport or city']"));
      Thread.sleep(2000);
        textCity.clear();Thread.sleep(2000);
          textCity.sendKeys("Delhi");Thread.sleep(2000);
        Actions a=new Actions(driver);
        // a.sendKeys(textCity,"Delhi").keyDown(Keys.ARROW_DOWN);
    a.sendKeys(Keys.ARROW_DOWN); a.sendKeys(Keys.ENTER);


//        driver.findElement(By.xpath(""));

// driver.close();
    }
}
