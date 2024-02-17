package Tests;

import Pages.P01_HomePage;
import Pages.P02_RegisterPage;
import com.github.hemanthsridhar.CSVUtils;
import com.github.hemanthsridhar.lib.ExtUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC01_RegisterTest extends TC00_TestBase{

    P01_HomePage homePage ;
    P02_RegisterPage registerPage ;



    @DataProvider(name = "userData")
    public static Object[][] provider() throws Exception{
        String path = "./src\\test//resources\\dataRegister.csv";
        ExtUtils ext = new CSVUtils(path,true);
        return ext.parseData() ;
    }





    @Test(dataProvider = "userData")
    public void validRegister(String firstName , String lastName , String email , String Password)
    {
        homePage = new P01_HomePage(driver);
        homePage.goToRegisterPage();



        registerPage = new P02_RegisterPage(driver);
        Assert.assertEquals(registerPage.assertOnTitle().getText() , "Create New Customer Account");
        Assert.assertTrue(driver.getCurrentUrl().contains("/customer/account/create/"));

        registerPage.fillRegisterData(firstName ,lastName , email , Password);


        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(registerPage.assertVisibleTxt()));

        Assert.assertTrue(registerPage.assertAfterRegister().getText().contains("Thank you for registering with Main Website Store"));
        Assert.assertTrue(registerPage.assertOnContactInf().getText().contains(firstName));



    }










}
