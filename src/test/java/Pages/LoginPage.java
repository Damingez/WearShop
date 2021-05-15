package Pages;

import org.exm.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends Page {

    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailInput;
    @FindBy(xpath = "//input[@id='passwd']")
    private WebElement passwordInput;
    @FindBy(xpath = "//button[@id='SubmitLogin']")
    private WebElement signInButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void goTo() {
        driver.navigate().to( Base.getProperties().getProperty("url"));
        // driver.navigate().to(prop.getProperty("url"))
    }

    public void loginWith(String login, String password) {
        emailInput.sendKeys(login);
        passwordInput.sendKeys(password);
        signInButton.click();
    }

}
