import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.lang.System.*;

public class HomePage extends BaseClass{

    public HomePage() {}

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".dropdown-login")
    private WebElement signUpDropDown;

    @FindBy(xpath = "*//div[contains(@class, 'dropdown-login')]//a[contains(text(), 'Sign Up')]")
    private WebElement signUpButtonInDropDown;

    @FindBy(xpath = "*//div[contains(@class, 'header-logo')]")
    private WebElement returnToHomePageImg;

    @FindBy(xpath = "*//div[contains(@class, 'dropdown-login')]//a[contains(text(), 'Login')]")
    private  WebElement logInAccountButton;
    @FindBy(xpath = "*//button[contains(@class, 'cc-btn cc-dismiss')]")
    private WebElement cacheCloseButton;

    public HomePage closeCacheModelPage() {
        this.cacheCloseButton.click();
        return this;
    }

    public SignUpPage goToSignUpPage() {
        this.closeCacheModelPage();
        this.signUpDropDown.click();
        this.signUpButtonInDropDown.click();
        return new SignUpPage(driver);
    }
    public LogInPage openMyAccoutPage() {
        this.closeCacheModelPage();
        this.signUpDropDown.click();
        this.logInAccountButton.click();
        return new LogInPage(driver);

    }
}
