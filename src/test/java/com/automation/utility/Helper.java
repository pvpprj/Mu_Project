package com.automation.utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Helper {
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

}