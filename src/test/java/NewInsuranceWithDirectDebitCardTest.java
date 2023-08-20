package test.java;

import main.java.pageEvents.HomePageEvents;
import main.java.pageEvents.LoginPageEvents;
import main.java.pageEvents.NewInsurancePageEvents;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class NewInsuranceWithDirectDebitCardTest extends BaseTest {
    @Test
    public void sampleMethodForNewInsuranceCreationWithDirectDebitCard() {
        LoginPageEvents loginPageEvents = new LoginPageEvents();
        loginPageEvents.changeLanguage();
        loginPageEvents.selectEnglishLanguage();
        loginPageEvents.verifyLanguageIsEnglish();
        loginPageEvents.selectEmailAddress();
        loginPageEvents.enterEmailAddress();
        loginPageEvents.selectPassword();
        loginPageEvents.enterPassword();
        loginPageEvents.clickOnNextButton();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // Wait for up to 5 seconds
        HomePageEvents homePageEvents = new HomePageEvents();
        homePageEvents.verifyHomePageIsLoaded();
        homePageEvents.createNewInsurance();

        NewInsurancePageEvents newInsurancePageEvents = new NewInsurancePageEvents();
        newInsurancePageEvents.verifyCreateNewInsurancePageIsLoaded();

        newInsurancePageEvents.selectCountryDropdown();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        newInsurancePageEvents.verifyCountryListIsLoaded();
        newInsurancePageEvents.selectCountryFromList();

        newInsurancePageEvents.selectProductNameDropdown();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        newInsurancePageEvents.verifyProductNameListIsLoaded();
        newInsurancePageEvents.selectProductNameFromList();

        newInsurancePageEvents.selectTariffDropdown();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        newInsurancePageEvents.verifyTariffListIsLoaded();
        newInsurancePageEvents.selectTariffFromList();

        newInsurancePageEvents.selectInsuranceCategoryDropdown();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        newInsurancePageEvents.verifyInsuranceCategoryListIsLoaded();
        newInsurancePageEvents.selectInsuranceCategoryFromList();

        newInsurancePageEvents.selectIPeriodDropdown();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        newInsurancePageEvents.verifyPeriodListIsLoaded();
        newInsurancePageEvents.selectPeriodFromList();

        newInsurancePageEvents.selectPaymentTypeDropdown();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        newInsurancePageEvents.verifyPaymentTypeIsLoaded();
        newInsurancePageEvents.selectPaymentTypeFromList();

        newInsurancePageEvents.selectClassDropdown();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        newInsurancePageEvents.verifyClassIsLoaded();
        newInsurancePageEvents.selectClassFromList();

        newInsurancePageEvents.enterSerialNumber();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        newInsurancePageEvents.enterDeviceName();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        newInsurancePageEvents.enterInvoiceNumber();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        newInsurancePageEvents.clickOnNextButton();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        newInsurancePageEvents.verifyCustomerFormIsLoaded();
        newInsurancePageEvents.selectSalutation();
        newInsurancePageEvents.enterFirstName();
        newInsurancePageEvents.enterLastName();
        newInsurancePageEvents.enterEmailID();
        newInsurancePageEvents.enterStreet();
        newInsurancePageEvents.enterHouseNumber();
        newInsurancePageEvents.enterPostalCode();
        newInsurancePageEvents.enterCity();
        newInsurancePageEvents.enterCountry();
        newInsurancePageEvents.clickOnCustomerNextButton();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        newInsurancePageEvents.verifyConfirmationText();
        newInsurancePageEvents.selectCheckBox1();
        newInsurancePageEvents.selectCheckBox2();
        newInsurancePageEvents.selectCheckBox3();
        newInsurancePageEvents.selectCheckBox4();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        newInsurancePageEvents.clickOnCreateInsurance();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        newInsurancePageEvents.verifyPaymentsPageIsLoaded();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        newInsurancePageEvents.selectDirectDebitCardRadioButton();
        newInsurancePageEvents.clickOnContinueToPaymentButton();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        newInsurancePageEvents.verifyDirectDebitCardDetailsPageIsLoaded();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        newInsurancePageEvents.enterAccountHolderName();
        newInsurancePageEvents.enterAccountHolderEmailID();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        newInsurancePageEvents.enterIBAN();
        newInsurancePageEvents.selectCheckBox();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        newInsurancePageEvents.clickOnOrderForAFeeButton();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);





    }
}
