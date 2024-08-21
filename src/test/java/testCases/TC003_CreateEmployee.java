package testCases;

import org.testng.annotations.Test;
import pageObjects.AddEmployee;
import pageObjects.BaseObject;
import pageObjects.LoginPage;

public class TC003_CreateEmployee extends BaseClass {

    @Test
    public void addEmployee()
    {
        LoginPage lp = new LoginPage(driver);
        AddEmployee add = new AddEmployee(driver);

//        logger.info("Login in Progress");
        lp.InputUsername(username);
        lp.InputPassword(password);
        lp.clickLogin();
//        logger.info("Login Successful");

        add.clickPIM();
        add.clickAddEmployee();

//        logger.info("Inputting Employee Details");
        add.inputFirstname(randomString(5));
        add.inputMidName(randomString(5));
        add.inputLastname(randomString(5));

//        logger.info("Creating Employee Login Details");
        add.createLoginDetails();
        add.inputUsername(randomString(5));
        add.disableUser();
        String pwd = randomString(5) + randomNumber(4);
        add.inputPassword(pwd);
        add.confirmPassword(pwd);

//        logger.info("Saving Employee Details");
        add.saveEmployee();
//        logger.info("Logging Out");
//        lp.Logout();

//        logger.info("TC003_CreateEmployee Successful");


    }
}
