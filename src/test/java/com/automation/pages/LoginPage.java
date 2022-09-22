package com.automation.pages;

import com.automation.utility.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends Helper {

    WebDriver driver;

    public LoginPage(WebDriver ldriver) {
        this.driver = ldriver;
    }

    @FindBy(linkText = "Login") WebElement login;
    @FindBy(xpath ="//input[@name='email']") WebElement username;
    @FindBy(xpath = "//input[@placeholder='Password']") WebElement password;
    @FindBy(xpath ="//div[@class='ui fluid large blue submit button']") WebElement loginButton;

//    public void clickLogin(String usernameApplication ,String passwordApplication )
//    {
//        login.click();
//        username.sendKeys(usernameApplication);
//        password.sendKeys(passwordApplication);
//        loginButton.click();
//    }



    // ------------------------------------------------------------------
    // Facebook
    @FindBy(xpath ="//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']") WebElement createNewAccount;
    @FindBy(xpath ="//input[@name='firstname']") WebElement firstName;
    @FindBy(xpath ="//input[@name='lastname']") WebElement lastname;
    @FindBy(xpath ="//input[@name='reg_email__']") WebElement reg_email;
    @FindBy(xpath ="//input[@name='reg_passwd__']") WebElement reg_passwd;

    @FindBy(xpath ="//button[@name='websubmit']") WebElement signButton;


    public void loginFaceBook(String username ,String lastnamee,String reg_emaile,String password )
    {
//        createNewAccount.click();
//        firstName.sendKeys(username);
//        lastname.sendKeys(lastnamee);
//        reg_email.sendKeys(reg_emaile);
//        reg_passwd.sendKeys(password);
//        signButton.click();

        clickButton(createNewAccount);

        sendText(firstName,username);
        sendText(lastname,lastnamee);
        sendText(reg_email,reg_emaile);
        sendText(reg_passwd,password);
        clickButton(signButton);
        // sendText();
    }

    // clickButton(createNewAccount);






}