package com.automation.stepdef;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;


public class StepDefinition {

    @When("user opens website")
    public void user_opens_website() {
        System.out.println("Opening website!");

    }
    @When("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("On login page!");

    }
    @When("user enters username {string} and password {string}")
    public void user_enters_username_and_password(String username, String password) {


    }
    @When("click on login button")
    public void click_on_login_button() {

    }
    @When("verify user is navigated to homepage")
    public void verify_user_is_navigated_to_homepage() {

    }
    @When("user clicks on user badge icon")
    public void user_clicks_on_user_badge_icon() {

    }
    @When("select on logout option")
    public void select_on_logout_option() {

    }
    @Then("verify invalid login error message is displayed")
    public void verify_invalid_login_error_message_is() {

    }
    @When("user hover mouse on PIM menu")
    public void user_hover_mouse_on_pim_menu() {

    }
    @When("click on Add Employee link")
    public void click_on_add_employee_link() {

    }
    @Then("verify user is navigated to add employee page")
    public void verify_user_is_navigated_to_add_employee_page() {

    }
    @When("user enters valid details on add employee page")
    public void user_enters_valid_details_on_add_employee_page() {

    }
    @When("click on save button")
    public void click_on_save_button() {

    }
    @Then("verify user is navigated to personal details page")
    public void verify_user_is_navigated_to_personal_details_page() {

    }
    @Then("verify error message for missing first name and last name")
    public void verify_error_message_for_missing_first_name_and_last_name() {

    }

    @When("select on login button")
    public void select_on_login_button() {

    }

    @When("user didn't enter password and username")
    public void user_didn_t_enter_password_and_username() {

    }
    @When("select Login button")
    public void select_login_button() {

    }
    @Then("verify error message is displayed")
    public void verify_error_message_is_displayed() {

    }

    @Then("verify table has below data")
    public void verify_table_has_below_data(List<List<String>> data) {
        for(int i = 0; i < data.size(); i++) {
            for(int j = 0; j < data.get(i).size(); j++) {
                System.out.print(data.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }

    @Then("verify another table data")
    public void verify_another_table_data(List<String> listOfData) {
        for (String data : listOfData) {
            System.out.println(data);

        }


    }




}
