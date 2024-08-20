package pageObjects;

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

    @FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout orangehrm-upgrade-layout']/div[@class='oxd-layout-container --collapse']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[2]/div[2]/div[1]/div[1]/div[2]/input[1]")
    WebElement txt_driversLicense;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/i[1]")
    WebElement lincense_expDate; //yyyy-dd-mm

    @FindBy(xpath = "//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//div[@class='oxd-grid-3 orangehrm-full-width-grid']//div[1]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")
    WebElement drp_nationality; //span[normalize-space()='Barbadian']

    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div/div[1]")
    WebElement drp_maritalstatus; //span[normalize-space()='Single']

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/i[1]")
    WebElement dob; //yyyy-dd-mm

    @FindBy(xpath = "//label[normalize-space()='Male']")
    WebElement male;

    @FindBy(xpath = "//label[normalize-space()='Female']")
    WebElement female;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/div[1]/div[1]/div[1]/div[2]/input[1]")
    WebElement txt_militaryService;

    @FindBy(xpath = "//div[@class='orangehrm-custom-fields']//div[@class='orangehrm-card-container']//form[@class='oxd-form']//div[@class='oxd-form-row']//div[@class='oxd-grid-3 orangehrm-full-width-grid']//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")
    WebElement drp_bloodType; //span[normalize-space()='A+']

    @FindBy(xpath = "//div[@class='orangehrm-custom-fields']//div[@class='orangehrm-card-container']//form[@class='oxd-form']//div[@class='oxd-form-row']//div[@class='oxd-grid-3 orangehrm-full-width-grid']//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
    WebElement txt_testfield;

    @FindBy(xpath = "//button[normalize-space()='Add']")
    WebElement btn_addAttachment;

    @FindBy(xpath = "//i[@class='oxd-icon bi-upload oxd-file-input-icon']")
    WebElement file_input; //testData/20230119_031434.jpg

    @FindBy(xpath = "//div[@class='oxd-file-input-div']")
    WebElement fileInputDisplay;

    @FindBy(xpath = "//textarea[@placeholder='Type comment here']")
    WebElement txt_file_comment;

    @FindBy(xpath = "//div[@class='orangehrm-attachment']//button[@type='submit'][normalize-space()='Save']")
    WebElement btn_savefile;
}
