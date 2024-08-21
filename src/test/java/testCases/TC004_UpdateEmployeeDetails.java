package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.EmployeeContactDetails;
import pageObjects.EmployeePersonalDetails;

import java.io.IOException;
import java.time.Period;

public class TC004_UpdateEmployeeDetails extends BaseClass{

    @Test
    public void updateEmployeeDetails() throws InterruptedException {
        TC003_CreateEmployee createEmployee = new TC003_CreateEmployee();
        createEmployee.addEmployee();
        Thread.sleep(3000);

        logger.info("Updating Employee Personal Details");
        EmployeePersonalDetails personal =new EmployeePersonalDetails(driver);
        //personal.inputNickname(randomString(5));
        personal.inputDriversLicense(String.valueOf(randomAlphaNumeric(9)));
        personal.lincenseExp("2024-20-11");
        personal.Nationality("Nigeria");
        personal.MaritalStatus("Single");
        personal.DateOfBirth("2002-07-05");
        personal.Gender("Male");
        personal.Save();

        personal.Bloodtype("O-");
        personal.commentBloodtype(randomString(7));
        personal.SaveBloodDetails();

        try {
            logger.info("Adding attachment");
            personal.AddAttachment();
            personal.Upload(System.getProperty("user.dir") + "\\testData\\20230119_031434.jpg");
            if (personal.confirmFileUpload().equals("20230119_031434.jpg")) {
                Assert.assertTrue(true);
                logger.info("File Upload Successful");
            }
            else
            {
                takeScreenshot(driver, "File Upload unsuccessful");
            }

            }
            catch(Exception e)
            {
                logger.info(e.getMessage());
            }
        personal.commentFile(randomString(6));
        personal.SaveUpload();
        logger.info("Employee Personal Details Updated Successfully");

        Thread.sleep(3000);

        logger.info("Updating Employee Contact Details");
        EmployeeContactDetails contact = new EmployeeContactDetails(driver);
        contact.clickContactDetails();
        contact.inputAddress1(randomAlphaNumeric(8));
        contact.inputAddress2(randomAlphaNumeric(9));
        contact.inputCity(randomString(5));
        contact.inputState(randomString(5));
        contact.inputZipCode(randomNumber(5));
        contact.selectCountry("Nigeria");
        contact.inputPhone(randomNumber(9),randomNumber(9), randomNumber(9));
        contact.inputEmail(randomAlphaNumeric(8)+"@gmail.com", randomAlphaNumeric(8)+"@gmail.com");
        contact.saveContactInfo();

        try{
            logger.info("Adding Contact Attachment");
            contact.AddAttachment();
            contact.Upload(System.getProperty("user.dir") + "\\testData\\test.png");

            if(contact.confirmFileUpload().equals("test.png"))
            {
                Assert.assertTrue(true);
                logger.info("Contact File Upload Successful");
            }
            else{
                takeScreenshot(driver, "Contact File Upload Unsuccessful");
            }
        } catch(Exception e)
        {
            logger.info(e.getMessage());
        }

        contact.commentFile(randomString(8));
        contact.SaveUpload();
        logger.info("Employee Contact Details Updated Successfully");

        logger.info("TC004_UpdateEmployeeDetails Successful");

    }

}
