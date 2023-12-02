package accessoriseSteps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class reportSteps {

	report rep=new report();
	SignUpCustomer c;
	product p;
	@Given("total user , product and order")
	public void total_user_product_and_order() 
	{
	  c.init();
	  p.initproduct();
	}

	@When("get all order,get all user and get all product")
	public void get_all_order_get_all_user_and_get_all_product()
	{
	   rep.showreport();
	}

	@Then("successfull to  generate customized reports about business")
	public void successfull_to_generate_customized_reports_about_business() {
	    assertTrue(rep.getreport()==1);
	}
	
}
