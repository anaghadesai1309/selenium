package test.java;

import main.java.pageEvents.HomePageEvents;
import main.java.pageEvents.LoginPageEvents;
import main.java.pageEvents.NewInsurancePageEvents;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class NewInsuranceWithCreditCardTest extends BaseTest {
    @Test
    public void sampleMethodForNewInsuranceCreationWithCreditCard() {
        //Login Page
        LoginPageEvents loginPageEvents = new LoginPageEvents();
        loginPageEvents.changeLanguage();
        loginPageEvents.selectEnglishLanguage();
        loginPageEvents.verifyLanguageIsEnglish();
        loginPageEvents.selectEmailAddress();
        loginPageEvents.enterEmailAddress();
        loginPageEvents.selectPassword();
        loginPageEvents.enterPassword();
        loginPageEvents.clickOnNextButton();

        //Create New Insurance Policy using Credit Card
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        HomePageEvents homePageEvents = new HomePageEvents();
        homePageEvents.verifyHomePageIsLoaded();
        homePageEvents.createNewInsurance();

        NewInsurancePageEvents newInsurancePageEvents = new NewInsurancePageEvents();
        newInsurancePageEvents.verifyCreateNewInsurancePageIsLoaded();
        //Product Details
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

        //Customer Details
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

        //Payment Gateway Page
        newInsurancePageEvents.verifyPaymentsPageIsLoaded();
        newInsurancePageEvents.selectCreditDebitCardRadioButton();
        newInsurancePageEvents.clickOnContinueToPaymentButton();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        newInsurancePageEvents.verifyCardDetailsPageIsLoaded();
        //newInsurancePageEvents.clickOnCardNumberField();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        newInsurancePageEvents.enterCreditCardNumber();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        newInsurancePageEvents.enterExpiryDate();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        newInsurancePageEvents.enterCVV();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        newInsurancePageEvents.clickOnOrderForAFeeButton();


    }
}
