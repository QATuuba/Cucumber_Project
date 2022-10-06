package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import io.cucumber.java.de.Wenn;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {

    public WebTableLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputUsername;

    @FindBy(name = "password")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    public WebElement loginButton;

    /**
     * No parameters
     * When we call this method, it will directly login using
     *
     * username: Test
     * Password: Tester
     */


    public void login(){
        this.inputUsername.sendKeys("Test");
        this.inputPassword.sendKeys("Tester");
        this.loginButton.click();
    }

    /**
     * This method will accept two arguments and login
     * @param username
     * @param password
     */

    public void login(String username, String password){
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        loginButton.click();
    }

    /**
     * This method will log in using credentials from
     * configuration.properties
     */

    public void loginWithConfig(){
        inputUsername.sendKeys("web.table.username");
        inputPassword.sendKeys("web.table.password");
        loginButton.click();
    }

}