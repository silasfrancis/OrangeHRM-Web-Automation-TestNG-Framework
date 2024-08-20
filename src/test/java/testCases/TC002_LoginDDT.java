package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import utilities.DataProviders;

public class TC002_LoginDDT extends BaseClass{


    @Test(dataProvider = "loginData", dataProviderClass = DataProviders.class)
    public void loginDDT(String username, String password, String exp_result)
    {
        LoginPage lp = new LoginPage(driver);
        lp.InputUsername(username);
        lp.InputPassword(password);
        lp.clickLogin();


        if(exp_result.equalsIgnoreCase("Pass"))
        {
            if(lp.LoginConfirm().isDisplayed())
            {
                lp.Logout();
                Assert.assertTrue(true);
                logger.info("Login Successful");
            }
            else
            {
                logger.info("Login Failed");
                Assert.fail();
            }
        }

        if(exp_result.equalsIgnoreCase("Fail"))
        {
           if(lp.Invalid_loginDetails().isDisplayed())
            {
                Assert.assertTrue(true);
                logger.info("Invalid Login Details Confirmed");
            }
           else
           {
               lp.Logout();
               logger.info("Login Successful with invalid details");
               Assert.fail();
           }
        }


    }
}
