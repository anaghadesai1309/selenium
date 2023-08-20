package main.java.pageObjects;

public interface NewInsurancePageElements {

    String createNewInsuranceText = "//*[@id=\"root\"]/div/div/div[1]/h2/span";
    String selectCountry = "//*[@id=\"country-select\"]";
    String countryList = "//*[@id=\"menu-country-select\"]/div[3]/ul";
    String selectCountryFromList = "//*[@id=\"menu-country-select\"]/div[3]/ul/li[5]";
    String productNameList = "//*[@id=\"menu-product-name-select\"]/div[3]/ul";
    String selectProductNameFromList = "//*[@id=\"menu-product-name-select\"]/div[3]/ul/li";
    String selectProductName = "//*[@id=\"product-name-select\"]";

    String tariffList = "//*[@id=\"menu-tariff-name-select\"]/div[3]/ul";
    String selectTariffFromList = "//*[@id=\"menu-tariff-name-select\"]/div[3]/ul/li";
    String selectTariff = "//*[@id=\"tariff-name-select\"]";


    String insuranceCategoryList = "//*[@id=\"menu-category-name-select\"]/div[3]/ul";
    String selectInsuranceCategoryFromList = "//*[@id=\"menu-category-name-select\"]/div[3]/ul/li";
    String selectInsuranceCategory = "//*[@id=\"category-name-select\"]";

    String periodList = "//*[@id=\"menu-duration-select\"]/div[3]/ul";
    String selectPeriodFromList = "//*[@id=\"menu-duration-select\"]/div[3]/ul/li[2]";
    String selectPeriod = "//*[@id=\"duration-select\"]";

    String paymentTypeList = "//*[@id=\"menu-frequency-select\"]/div[3]/ul";
    String selectPaymentTypeFromList = "//*[@id=\"menu-frequency-select\"]/div[3]/ul/li";
    String selectPaymentType = "//*[@id=\"frequency-select\"]";

    String classList = "//*[@id=\"menu-class-name-select\"]/div[3]/ul";
    String selectClassFromList = "//*[@id=\"menu-class-name-select\"]/div[3]/ul/li[4]";
    String selectClass = "//*[@id=\"class-name-select\"]";

    String enterSerialNumber = "//*[@id=\"input-createCertificate_serialNumber\"]";
    String enterDeviceName = "//*[@id=\"input-createCertificate_deviceName\"]";
    String enterInvoiceNumber = "//*[@id=\"input-createCertificate_invoiceNumber\"]";
    String productNextButton = "//*[@id=\"root\"]/div/div/div[2]/div/div[2]/form/div[5]/div/div[3]/button";

    String verifySalutationText = "//*[@id=\"root\"]/div/div/div[2]/div/div[2]/form/div[1]/label/span[1]";

    String selectSalutation = "//*[@id=\"root\"]/div/div/div[2]/div/div[2]/form/div[1]/div/label[1]/span[1]/span[1]/input";

    String enterFirstName = "//*[@id=\"input-createCertificate_firstName\"]";
    String enterLastName = "//*[@id=\"input-createCertificate_lastName\"]";
    String enterEmailID = "//*[@id=\"input-createCertificate_email\"]";
    String enterStreet = "//*[@id=\"input-createCertificate_streetName\"]";
    String enterHouseNumber = "//*[@id=\"input-createCertificate_streetNumber\"]";
    String enterPostalCode = "//*[@id=\"input-createCertificate_zip\"]";
    String enterCity = "//*[@id=\"input-createCertificate_city\"]";
    String enterCountry = "//*[@id=\"input-createCertificate_country\"]";
    String customerNextButton = "//*[@id=\"root\"]/div/div/div[2]/div/div[2]/form/div[11]/div/div[3]/button";

    String verifyConfirmationTest = "//*[@id=\"root\"]/div/div/div[2]/div/div[2]/form/div[1]/div[35]/div/div/label[1]/p/span";

    String checkBox1 = "//*[@id=\"root\"]/div/div/div[2]/div/div[2]/form/div[1]/div[35]/div/div/label[2]/span[1]/span[1]/input";
    String checkBox2 = "//*[@id=\"root\"]/div/div/div[2]/div/div[2]/form/div[1]/div[35]/div/div/label[3]/span[1]/span[1]/input";
    String checkBox3 = "//*[@id=\"root\"]/div/div/div[2]/div/div[2]/form/div[1]/div[35]/div/div/label[4]/span[1]/span[1]/input";
    String checkBox4 = "//*[@id=\"root\"]/div/div/div[2]/div/div[2]/form/div[1]/div[35]/div/div/label[5]/span[1]/span[1]/input";

    String createInsuranceButton = "//*[@id=\"root\"]/div/div/div[2]/div/div[2]/form/div[2]/div/div[3]/button";

    //Payments Page Elements

    String verifyPaymentsPage = "//*[@id=\"root\"]/div/div[1]/div[2]/div[1]/div/div/div/h1";

    String selectCreditDebitCard = "//*[@id=\"root\"]/div/div[1]/div[2]/div[1]/div/div/div/fieldset/div/label[1]/span[1]/span[1]/input";
    String continueToPaymentButton = "//*[@id=\"root\"]/div/div[1]/div[2]/div[2]/div/div[2]/button";

    String cardDetailsPage = "//*[@id=\"root\"]/div/div[1]/div[2]/div[1]/div/div/div/h1";

    String enterCreditCardNumber = "//*[@id=\"root\"]/form/div/div[2]/span[1]/span[2]/div/div[2]/span/input";

    String enterExpiryDate = "//*[@id=\"root\"]/form/div/div[2]/span[2]/span[1]/span/span/input";

    String enterCVV = "//*[@id=\"root\"]/form/div/div[2]/span[2]/span[2]/span/span/input";
    String orderForAFeeButton = "//*[@id=\"root\"]/div/div[1]/div[2]/div[2]/div/div[2]/button[1]";

    String selectDirectDebitCard = "//*[@id=\"root\"]/div/div[1]/div[2]/div[1]/div/div/div/fieldset/div/label[2]/span[1]/span[1]/input";

    String verifyDirectDebitCardPageLoaded = "//*[@id=\"root\"]/div/div[1]/div[2]/div[1]/div/div[2]/div/label/span[2]/div/h2";

    String enterAccountHolderName = "//*[@id=\"root\"]/div/div[1]/div[2]/div[1]/div/div[1]/div/div/div[1]/div/input";

    String enterAccountHolderEmailID = "//*[@id=\"root\"]/div/div[1]/div[2]/div[1]/div/div[1]/div/div/div[2]/div/input";

    String enterIBAN = "//*[@id=\"root\"]/form/span[2]/div/div[2]/span/input";

    String selectCheckBox = "//*[@id=\"root\"]/div/div[1]/div[2]/div[1]/div/div[2]/div/label/span[1]/span/input";


}
