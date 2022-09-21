package com.automation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigeDataProvider {

    Properties pro;

    public ConfigeDataProvider() {
        File src = new File("./Confi/config.properties");

        FileInputStream fis = null;
        try {
            fis = new FileInputStream(src);
            pro= new Properties();
            pro.load(fis);
        } catch (Exception e) {
            System.out.println("Not able to load Confige File >> "+e.getMessage());
        }
    }

    public String getDataFromConfig(String KetToSearch){
        return pro.getProperty(KetToSearch);
    }

    public String getBrowser(){
       return pro.getProperty("Browser");
    }

    public String getStagingURL(){
     return pro.getProperty("qaUrl");
    }





}
