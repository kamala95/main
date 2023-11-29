package pages;

import lombok.Data;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

@Data
public class DashboardPage {
    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void assertDashboardUrl(){
        Assert.assertEquals("http://qa-duobank.us-east-2.elasticbeanstalk.com/dashboard.php", Driver.getDriver().getCurrentUrl());
    }
    @FindBy(xpath = "//img[@src='app-assets/images/logo/logo.png']")
    private WebElement logo;

    public void assertDashboardLogo(){
        Assert.assertTrue(getLogo().isDisplayed());
    }

    @FindBy(xpath = "//span[@data-i18n=\"eCommerce\"]")
    private WebElement mortgageApp;

    public void assertMortgageApp(){
        Assert.assertTrue(getMortgageApp().isDisplayed());
    }

    @FindBy(xpath = "//span[@data-i18n=\"Analytics\"]")
    private WebElement applicationListButton;

    public void assertApplicationList() {
        Assert.assertTrue(getApplicationListButton().isDisplayed());
    }

    @FindBy(xpath = "//span[@class='user-name']")
    private WebElement userName;

    @FindBy(xpath = " //img[@src='app-assets/images/portrait/small/avatar-s-11.jpg']")
    private WebElement profilePicture;

    public void userNameDisplayed() {
        Assert.assertTrue(getUserName().isDisplayed());
    }
    public void profilePictureIsDisplayed() {
        Assert.assertTrue(getProfilePicture().isDisplayed());
    }

    public void verificationOfUserName() {
        Assert.assertEquals("Emily Johnson", getUserName().getText());

    }
    @FindBy(xpath = "//a[@class='dropdown-item']")
    private WebElement logOut;

    public void LogOutIsDisplayed() {
        Assert.assertTrue(getLogOut().isDisplayed());
    }
}
