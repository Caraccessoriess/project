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
	
	
	private static String enternumber="Please choose the number:";
	
	private static String name="1. Name:";
	private static String description="2. Description";
	private static String price="4. Price:";
	private static String image="3. Image";
	private static String install="5. Install:";
	private static String quantity="6. Quantity";
	
	private static String add=". Add";
	private static String edit=". Edit";
	private static String back=". Back";
	private static String delete=". Delete";
	
	private static String editp="Please choose the number of product to edit:";
	private static String editinf="Please choose the number of information to edit:";
	
	
	
	private static final List<String> catagory = new ArrayList<String>();
	private product p=new product();
	private  List <product>interior = p.getinterior();
	private  List <product>exterior = p.getextrior();
	private  List <product>elect = p.getelect();
	
	
	public List<String> getcatg() 
	{ 
		return catagory;
	}
	
	SignUpCustomer c;
	private installation inst=new installation();
	public List<SignUpCustomer> mylist = c.getMylist();
	
	public static void setoptionf(int i) {
		optionf=i;
		
		
	}
	public int getoptionf() {
		return optionf;
		
	}
	
	public void initcatagory()
	{
		catagory.add(("Interior"));
		catagory.add(("Exterior"));
		catagory.add(("Electronic"));
		
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
	    LOGGER.log(Level.INFO, x + add);
	    x++;
	   LOGGER.log(Level.INFO, x + edit);
	    x++;
	    LOGGER.log(Level.INFO, x + delete);
	    x++;
	   LOGGER.log(Level.INFO, x + back);
	    
	}
	public void setaddf(int i) {
		LOGGER.log(Level.INFO,"done{0}",i);
	}
	
	
	public void addcatagory(String catag)
	{
		catagory.add(catag);
		
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
	
	private  void interior()
	{
		showinterior();
		Scanner input3 = new Scanner(System.in);
		LOGGER.log(Level.INFO,enternumber);
		int number = Integer.parseInt(input3.nextLine());
		if(number<=interior.size())
		{
			product.printdetails(number);
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
		LOGGER.log(Level.INFO,enternumber);
		int number = Integer.parseInt(input3.nextLine());
		if(number<=exterior.size())
		{
			product.printdetailsext(number);
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
	
	private  void Electronic()
	{
		showelec();
		Scanner input3 = new Scanner(System.in);
		LOGGER.log(Level.INFO,enternumber);
		int number = Integer.parseInt(input3.nextLine());
		if(number<=elect.size())
		{
			p.printelecdetails(number);
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
			LOGGER.log(Level.INFO,editp);
			int number = Integer.parseInt(input3.nextLine());
			
			LOGGER.log(Level.INFO,editinf);
			LOGGER.log(Level.INFO,name);
			LOGGER.log(Level.INFO,description);
			LOGGER.log(Level.INFO,image);
			LOGGER.log(Level.INFO,price);
			LOGGER.log(Level.INFO,install);
			LOGGER.log(Level.INFO,quantity);
			int option = Integer.parseInt(input3.nextLine());
			if(option==1)
			{
				LOGGER.log(Level.INFO,"Please enter the new name interior product:");
			     String names = input3.nextLine();
			     editname(number,names);
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
			     String images = input3.nextLine();
			     editimage(number,images);
			     showinterior();
			}
			if(option==4)
			{
				LOGGER.log(Level.INFO,"Please enter the new price interior product:");
				int prices = Integer.parseInt(input3.nextLine());
			     editprice(number,prices);
			     showinterior();
			}
			if(option==5)
			{
				LOGGER.log(Level.INFO,"Please enter the new install interior product:");
				 String installs = input3.nextLine();
			     editinstall(number,installs);
			     showinterior();
			}
			if(option==6)
			{
				LOGGER.log(Level.INFO,"Please enter the new quantity interior product:");
				int quantitys = Integer.parseInt(input3.nextLine());
			     editquantity(number,quantitys);
			     showinterior();
			}
			

	}
	
	private void editexterior() 
	{
		 Scanner input3 = new Scanner(System.in);
			LOGGER.log(Level.INFO,editp);
			int number = Integer.parseInt(input3.nextLine());
			
			LOGGER.log(Level.INFO,editinf);
			LOGGER.log(Level.INFO,name);
			LOGGER.log(Level.INFO,description);
			LOGGER.log(Level.INFO,image);
			LOGGER.log(Level.INFO,price);
			LOGGER.log(Level.INFO,install);
			LOGGER.log(Level.INFO,quantity);
			int option = Integer.parseInt(input3.nextLine());
			if(option==1)
			{
				LOGGER.log(Level.INFO,"Please enter the new name exterior product:");
			     String namesss = input3.nextLine();
			     editname1(number,namesss);
			     showExterior();
			}
			
			if(option==2)
			{
				LOGGER.log(Level.INFO,"Please enter the new description exterior product:");
			     String descsss = input3.nextLine();
			     editdescription1(number,descsss);
			     showExterior();
			}
			if(option==3)
			{
			LOGGER.log(Level.INFO,"Please enter the new image exterior product:");
			     String imagesss = input3.nextLine();
			     editimage1(number,imagesss);
			     showExterior();
			}
			if(option==4)
			{
				LOGGER.log(Level.INFO,"Please enter the new price exterior product:");
				int pricesss = Integer.parseInt(input3.nextLine());
			     editprice1(number,pricesss);
			     showExterior();
			}
			if(option==5)
			{
				LOGGER.log(Level.INFO,"Please enter the new install exterior product:");
				 String installsss = input3.nextLine();
			     editinstall1(number,installsss);
			     showExterior();
			}
			if(option==6)
			{
				LOGGER.log(Level.INFO,"Please enter the new quantity exterior product:");
				int quantitysss = Integer.parseInt(input3.nextLine());
			     editquantity1(number,quantitysss);
			     showExterior();
			}
			

	}
	private void editelect() 
	{
		 Scanner input3 = new Scanner(System.in);
			LOGGER.log(Level.INFO,editp);
			int number = Integer.parseInt(input3.nextLine());
			
			LOGGER.log(Level.INFO,editinf);
			LOGGER.log(Level.INFO,name);
			LOGGER.log(Level.INFO,description);
			LOGGER.log(Level.INFO,image);
			LOGGER.log(Level.INFO,price);
			LOGGER.log(Level.INFO,install);
			LOGGER.log(Level.INFO,quantity);
			int option = Integer.parseInt(input3.nextLine());
			if(option==1)
			{
				LOGGER.log(Level.INFO,"Please enter the new name electronic product:");
			     String namess = input3.nextLine();
			     editname2(number,namess);
			     showelec();
			}
			
			if(option==2)
			{
				LOGGER.log(Level.INFO,"Please enter the new description electronic product:");
			     String descss = input3.nextLine();
			     editdescription2(number,descss);
			     showelec();
			}
			if(option==3)
			{
				LOGGER.log(Level.INFO,"Please enter the new image electronic product:");
			     String imagess = input3.nextLine();
			     editimage2(number,imagess);
			     showelec();
			}
			if(option==4)
			{
				LOGGER.log(Level.INFO,"Please enter the new price electronic product:");
				int pricess = Integer.parseInt(input3.nextLine());
			     editprice2(number,pricess);
			     showelec();
			}
			if(option==5)
			{
				LOGGER.log(Level.INFO,"Please enter the new install electronic product:");
				 String installss = input3.nextLine();
			     editinstall2(number,installss);
			     showelec();
			}
			if(option==6)
			{
			LOGGER.log(Level.INFO,"Please enter the new quantity electronic product:");
				int quantityss = Integer.parseInt(input3.nextLine());
			     editquantity2(number,quantityss);
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
	     String name2 = input3.nextLine();
	     
	  LOGGER.log(Level.INFO,"Please enter the new interior product description:");
	     String description1 = input3.nextLine();
	     
	     LOGGER.log(Level.INFO,"Please enter the new interior product image:");
	     String image1 = input3.nextLine();
	     
	     LOGGER.log(Level.INFO,"Please enter the new interior product price:");
	     int price1 = Integer.parseInt(input3.nextLine());
	     
	    LOGGER.log(Level.INFO,"Please enter the new interior product install:");
	     String install1 = input3.nextLine();
	     
	    LOGGER.log(Level.INFO,"Please enter the new interior product quantity:");
	     int quantity1 = Integer.parseInt(input3.nextLine());
	     
	     addinteriorname(name2,description1,image1,price1,install1,quantity1);
	     showinterior();
	}
	
	private void addexterior() 
	{
		 LOGGER.log(Level.INFO,"Please enter the new name exterior product:");
		 Scanner input3 = new Scanner(System.in);
	     String name4 = input3.nextLine();
	     
	    LOGGER.log(Level.INFO,"Please enter the new exterior product description:");
	     String description4 = input3.nextLine();
	     
	    LOGGER.log(Level.INFO,"Please enter the new exterior product image:");
	     String image4 = input3.nextLine();
	     
	    LOGGER.log(Level.INFO,"Please enter the new exterior product price:");
	     int price4 = Integer.parseInt(input3.nextLine());
	     
	    LOGGER.log(Level.INFO,"Please enter the new exterior product install:");
	     String install4 = input3.nextLine();
	     
	   LOGGER.log(Level.INFO,"Please enter the new exterior product quantity:");
	     int quantity4 = Integer.parseInt(input3.nextLine());
	     
	     addexteriorname(name4,description4,image4,price4,install4,quantity4);
	     showExterior();
	}
	
	
	private void addelect() 
	{
		LOGGER.log(Level.INFO,"Please enter the new name electronic product:");
		 Scanner input3 = new Scanner(System.in);
	     String name5 = input3.nextLine();
	     
	    LOGGER.log(Level.INFO,"Please enter the new electronic product description:");
	     String description5 = input3.nextLine();
	     
	     LOGGER.log(Level.INFO,"Please enter the new electronic product image:");
	     String image5 = input3.nextLine();
	     
	    LOGGER.log(Level.INFO,"Please enter the new electronic product price:");
	     int price5 = Integer.parseInt(input3.nextLine());
	     
	     LOGGER.log(Level.INFO,"Please enter the new electronic product install:");
	     String install5 = input3.nextLine();
	     
	     LOGGER.log(Level.INFO,"Please enter the new electronic product quantity:");
	     int quantity5 = Integer.parseInt(input3.nextLine());
	     
	     addelectronicrname(name5,description5,image5,price5,install5,quantity5);
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
	    LOGGER.log(Level.INFO, x + add);
	    x++;
	 LOGGER.log(Level.INFO, x + edit);
	    x++;
	   LOGGER.log(Level.INFO, x + back);
	}
	
	public void showExterior()
	{
		int x=0;
		for (int i = 0; i < exterior.size(); i++)
		{
	    x=i+1;
		LOGGER.log(Level.INFO,x + ". {0}" , exterior.get(i).getname());
		}
		x++;
	   LOGGER.log(Level.INFO,"{0}", x + add);
	    x++;
	   LOGGER.log(Level.INFO, "{0}",x + edit);
	    x++;
	    LOGGER.log(Level.INFO, "{0}",x + back);
	}
	
	public void showelec()
	{
		int x=0;
		for (int i = 0; i < elect.size(); i++)
		{
	    x=i+1;
		LOGGER.log(Level.INFO, x+". {0}" , elect.get(i).getname());
		}
		x++;
	    LOGGER.log(Level.INFO,"{0}", x + add);
	    x++;
	    LOGGER.log(Level.INFO,"{0}",x + edit);
	    x++;
	    LOGGER.log(Level.INFO,"{0}", x + back);
	}
	
	private void delete() {
		 Scanner input3 = new Scanner(System.in);
			LOGGER.log(Level.INFO,"Please choose the number of category to delete:");
			int number1 = Integer.parseInt(input3.nextLine());
			while(number1 > catagory.size())
			{
				LOGGER.log(Level.INFO,"Please choose valid number:");
				delete();
			}
			deletecatagory(number1);
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
	     String name1 = input3.nextLine();
	     addcatagory(name1);
	     showcatagory();
	}
	public void seteditf(int i) {
		
		LOGGER.log(Level.INFO,"done{0}",i);
	}
	public void setsafetyf(int i) {
		LOGGER.log(Level.INFO,"done{0}",i);
		
	}
	public void editcatagory(String edit,int n) {
		
		catagory.set(n-1, edit);
		
	}
	public void setdeletef(int i) {
		LOGGER.log(Level.INFO,"done{0}",i);
		
	}
	public void setinteriorf(int i) {
		LOGGER.log(Level.INFO,"done{0}",i);
		
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
		
		LOGGER.log(Level.INFO,"done{0}",i);
	}
	public void setinformation(int i) {
	
		LOGGER.log(Level.INFO,"done{0}",i);
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
					LOGGER.log(Level.INFO,"Name:{0}",mylist.get(i).getname()+"");
					LOGGER.log(Level.INFO," ,Email:{0} " , mylist.get(i).getemail()+""); 
					LOGGER.log(Level.INFO," ,Address:{0} " , mylist.get(i).getaddress() +""); 	   
				}
		}	
	}
	public void showinstallation() {
		
		installation.printdate();
	}
	public void setextf(int i) {
		
		LOGGER.log(Level.INFO,"done{0}",i);
	}
	public void setelecf(int i) {
		
		LOGGER.log(Level.INFO,"done{0}",i);
	}

}
