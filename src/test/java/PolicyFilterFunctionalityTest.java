package test.java;

import main.java.pageEvents.HomePageEvents;
import main.java.pageEvents.LoginPageEvents;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PolicyFilterFunctionalityTest extends BaseTest {
    @Test
    public void methodForFilterFunctionality() {
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

        //Filter drop down
        HomePageEvents homePageEvents = new HomePageEvents();
        homePageEvents.selectFilterDropdown();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        homePageEvents.verifyFilterListIsLoaded();
        homePageEvents.selectPolicyNumberFilterFromDropdown();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        homePageEvents.enterPolicyNumber();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        homePageEvents.verifyExpectedPolicyIsDisplayed();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        homePageEvents.removePolicyNumberFilter();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        homePageEvents.verifyFilterPageReset();


    }

}
