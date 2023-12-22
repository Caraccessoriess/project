package accessoriseSteps;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class notificationSteps {
	//
	notificationemail n=new notificationemail("s12028161@stu.najah.edu", "MALAK0593844970", "s12027933@stu.najah.edu");
	@Given("customer in menu page")
	public void customer_in_menu_page() 
	{
	 n.setcustf(1);
	}

	@When("choose confirm order")
	public void choose_confirm_order() {
	    n.setconfirmf(1);
	}

	@When("fill the form of order")
	public void fill_the_form_of_order() {
	  n.setfillf(1);
	 n.sendEmail("Successfully Order","Your order is confirmed ! ..");
	}

	@Then("send confirm email")
	public void send_confirm_email() {
	 
		assertTrue(n.getflagemail()==1);
	}

}
