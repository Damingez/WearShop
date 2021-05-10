package stepDefinitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class LoginSteps {

    @When("^the user is on WearShop login page$")
    public void the_user_is_on_wearshop_login_page()   {
        System.out.println("User is on login page");
    }

    @When("^the user logins into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void the_user_logins_into_application_with_something_and_password_something(String strArg1, String strArg2)   {
        System.out.println("User is on logins into shop");
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated()   {
        System.out.println("Home page is populated");
    }

    @Then("^the user Fullname \"([^\"]*)\" is displayed in the upper panel$")
    public void the_user_fullname_something_is_displayed_in_the_upper_panel(String strArg1)   {
        System.out.println("User name is displayed");
    }

}
