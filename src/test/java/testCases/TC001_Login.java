package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;

public class TC001_Login extends BaseClass{

    @Test
    public void loginTest()
    {
        LoginPage lp = new LoginPage(driver);
        lp.InputUsername(username);
        lp.InputPassword(password);
        lp.clickLogin();

        if(driver.getTitle().equals("OrangeHRM"))
        {
            Assert.assertTrue(true);
        }

        lp.Logout();
    }
}
