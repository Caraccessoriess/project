package accessoriseSteps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Admin {
//
	private static final Logger LOGGER = Logger.getLogger(Admin.class.getName());
	private static int optionf=0;
	
	private static int addf=0;
	
	private static int editf=0;
	private static int safetyf=0;
	private static int deletef=0;
	private static int interiorf=0;
	private static int productf=0;
	private static int informationf=0;
	private static int extf=0;
	private static int elecf=0;
	
	private static final List<String> catagory = new ArrayList<String>();
	product p=new product();
	List <product>interior = p.getinterior();
	List <product>exterior = p.getextrior();
	List <product>elect = p.getelect();
	
	
	public List<String> getcatg() 
	{ 
		return catagory;
	}
	
	SignUpCustomer c;
	installation inst;
	public List<SignUpCustomer> mylist = c.getMylist();
	
	public void setoptionf(int i) {
		this.optionf=i;
		
		
	}
	public int getoptionf() {
		return optionf;
		
	}
	
	public void initcatagory()
	{
		catagory.add(new String("Interior"));
		catagory.add(new String("Exterior"));
		catagory.add(new String("Electronic"));
		
	}
	public void showcatagory()
	{
		int x=0;
		for (int i = 0; i < catagory.size(); i++)
		{
	    x=i+1;
	    LOGGER.log(Level.INFO, x + ". " + catagory.get(i));
		}
		x++;
		LOGGER.log(Level.INFO, x + ". Add");
	    x++;
	    LOGGER.log(Level.INFO, x + ". Edit");
	    x++;
	    LOGGER.log(Level.INFO, x + ". Delete");
	    x++;
	    LOGGER.log(Level.INFO, x + ". Back");
	    
	}
	public void setaddf(int i) {
		int addf=i;
	}
	
	
	public void addcatagory(String catag)
	{
		catagory.add(new String(catag));
		
	}
	public String checkcatagory() {
	
		return catagory.get(catagory.size()-1);
	}
	
	public void choseoption(int option)
	{
		if(option<=catagory.size())
		{
			if(catagory.get(option-1).equals("Interior"))
			{
				interior();
			}
			if(catagory.get(option-1).equals("Exterior"))
			{
				Exterior();
			}
			if(catagory.get(option-1).equals("Electronic"))
			{
				Electronic();
			}
			
		}
		if(option==catagory.size()+1)//add
		{
			add();
		}
		if(option==catagory.size()+2)//edit
		{
			edit();
		}
		if(option==catagory.size()+3)//delete
		{
			delete();
		}
	}
	
	private void interior()
	{
		showinterior();
		Scanner input3 = new Scanner(System.in);
		LOGGER.log(Level.INFO,"Please choose the number:");
		int number = Integer.parseInt(input3.nextLine());
		if(number<=interior.size())
		{
			p.printdetails(number);
			LOGGER.log(Level.INFO,"1. Edit");
			LOGGER.log(Level.INFO,"2. Back");
			int num = Integer.parseInt(input3.nextLine());
			if(num==1)
			{
				LOGGER.log(Level.INFO,"Please choose number you want to edit:");
				LOGGER.log(Level.INFO,"1. Name");
				LOGGER.log(Level.INFO,"2. Description");
				LOGGER.log(Level.INFO,"3. Image");
				LOGGER.log(Level.INFO,"4. Price");
				LOGGER.log(Level.INFO,"5. Quantity");
				int option = Integer.parseInt(input3.nextLine());
				if(option==1)
				{
					LOGGER.log(Level.INFO,"Please enter the new name:");
					String name=input3.nextLine();
					interior.get(number).setname(name);
				}
				else if(option==2)
				{
					LOGGER.log(Level.INFO,"Please enter the new Descriptione:");
					String Description=input3.nextLine();
					interior.get(number).setdescriptions(Description);
				}
				else if(option==3)
				{
					LOGGER.log(Level.INFO,"Please enter the new Image:");
					String Image=input3.nextLine();
					interior.get(number).setimage(Image);
				}
				else if(option==4)
				{
					LOGGER.log(Level.INFO,"Please enter the new price:");
					int price = Integer.parseInt(input3.nextLine());
					interior.get(number).setprices(price);
				}
				else if(option==5)
				{
					LOGGER.log(Level.INFO,"Please enter the new Quantity:");
					int Quantity = Integer.parseInt(input3.nextLine());
					interior.get(number).setquant(Quantity);
				}
				
				
			}
			if(num==2)
			{
				interior();
			}	
		}
		if(number==interior.size()+1)//add
		{
			addinterior();
		}
		if(number==interior.size()+2)//edit
		{
			editinterior();
		}
	}
	
	private void Exterior()
	{
		showExterior();
		Scanner input3 = new Scanner(System.in);
		LOGGER.log(Level.INFO,"Please choose the number:");
		int number = Integer.parseInt(input3.nextLine());
		if(number<=exterior.size())
		{
			p.printdetailsext(number);
			LOGGER.log(Level.INFO,"1. Edit");
			LOGGER.log(Level.INFO,"2. Back");
			int num = Integer.parseInt(input3.nextLine());
			if(num==1)
			{
				LOGGER.log(Level.INFO,"Please choose number you want to edit:");
				LOGGER.log(Level.INFO,"1. Name");
				LOGGER.log(Level.INFO,"2. Description");
				LOGGER.log(Level.INFO,"3. Image");
				LOGGER.log(Level.INFO,"4. Price");
				LOGGER.log(Level.INFO,"5. Quantity");
				int option = Integer.parseInt(input3.nextLine());
				if(option==1)
				{
					LOGGER.log(Level.INFO,"Please enter the new name:");
					String name=input3.nextLine();
					exterior.get(number).setname(name);
				}
				else if(option==2)
				{
					LOGGER.log(Level.INFO,"Please enter the new Descriptione:");
					String Description=input3.nextLine();
					exterior.get(number).setdescriptions(Description);
				}
				else if(option==3)
				{
					LOGGER.log(Level.INFO,"Please enter the new Image:");
					String Image=input3.nextLine();
					exterior.get(number).setimage(Image);
				}
				else if(option==4)
				{
					LOGGER.log(Level.INFO,"Please enter the new price:");
					int price = Integer.parseInt(input3.nextLine());
					exterior.get(number).setprices(price);
				}
				else if(option==5)
				{
					LOGGER.log(Level.INFO,"Please enter the new Quantity:");
					int Quantity = Integer.parseInt(input3.nextLine());
					exterior.get(number).setquant(Quantity);
				}
				
				
			}
			if(num==2)
			{
				Exterior();
			}	
		}
		if(number==exterior.size()+1)//add
		{
			addexterior();
		}
		if(number==exterior.size()+2)//edit
		{
			editexterior();
		}

	}
	
	private void Electronic()
	{
		showelec();
		Scanner input3 = new Scanner(System.in);
		LOGGER.log(Level.INFO,"Please choose the number:");
		int number = Integer.parseInt(input3.nextLine());
		if(number<=elect.size())
		{
			p.printelecdetails(number);
			LOGGER.log(Level.INFO,"1. Edit");
			LOGGER.log(Level.INFO,"2. Back");
			int num = Integer.parseInt(input3.nextLine());
			if(num==1)
			{
				LOGGER.log(Level.INFO,"Please choose number you want to edit:");
				LOGGER.log(Level.INFO,"1. Name");
				LOGGER.log(Level.INFO,"2. Description");
				LOGGER.log(Level.INFO,"3. Image");
				LOGGER.log(Level.INFO,"4. Price");
				LOGGER.log(Level.INFO,"5. Quantity");
				int option = Integer.parseInt(input3.nextLine());
				if(option==1)
				{
					LOGGER.log(Level.INFO,"Please enter the new name:");
					String name=input3.nextLine();
					elect.get(number).setname(name);
				}
				else if(option==2)
				{
					LOGGER.log(Level.INFO,"Please enter the new Descriptione:");
					String Description=input3.nextLine();
					elect.get(number).setdescriptions(Description);
				}
				else if(option==3)
				{
					LOGGER.log(Level.INFO,"Please enter the new Image:");
					String Image=input3.nextLine();
					elect.get(number).setimage(Image);
				}
				else if(option==4)
				{
					LOGGER.log(Level.INFO,"Please enter the new price:");
					int price = Integer.parseInt(input3.nextLine());
					elect.get(number).setprices(price);
				}
				else if(option==5)
				{
					LOGGER.log(Level.INFO,"Please enter the new Quantity:");
					int Quantity = Integer.parseInt(input3.nextLine());
					elect.get(number).setquant(Quantity);
				}
				
				
			}
			if(num==2)
			{
				 Electronic();
			}	
		}
		if(number==elect.size()+1)//add
		{
			addelect();
		}
		if(number==elect.size()+2)//edit
		{
			editelect();
		}

	}
	
	
	
	private void editinterior() 
	{
		 Scanner input3 = new Scanner(System.in);
		 LOGGER.log(Level.INFO,"Please choose the number of product to edit:");
			int number = Integer.parseInt(input3.nextLine());
			
			LOGGER.log(Level.INFO,"Please choose the number of information to edit:");
			LOGGER.log(Level.INFO,"1. Name");
			LOGGER.log(Level.INFO,"2. Description");
			LOGGER.log(Level.INFO,"3. image");
			LOGGER.log(Level.INFO,"4. price");
			LOGGER.log(Level.INFO,"5. install");
			LOGGER.log(Level.INFO,"6. quantity");
			int option = Integer.parseInt(input3.nextLine());
			if(option==1)
			{
				LOGGER.log(Level.INFO,"Please enter the new name interior product:");
			     String name = input3.nextLine();
			     editname(number,name);
			     showinterior();
			}
			
			if(option==2)
			{
				LOGGER.log(Level.INFO,"Please enter the new description interior product:");
			     String desc = input3.nextLine();
			     editdescription(number,desc);
			     showinterior();
			}
			if(option==3)
			{
				LOGGER.log(Level.INFO,"Please enter the new image interior product:");
			     String image = input3.nextLine();
			     editimage(number,image);
			     showinterior();
			}
			if(option==4)
			{
				LOGGER.log(Level.INFO,"Please enter the new price interior product:");
				int price = Integer.parseInt(input3.nextLine());
			     editprice(number,price);
			     showinterior();
			}
			if(option==5)
			{
				LOGGER.log(Level.INFO,"Please enter the new install interior product:");
				 String install = input3.nextLine();
			     editinstall(number,install);
			     showinterior();
			}
			if(option==6)
			{
				LOGGER.log(Level.INFO,"Please enter the new quantity interior product:");
				int quantity = Integer.parseInt(input3.nextLine());
			     editquantity(number,quantity);
			     showinterior();
			}
			

	}
	
	private void editexterior() 
	{
		 Scanner input3 = new Scanner(System.in);
		 LOGGER.log(Level.INFO,"Please choose the number of product to edit:");
			int number = Integer.parseInt(input3.nextLine());
			
			LOGGER.log(Level.INFO,"Please choose the number of information to edit:");
			LOGGER.log(Level.INFO,"1. Name");
			LOGGER.log(Level.INFO,"2. Description");
			LOGGER.log(Level.INFO,"3. image");
			LOGGER.log(Level.INFO,"4. price");
			LOGGER.log(Level.INFO,"5. install");
			LOGGER.log(Level.INFO,"6. quantity");
			int option = Integer.parseInt(input3.nextLine());
			if(option==1)
			{
				LOGGER.log(Level.INFO,"Please enter the new name exterior product:");
			     String name = input3.nextLine();
			     editname1(number,name);
			     showExterior();
			}
			
			if(option==2)
			{
				LOGGER.log(Level.INFO,"Please enter the new description exterior product:");
			     String desc = input3.nextLine();
			     editdescription1(number,desc);
			     showExterior();
			}
			if(option==3)
			{
				LOGGER.log(Level.INFO,"Please enter the new image exterior product:");
			     String image = input3.nextLine();
			     editimage1(number,image);
			     showExterior();
			}
			if(option==4)
			{
				LOGGER.log(Level.INFO,"Please enter the new price exterior product:");
				int price = Integer.parseInt(input3.nextLine());
			     editprice1(number,price);
			     showExterior();
			}
			if(option==5)
			{
				LOGGER.log(Level.INFO,"Please enter the new install exterior product:");
				 String install = input3.nextLine();
			     editinstall1(number,install);
			     showExterior();
			}
			if(option==6)
			{
				LOGGER.log(Level.INFO,"Please enter the new quantity exterior product:");
				int quantity = Integer.parseInt(input3.nextLine());
			     editquantity1(number,quantity);
			     showExterior();
			}
			

	}
	private void editelect() 
	{
		 Scanner input3 = new Scanner(System.in);
		 LOGGER.log(Level.INFO,"Please choose the number of product to edit:");
			int number = Integer.parseInt(input3.nextLine());
			
			LOGGER.log(Level.INFO,"Please choose the number of information to edit:");
			LOGGER.log(Level.INFO,"1. Name");
			LOGGER.log(Level.INFO,"2. Description");
			LOGGER.log(Level.INFO,"3. image");
			LOGGER.log(Level.INFO,"4. price");
			LOGGER.log(Level.INFO,"5. install");
			LOGGER.log(Level.INFO,"6. quantity");
			int option = Integer.parseInt(input3.nextLine());
			if(option==1)
			{
				LOGGER.log(Level.INFO,"Please enter the new name electronic product:");
			     String name = input3.nextLine();
			     editname2(number,name);
			     showelec();
			}
			
			if(option==2)
			{
				LOGGER.log(Level.INFO,"Please enter the new description electronic product:");
			     String desc = input3.nextLine();
			     editdescription2(number,desc);
			     showelec();
			}
			if(option==3)
			{
				LOGGER.log(Level.INFO,"Please enter the new image electronic product:");
			     String image = input3.nextLine();
			     editimage2(number,image);
			     showelec();
			}
			if(option==4)
			{
				LOGGER.log(Level.INFO,"Please enter the new price electronic product:");
				int price = Integer.parseInt(input3.nextLine());
			     editprice2(number,price);
			     showelec();
			}
			if(option==5)
			{
				LOGGER.log(Level.INFO,"Please enter the new install electronic product:");
				 String install = input3.nextLine();
			     editinstall2(number,install);
			     showelec();
			}
			if(option==6)
			{
				LOGGER.log(Level.INFO,"Please enter the new quantity electronic product:");
				int quantity = Integer.parseInt(input3.nextLine());
			     editquantity2(number,quantity);
			     showelec();
			}
			

	}
	
	private void editquantity1(int number, int quantity) {
		exterior.get(number-1).setavailability(quantity);
		
	}
	private void editinstall1(int number, String install) {
		
		exterior.get(number-1).setinstall(install);
	}
	private void editprice1(int number, int price) {
		exterior.get(number-1).setprices(price);
		
	}
	private void editimage1(int index, String image) {
		exterior.get(index-1).setimage(image);
	}
	private void editdescription1(int index, String desc) {
		
		exterior.get(index-1).setdescriptions(desc);
	}
	public void editname1(int index,String name)
	{
		exterior.get(index-1).setname(name);
	}
	
	private void editquantity2(int number, int quantity) {
		elect.get(number-1).setavailability(quantity);
		
	}
	private void editinstall2(int number, String install) {
		
		elect.get(number-1).setinstall(install);
	}
	private void editprice2(int number, int price) {
		elect.get(number-1).setprices(price);
		
	}
	private void editimage2(int index, String image) {
		elect.get(index-1).setimage(image);
	}
	private void editdescription2(int index, String desc) {
		
		elect.get(index-1).setdescriptions(desc);
	}
	public void editname2(int index,String name)
	{
		elect.get(index-1).setname(name);
	}
	
	private void editquantity(int number, int quantity) {
		interior.get(number-1).setavailability(quantity);
		
	}
	private void editinstall(int number, String install) {
		
		interior.get(number-1).setinstall(install);
	}
	private void editprice(int number, int price) {
		interior.get(number-1).setprices(price);
		
	}
	private void editimage(int index, String image) {
		interior.get(index-1).setimage(image);
	}
	private void editdescription(int index, String desc) {
		
		interior.get(index-1).setdescriptions(desc);
	}
	public void editname(int index,String name)
	{
		interior.get(index-1).setname(name);
	}
	private void addinterior() 
	{
		LOGGER.log(Level.INFO,"Please enter the new name interior product:");
		 Scanner input3 = new Scanner(System.in);
	     String name = input3.nextLine();
	     
	     LOGGER.log(Level.INFO,"Please enter the new interior product description:");
	     String description = input3.nextLine();
	     
	     LOGGER.log(Level.INFO,"Please enter the new interior product image:");
	     String image = input3.nextLine();
	     
	     LOGGER.log(Level.INFO,"Please enter the new interior product price:");
	     int price = Integer.parseInt(input3.nextLine());
	     
	     LOGGER.log(Level.INFO,"Please enter the new interior product install:");
	     String install = input3.nextLine();
	     
	     LOGGER.log(Level.INFO,"Please enter the new interior product quantity:");
	     int quantity = Integer.parseInt(input3.nextLine());
	     
	     addinteriorname(name,description,image,price,install,quantity);
	     showinterior();
	}
	
	private void addexterior() 
	{
		LOGGER.log(Level.INFO,"Please enter the new name exterior product:");
		 Scanner input3 = new Scanner(System.in);
	     String name = input3.nextLine();
	     
	     LOGGER.log(Level.INFO,"Please enter the new exterior product description:");
	     String description = input3.nextLine();
	     
	     LOGGER.log(Level.INFO,"Please enter the new exterior product image:");
	     String image = input3.nextLine();
	     
	     LOGGER.log(Level.INFO,"Please enter the new exterior product price:");
	     int price = Integer.parseInt(input3.nextLine());
	     
	     LOGGER.log(Level.INFO,"Please enter the new exterior product install:");
	     String install = input3.nextLine();
	     
	     LOGGER.log(Level.INFO,"Please enter the new exterior product quantity:");
	     int quantity = Integer.parseInt(input3.nextLine());
	     
	     addexteriorname(name,description,image,price,install,quantity);
	     showExterior();
	}
	
	
	private void addelect() 
	{
		LOGGER.log(Level.INFO,"Please enter the new name electronic product:");
		 Scanner input3 = new Scanner(System.in);
	     String name = input3.nextLine();
	     
	     LOGGER.log(Level.INFO,"Please enter the new electronic product description:");
	     String description = input3.nextLine();
	     
	     LOGGER.log(Level.INFO,"Please enter the new electronic product image:");
	     String image = input3.nextLine();
	     
	     LOGGER.log(Level.INFO,"Please enter the new electronic product price:");
	     int price = Integer.parseInt(input3.nextLine());
	     
	     LOGGER.log(Level.INFO,"Please enter the new electronic product install:");
	     String install = input3.nextLine();
	     
	     LOGGER.log(Level.INFO,"Please enter the new electronic product quantity:");
	     int quantity = Integer.parseInt(input3.nextLine());
	     
	     addelectronicrname(name,description,image,price,install,quantity);
	     showelec();
	}
	public void addinteriorname(String names, String descriptions,String image, int prices,String installe, int availability) 
	{
		interior.add(new product(names,descriptions,image,prices,installe,availability));
		
	}
	public void  addexteriorname(String names, String descriptions,String image, int prices,String installe, int availability) 
	{
		exterior.add(new product(names,descriptions,image,prices,installe,availability));
		
	}
	public void  addelectronicrname(String names, String descriptions,String image, int prices,String installe, int availability) 
	{
		elect.add(new product(names,descriptions,image,prices,installe,availability));
		
	}
	public void showinterior()
	{
		int x=0;
		for (int i = 0; i < interior.size(); i++)
		{
	    x=i+1;
	    LOGGER.log(Level.INFO, x + ". " + interior.get(i).getname());
		}
		x++;
		LOGGER.log(Level.INFO, x + ". Add");
	    x++;
	    LOGGER.log(Level.INFO, x + ". Edit");
	    x++;
	    LOGGER.log(Level.INFO, x + ". Back");
	}
	
	public void showExterior()
	{
		int x=0;
		for (int i = 0; i < exterior.size(); i++)
		{
	    x=i+1;
	    LOGGER.log(Level.INFO, x + ". " + exterior.get(i).getname());
		}
		x++;
		LOGGER.log(Level.INFO, x + ". Add");
	    x++;
	    LOGGER.log(Level.INFO, x + ". Edit");
	    x++;
	    LOGGER.log(Level.INFO, x + ". Back");
	}
	
	public void showelec()
	{
		int x=0;
		for (int i = 0; i < elect.size(); i++)
		{
	    x=i+1;
	    LOGGER.log(Level.INFO, x + ". " + elect.get(i).getname());
		}
		x++;
		LOGGER.log(Level.INFO, x + ". Add");
	    x++;
	    LOGGER.log(Level.INFO, x + ". Edit");
	    x++;
	    LOGGER.log(Level.INFO,x + ". Back");
	}
	
	private void delete() {
		 Scanner input3 = new Scanner(System.in);
		 LOGGER.log(Level.INFO,"Please choose the number of category to delete:");
			int number = Integer.parseInt(input3.nextLine());
			while(number > catagory.size())
			{
				LOGGER.log(Level.INFO,"Please choose valid number:");
				delete();
			}
			deletecatagory(number);
			showcatagory();
	}
	
	
	public void deletecatagory(int number) {
		catagory.remove(number-1);
			}
	private void edit()
	{
		 Scanner input3 = new Scanner(System.in);
		 LOGGER.log(Level.INFO,"Please choose the number of category to edit:");
		int number = Integer.parseInt(input3.nextLine());
		while(number > catagory.size())
		{
			LOGGER.log(Level.INFO,"Please choose valid number:");
			edit();
		}
		LOGGER.log(Level.INFO,"write the new edit for category:");
		String newname = input3.nextLine();
		editcatagory(newname,number);
		showcatagory();
		
		
		
	}
	private void add()
	{
		LOGGER.log(Level.INFO,"Please enter the new category:");
		 Scanner input3 = new Scanner(System.in);
	     String name = input3.nextLine();
	     addcatagory(name);
	     showcatagory();
	}
	public void seteditf(int i) {
		this.editf=i;
		
	}
	public void setsafetyf(int i) {
		// TODO Auto-generated method stub
		this.safetyf=i;
	}
	public void editcatagory(String edit,int n) {
		
		catagory.set(n-1, edit);
		
	}
	public void setdeletef(int i) {
		this.deletef=i;
		
	}
	public void setinteriorf(int i) {
		// TODO Auto-generated method stub
		this.interiorf=i;
	}
	public String checkinterior() {
		
		
		return interior.get(interior.size()-1).getname();
	}
public String checkexterior() {
		
		
		return exterior.get(exterior.size()-1).getname();
	}
public String checkelec() {
	
	
	return elect.get(elect.size()-1).getname();
}
	public void setproduct(int i) {
		this.productf=i;
		
	}
	public void setinformation(int i) {
	this.informationf=i;
		
	}
	public String checknameinterior() {
		
		
		return interior.get(0).getname();
	}
public String checknameexterior() {
		
		
		return exterior.get(0).getname();
	}
public String checknameelectronic() {
	
	
	return elect.get(1).getname();
}
	public void showaccount() 
	{
		for (int i = 0; i < mylist.size(); i++)
		{
			int pass=mylist.get(i).getpass();
		    String passString = Integer.toString(pass);
				if (passString.length() == 4)
				{
					LOGGER.log(Level.INFO,"Name:"+mylist.get(i).getname() +"  , Email: " + mylist.get(i).getemail() + "  , Address: " + mylist.get(i).getaddress());
				}
		}	
	}
	public void showinstallation() {
		
		inst.printdate();
	}
	public void setextf(int i) {
		extf=i;
		
	}
	public void setelecf(int i) {
		elecf=i;
		
	}

}
