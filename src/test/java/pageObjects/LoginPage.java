package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseObject{

    public LoginPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement txt_username;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement txt_password;

    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement btn_login;

    @FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
    WebElement drp_user;

    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement logout;

    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Dashboard']")
    WebElement dashboard;

    @FindBy(xpath = "//i[@class='oxd-icon bi-exclamation-circle oxd-alert-content-icon']")
    WebElement invalid_loginDetails;

    public void InputUsername(String username)
    {
        txt_username.sendKeys(username);
    }

    public void InputPassword(String password)
    {
        txt_password.sendKeys(password);
    }

    public void clickLogin()
    {
        btn_login.click();
    }

    public void Logout()
    {
        drp_user.click();
        logout.click();
    }

    public WebElement LoginConfirm()
    {
        return dashboard;
    }

    public WebElement Invalid_loginDetails()
    {
        return invalid_loginDetails;
    }


}
