package com.bookit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BasePage{
    @FindBy(name="email")
    public WebElement email;

    @FindBy(name="password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInBtn;

    public void login(String userEmail,String userPassword){
        email.sendKeys(userEmail);
        password.sendKeys(userPassword);
        signInBtn.click();
    }


}
