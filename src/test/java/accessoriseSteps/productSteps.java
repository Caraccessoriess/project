package accessoriseSteps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class productSteps {
	product p=new product();

	@Given("user in product page")
	public void user_in_product_page()
	{
		
		p.setproductf(1);
	}

	@When("user choose interior product")
	public void user_choose_interior_product() {
	   p.initproduct();
	   p.setint(1);
	}

	@When("user select rearview mirror")
	public void user_select_rearview_mirror() {
	    
		p.setmirror(3);
		p.printdetails(3);
	}

	@Then("go to rearview mirror page details")
	public void go_to_rearview_mirror_page_details()
	{
	    assertTrue(p.getdoneshow()==1);
	}

	@When("user choose exterior product")
	public void user_choose_exterior_product() {
		p.initproduct();
		p.setext(2);
		
	}

	@When("user select led light strips")
	public void user_select_led_light_strips() {
		p.setled(3);
		p.printdetailsext(3);
	}

	@Then("go to led light strips page details")
	public void go_to_led_light_strips_page_details() {
		assertTrue(p.getdoneshow2()==1);
	}

	@When("user choose electronic product")
	public void user_choose_electronic_product() {
		p.initproduct();
		p.setele(1);
	}

	@When("user select phone holder")
	public void user_select_phone_holder() {
		p.setholder(4);
		p.printelecdetails(4);
	}

	@Then("go to phone holder page details")
	public void go_to_phone_holder_page_details() {
		assertTrue(p.getdoneshow3()==1);
	}
	
	@When("user choose search option")
	public void user_choose_search_option() {
		
	    p.setsearchoption(1);
	}
	
	@When("write name product to search it")
	public void write_name_product_to_search_it() {
        p.search("cover");
	}


	@Then("View details of the product you have chosen to search for")
	public void view_details_of_the_product_you_have_chosen_to_search_for() {
	assertTrue(p.getsucesssearch()==1);
	}
}
