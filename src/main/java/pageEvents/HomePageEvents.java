package main.java.pageEvents;

import main.java.pageObjects.HomePageElements;
import main.java.utils.ElementFetch;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static test.java.BaseTest.driver;

public class HomePageEvents {
    String expectedDate = "23082023";

    public void verifyHomePageIsLoaded() {
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getListWebElements("XPATH", HomePageElements.insurancesText).size() > 0, "Home Page not loaded yet!");
    }

    public void createNewInsurance() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", HomePageElements.createNewInsurance).click();
    }

    public void importInsuranceData() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", HomePageElements.importInsuranceData).click();
    }

    public void selectFilterDropdown() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", HomePageElements.searchForDropdown).click();
    }

    public void selectPolicyNumberFilterFromDropdown() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", HomePageElements.selectPolicyNumberFromDropdown).click();
    }

    public void selectEmailFilterFromDropdown() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", HomePageElements.selectEmailFromDropdown).click();
    }

    public void selectNewerThanSortFromDropdown() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", HomePageElements.selectNewerThanSortFromDropdown).click();
    }

    public void selectOlderThanSortFromDropdown() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", HomePageElements.selectOlderThanSortFromDropdown).click();
    }

    public void verifyFilterListIsLoaded() {
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getListWebElements("XPATH", HomePageElements.filterList).size() > 0, "List not loaded yet!");
    }

    public void enterPolicyNumber() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", HomePageElements.enterPolicyNumber).sendKeys("200000321399");
        elementFetch.getWebElement("XPATH", HomePageElements.enterPolicyNumber).sendKeys(Keys.ENTER);

    }

    public void enterEmail() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", HomePageElements.enterPolicyNumber).sendKeys("anagha.testuser@abc.com");
        elementFetch.getWebElement("XPATH", HomePageElements.enterPolicyNumber).sendKeys(Keys.ENTER);
    }

    public void enterDate() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", HomePageElements.enterPolicyNumber).sendKeys(expectedDate);
        elementFetch.getWebElement("XPATH", HomePageElements.enterPolicyNumber).sendKeys(Keys.ENTER);
    }

    public void verifyExpectedPolicyIsDisplayed() {
        WebElement recordElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[2]/div/table/tbody/tr/th[1]"));
        String expectedText = "200000321399";
        String actualText = recordElement.getText();
        System.out.println(actualText);
        Assert.assertEquals(actualText, expectedText, "Policy Number does not match the expected value");
        boolean isElementPresent = driver.findElements(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[1]/div[1]/span")).size() > 0;
        Assert.assertTrue(isElementPresent, "List not loaded yet!");
    }

    public void verifyExpectedEmailIsDisplayed() {
        WebElement recordElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[2]/div/table/tbody/tr/th[3]"));
        String expectedText = "anagha.testuser@abc.com";
        String actualText = recordElement.getText();
        System.out.println(actualText);
        Assert.assertEquals(actualText, expectedText, "Email address does not match the expected value");
        boolean isElementPresent = driver.findElements(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[1]/div[1]/span")).size() > 0;
        Assert.assertTrue(isElementPresent, "List not loaded yet!");
    }

    public void verifyExpectedDateIsDisplayed() {
        try {
            WebElement recordElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[2]/div/table/tbody/tr/th[4]"));
            SimpleDateFormat dateFormatExpectedDate = new SimpleDateFormat("ddMMyyyy");
            Date parsedExpectedDate = dateFormatExpectedDate.parse(expectedDate);
            SimpleDateFormat dateFormatActualDate = new SimpleDateFormat("MMMM dd, yyyy");
            String actualDate = recordElement.getText();
            Date parsedActualDate = dateFormatActualDate.parse(actualDate);
            Assert.assertTrue(parsedExpectedDate.before(parsedActualDate), "The Expected Date is not before the Actual Date.");
            System.out.println(actualDate);
            boolean isElementPresent = driver.findElements(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[1]/div[1]/span")).size() > 0;
            Assert.assertTrue(isElementPresent, "List not loaded yet!");
        } catch (ParseException e) {
            Assert.fail("Date parsing failed: " + e.getMessage());
        }
    }

    public void verifyFilterPageReset() {
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getListWebElements("XPATH", HomePageElements.filterResetText).size() > 0, "List not loaded yet!");
    }

    public void removePolicyNumberFilter() {
        driver.findElement(By.xpath("//*[name()='svg' and @class='MuiSvgIcon-root MuiChip-deleteIcon MuiChip-deleteIconColorSecondary']")).click();
    }
}
