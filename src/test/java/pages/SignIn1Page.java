package pages;

import lombok.Data;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

@Data
public class SignIn1Page {

    public SignIn1Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "exampleInputEmail1")
    private WebElement email;

    public void signInWithValidData(){
        getEmail().sendKeys("emilyjohnson202324@gmail.com", Keys.TAB,"Duotech2023",Keys.ENTER);
    }

    public void assertUrl(){
        Assert.assertEquals("http://qa-duobank.us-east-2.elasticbeanstalk.com/index.php", Driver.getDriver().getCurrentUrl());
    }

}
