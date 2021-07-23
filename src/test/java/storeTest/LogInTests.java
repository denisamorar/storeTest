package storeTest;

import org.junit.Test;

public class LogInTests extends BaseTests{
    @Test
    public void shouldSuccessfullyLogIn(){
        homePage.clickSignInButton();
        autPage.enterEmailAddress("1abcd@gmail.com");
        autPage.enterPassword("12345");
        autPage.clickSignInButton();
        myAccountPage.verifyWelcomeMsg("Welcome to your account. Here you can manage all of your personal information and orders.");
        myAccountPage.logInOut();

    }
}
