package main.java.pageObjects;

public interface HomePageElements {

    String createNewInsurance = "//*[@id=\"root\"]/div/div/div[1]/div/a[2]/button";
    String insurancesText = "//*[@id=\"root\"]/div/div/div[1]/h2/span";
    String importInsuranceData = "//*[@id=\"root\"]/div/div/div[1]/div/a[3]/button";
    String searchForDropdown = "//*[@id=\"root\"]/div/div/div[3]/div[1]/div/div/div/div";

    String filterList = "//*[@id=\"menu-\"]/div[3]/ul";
    String selectPolicyNumberFromDropdown = "//*[@id=\"menu-\"]/div[3]/ul/li[1]";

    String selectEmailFromDropdown = "//*[@id=\"menu-\"]/div[3]/ul/li[2]";
    String selectNewerThanSortFromDropdown = "//*[@id=\"menu-\"]/div[3]/ul/li[3]";
    String selectOlderThanSortFromDropdown = "//*[@id=\"menu-\"]/div[3]/ul/li[4]";

    String  enterPolicyNumber = "//*[@id=\"root\"]/div/div/div[3]/div[1]/div/div/div/input";

    String filterResetText = "//*[@id=\"root\"]/div/div/div[3]/div[1]/div/div/label";

}
