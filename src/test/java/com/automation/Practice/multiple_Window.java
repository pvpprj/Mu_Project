package com.automation.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class multiple_Window {
    public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "./Drivers/dri/chromedriver.exe");  //     "C:\\Users\\Rahul_Gupta1\\Desktop\\driver\\chromedriver.exe"
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
            driver.get("https://www.thetesttribe.com/blog/multiple-windows-selenium/");

            String parent =driver.getWindowHandle();
            String title=driver.getTitle();
            System.out.println("parent Windows Title = "+parent);
            System.out.println("parent Windows Title = "+title);
            System.out.println("Window name = "+driver.getWindowHandle()+" = "+driver.getTitle()+" = "+driver.getCurrentUrl());

            driver.findElement(By.xpath("//i[@class='fab fa-instagram']")).click();  // 1st click
            driver.findElement(By.xpath("//i[@class='fab fa-linkedin-in']")).click();  // 2nd click
            driver.findElement(By.xpath("//a[@class='elementor-icon elementor-social-icon elementor-social-icon- elementor-repeater-item-337d5af']//*[name()='svg']")).click();   // 3 click
            driver.findElement(By.xpath("//i[@class='fab fa-youtube']")).click();  // 4 click

            System.out.println("Current Title = "+driver.getTitle());


           Set<String> handles =driver.getWindowHandles();
           List<String> handlesList=new ArrayList<String>(handles);
            for(String x:handlesList) {
                Thread.sleep(2000);
                String titleget = driver.switchTo().window(x).getTitle();
                Thread.sleep(2000);
                    if(titleget.equals("(525) The Test Tribe - YouTube")){
                            driver.switchTo().window(x);
                    }
            }
        System.out.println("Switch window done = "+driver.getTitle()+" = "+driver.getCurrentUrl());

         WebElement dd= driver.findElement(By.xpath("//input[@id='search']"));
            dd.sendKeys("Iphome 11");
            dd.sendKeys(Keys.ENTER);


            /*Thread.sleep(20000);
           ArrayList<String> arr = new ArrayList<String>(driver.getWindowHandles());
            System.out.println(arr);
            System.out.println("Size = "+arr.size());

            int n=3;
            driver.switchTo().window(arr.get(n));
            System.out.println("Window name = "+arr.get(n)+" = "+driver.getTitle()+" = "+driver.getCurrentUrl());
*/

//            for(int i=0;i<arr.size();i++) {
//             System.out.println("Window name = "+arr.get(i)+" = "+driver.getTitle(i)+" = "+driver.getCurrentUrl());
//            }

            System.out.println("----------------------Done----------------------------------");
    }
}