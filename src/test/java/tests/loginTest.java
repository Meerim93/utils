package tests;

import org.testng.annotations.Test;
import pages.loginPage;
import utils.Base1;
import utils.CommonUtils;

public class loginTest extends Base1 {
    private final String CREDENTIALS_PROPERTIES="src/test/resources/credintials.properties";
    @Test
    public void loginPositiveTest(){
        loginPage loginPage = new loginPage(driver);
        String username = CommonUtils.readProperty(CREDENTIALS_PROPERTIES,"username");
        loginPage.usernameField.sendKeys(username);

        String password = CommonUtils.readProperty(CREDENTIALS_PROPERTIES,"password");
        loginPage.passwordField.sendKeys(password);

        loginPage.loginButton.click();

    }
}
