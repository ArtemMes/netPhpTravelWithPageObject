import com.sun.xml.internal.bind.v2.model.core.MaybeElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sun.nio.cs.ext.MacArabic;

public class MyAccount extends BaseClass {
    public MyAccount() {}
    public MyAccount(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "*//a[contains(text(), 'My Profile')]")
    private WebElement profileTub;

    @FindBy(xpath = "*//input[@name = 'email']")
    private WebElement emailFieldInProfileTab;

    @FindBy(xpath = "*//input[@name = 'address1']")
    private WebElement address1FieldInProfileTab;

    @FindBy(xpath = "*//input[@name = 'address2']")
    private WebElement address2FieldInProfileTab;

    @FindBy(xpath = "*//input[@name = 'city']")
    private WebElement cityFieldInProfileTab;

    @FindBy(xpath = "*//input[@name = 'state']")
    private WebElement stateFieldInProfileTab;

    @FindBy(xpath = "*//input[@name = 'zip']")
    private WebElement zipCodeFieldInProfileTab;

    @FindBy(xpath = "*//input[@name = 'phone']")
    private WebElement phoneFieldInProfileTab;

    @FindBy(xpath = "*//button[contains(@class, 'updateprofile')]")
    private WebElement saveInformatioButtonInProfileTab;

    public MyAccount changeEmailProcedure(String email) {
        this.emailFieldInProfileTab.clear();
        this.emailFieldInProfileTab.sendKeys(email);
        return this;
    }
    public MyAccount changeFirstAddressProcedure(String address1) {
        this.address1FieldInProfileTab.sendKeys(address1);
        return this;
    }

    public  MyAccount changeSecondAddressProcedure(String address2) {
        this.address2FieldInProfileTab.sendKeys(address2);
        return this;
    }

    public MyAccount changeCityProcedure(String city){
        this.cityFieldInProfileTab.sendKeys(city);
        return this;
    }

    public MyAccount changeStateProcedure(String state) {
        this.stateFieldInProfileTab.sendKeys(state);
        return this;
    }

    public MyAccount changeZipCodeProcedure(String zipCode) {
        this.zipCodeFieldInProfileTab.sendKeys(zipCode);
        return this;
    }

    public MyAccount changedPhoneNumberProcedure(String phoneNumber) {
        this.phoneFieldInProfileTab.clear();
        this.phoneFieldInProfileTab.sendKeys(phoneNumber);
        return this;
    }
    public MyAccount waitWhenPageIsLoaded() throws InterruptedException {
        Thread.sleep(3000);
        return this;
    }
    public MyAccount openProfiletab() throws InterruptedException {
        waitWhenPageIsLoaded();
        this.profileTub.click();
        return this;
    }
    public MyAccount saveAllChanges() {
        this.saveInformatioButtonInProfileTab.click();
        return this;
    }




}
