import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BaseClass{
    public SignUpPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(name = "firstname")
    private WebElement firstname;

    @FindBy(name = "lastname")
    private WebElement lastname;

    @FindBy(name = "phone")
    private WebElement phone;

    @FindBy(name = "email")
    private WebElement email;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(name = "confirmpassword")
    private WebElement confirmPassword;

    @FindBy(className = "signupbtn")
    private WebElement signUpBtn;

    public SignUpPage setFirstName (String value) {
        firstname.sendKeys(value);
        return this;
    }

    public SignUpPage setLastName (String value){
        lastname.sendKeys(value);
        return this;
    }

    public SignUpPage setPhone (String value){
        phone.sendKeys(value);
        return this;
    }

    public SignUpPage setEmail (String value){
        email.sendKeys(value);
        return this;
    }

    public SignUpPage setPassword (String value){
        password.sendKeys(value);
        return this;
    }

    public SignUpPage setConfirmPassword (String value){
        confirmPassword.sendKeys(value);
        return this;
    }

    public SignUpPage waitWhenPageIsLoaded() throws InterruptedException {
        Thread.sleep(3000);
        return this;
    }

    public MyAccount clickToSignUpButton() throws InterruptedException {
        this.signUpBtn.click();
        waitWhenPageIsLoaded();
        return new MyAccount(driver);
    }

}
