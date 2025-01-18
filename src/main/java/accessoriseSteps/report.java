package accessoriseSteps;

import java.util.List;

import java.util.logging.Level;
import java.util.logging.Logger;
public class report {
	//
	private static final Logger LOGGER = Logger.getLogger(report.class.getName());
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
		
		LOGGER.log(Level.INFO," ----------------- Car Accessories Application ---------------------");
		
		LOGGER.log(Level.INFO,"\nUSERS INFORMATION");
		LOGGER.log(Level.INFO,"- Total number of user in Application =" + countuser);
		LOGGER.log(Level.INFO,"- Total number of Admin in Application =" + countadmin);
		LOGGER.log(Level.INFO,"- Total number of Customer in Application =" + countcustomer);
		LOGGER.log(Level.INFO,"- Total number of installer in Application =" + countinstaller);
		
		LOGGER.log(Level.INFO,"\nPRODUCT");
		LOGGER.log(Level.INFO,"- Total number of Catagories in Application =" + countcatagory);
		LOGGER.log(Level.INFO,"- Total number of Product in Application =" + countproduct);
		LOGGER.log(Level.INFO,"- Total number of Interior Product in Application =" + countent);
		LOGGER.log(Level.INFO,"- Total number of Exterior Product in Application =" + countext);
		LOGGER.log(Level.INFO,"- Total number of Electronic Product in Application =" + countelect);
		
		LOGGER.log(Level.INFO,"\nORDER");
		LOGGER.log(Level.INFO,"- Total number of Order in Application =" + Order);
		
		LOGGER.log(Level.INFO," -------------------------------------------------------------------");
		reportsucess=1;
	
		}

    
		
	}


