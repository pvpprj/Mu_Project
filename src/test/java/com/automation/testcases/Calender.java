package com.automation.testcases;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class Calender {

    String date="24"; String mon="August";  String yea="2022";

    @Test
    public void Test1() {
        System.setProperty("webdriver.chrome.driver", "./Drivers/dri/chromedriver.exe");  //     "C:\\Users\\Rahul_Gupta1\\Desktop\\driver\\chromedriver.exe"
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");


        WebElement cal = driver.findElement(By.xpath("//input[@id='datepicker']"));
        cal.click();

        String month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
        String years=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
        System.out.println(month+" "+years);

        while (!(month.equals(mon) && years.equals(yea))){
            driver.findElement(By.xpath("//span[text()='Prev']")).click();

            month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            years=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
        }
        driver.findElement(By.xpath("//td[@data-handler=\"selectDay\"]//a[text()='"+date+"']")).click();

        String value = driver.findElement(By.xpath("//input[@id='datepicker']")).getText().toString();
        System.out.println("Value = "+value);

//        driver.findElement(By.xpath(""));

// driver.close();
    }


}
