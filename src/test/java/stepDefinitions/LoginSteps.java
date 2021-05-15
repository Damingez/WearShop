package stepDefinitions;


import Pages.LoginPage;
import Pages.MyAccountPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.exm.Base;
import org.junit.Assert;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class LoginSteps extends Base {

    LoginPage loginPage;

    public LoginPage getLoginPage(){
        return new LoginPage(getDriver());
    }

    public MyAccountPage getMyAccountPage(){
        return new MyAccountPage(getDriver());
    }

    @When("^the user is on WearShop login page$")
    public void the_user_is_on_wearshop_login_page() {
        loginPage = getLoginPage();
        loginPage.goTo();
    }

    @When("^the user logins into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void the_user_logins_into_application_with_something_and_password_something(String login, String password)   {
        loginPage.loginWith(login, password);
    }

    @Then("^My account page is displayed$")
    public void account_page_is_displayed()   {
       String actualText = getMyAccountPage().getAccountHeadingText();
       Assert.assertEquals("My account", actualText);
    }

    @Then("^the user Fullname \"([^\"]*)\" is displayed in the upper panel$")
    public void the_user_fullname_something_is_displayed_in_the_upper_panel(String fullname)   {
        String actualText = loginPage.getLoggedUserFullName();
        Assert.assertEquals(fullname, actualText);
    }

}
