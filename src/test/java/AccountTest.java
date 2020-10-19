import static org.junit.Assert.*;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class AccountTest {

    private Account account;

    @Given("^Account with a password of \"([^\"]*)\"$")
    public void account_with_a_password_of(String password) throws Throwable {
        this.account = new Account(password);
    }

    @When("^Trying to login with password \"([^\"]*)\"$")
    public void trying_to_login_with_password(String password) throws Throwable {
        this.account.login(password);
    }

    @Then("^Account is logged in \"([^\"]*)\"$")
    public void account_is_logged_in(boolean isLogged) throws Throwable {
        assertEquals(this.account.isLogged(), isLogged);
    }

    @When("^Trying to change password for \"([^\"]*)\" to \"([^\"]*)\"$")
    public void trying_to_change_password_for_to(String oldPassword, String newPassword) throws Throwable {
        this.account.changePassword(oldPassword, newPassword);
    }

    @Then("^Account password is \"([^\"]*)\"$")
    public void account_password_is(String password) throws Throwable {
        assertEquals(this.account.getPassword(), password);
    }
}
