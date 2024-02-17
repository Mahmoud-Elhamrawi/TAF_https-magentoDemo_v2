package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_SearchPage extends P00_PageBase{

    public P03_SearchPage(WebDriver driver)
    {
        super(driver);
    }
    private final By searchInput = By.id("search");
    private final By listOption = By.id("search_autocomplete");
    private final  By listOptions = By.cssSelector("li[role=\"option\"]");









    public void typeInSearchInp(String txt)
    {
        enterTxt(driver.findElement(searchInput),txt );
    }

    public WebElement autoList()
    {
        return driver.findElement(listOption);
    }

    public List<WebElement> optionsss()
    {
        return driver.findElements(listOptions);
    }

}
