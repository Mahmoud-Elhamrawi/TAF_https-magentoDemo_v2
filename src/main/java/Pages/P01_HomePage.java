package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P01_HomePage extends P00_PageBase{
    public P01_HomePage(WebDriver driver) {
        super(driver);
    }

    private final By registerLink = By.cssSelector("div[class=\"panel wrapper\"] ul :nth-child(3) a") ;
    private final By registerBtn = By.xpath("//div[@class=\"panel header\"] //ul//li[3]//a");









    public void goToRegisterPage()
    {
        clickEle(driver.findElement(registerBtn));
    }






}
