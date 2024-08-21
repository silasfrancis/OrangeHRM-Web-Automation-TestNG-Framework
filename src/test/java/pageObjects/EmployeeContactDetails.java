package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeeContactDetails extends BaseObject{

    public EmployeeContactDetails(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[2]/a")
    WebElement click_ContactDetails;

    @FindBy(xpath = "//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//div[1]//div[1]//div[1]//div[1]//div[2]//input[1]")
    WebElement streetAddress1;

    @FindBy(xpath = "//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//div[1]//div[1]//div[2]//div[1]//div[2]//input[1]")
    WebElement streetAddress2;

    @FindBy(xpath = "//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//div[1]//div[1]//div[3]//div[1]//div[2]//input[1]")
    WebElement city;

    @FindBy(xpath = "//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//div[1]//div[1]//div[4]//div[1]//div[2]//input[1]")
    WebElement state;

    @FindBy(xpath = "//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//div[1]//div[1]//div[5]//div[1]//div[2]//input[1]")
    WebElement zipcode;

    @FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")
    WebElement drp_country; // //span[normalize-space()='American Samoa']

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")
    WebElement inputHomePhone;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")
    WebElement inputMobilePhone;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[3]/div[1]/div[2]/input[1]")
    WebElement inputWorkPhone;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/input[1]")
    WebElement inputWorkEmail;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[2]/div[1]/div[2]/input[1]")
    WebElement otherEmail;

    @FindBy(xpath = "//button[normalize-space()='Save']")
    WebElement saveContactInfo;

    @FindBy(xpath = "//button[normalize-space()='Add']")
    WebElement add_attachment;

    @FindBy(xpath = "//i[@class='oxd-icon bi-upload oxd-file-input-icon']")
    WebElement file_input; // testData/test.png

    @FindBy(xpath = "//div[@class='oxd-file-input-div']")
    WebElement fileInputDisplay;

    @FindBy(xpath = "//textarea[@placeholder='Type comment here']")
    WebElement txt_file_comment;

    @FindBy(xpath = "//div[@class='orangehrm-attachment']//button[@type='submit'][normalize-space()='Save']")
    WebElement btn_savefile;

    public WebElement clickContactDetails()
    {
        return click_ContactDetails;
    }

    public void inputAddress1(String address)
    {
        streetAddress1.sendKeys(address);
    }

    public void inputAddress2(String address)
    {
        streetAddress2.sendKeys(address);
    }

    public void inputCity(String City)
    {
        city.sendKeys(City);
    }

    public void inputState(String State)
    {
        state.sendKeys(State);
    }

    public void inputZipCode(String Zipcode)
    {
        zipcode.sendKeys(Zipcode);
    }

    public void selectCountry(String country)
    {
        drp_country.click();
        WebElement Country = driver.findElement(By.xpath("//span[normalize-space()='"+country+"']"));
        Country.click();
    }

    public void inputPhone(String homePhone, String mobilePhone, String workPhone)
    {
        inputHomePhone.sendKeys(homePhone);
        inputMobilePhone.sendKeys(mobilePhone);
        inputWorkPhone.sendKeys(workPhone);
    }

    public void inputEmail(String workEmail, String other_email)
    {
        inputWorkEmail.sendKeys(workEmail);
        otherEmail.sendKeys(other_email);
    }

    public void saveContactInfo()
    {
        saveContactInfo.click();
    }

    public void AddAttachment()
    {
        add_attachment.click();
    }

    public void Upload(String path)
    {
        file_input.sendKeys(path);
    }

    public String confirmFileUpload()
    {
        return fileInputDisplay.getText();
    }

    public void commentFile(String comment)
    {
        txt_file_comment.sendKeys(comment);
    }

    public void SaveUpload()
    {
        btn_savefile.click();
    }
}
