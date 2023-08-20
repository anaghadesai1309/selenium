package main.java.pageObjects;

public interface LoginPageElements {
    String changeLanguageButton = "//*[@id=\"root\"]/div/header/div/div/button";
    String englishLanguage = "//*[@id=\"language-menu\"]/div[3]/ul/li[2]";
    String rememberMeText = "//*[@id=\"root\"]/div/div/div/form/div[4]/label/span[2]/span";
    String emailAddress = "login_username";
    String password = "login_password";
    String nextButton = "//*[@id=\"root\"]/div/div/div/form/div[4]/button";
}
