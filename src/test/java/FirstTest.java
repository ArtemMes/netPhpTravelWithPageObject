import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FirstTest {
    AllDataNeededToTest data = new AllDataNeededToTest();

    @Test (priority = 0)
    public void testRegistrationNewUser() throws InterruptedException {
        BaseClass baseClass = new BaseClass();
        baseClass
                .beforeMeth()
                .openHomePage()
                .goToSignUpPage()
                .setFirstName(data.FirstName)
                .setLastName(data.LastName)
                .setPhone(data.phoneNumber)
                .setEmail(data.email)
                .setPassword(data.password)
                .setConfirmPassword(data.confirmpassword)
                .clickToSignUpButton()
                .driver.quit();
    }

    @Test (priority = 1)
    public void testLoginToCreatedUser() throws InterruptedException {

        BaseClass baseClass = new HomePage();
        baseClass
                .beforeMeth()
                .openHomePage()
                .openMyAccoutPage()
                .fillTheEmailField(data.email)
                .fillThePasswordField(data.password)
                .loginingAndOpenMyAccountPage()
                .driver.quit();
    }
    @Test (priority = 2)
    public void testChangeInformationAboutUs() throws InterruptedException {

        BaseClass baseClass = new BaseClass();
        baseClass
                .beforeMeth()
                .openHomePage()
                .openMyAccoutPage()
                .fillTheEmailField(data.email)
                .fillThePasswordField(data.password)
                .loginingAndOpenMyAccountPage()
                .openProfiletab()
                .changeEmailProcedure(data.newEmail)
                .changeFirstAddressProcedure(data.Adress1)
                .changeSecondAddressProcedure(data.Adress2)
                .changeCityProcedure(data.City)
                .changeStateProcedure(data.State)
                .changeZipCodeProcedure(data.Zip)
                .changedPhoneNumberProcedure(data.newPhone)
                .saveAllChanges()
                .driver.quit();
    }

}
