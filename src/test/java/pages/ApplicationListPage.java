package pages;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class ApplicationListPage {
    public ApplicationListPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    public void assertApplicationListUrl(){
        Assert.assertEquals("http://qa-duobank.us-east-2.elasticbeanstalk.com/applications.php", Driver.getDriver().getCurrentUrl());
    }
}
