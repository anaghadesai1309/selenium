package test.java;

import main.java.pageEvents.LoginPageEvents;
import org.testng.annotations.Test;

public class SampleTest extends BaseTest{
    @Test
    public void sampleMethodForSuccessfulLogin(){
        LoginPageEvents loginPageEvents = new LoginPageEvents();
        loginPageEvents.changeLanguage();
        loginPageEvents.selectEnglishLanguage();
        loginPageEvents.verifyLanguageIsEnglish();
        loginPageEvents.selectEmailAddress();
        loginPageEvents.enterEmailAddress();
        loginPageEvents.selectPassword();
        loginPageEvents.enterPassword();
        loginPageEvents.clickOnNextButton();

    }
}
