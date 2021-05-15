package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends Page {

    @FindBy(xpath = "//h1[@class='page-heading']")
    private WebElement myAccountLabel;

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public String getAccountHeadingText() {
        return myAccountLabel.getAttribute("textContent");
    }

}
