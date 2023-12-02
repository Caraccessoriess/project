package accessoriseSteps;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Scanner;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import accessoriseSteps.signupSteps;


public class signupSteps {
	SignUpCustomer c ;
	
	@Given("name,passward,email and address")
	public void name_passward_email_and_address() {

		c=new SignUpCustomer("Deema Hamoudeh", 12345, "demahamoudeh200@gmail.com", "nablus");
	}

	@When("the customer give name,passward,email and address")
	public void the_customer_give_name_passward_email_and_address() 
	{
		
		 c.init();
	     c.authintication2();

	}

	@Then("the user registration should be successful")
	public void the_user_registration_should_be_successful() {

		assertTrue(c.getadminf()==1 || c.getcustomerf()==1 || c.getinstallerf()==1);
		
	}
	
	@Given("name,incorrect passward,email and address")
	public void name_incorrect_passward_email_and_address() {
		c=new SignUpCustomer("Deema Hamoudeh", 125, "demahamoudeh200@gmail.com", "nablus");
	}

	@When("the customer give name,incorrect passward,email and address")
	public void the_customer_give_name_incorrect_passward_email_and_address() {
		c.init();
	    c.authintication2();
	}

	@Then("the user registration should be not successful")
	public void the_user_registration_should_be_not_successful() {
		assertTrue(c.getnotfoundf()==1);
	}
	
	
	@Given("valid admin user name and password")
	public void valid_admin_user_name_and_password() {
		
		c = new SignUpCustomer("malak jawabreh",123);
	}

	@When("admin write username and password correct")
	public void admin_write_username_and_password_correct()
	{
	    c.init();
		c.authintication();
		
	}

	@Then("enter as admin")
	public void enter_as_admin() {
		assertTrue(c.getadminf()==1);
	}
	
	@Given("valid Customer user name and password")
	public void valid_customer_user_name_and_password() {
		c = new SignUpCustomer("noor omar",1234);
	}

	@When("Customer write username and password correct")
	public void customer_write_username_and_password_correct() {
		c.init();
		 c.authintication();
	}
	

	@Then("enter as customer")
	public void enter_as_customer() {
		assertTrue(c.getcustomerf()==1);
	}



	@Given("valid Installer user name and password")
	public void valid_installer_user_name_and_password() {
		c = new SignUpCustomer("Deema Hamoudeh",12345);
	}

	@When("Installer write username and password correct")
	public void installer_write_username_and_password_correct() {
		c.init();
		c.authintication();
	}

	

	@Then("enter as installrer")
	public void enter_as_installrer() {
		assertTrue(c.getinstallerf()==1);
	}

	@Given("incorrect  user name or password")
	public void incorrect_user_name_or_password() {
		c = new SignUpCustomer("Deema Hamdeh",12345);
	}

	@When("user write username and password incorrect")
	public void user_write_username_and_password_incorrect() {
		c.init();
		c.authintication();
	   
	}

	@Then("display incorrect username or password. Please try again or Sign up with new account")
	public void display_incorrect_username_or_password_please_try_again_or_sign_up_with_new_account() {
		assertTrue(c.getnotfoundf()==1);
	}
}
