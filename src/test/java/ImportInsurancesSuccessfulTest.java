package test.java;

import main.java.pageEvents.HomePageEvents;
import main.java.pageEvents.ImportInsurancesPageEvents;
import main.java.pageEvents.LoginPageEvents;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ImportInsurancesSuccessfulTest extends BaseTest{
    @Test
    public void sampleMethodForSuccessfulImportInsurances() throws IOException {
        LoginPageEvents loginPageEvents = new LoginPageEvents();
        loginPageEvents.changeLanguage();
        loginPageEvents.selectEnglishLanguage();
        loginPageEvents.verifyLanguageIsEnglish();
        loginPageEvents.selectEmailAddress();
        loginPageEvents.enterEmailAddress();
        loginPageEvents.selectPassword();
        loginPageEvents.enterPassword();
        loginPageEvents.clickOnNextButton();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        HomePageEvents homePageEvents = new HomePageEvents();
        homePageEvents.verifyHomePageIsLoaded();
        homePageEvents.importInsuranceData();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        ImportInsurancesPageEvents importInsurancesPageEvents = new ImportInsurancesPageEvents();
        importInsurancesPageEvents.verifyImportInsurancesPageLoaded();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        importInsurancesPageEvents.uploadSuccessCSVFile();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        importInsurancesPageEvents.createInsurance();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        importInsurancesPageEvents.compareSuccessfulCSVDataWithHTML();



    }
}
