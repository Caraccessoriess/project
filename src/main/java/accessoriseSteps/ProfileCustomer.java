package accessoriseSteps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProfileCustomer {
//
	private int pass;
	private String name;
	private String email;
	private String address;
	
	private int totprice=0;
	private String status;
	private static product prd= new product();
	
	private static int customerf=0;
	private static int profilef=0;
	private static int optionf=0;
	private static int correctpassf=0;
	private static int menuf=0;
	
	public ProfileCustomer(String names, int pass, String email, String addres) {
		this.pass = pass;
		this.name = names;
		this.email = email;
		this.address = addres;
	}
	public static class order{
		String email;
		String status;
	    int total=0;
	    product p;
	}
	

	public ProfileCustomer(String email, int totprice) {
		
	 this.totprice=totprice;
	 this.email = email;
		
	}
	public ProfileCustomer() {}
	
	SignUpCustomer c;
	public List<SignUpCustomer> mylist = c.getMylist();
	

	installation inst=new installation();
	List<installation> allOrder = inst.getallOrder();
	
	public void setcustpage(int i) {
		
		this.customerf=i;
	}
public int getcustpage() {
		
		return customerf;
	}
public void setprofilef(int i) {
	this.profilef=i;
	
}
public int getprofile() {
	
	return profilef;
}

public void setname(String m) {
	this.name=m;
}
public void setpass(int m) {
	this.pass=m;
}
public void setaddress(String m) {
	this.address=m;
}
public void setemail(String m) {
	this.email=m;
}

public void changename(String n)
{
	int x=0;
	 for (int i = 0; i < mylist.size(); i++)
	 {
		 if(mylist.get(i).getname().equals(this.name))
		 {
			 x=i;
		 }
	 }
	 
	 mylist.get(x).setname(n);
	 this.name=n;
}

public String getname() {
	return name;
}

public String getnamee() {
	
	
	 for (int i = 0; i < mylist.size(); i++)
	 {
		 if(mylist.get(i).getname().equals(this.name))
		 {
			 this.pass=mylist.get(i).getpass();
			 this.email=mylist.get(i).getemail();
			 this.address=mylist.get(i).getaddress();
		 }
	 }
	 
	 System.out.println("1. Name :" + this.name);
		System.out.println("\n 2. Passward : **** ");
		System.out.println("\n 3. Email :" + this.email);
		System.out.println("\n 4. Address :" + this.address);
		System.out.println("\n 5. Back :");
		
	return this.name;
}

public int getpass() {
	return this.pass;
}
	
public String getemail() {
	return this.email;
}

public String getaddress() {
	return this.address;
}
public void setoptionf(int i) {
	
	this.optionf=i;
}
public int getoptionf() {
	
	return optionf;
}
public void checkpass(int i) 
{
	if(this.pass == i)
	{
		correctpassf=1;
	}
	
	
}
public void changepassward(int i) {
	if(correctpassf ==1)
	{
		int x=0;
		 for (int o = 0; o < mylist.size(); o++)
		 {
			
			 if(mylist.get(o).getname().equals(this.name))
			 {
				 x=o;
			 }
		 }
		 
		 mylist.get(x).setpass(i);
		 this.pass=i;
	}
	
	
}
public void changeaddress(String add) {
	int x=0;
	 for (int i = 0; i < mylist.size(); i++)
	 {
		 if(mylist.get(i).getname().equals(this.name))
		 {
			 x=i;
		 }
	 }
	 
	 mylist.get(x).setaddress(add);
	 this.address=add;
	
}
public void setmenuf(int i) {
	this.menuf=i;
	
}
public int getmenuf() {
	// TODO Auto-generated method stub
	return menuf;
}
public void showhistory() {
	  int x=0;
	for (int i = 0; i <allOrder.size(); i++)
	 {
		
	
		if(email.equals(allOrder.get(i).getemail())) {
		x=i+1;
		System.out.println(x+". "+allOrder.get(i).getemail()+"   "+allOrder.get(i).getstatus()+"   "+ allOrder.get(i).gettotalprice()+" "+allOrder.get(i).getproductNames());
		
	 }
	 }
	menuf=2;
}
}
