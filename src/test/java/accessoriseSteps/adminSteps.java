package accessoriseSteps;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class adminSteps {
	SignUpCustomer c ;
	Admin ad=new Admin();
	product p=new product();

	//
	@Given("log in as admin")
	public void log_in_as_admin() {
		c = new SignUpCustomer("malak jawabreh",123);
		c.init();
	}

	@When("choose product option")
	public void choose_product_option() {
	   ad.setoptionf(1);
	}

	@Then("display catagorys")
	public void display_catagorys()
	{
	  ad.showcatagory();
	  assertTrue(ad.getoptionf()==1);
	}
	
	@Given("admin in product catagory page")
	public void admin_in_product_catagory_page() {
		ad.setoptionf(1);

	}

	@When("choose add option")
	public void choose_add_option() 
	{
	ad.initcatagory();
	   ad.setaddf(1);
	}

	@When("write safety tools")
	public void write_safety_tools() 
	{
	  ad.addcatagory("Safety tool");
	}

	@Then("add safety tools to catagory")
	public void add_safety_tools_to_catagory() 
	{
		String expected="Safety tool";
		String actual =ad.checkcatagory();
		assertEquals(expected,actual);
	  
	}
	
	@When("choose edit option")
	public void choose_edit_option() {
		ad.seteditf(1);
	}

	@When("choose safety tools")
	public void choose_safety_tools() {
	    ad.setsafetyf(1);
	}

	@When("write safety")
	public void write_safety() {
		ad.editcatagory("Safety",4);
	}

	@Then("edit safety tools to safety")
	public void edit_safety_tools_to_safety() 
	{
		String expected="Safety";
		String actual =ad.checkcatagory();
		assertEquals(expected,actual);
	   
	}
	

@When("choose delete option")
public void choose_delete_option() {
	ad.setdeletef(1);
	ad.deletecatagory(4);
}

@Then("delete safety tools")
public void delete_safety_tools() 
{
	String expected="Electronic";
	String actual =ad.checkcatagory();
	assertEquals(expected,actual);
}

@When("choose interior product")
public void choose_interior_product() 
{
   ad.setinteriorf(1);
}

@When("choose add interior option")
public void choose_add_interior_option() {
	   ad.setaddf(1);
}

@When("add Steering Wheel Cover")
public void add_steering_wheel_cover() {
	p.initproduct();
	ad.addinteriorname("Steering Wheel Cover","cover","image",150,"no",10);
}

@Then("add Steering Wheel Cover to interior product")
public void add_steering_wheel_cover_to_interior_product() {
	String expected="Steering Wheel Cover";
	String actual =ad.checkinterior();
	assertEquals(expected,actual);
}

@When("choose edit interior option")
public void choose_edit_interior_option() {
 ad.seteditf(1);
}

@When("choose product to edit")
public void choose_product_to_edit() {
   ad.setproduct(1);
}

@When("Select one of the information to edit")
public void select_one_of_the_information_to_edit() {
   ad.setinformation(1);
   ad.editname(1, "seat");
}

@Then("edit the information of this product")
public void edit_the_information_of_this_product() 
{
	String expected="seat";
	String actual =ad.checknameinterior();
	assertEquals(expected,actual);
   
}

@When("choose exterior product")
public void choose_exterior_product() {
    ad.setextf(1);
}

@When("choose add exterior option")
public void choose_add_exterior_option() {
    ad.setaddf(1);
}

@When("add cover")
public void add_cover() {
	ad.addexteriorname("cover","cover","image",150,"no",10);
}

@Then("add cover to exterior product")
public void add_cover_to_exterior_product() {
	String expected="cover";
	String actual =ad.checkexterior();
	assertEquals(expected,actual);
}

@When("choose edit exterior option")
public void choose_edit_exterior_option() {
	ad.seteditf(1);
}

@When("Select one of the information to edit exterior product")
public void select_one_of_the_information_to_edit_exterior_product() {
	 ad.setinformation(1);
	   ad.editname1(1, "Fender");
}

@Then("edit the information of this exterior product")
public void edit_the_information_of_this_exterior_product() {
	String expected="Fender";
	String actual =ad.checknameexterior();
	assertEquals(expected,actual);
}



@When("choose add electronic option")
public void choose_add_electronic_option() {
ad.setelecf(1);
}

@When("add camera")
public void add_camera() {
	ad.addelectronicrname("camera","camera","image",150,"no",10);

}

@Then("add camera to electronic product")
public void add_camera_to_electronic_product() {
	String expected="camera";
	String actual =ad.checkelec();
	assertEquals(expected,actual);
}

@When("choose electronic product")
public void choose_electronic_product() {
   ad.setelecf(1);
}

@When("choose edit electronic option")
public void choose_edit_electronic_option() {
	ad.seteditf(1);
}
@When("Select one of the information to edit electronic product")
public void select_one_of_the_information_to_edit_electronic_product() {
	 ad.setinformation(1);
	   ad.editname2(2, "Parking");
}

@Then("edit the information of this electronic product")
public void edit_the_information_of_this_electronic_product() {
	String expected="Parking";
	String actual =ad.checknameelectronic();
	assertEquals(expected,actual);
}


@When("choose user account option")
public void choose_user_account_option() {

	ad.setoptionf(2);
}

@Then("view customers account")
public void view_customers_account() 
{
assertTrue(ad.getoptionf()==2);
}

@When("choose inastallation appointment option")
public void choose_inastallation_appointment_option() {
	ad.setoptionf(3);
}

@Then("view inastallation appointment")
public void view_inastallation_appointment() {
	assertTrue(ad.getoptionf()==3);
}

}
