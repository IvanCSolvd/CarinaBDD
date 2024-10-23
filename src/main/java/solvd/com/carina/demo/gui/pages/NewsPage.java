package solvd.com.carina.demo.gui.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import solvd.com.carina.demo.gui.components.NewsItem;

public class NewsPage extends AbstractPage {
    
    @FindBy(className="searchFor")
    private ExtendedWebElement searchTextField;
    
    @FindBy(xpath="//input[@value='Search']")
    private ExtendedWebElement searchButton;
    
    @FindBy(xpath="//div[@class='news-item']")
    private List<NewsItem> news;
    
    public NewsPage(WebDriver driver) {
        super(driver);
        setPageURL("/news.php3");
    }
    
    public List<NewsItem> searchNews(String q) {
        searchTextField.type(q);
        searchButton.click();
        return news;
    }
    
}