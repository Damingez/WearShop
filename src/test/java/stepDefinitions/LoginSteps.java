package stepDefinitions;


import cucumberOptions.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@RunWith(Cucumber.class)
public class LoginSteps extends Base {

    WebDriver driver;

    @When("^the user is on WearShop login page$")
    public void the_user_is_on_wearshop_login_page()   {
        driver = getDriver();
        driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    @When("^the user logins into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void the_user_logins_into_application_with_something_and_password_something(String login, String password)   {
        driver.findElement(By.id("email")).sendKeys(login);
        driver.findElement(By.id("passwd")).sendKeys(password);
        driver.findElement(By.id("SubmitLogin")).click();
    }

    @Then("^My account page is displayed$")
    public void account_page_is_displayed()   {
       String actualText = driver.findElement(By.xpath("//h1[@class='page-heading']")).getAttribute("textContent");
       Assert.assertEquals("My account", actualText);
    }

    @Then("^the user Fullname \"([^\"]*)\" is displayed in the upper panel$")
    public void the_user_fullname_something_is_displayed_in_the_upper_panel(String fullname)   {
        String actualText = driver.findElement(By.xpath("//a[@title='View my customer account']/span")).getAttribute("textContent");
        Assert.assertEquals(fullname, actualText);
    }

}
