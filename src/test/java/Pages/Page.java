package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class Page {

    @FindBy(xpath = "//a[@title='View my customer account']/span")
    private WebElement userFullnameSpan;

    WebDriver driver;

    public Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public String getLoggedUserFullName() {
        return userFullnameSpan.getAttribute("textContent");
    }

}
