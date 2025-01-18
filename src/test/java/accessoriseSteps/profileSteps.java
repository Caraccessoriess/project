package accessoriseSteps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class profileSteps {
	SignUpCustomer c ;
	ProfileCustomer pr=new 	ProfileCustomer();
	
	//
	@Given("user is log in as customer")
	public void user_is_log_in_as_customer() 
	{
		c = new SignUpCustomer("noor omar",1234);
		c.init();
		ProfileCustomer pr2=new ProfileCustomer("ali",123,"ali@gmail.com","nablus");
		ProfileCustomer pr3=new ProfileCustomer("ali@gmail.com",150);
		pr2.setaddress("ramallah");
		pr2.setemail("ali@gmail.com");
		pr2.setpass(540);
	}

	@When("user in customer page")
	public void user_in_customer_page(){
		
	   pr.setcustpage(1);
		
	}

	@When("choose profile option")
	public void choose_profile_option()
	{
	   pr.setprofilef(1);
	   pr.setname("noor omar");
	}

	@Then("view profile for customer")
	public void view_profile_for_customer() {
	   
		
		if(pr.getcustpage()==1 && pr.getprofile()==1)
		{
			String expectedname = "noor omar";
			String actualname= pr.getnamee();
			
			assertEquals(expectedname,actualname );
			
			int expectedpass = 1234;
			int actualpass= pr.getpass();
			assertEquals(expectedpass,actualpass );
			
			String expectedemail = "s12027933@stu.najah.edu";
			String actualemail= pr.getemail();
			assertEquals(expectedemail,actualemail );
			
			String expectedaddress = "Jenin";
			String actualaddress= pr.getaddress();
			assertEquals(expectedaddress,actualaddress );
		}
		
		
	}
	
	@Given("customer in profile page")
	public void customer_in_profile_page() 
	{
		pr.setprofilef(1);
		pr.setname("noor omar");
		pr.getnamee();
	}
	
	@When("customer choose to edit name")
	public void customer_choose_to_edit_name() {
	   pr.setoptionf(1);
	}

	@When("customer enter the new name")
	public void customer_enter_the_new_name()
	{
	  pr.changename("amani ahmad");
	}

	@Then("change the user name")
	public void change_the_user_name() 
	{
		String expectedname="amani ahmad";
		String acutalname=pr.getname();
		assertEquals(expectedname,acutalname);
	  
	}
	
	@Given("customer in profile pagee")
	public void customer_in_profile_pagee() {
		pr.setprofilef(1);
		pr.setname("amani ahmad");
		pr.getnamee();
	}

	
	@When("customer choose to edit passward")
	public void customer_choose_to_edit_passward() {
		pr.setoptionf(2);
	}

	@When("enter the current passward correctly")
	public void enter_the_current_passward_correctly()
	{
		pr.checkpass(1234);
	}

	@When("customer enter the new passward")
	public void customer_enter_the_new_passward() {
	   
		pr.changepassward(4321);
	}

	@Then("change the user passward")
	public void change_the_user_passward() {
		int expectedpass=4321;
		int actualpass=pr.getpass();
		assertEquals(expectedpass,actualpass);
	}


	@When("customer choose to edit address")
	public void customer_choose_to_edit_address() {
		pr.setoptionf(3);
	}

	@When("customer enter the new addresss")
	public void customer_enter_the_new_addresss() {
		pr.changeaddress("ramallah");
	}

	@Then("change the user address")
	public void change_the_user_address() {
		String expectedadd="ramallah";
		String actualadd=pr.getaddress();
		assertEquals(expectedadd,actualadd);
	}

	@When("customer choose to edit email")
	public void customer_choose_to_edit_email()
	{
		pr.setoptionf(4);
	}

	@Then("display the message cant edit the email")
	public void display_the_message_cant_edit_the_email() 
	{
	  assertTrue(pr.getoptionf()==4);
	}
	
	
	@When("choose History option")
	public void choose_history_option() {
		pr.setmenuf(4);
		pr.showhistory();
	   //pr.setname("noor omar");
	}

	@Then("view history for customer")
	public void view_history_for_customer() 
	{
	     assertTrue(pr.getmenuf()==2);
	}

}
