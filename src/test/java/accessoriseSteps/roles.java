package accessoriseSteps;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class roles {

	SignUpCustomer c ;
	//
	@Given("admin write valid user name and password")
	public void admin_write_valid_user_name_and_password() {
		c = new SignUpCustomer("malak jawabreh",123);
	}

	@When("succesfully log in as admin")
	public void succesfully_log_in_as_admin() {
		c.init();
	    c.authintication();
	}

	@Then("open admin page")
	public void open_admin_page() {
	   assertTrue(c.getadminf()==1);
	}

	@Given("Customer write valid user name and password")
	public void customer_write_valid_user_name_and_password() {
		c = new SignUpCustomer("noor omar",1234);
	}

	@When("succesfully log in as Customer")
	public void succesfully_log_in_as_customer() {
		c.init();
	    c.authintication();
	}

	@Then("open Customer page")
	public void open_customer_page() {
		assertTrue(c.getcustomerf()==1);
	}

	@Given("Installer write valid user name and password")
	public void installer_write_valid_user_name_and_password() {
		c = new SignUpCustomer("Deema Hamoudeh",12345);
	}

	@When("succesfully log in as Installer")
	public void succesfully_log_in_as_installer() {
		c.init();
	    c.authintication();
	}

	@Then("open Installer page")
	public void open_installer_page() {
		assertTrue(c.getinstallerf()==1);
	}

}
