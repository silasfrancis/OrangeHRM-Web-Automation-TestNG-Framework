package testCases;

import org.testng.annotations.Test;
import pageObjects.AddEmployee;
import pageObjects.LoginPage;
import utilities.DataProviders;

public class TC005_CreateEmployeeDDT extends BaseClass{

    @Test(dataProvider = "EmployeeData", dataProviderClass = DataProviders.class)
    public void addEmployeeDDT(String fname, String mname, String lname, String uname, String pwd)
    {
        LoginPage lp = new LoginPage(driver);
        AddEmployee add = new AddEmployee(driver);

        logger.info("Login in Progress");
        lp.InputUsername(username);
        lp.InputPassword(password);
        lp.clickLogin();
        logger.info("Login Successful");

        add.clickPIM();
        add.clickAddEmployee();

        logger.info("Inputting Employee Details");
        add.inputFirstname(fname);
        add.inputMidName(mname);
        add.inputLastname(lname);

        logger.info("Creating Employee Login Details");
        add.createLoginDetails();
        add.inputUsername(uname);
        add.disableUser();
        add.inputPassword(pwd);
        add.confirmPassword(pwd);

        logger.info("Saving Employee Details");
        add.saveEmployee();
        logger.info("Logging Out");
        lp.Logout();

        logger.info("TTC005_CreateEmployeeDDT Successful");
    }
}
