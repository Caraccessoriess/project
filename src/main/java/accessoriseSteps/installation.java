package accessoriseSteps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class installation {
	
	private static product p = new product();
	private static Scanner input;
	int instflag=0;
	int totalprice=0;
	private String status;
	private String email;
	private String datee="";
	private String model="";
	private String address="";
	private String phone="";
	
	
	ProfileCustomer profc;
	
	public installation()
	{
	}
	public String getemail() {
		
		return email;
	}
	public String getstatus() {
		
		return status;
	}
public String getdate() {
		
		return datee;
	}
public String getadd() {
	
	return address;
}
public String getphone() {
	
	return phone;
}
public String getmodel() {
	
	return model;
}
    public int gettotalprice() {
		
		return totalprice;
	}
    public List<String> getproductNames() 
	{ 
		return productNames;
	}
	public void setemail(String email) {
		
		this.email=email;
	}
	public List<installation> getallOrder() 
	{ 
		return allOrder;
	}
	
	List <product>order = p.getorder();
    private   List<String> productNames = new ArrayList<String>();
    private static  final List<installation> allOrder = new ArrayList<installation>();
	private static final List<String> date = new ArrayList<String>();
	
	
	
	SignUpCustomer c;
	public List<SignUpCustomer> mylist = c.getMylist();
	
	
	
	public installation(String email,List <String> productName, int total, String status,String date,String model,String phone,String address)
	{
		this.email=email;
		this.productNames=new ArrayList<String>(productName); ;
		this.totalprice=total;
		this.status=status;
		this.datee=date;
		this.model=model;
		this.phone=phone;
		this.address=address;
		
	}

	
	public static void initdate() {
		date.add(new String("15/12/2023"));
		date.add(new String("16/12/2023"));
		date.add(new String("17/12/2023"));
	
	}
	
	public static void AddDate(String fdate)
	{
		date.add(new String(fdate));
	}
	
	public void RemoveDate() 
	{
		printdate();
		Scanner input3 = new Scanner(System.in);
			System.out.println("Choose number of date you want to remove it: \n");
			int number8 = Integer.parseInt(input3.nextLine());
			date.remove(number8-1);
			printdate();
	}
	
	
	public static void printdate()
	{
		for (int i = 0; i < date.size(); i++)
		{
			int x=i+1;
		System.out.println( x + ". " + date.get(i));
		}
	}
	
	public void printorder()
	{
		System.out.println("Product Name      Price       Quantity        Total Price");
		
		for(int i=0;i<order.size();i++)
		{
			System.out.println(order.get(i).getname()+ "           " + order.get(i).getprices()+ "           "+order.get(i).getquant()+ "       " + order.get(i).getprices() * order.get(i).getquant()   );
			 totalprice+=(order.get(i).getprices() * order.get(i).getquant()) ;
		}
		
		System.out.println("\n Total Price = " +totalprice);
	}
	public void checkinst() {
		
		int flag=0;
		
		for(int i=0;i<order.size();i++)
		{
			if(order.get(i).getavailability() == 0)
			{
				System.out.println(order.get(i).getname() + " is Sold Out , Do you want to conferm order without this product?");
				input = new Scanner(System.in);
				int n= Integer.parseInt(input.nextLine());
				if(n==1)
				{
					order.remove(i);
				}
				else 
				{
					flag=10;
				}
			}
		}
		if(flag == 0)
		{
		int number=0;
		System.out.println("\nPLease Fill this Form\n");
		System.out.println("\nEnter Your Car Model:");
		input = new Scanner(System.in);
	  model = input.nextLine();
		
		System.out.println("\nEnter Your Address :");
		input = new Scanner(System.in);
		address = input.nextLine();
		
		System.out.println("\nEnter Your Phone:");
		input = new Scanner(System.in);
	  phone = input.nextLine();
		
		instflag = installreq();
		while(instflag==1)
		{
			printdate();
			System.out.println("\nEnter Your prefered Date:");
			input = new Scanner(System.in);
			number= Integer.parseInt(input.nextLine());
			if(number <= date.size())
			{
				datee=date.get(number-1);
				instflag=0;
			}
			else 
			{
				System.out.println("\n Choose valid Date:");
			}
		}
	
		productNames.clear();
		//add all products in the order to productNames
		for (int i = 0; i < order.size(); i++)
		{
			productNames.add(order.get(i).getname());
		}
		
		
		
		
		
		//add all things to the history array
		
		
		String status="not arrived";
		int total=totalprice;
		allOrder.add(new installation(email,productNames,total,status,datee,model,phone,address));
		
		order.clear();
		totalprice=0;
		datee="";
//		for (int i = 0; i < allOrder.size(); i++)
//		{
//			System.out.println(allOrder.get(i).getemail());
//			System.out.println(allOrder.get(i).getstatus());
//			System.out.println(allOrder.get(i).gettotalprice());
//			System.out.println(allOrder.get(i).getproductNames());
//		}
//		
		System.out.println("\nSuccessfully Order\n");
		
		 notificationemail notification = new notificationemail("s12028161@stu.najah.edu", "MALAK0593844970", email);
		 notification.sendEmail("Successfully Order","Your order is confirmed ! ..");
		}
	}
	
	
	public int installreq()
	{
		for(int i=0;i<order.size();i++)
		{
			if(order.get(i).getinstall().equals("yes"))
			{
				instflag=1;
				return instflag;
			}
		}
		
		return instflag;
	}
	public void showinstall() {
		int x=0;
		for(int i=0;i<allOrder.size();i++)
		{
		if(allOrder.get(i).getdate().equals(""))
		{
			
		}
		else 
		{
			x=i+1;
			
			System.out.println( x + ". "+ allOrder.get(i).getemail() + "," + allOrder.get(i).getstatus()  + "," + allOrder.get(i).getproductNames()  + "," + allOrder.get(i).getdate()  + "," + allOrder.get(i).getmodel()  + "," + allOrder.get(i).getphone()  + "," + allOrder.get(i).getadd());

			
		}
		}
		
	}
}
