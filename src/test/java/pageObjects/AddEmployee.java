package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddEmployee extends BaseObject {

    public AddEmployee(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM']")
    WebElement PIM;

    @FindBy(xpath = "//a[normalize-space()='Add Employee']")
    WebElement btn_addEmployee;

    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement txt_firstname;

    @FindBy(xpath = "//input[@placeholder='Middle Name']")
    WebElement txt_middlename;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement txt_lastname;

    @FindBy(xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
    WebElement btn_createLoginDetails;

    @FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout orangehrm-upgrade-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/form[@class='oxd-form']/div[@class='orangehrm-employee-container']/div[@class='orangehrm-employee-form']/div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/input[1]")
    WebElement txt_inputUsername;

    @FindBy(xpath = "//label[normalize-space()='Disabled']")
    WebElement disableUser;

    @FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
    WebElement txt_inputPassword;

    @FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
    WebElement txt_confirmPassword;

    @FindBy(xpath = "//button[normalize-space()='Save']")
    WebElement btn_save;

    public void clickPIM()
    {
        PIM.click();
    }

    public void clickAddEmployee()
    {
        btn_addEmployee.click();
    }

    public void inputFirstname(String fname)
    {
        txt_firstname.sendKeys(fname);
    }

    public void inputMidName(String mname)
    {
        txt_middlename.sendKeys(mname);
    }

    public void inputLastname(String lname)
    {
        txt_lastname.sendKeys(lname);
    }

    public void createLoginDetails()
    {
        btn_createLoginDetails.click();
    }

    public void inputUsername(String username)
    {
        txt_inputUsername.clear();
        txt_inputUsername.sendKeys(username);
    }

    public void disableUser()
    {
        disableUser.click();
    }

    public void inputPassword(String password)
    {
        txt_inputPassword.clear();
        txt_inputPassword.sendKeys(password);
    }

    public void confirmPassword(String password)
    {
        txt_confirmPassword.clear();
        txt_confirmPassword.sendKeys(password);
    }

    public void saveEmployee()
    {
        btn_save.click();
    }

}
