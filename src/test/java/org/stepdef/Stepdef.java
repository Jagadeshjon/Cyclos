package org.stepdef;

import java.util.concurrent.TimeUnit;

import org.baseclass.Base_Class_For_All_Project;
import org.openqa.selenium.WebDriver;
import org.page.object.manager.PageObjectManager;
import org.testrunnercyclos.TestRunner12;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Stepdef extends Base_Class_For_All_Project {
	public static WebDriver driver = TestRunner12.driver;
	
	public static PageObjectManager pom = new PageObjectManager(driver);
	
	@Given("^User Launch the Application$")
	public void user_Launch_the_Application() throws Throwable {
		getUrl("https://demo.cyclos.org/ui/home");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	}

	@When("^User click the login button$")
	public void user_click_the_login_button() throws Throwable {
		
		clickOnElement(pom.getHomepage().getLogin());
	   
	}

	@When("^User enter the username in the user name field$")
	public void user_enter_the_username_in_the_user_name_field() throws Throwable {
		inputValueElement(pom.getHomepage().getUsername(), Particular_Celldata("C:\\Users\\tgt587\\eclipse-workspace\\Automation_Testing_Training\\New XLSX Worksheet.xlsx", 0, 1) );//"demo"
	}
	@When("User enter the password in the password field")
	public void user_enter_the_password_in_the_password_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		inputValueElement(pom.getHomepage().getPassword(), Particular_Celldata("C:\\Users\\tgt587\\eclipse-workspace\\Automation_Testing_Training\\New XLSX Worksheet.xlsx", 1, 1));
	}

	@Then("^User click the submit button and it navigates to dashboardpage$")
	public void user_click_the_submit_button_and_it_navigates_to_dashboardpage() throws Throwable {
		clickOnElement(pom.getHomepage().getSubmit());
		//Thread.sleep(5000);
	}
	
	@When("User click the payuser button and it navigates to Payment to user page")
	public void user_click_the_payuser_button_and_it_navigates_to_payment_to_user_page() throws Throwable {
		clickOnElement(pom.getHomepage().getPayuser());
	}
	@When("User click the Select the contact button the contact list will open")
	public void user_click_the_select_the_contact_button_the_contact_list_will_open()throws Throwable {
		clickOnElement(pom.getDashboard().getTouser());
	}
	@When("User click the contact and it will added in To user menu")
	public void user_click_the_contact_and_it_will_added_in_to_user_menu() throws Throwable {
		clickOnElement(pom.getDashboard().getActivewalking());
	}
	@When("User enter the amount in the amount field")
	public void user_enter_the_amount_in_the_amount_field() throws Throwable {
		inputValueElement(pom.getDashboard().getAmount(), "2");
	}
	@When("User click the Scheduling button and the Scheduling menu will open")
	public void user_click_the_scheduling_button_and_the_scheduling_menu_will_open() throws Throwable {
		clickOnElement(pom.getDashboard().getPaynow());
	}
	@When("User click the Payuser button the payuser options will be selected")
	public void user_click_the_payuser_button_the_payuser_options_will_be_selected() throws Throwable {
		clickOnElement(pom.getDashboard().getPaynowdrop());   
	}
	@When("User enter the Description in description menu")
	public void user_enter_the_description_in_description_menu() throws Throwable {
		inputValueElement(pom.getDashboard().getText(), "jaga");
	}
	@When("User click the next button and it will navigates to payment confirmation page")
	public void user_click_the_next_button_and_it_will_navigates_to_payment_confirmation_page() {
		clickOnElement(pom.getDashboard().getNext());
	}
	@When("User click the confirm button and the payment will be paid to the person")
	public void user_click_the_confirm_button_and_the_payment_will_be_paid_to_the_person() {
		clickOnElement(pom.getDashboard().getConfirm());
	}



}
