package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ApplicationListPage;
import pages.DashboardPage;
import pages.SignIn1Page;

public class DashboardStepDefs {
    private final SignIn1Page signIn1Page = new SignIn1Page();
    private final DashboardPage dashboardPage = new DashboardPage();
    private final ApplicationListPage applicationListPage = new ApplicationListPage();

    @Given("the user has successfully logged in with valid credentials")
    public void the_user_has_successfully_logged_in_with_valid_credentials() {
        signIn1Page.signInWithValidData();
    }

    @When("the user navigates to the dashboard page")
    public void the_user_navigates_to_the_dashboard_page()  {
        dashboardPage.assertDashboardUrl();
    }

    @Then("the bank's logo should be displayed in the top left corner of the page")
    public void the_bank_s_logo_should_be_displayed_in_the_top_left_corner_of_the_page() {
        dashboardPage.assertDashboardLogo();
    }

    @And("there should be a {string} option")
    public void there_should_be_a_option(String string) {
        dashboardPage.assertMortgageApp();
        dashboardPage.assertApplicationList();
    }

    @When("the user click {string}")
    public void the_user_click(String string) {
        dashboardPage.getApplicationListButton().click();
    }

    @Then("the user's current page should be the {string} page")
    public void the_user_s_current_page_should_be_the_page(String string) {
        applicationListPage.assertApplicationListUrl();
    }

    @Then("the user's account information should be visible in the top right corner")
    public void the_user_s_account_information_should_be_visible_in_the_top_right_corner() {
        dashboardPage.userNameDisplayed();
        dashboardPage.profilePictureIsDisplayed();
        dashboardPage.verificationOfUserName();
    }

    @When("the user clicks on their name or picture")
    public void the_user_clicks_on_their_name_or_picture() {
        dashboardPage.getUserName().click();
    }

    @Then("a dropdown menu should appear with a Logout link")
    public void a_dropdown_menu_should_appear_with_a_Logout_link()  {
        dashboardPage.LogOutIsDisplayed();
    }

    @When("the user clicks on the Logout link")
    public void the_user_clicks_on_the_Logout_link() {
        dashboardPage.getLogOut().click();
    }

    @Then("the user should be successfully logged out of the system")
    public void the_user_should_be_successfully_logged_out_of_the_system() {
        signIn1Page.assertUrl();
    }

}
