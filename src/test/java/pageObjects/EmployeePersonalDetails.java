package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeePersonalDetails extends BaseObject{

    public EmployeePersonalDetails(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//div[1]//div[2]//div[1]//div[1]//div[2]//input[1]")
    WebElement txt_inputNickName;

    @FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout orangehrm-upgrade-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[2]/div[1]/div[1]/div[2]/input[1]")
    WebElement txt_driversLicense;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div/input")
    WebElement lincense_expDate; //yyyy-dd-mm

    @FindBy(xpath = "//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//div[@class='oxd-grid-3 orangehrm-full-width-grid']//div[1]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")
    WebElement drp_nationality; // //span[normalize-space()='Barbadian']

    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div/div[1]")
    WebElement drp_maritalstatus; // //span[normalize-space()='Single']

    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div/div/input")
    WebElement dob; //yyyy-dd-mm

    @FindBy(xpath = "//label[normalize-space()='Male']")
    WebElement male;

    @FindBy(xpath = "//label[normalize-space()='Female']")
    WebElement female;

    @FindBy(xpath = "//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//button[@type='submit'][normalize-space()='Save']")
    WebElement savepersonaldetails;

    @FindBy(xpath = "//div[@class='orangehrm-custom-fields']//div[@class='orangehrm-card-container']//form[@class='oxd-form']//div[@class='oxd-form-row']//div[@class='oxd-grid-3 orangehrm-full-width-grid']//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")
    WebElement drp_bloodType; // //span[normalize-space()='A+']

    @FindBy(xpath = "//div[@class='orangehrm-custom-fields']//div[@class='orangehrm-card-container']//form[@class='oxd-form']//div[@class='oxd-form-row']//div[@class='oxd-grid-3 orangehrm-full-width-grid']//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
    WebElement txt_testfield;

    @FindBy(xpath = "//div[@class='orangehrm-custom-fields']//button[@type='submit'][normalize-space()='Save']")
    WebElement saveBloodDetails;

    @FindBy(xpath = "//button[normalize-space()='Add']")
    WebElement btn_addAttachment;

    @FindBy(xpath = "//i[@class='oxd-icon bi-upload oxd-file-input-icon']")
    WebElement file_input;

    @FindBy(xpath = "//div[@class='oxd-file-input-div']")
    WebElement fileInputDisplay;

    @FindBy(xpath = "//textarea[@placeholder='Type comment here']")
    WebElement txt_file_comment;

    @FindBy(xpath = "//div[@class='orangehrm-attachment']//button[@type='submit'][normalize-space()='Save']")
    WebElement btn_savefile;

    public void inputNickname(String nickname)
    {
        txt_inputNickName.sendKeys(nickname);
    }

    public void inputDriversLicense(String drivers_lincense)
    {
        txt_driversLicense.sendKeys(drivers_lincense);
    }

    public void lincenseExp(String yyyy_dd_mm)
    {
        lincense_expDate.sendKeys(yyyy_dd_mm);
    }

    public void Nationality(String nation)
    {
        drp_nationality.click();
        WebElement nationality = driver.findElement(By.xpath("//span[normalize-space()='"+nation+"']"));
        nationality.click();
    }

    public void MaritalStatus(String status)
    {
        drp_maritalstatus.click();
        WebElement maritalStatus = driver.findElement(By.xpath("//span[normalize-space()='"+status+"']"));
        maritalStatus.click();
    }

    public void DateOfBirth(String yy_dd_mm)
    {
        dob.sendKeys(yy_dd_mm);
    }

    public void Gender(String gender)
    {
        if(gender.equalsIgnoreCase("male"))
        {
            male.click();
        }
        else if(gender.equalsIgnoreCase("female"))
        {
            female.click();
        }
    }

    public void Save()
    {
        savepersonaldetails.click();
    }

    public void Bloodtype(String bloodtype)
    {
        drp_bloodType.click();
        WebElement btype = driver.findElement(By.xpath("//span[normalize-space()='"+bloodtype+"']"));
        btype.click();
    }

    public void commentBloodtype(String comment)
    {
        txt_testfield.sendKeys(comment);
    }

    public void SaveBloodDetails()
    {
        saveBloodDetails.click();
    }

    public void AddAttachment()
    {
        btn_addAttachment.click();
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
