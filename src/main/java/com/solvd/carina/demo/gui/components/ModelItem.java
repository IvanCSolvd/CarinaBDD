package com.solvd.carina.demo.gui.components;

import com.solvd.carina.demo.gui.pages.ModelInfoPage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ModelItem extends AbstractUIObject {

    @FindBy(xpath = ".//strong/span")
    private ExtendedWebElement modelLabel;

    @FindBy(xpath = ".//a")
    private ExtendedWebElement modelLink;

    public ModelItem(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public String readModel() {
        return modelLabel.getText();
    }

    public ModelInfoPage openModelPage() {
        modelLink.click();
        return new ModelInfoPage(driver);
    }
}
