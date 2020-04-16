import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    WebDriver driver;

    public BaseClass() {

    }

    public BaseClass(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void beforeMethods() {
        System.setProperty("webdriver.chrome.driver","C:/maven/ChromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public BaseClass beforeMeth(){
        beforeMethods();
        driver.get("https://www.phptravels.net/home");
        return this;
    }
    public HomePage openHomePage() {
        return new HomePage(driver);
    }
}
