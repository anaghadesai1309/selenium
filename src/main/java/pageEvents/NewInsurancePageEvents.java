package main.java.pageEvents;

import main.java.pageObjects.NewInsurancePageElements;
import main.java.utils.ElementFetch;
import org.openqa.selenium.By;
import org.testng.Assert;

import static test.java.BaseTest.driver;


public class NewInsurancePageEvents {
    public void verifyCreateNewInsurancePageIsLoaded() {
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getListWebElements("XPATH", NewInsurancePageElements.createNewInsuranceText).size() > 0, "Create New Insurance Page not loaded yet!");
    }

    public void selectCountryDropdown() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", NewInsurancePageElements.selectCountry).click();
    }

    public void verifyCountryListIsLoaded() {
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getListWebElements("XPATH", NewInsurancePageElements.countryList).size() > 0, "List of countries not loaded yet!");
    }

    public void selectCountryFromList() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", NewInsurancePageElements.selectCountryFromList).click();
    }

    public void selectProductNameDropdown() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", NewInsurancePageElements.selectProductName).click();
    }

    public void verifyProductNameListIsLoaded() {
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getListWebElements("XPATH", NewInsurancePageElements.productNameList).size() > 0, "List of products not loaded yet!");
    }

    public void selectProductNameFromList() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", NewInsurancePageElements.selectProductNameFromList).click();
    }

    public void selectTariffDropdown() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", NewInsurancePageElements.selectTariff).click();
    }

    public void verifyTariffListIsLoaded() {
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getListWebElements("XPATH", NewInsurancePageElements.tariffList).size() > 0, "List of products not loaded yet!");
    }

    public void selectTariffFromList() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", NewInsurancePageElements.selectTariffFromList).click();
    }

    public void selectInsuranceCategoryDropdown() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", NewInsurancePageElements.selectInsuranceCategory).click();
    }

    public void verifyInsuranceCategoryListIsLoaded() {
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getListWebElements("XPATH", NewInsurancePageElements.insuranceCategoryList).size() > 0, "List of products not loaded yet!");
    }

    public void selectInsuranceCategoryFromList() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", NewInsurancePageElements.selectInsuranceCategoryFromList).click();
    }

    public void selectIPeriodDropdown() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", NewInsurancePageElements.selectPeriod).click();
    }

    public void verifyPeriodListIsLoaded() {
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getListWebElements("XPATH", NewInsurancePageElements.periodList).size() > 0, "List of products not loaded yet!");
    }

    public void selectPeriodFromList() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", NewInsurancePageElements.selectPeriodFromList).click();
    }


    public void selectPaymentTypeDropdown() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", NewInsurancePageElements.selectPaymentType).click();
    }

    public void verifyPaymentTypeIsLoaded() {
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getListWebElements("XPATH", NewInsurancePageElements.paymentTypeList).size() > 0, "List of products not loaded yet!");
    }

    public void selectPaymentTypeFromList() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", NewInsurancePageElements.selectPaymentTypeFromList).click();
    }

    public void selectClassDropdown() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", NewInsurancePageElements.selectClass).click();
    }

    public void verifyClassIsLoaded() {
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getListWebElements("XPATH", NewInsurancePageElements.classList).size() > 0, "List of products not loaded yet!");
    }

    public void selectClassFromList() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", NewInsurancePageElements.selectClassFromList).click();
    }

    public void enterSerialNumber() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", NewInsurancePageElements.enterSerialNumber).sendKeys("011111110000000007");
    }

    public void enterDeviceName() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", NewInsurancePageElements.enterDeviceName).sendKeys("TestDevice01");
    }

    public void enterInvoiceNumber() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", NewInsurancePageElements.enterInvoiceNumber).sendKeys("(AI01)GTIN+(AI21)");
    }

    public void clickOnNextButton() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", NewInsurancePageElements.productNextButton).click();
    }

    public void verifyCustomerFormIsLoaded() {
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getListWebElements("XPATH", NewInsurancePageElements.verifySalutationText).size() > 0, "Customer Details Form not loaded yet!");
    }

    public void selectSalutation() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", NewInsurancePageElements.selectSalutation).click();
    }

    public void enterFirstName() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", NewInsurancePageElements.enterFirstName).sendKeys("TestUser");
    }

    public void enterLastName() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", NewInsurancePageElements.enterLastName).sendKeys("001");
    }

    public void enterEmailID() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", NewInsurancePageElements.enterEmailID).sendKeys("testuser001@abc.com");
    }

    public void enterStreet() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", NewInsurancePageElements.enterStreet).sendKeys("StreetNumber001");
    }

    public void enterHouseNumber() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", NewInsurancePageElements.enterHouseNumber).sendKeys("290");
    }

    public void enterPostalCode() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", NewInsurancePageElements.enterPostalCode).sendKeys("290902");
    }

    public void enterCity() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", NewInsurancePageElements.enterCity).sendKeys("Mumbai");
    }

    public void enterCountry() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", NewInsurancePageElements.enterCountry).sendKeys("IN");
    }

    public void clickOnCustomerNextButton() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", NewInsurancePageElements.customerNextButton).click();
    }

    public void verifyConfirmationText() {
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getListWebElements("XPATH", NewInsurancePageElements.verifyConfirmationTest).size() > 0, "Confirmation Page not loaded yet!");

    }

    public void selectCheckBox1() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", NewInsurancePageElements.checkBox1).click();

    }

    public void selectCheckBox2() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", NewInsurancePageElements.checkBox2).click();

    }

    public void selectCheckBox3() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", NewInsurancePageElements.checkBox3).click();

    }

    public void selectCheckBox4() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", NewInsurancePageElements.checkBox4).click();

    }

    public void clickOnCreateInsurance() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", NewInsurancePageElements.createInsuranceButton).click();

    }

    public void verifyPaymentsPageIsLoaded() {
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getListWebElements("XPATH", NewInsurancePageElements.verifyPaymentsPage).size() > 0, "Payments Page not loaded yet!");
    }

    public void selectCreditDebitCardRadioButton() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", NewInsurancePageElements.selectCreditDebitCard).click();

    }

    public void clickOnContinueToPaymentButton() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", NewInsurancePageElements.continueToPaymentButton).click();

    }

    public void verifyCardDetailsPageIsLoaded() {
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getListWebElements("XPATH", NewInsurancePageElements.cardDetailsPage).size() > 0, "Credit Card Details Page not loaded yet!");
    }


    public void enterCreditCardNumber() {
        ElementFetch elementFetch = new ElementFetch();
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe")));
        elementFetch.getWebElement("XPATH", NewInsurancePageElements.enterCreditCardNumber).sendKeys("4242424242424242");
    }

    public void enterExpiryDate() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", NewInsurancePageElements.enterExpiryDate).sendKeys("1233");
    }

    public void enterCVV() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", NewInsurancePageElements.enterCVV).sendKeys("233");
    }

    public void clickOnOrderForAFeeButton() {
        ElementFetch elementFetch = new ElementFetch();
        driver.switchTo().defaultContent();
        elementFetch.getWebElement("XPATH", NewInsurancePageElements.orderForAFeeButton).click();

    }

    public void selectDirectDebitCardRadioButton() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", NewInsurancePageElements.selectDirectDebitCard).click();

    }

    public void verifyDirectDebitCardDetailsPageIsLoaded() {
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getListWebElements("XPATH", NewInsurancePageElements.verifyDirectDebitCardPageLoaded).size() > 0, "Direct Debit Card Details Page not loaded yet!");
    }

    public void enterAccountHolderName() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", NewInsurancePageElements.enterAccountHolderName).sendKeys("TestUser");
    }

    public void enterAccountHolderEmailID() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", NewInsurancePageElements.enterAccountHolderEmailID).sendKeys("testuser@abc.com");
    }

    public void enterIBAN() {
        ElementFetch elementFetch = new ElementFetch();
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title=\"Sicherer Eingaberahmen für IBAN\"]")));
        elementFetch.getWebElement("XPATH", NewInsurancePageElements.enterIBAN).sendKeys("DE89370400440532013000");
    }

    public void selectCheckBox() {
        ElementFetch elementFetch = new ElementFetch();
        driver.switchTo().defaultContent();
        elementFetch.getWebElement("XPATH", NewInsurancePageElements.selectCheckBox).click();

    }






}
