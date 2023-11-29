package pages;

import lombok.Data;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

@Data
public class MortgageApplicationPage {
    public MortgageApplicationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    public void assertMortgageAppUrl(){
        Assert.assertEquals("http://qa-duobank.us-east-2.elasticbeanstalk.com/mortgage.php", Driver.getDriver().getCurrentUrl());
    }

}
