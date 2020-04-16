import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import sun.rmi.runtime.Log;

public class LogInPage extends BaseClass {
    public LogInPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "*//input[@name = 'username']")
    private WebElement inputUserName;

    @FindBy(xpath = "*//input[@name = 'password']")
    private WebElement inputUserPassword;

    @FindBy(xpath = "*//button[contains(@class, 'loginbtn')]")
    private WebElement logInButton;

    public LogInPage fillTheEmailField(String username) {
        this.inputUserName.sendKeys(username);
        return this;
    }

    public LogInPage fillThePasswordField(String password) {
        this.inputUserPassword.sendKeys(password);
        return this;
    }

    public MyAccount loginingAndOpenMyAccountPage() throws InterruptedException {
        this.logInButton.click();
        waitWhenPageIsLoaded();
        return new MyAccount(driver);
    }
    public LogInPage waitWhenPageIsLoaded() throws InterruptedException {
        Thread.sleep(3000);
        return this;
    }
}
