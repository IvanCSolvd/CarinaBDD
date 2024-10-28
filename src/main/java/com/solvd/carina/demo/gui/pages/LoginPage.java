package com.solvd.carina.demo.gui.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "user-name")
    private ExtendedWebElement usernameInput;
    @FindBy(id = "password")
    private ExtendedWebElement passwordInput;
    @FindBy(id = "login-button")
    private ExtendedWebElement loginButton;

    public CatalogPage login(String username, String password){
        usernameInput.type(username);
        passwordInput.type(password);
        loginButton.click();
        return new CatalogPage(getDriver());
    }
}
