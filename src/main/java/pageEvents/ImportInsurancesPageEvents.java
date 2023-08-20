package main.java.pageEvents;

import main.java.pageObjects.ImportInsurancesPageElements;
import main.java.utils.ElementFetch;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static test.java.BaseTest.driver;

public class ImportInsurancesPageEvents {
    String filePathSuccess = System.getProperty("user.dir") + "\\src\\main\\resources\\testdata_success.csv";
    String filePathFailure = System.getProperty("user.dir") + "\\src\\main\\resources\\testdata_failure.csv";

    public void verifyImportInsurancesPageLoaded() {
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getListWebElements("XPATH", ImportInsurancesPageElements.verifyImportInsurancesPageText).size() > 0, "Import Insurance Page not loaded yet!");
    }

    public void uploadSuccessCSVFile() {
        WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[3]/div/input"));
        fileInput.sendKeys(filePathSuccess);
    }

    public void uploadFailureCSVFile() {
        WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[3]/div/input"));
        fileInput.sendKeys(filePathFailure);
    }

    public void createInsurance() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", ImportInsurancesPageElements.createInsuranceButton).click();
    }

    public void compareSuccessfulCSVDataWithHTML() throws IOException {
        CSVParser csvParser = new CSVParser(new FileReader(filePathSuccess), CSVFormat.DEFAULT);
        WebElement table = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/table"));

        List<WebElement> rows = table.findElements(By.tagName("tr"));

        int rowNumber = 0;
        for (CSVRecord csvRecord : csvParser) {
            if (rowNumber == 0) {
                rowNumber++;
                continue;
            }
            WebElement row = rows.get(rowNumber);
            List<WebElement> columns = row.findElements(By.tagName("th"));
            List<String> columnData = new ArrayList<>();
            int columnNumber = 0;
            for (WebElement column : columns) {
                if (columnNumber == 0) {
                    columnNumber++;
                    continue;
                }
                columnData.add(column.getText());
                columnNumber++;
            }
            Assert.assertEquals(columnData.get(0), csvRecord.get(0), "Product Group mismatch at row " + rowNumber);
            Assert.assertEquals(columnData.get(1), csvRecord.get(1), "Insurance category mismatch at row " + rowNumber);
            Assert.assertEquals(columnData.get(2), csvRecord.get(2), "E-Mail mismatch at row " + rowNumber);
            Assert.assertEquals(columnData.get(3), csvRecord.get(4), "First name mismatch at row " + rowNumber);
            Assert.assertEquals(columnData.get(4), csvRecord.get(5), "Last name mismatch at row " + rowNumber);
            Assert.assertEquals(columnData.get(5), csvRecord.get(10), "Country mismatch at row " + rowNumber);
            Assert.assertEquals(columnData.get(6), csvRecord.get(11), "Serial number mismatch at row " + rowNumber);
            Assert.assertEquals(columnData.get(7), csvRecord.get(14), "Invoice number mismatch at row " + rowNumber);
            Assert.assertEquals(columnData.get(8), csvRecord.get(13), "Order number mismatch at row " + rowNumber);
            Assert.assertEquals(columnData.get(9), "✅");
            rowNumber++;
        }
        csvParser.close();
    }

    public void compareFailureCSVDataWithHTML() throws IOException {
        ElementFetch elementFetch = new ElementFetch();
        String errorMessage = elementFetch.getWebElement("XPATH", ImportInsurancesPageElements.errorMessageWindow).getText();
        System.out.println(errorMessage);
        CSVParser csvParser = new CSVParser(new FileReader(filePathSuccess), CSVFormat.DEFAULT);
        List<CSVRecord> csvRecords = csvParser.getRecords();
        WebElement table = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div[3]/div[2]/table/tbody"));

        List<WebElement> rows = table.findElements(By.tagName("tr"));
        // Iterate through CSV records and HTML table for comparison of row 0
        WebElement row = rows.get(0);
        List<WebElement> columns = row.findElements(By.tagName("th"));
        List<String> columnData = new ArrayList<>();
        int columnNumber = 0;
        for (WebElement column : columns) {
            if (columnNumber == 0) {
                columnNumber++;
                continue;
            }
            columnData.add(column.getText());
            columnNumber++;
        }
        CSVRecord csvRecord = csvRecords.get(1);
        Assert.assertEquals(columnData.get(0), csvRecord.get(0), "Product Group mismatch at row ");
        Assert.assertEquals(columnData.get(1), csvRecord.get(1), "Insurance category mismatch at row ");
        Assert.assertEquals(columnData.get(2), csvRecord.get(2), "E-Mail mismatch at row ");
        Assert.assertEquals(columnData.get(3), csvRecord.get(4), "First name mismatch at row ");
        Assert.assertEquals(columnData.get(4), csvRecord.get(5), "Last name mismatch at row ");
        Assert.assertEquals(columnData.get(5), csvRecord.get(10), "Country mismatch at row ");
        Assert.assertEquals(columnData.get(6), csvRecord.get(11), "Serial number mismatch at row ");
        Assert.assertEquals(columnData.get(7), csvRecord.get(14), "Invoice number mismatch at row ");
        Assert.assertEquals(columnData.get(8), csvRecord.get(13), "Order number mismatch at row ");
        Assert.assertEquals(columnData.get(9), "✅");

        // Iterate through CSV records and HTML table for comparison of row 1
        row = rows.get(1);
        columns = row.findElements(By.tagName("th"));
        columnData = new ArrayList<>();
        columnNumber = 0;
        for (WebElement column : columns) {
            if (columnNumber == 0) {
                columnNumber++;
                continue;
            }
            columnData.add(column.getText());
            columnNumber++;
        }
        csvRecord = csvRecords.get(2);
        Assert.assertEquals(columnData.get(0), csvRecord.get(0), "Product Group mismatch at row ");
        Assert.assertEquals(columnData.get(1), csvRecord.get(1), "Insurance category mismatch at row ");
        Assert.assertEquals(columnData.get(2), csvRecord.get(2), "E-Mail mismatch at row ");
        Assert.assertEquals(columnData.get(3), csvRecord.get(4), "First name mismatch at row ");
        Assert.assertEquals(columnData.get(4), csvRecord.get(5), "Last name mismatch at row ");
        Assert.assertEquals(columnData.get(5), csvRecord.get(10), "Country mismatch at row ");
        Assert.assertEquals(columnData.get(6), "", "Serial number mismatch at row ");
        Assert.assertEquals(columnData.get(7), "", "Invoice number mismatch at row ");
        Assert.assertEquals(columnData.get(8), "", "Order number mismatch at row ");
        Assert.assertEquals(columnData.get(9), "❌");

        // Iterate through CSV records and HTML table for comparison of row 2
        row = rows.get(2);
        columns = row.findElements(By.tagName("th"));
        columnData = new ArrayList<>();
        columnNumber = 0;
        for (WebElement column : columns) {
            if (columnNumber == 0) {
                columnNumber++;
                continue;
            }
            columnData.add(column.getText());
            columnNumber++;
        }
        csvRecord = csvRecords.get(3);
        Assert.assertEquals(columnData.get(0), csvRecord.get(0), "Product Group mismatch at row ");
        Assert.assertEquals(columnData.get(1), csvRecord.get(1), "Insurance category mismatch at row ");
        Assert.assertEquals(columnData.get(2), csvRecord.get(2), "E-Mail mismatch at row ");
        Assert.assertEquals(columnData.get(3), csvRecord.get(4), "First name mismatch at row ");
        Assert.assertEquals(columnData.get(4), csvRecord.get(5), "Last name mismatch at row ");
        Assert.assertEquals(columnData.get(5), csvRecord.get(10), "Country mismatch at row ");
        Assert.assertEquals(columnData.get(6), csvRecord.get(11), "Serial number mismatch at row ");
        Assert.assertEquals(columnData.get(7), csvRecord.get(14), "Invoice number mismatch at row ");
        Assert.assertEquals(columnData.get(8), csvRecord.get(13), "Order number mismatch at row ");
        Assert.assertEquals(columnData.get(9), "✅");

        // Iterate through CSV records and HTML table for comparison of row 3
        row = rows.get(3);
        columns = row.findElements(By.tagName("th"));
        columnData = new ArrayList<>();
        columnNumber = 0;
        for (WebElement column : columns) {
            if (columnNumber == 0) {
                columnNumber++;
                continue;
            }
            columnData.add(column.getText());
            columnNumber++;
        }
        csvRecord = csvRecords.get(4);
        Assert.assertEquals(columnData.get(0), csvRecord.get(0), "Product Group mismatch at row ");
        Assert.assertEquals(columnData.get(1), csvRecord.get(1), "Insurance category mismatch at row ");
        Assert.assertEquals(columnData.get(2), "test@test", "E-Mail mismatch at row ");
        Assert.assertEquals(columnData.get(3), csvRecord.get(4), "First name mismatch at row ");
        Assert.assertEquals(columnData.get(4), csvRecord.get(5), "Last name mismatch at row ");
        Assert.assertEquals(columnData.get(5), csvRecord.get(10), "Country mismatch at row ");
        Assert.assertEquals(columnData.get(6), csvRecord.get(11), "Serial number mismatch at row ");
        Assert.assertEquals(columnData.get(7), csvRecord.get(14), "Invoice number mismatch at row ");
        Assert.assertEquals(columnData.get(8), csvRecord.get(13), "Order number mismatch at row ");
        Assert.assertEquals(columnData.get(9), "❌");

        // Iterate through CSV records and HTML table for comparison of row 4
        row = rows.get(4);
        columns = row.findElements(By.tagName("th"));
        columnData = new ArrayList<>();
        columnNumber = 0;
        for (WebElement column : columns) {
            if (columnNumber == 0) {
                columnNumber++;
                continue;
            }
            columnData.add(column.getText());
            columnNumber++;
        }
        csvRecord = csvRecords.get(5);
        Assert.assertEquals(columnData.get(0), csvRecord.get(0), "Product Group mismatch at row ");
        Assert.assertEquals(columnData.get(1), csvRecord.get(1), "Insurance category mismatch at row ");
        Assert.assertEquals(columnData.get(2), csvRecord.get(2), "E-Mail mismatch at row ");
        Assert.assertEquals(columnData.get(3), csvRecord.get(4), "First name mismatch at row ");
        Assert.assertEquals(columnData.get(4), csvRecord.get(5), "Last name mismatch at row ");
        Assert.assertEquals(columnData.get(5), csvRecord.get(10), "Country mismatch at row ");
        Assert.assertEquals(columnData.get(6), csvRecord.get(11), "Serial number mismatch at row ");
        Assert.assertEquals(columnData.get(7), csvRecord.get(14), "Invoice number mismatch at row ");
        Assert.assertEquals(columnData.get(8), csvRecord.get(13), "Order number mismatch at row ");
        Assert.assertEquals(columnData.get(9), "✅");


        Assert.assertEquals(errorMessage, "Error at errors message: Identifier customer_email should be correctly formatted (mail@example.com)\n" +
                "Error at errors type: policy_validation_invalid_email\n" +
                "Error at errors context identifier: customer_email");
    }
}
