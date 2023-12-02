package accessoriseSteps;

import java.util.List;

public class report {
	
	SignUpCustomer c;
	Admin adm=new Admin();
	public List<SignUpCustomer> mylist = c.getMylist();
	product p=new product();
	List <product>interior = p.getinterior();
	List <product>exterior = p.getextrior();
	List <product>elect = p.getelect();
	List <String>catag = adm.getcatg();
	installation inst=new installation();
	List<installation> allOrder = inst.getallOrder();
	
	int countuser=0;
	int countadmin=0;
	int countinstaller=0;
	int countcustomer=0;
	
	int countproduct=0;
	int countcatagory=0;
	int countent=0;
	int countext=0;
	int countelect=0;
	int reportsucess=0;
	public int getreport()
	{
		return reportsucess;
	}
	int Order=0;
	public report() {
		
	}

	public void showreport() {
		
		for(int i=0;i<mylist.size();i++)
		{
			countuser++;
			int pass=mylist.get(i).getpass();
			String passString = Integer.toString(pass);

			if (passString.length() == 3) {
				countadmin++;

			} 
			else if (passString.length() == 4) {
				countcustomer++;
			} else if (passString.length() == 5) {
				countinstaller++;
			} 

		}
		for(int i=0;i<catag.size();i++)
		{
			countcatagory++;

		}
		
		for(int i=0;i<interior.size();i++)
		{
			countproduct++;
			countent++;

		}
		for(int i=0;i<exterior.size();i++)
		{
			countproduct++;
			countext++;

		}
		for(int i=0;i<elect.size();i++)
		{
			countproduct++;
			countelect++;
		}
		for(int i=0;i<allOrder.size();i++)
		{
			Order++;
		}
		
		System.out.println(" ----------------- Car Accessories Application ---------------------");
		
		System.out.println("\nUSERS INFORMATION");
		System.out.println("- Total number of user in Application =" + countuser);
		System.out.println("- Total number of Admin in Application =" + countadmin);
		System.out.println("- Total number of Customer in Application =" + countcustomer);
		System.out.println("- Total number of installer in Application =" + countinstaller);
		
		System.out.println("\nPRODUCT");
		System.out.println("- Total number of Catagories in Application =" + countcatagory);
		System.out.println("- Total number of Product in Application =" + countproduct);
		System.out.println("- Total number of Interior Product in Application =" + countent);
		System.out.println("- Total number of Exterior Product in Application =" + countext);
		System.out.println("- Total number of Electronic Product in Application =" + countelect);
		
		System.out.println("\nORDER");
		System.out.println("- Total number of Order in Application =" + Order);
		
		System.out.println(" -------------------------------------------------------------------");
		reportsucess=1;
	
		}

    
		
	}


