package com.solvd.carina.cucumber.steps;

import com.solvd.carina.demo.gui.pages.CatalogPage;
import com.solvd.carina.demo.gui.pages.LoginPage;
import com.zebrunner.carina.utils.R;
import com.zebrunner.carina.webdriver.IDriverPool;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SaucedemoSteps implements IDriverPool {

    @Given("I am on login page of Saucedemo website")
    public void mainPageIsOpen(){
        LoginPage loginPage= new LoginPage(getDriver());
        loginPage.open();
    }

    @When("I enter valid username and password and click on Login button")
    public void loginWithValidCredentials() {
        LoginPage loginPage= new LoginPage(getDriver());
        CatalogPage catalogPage = loginPage.login(R.TESTDATA.get("username"), R.TESTDATA.get("password"));
    }

    @Then("page {string} should be open")
    public void page_should_be_open(String string) {
        CatalogPage catalogPage = new CatalogPage(getDriver());
        Assert.assertTrue(catalogPage.isPageOpened());
    }
}
