package accessoriseSteps;

import static org.junit.Assert.assertTrue;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class installationSteps
{
	installation n =new installation() ;
	product p = new product();
	//
	@Given("customer in order page")
	public void customer_in_order_page() 
	{
         p.setordf(1);
	}

	@When("choose to confirm order")
	public void choose_to_confirm_order() 
	{
	 p.setconf(1);
	 p.initproduct();
	 
	}

	@When("needs the product installation")
	public void needs_the_product_installation()
	{
		p.addorder(3, 2);  
	}

	@Then("show the confirm order form")
	public void show_the_confirm_order_form() 
	{
	p.setdonef(1);
	}
	
	@Then("show the installation request form")
	public void show_the_installation_request_form()
	{
	    assertTrue(n.installreq()==1);
	}
	@When("no product needs installation")
	public void no_product_needs_installation()
	{
		p.addorder(1, 2);
		
	}

	@Given("customer is fill the form")
	public void customer_is_fill_the_form() 
	{
		p.setdonef(1);
	}

	@When("choose to done request")
	public void choose_to_done_request()
	{
		p.setfillf(1);
	}

	@Then("confirm order")
	public void confirm_order() 
	{
		
		assertTrue(p.getfill()==1);
	}
}
