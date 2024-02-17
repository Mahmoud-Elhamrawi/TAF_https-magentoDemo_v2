package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P02_RegisterPage extends P01_HomePage{
    public P02_RegisterPage(WebDriver driver)
    {
        super(driver);
    }


    private final By assertRegisterTitle = By.cssSelector("h1[class=\"page-title\"] span") ;
    private final By firstNameInput = By.id("firstname");
    private final By lastNameInput = By.id("lastname");
    private final By emailInput = By.id("email_address");
    private final By passwordInput = By.id("password");
    private final By confirmPassInput = By.id("password-confirmation");
    private final By createBtn = By.xpath("//button[@title=\"Create an Account\"]");

    private final By assertOnTitleAfterRegis  = By.xpath("//div[text()='Thank you for registering with Main Website Store.']");
     private final By assertVisibleOfTxt = By.cssSelector("div[class=\"panel wrapper\"] div[class=\"panel header\"] li[class=\"greet welcome\"] span");

     private final By assertOnContactInfo = By.cssSelector("div[class=\"box box-information\"] p ");
    public WebElement assertOnTitle()
    {
        return driver.findElement(assertRegisterTitle);
    }
    public void fillRegisterData(String fn , String ln , String email , String Pass)
    {
        enterTxt(driver.findElement(firstNameInput),fn );
        enterTxt(driver.findElement(lastNameInput),ln );
        enterTxt(driver.findElement(emailInput),email );
        enterTxt(driver.findElement(passwordInput),Pass );
        enterTxt(driver.findElement(confirmPassInput),Pass );
        clickEle(driver.findElement(createBtn));
    }

    public WebElement assertVisibleTxt()
    {
        return driver.findElement(assertVisibleOfTxt);
    }

    public WebElement assertAfterRegister()
    {
        return driver.findElement(assertOnTitleAfterRegis);
    }
    public WebElement assertOnContactInf()
    {
        return driver.findElement(assertOnContactInfo);
    }





}
