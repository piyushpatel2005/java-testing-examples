package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class StepDefinition {
    @Given("^User is on Netbanking landing page$")
    public void user_is_on_NetBanking_landing_page() {
        System.out.println("Navigated to login page");
    }

    @When("User login into application with username and password")
    public void userLoginIntoApplicationWithUsernameAndPassword() {
        System.out.println("Login success!");
    }

    @Then("Home page is populated")
    public void homePageIsPopulated() {
        System.out.println("Home Page populated");
    }

    @And("Cards are displayed")
    public void cardsAreDisplayed() {
        System.out.println("Cards are visible.");
    }

    @When("User login into application with username {string} and password {string}")
    public void userLoginIntoApplicationWithUsernameAndPassword(String username, String password) {
        System.out.printf("User tried to login using %s and %s.%n", username, password);
    }

    @And("Cards displayed {string}")
    public void cardsDisplayed(String success) {
        System.out.println("Cards displayed " + success);
    }

    @When("User sign up with following details")
    public void userSignUpWithFollowingDetails(DataTable dataTable) {
        List<String> data = dataTable.asList();
        System.out.println(dataTable.column(0));
        System.out.println(data.get(0));
    }

    @When("User login into application with sample users as : username {} and password {}")
    public void userLoginIntoApplicationWithSampleUsersAsUsernameAndPassword(String username, String password) {
        System.out.println(String.format("Login using username %s and password %s", username, password));
    }

    @Given("validate the browser")
    public void validateTheBrowser() {
        System.out.println("Validating browser");
    }

    @When("Browser is opened")
    public void browserIsOpened() {
        System.out.println("Browser is opened");
    }

    @Then("Check if browser is started.")
    public void checkIfBrowserIsStarted() {
        System.out.println("Verify if browser is started");
    }
}
