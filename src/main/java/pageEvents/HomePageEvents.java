package main.java.pageEvents;

import main.java.pageObjects.HomePageElements;
import main.java.pageObjects.LoginPageElements;
import main.java.utils.ElementFetch;
import org.testng.Assert;

public class HomePageEvents {

    public void verifyHomePageIsLoaded() {
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getListWebElements("XPATH", HomePageElements.insurancesText).size() > 0, "Home Page not loaded yet!");
    }
    public void createNewInsurance(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", HomePageElements.createNewInsurance).click();
    }

    public void importInsuranceData(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", HomePageElements.importInsuranceData).click();
    }
}
