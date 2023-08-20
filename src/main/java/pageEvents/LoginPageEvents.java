package main.java.pageEvents;

import main.java.pageObjects.LoginPageElements;
import main.java.utils.ElementFetch;
import org.testng.Assert;

public class LoginPageEvents {

    public void changeLanguage() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", LoginPageElements.changeLanguageButton).click();
    }

    public void selectEnglishLanguage() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", LoginPageElements.englishLanguage).click();
    }

    public void verifyLanguageIsEnglish() {
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getListWebElements("XPATH", LoginPageElements.rememberMeText).size() > 0, "Language not changed to English");
    }

    public void selectEmailAddress() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID", LoginPageElements.emailAddress).click();
    }

    public void enterEmailAddress() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID", LoginPageElements.emailAddress).sendKeys("testsellingpartner1@simplesurance.de");
    }

    public void selectPassword() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID", LoginPageElements.password).click();
    }

    public void enterPassword() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID", LoginPageElements.password).sendKeys("TestSellingPartner1Pass");
    }

    public void clickOnNextButton() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", LoginPageElements.nextButton).click();
    }
}
