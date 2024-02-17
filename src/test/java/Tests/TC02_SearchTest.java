package Tests;

import Pages.P03_SearchPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class TC02_SearchTest extends TC00_TestBase{

P03_SearchPage searchPage ;

String textSearch ="watch";

    @Test
    public void validSearch()
    {
        searchPage = new P03_SearchPage(driver);
        searchPage.typeInSearchInp(textSearch);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(searchPage.autoList()));
         List<WebElement> list =  searchPage.optionsss();
         list.get(0).click();

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("scrollBy(0,600)");





    }



}
