package accessoriseSteps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;

import accessoriseSteps.SignUpCustomer;

public class SignUpCustomer {
	private int pass;//
	private String name;
	private String email;
	private String address;
	private static MainApp mn = new MainApp();

	public SignUpCustomer(String names, int pass, String email, String addres) {
		this.pass = pass;
		this.name = names;
		this.email = email;
		this.address = addres;

	}

	public SignUpCustomer(String name, int pas) {
		this.pass = pas;
		this.name = name;

	}

	private static int x;
	private static int adminflag = 0;
	private static int customerflag = 0;
	private static int installerflag = 0;
	private static int notfoundflag = 0;

	public int getx() {
		return x;
	}

	public static void setx(int x) {
		SignUpCustomer.x = x;
	}

	public int getadminf() {
		return adminflag;
	}

	public int getcustomerf() {
		return customerflag;
	}

	public int getinstallerf() {
		return installerflag;
	}

	public int getnotfoundf() {
		return notfoundflag;
	}

	public SignUpCustomer() {
	}

	public int getpass() {
		return pass;
	}

	public void setpass(int pass) {
		this.pass = pass;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getemail() {
		return email;
	}

	public void setemail(String email) {
		this.email = email;
	}

	public String getaddress() {
		return address;
	}

	public void setaddress(String address) {
		this.address = address;
	}

	private static final List<SignUpCustomer> mylist = new ArrayList<SignUpCustomer>();

	public static void init() {
		mylist.add(new SignUpCustomer("malak jawabreh", 123, "malak@gmail.com", "nablus"));
		mylist.add(new SignUpCustomer("Deema Hamoudeh", 12345, "demahamoudeh200@gmail.com", "nablus"));
		mylist.add(new SignUpCustomer("noor omar", 1234, "s12027933@stu.najah.edu", "Jenin"));
	}

	public static List<SignUpCustomer> getMylist() {
		return mylist;
	}

	

	public void authintication() {
 
		
		for (int i = 0; i < mylist.size(); i++) {

			if (mylist.get(i).name.equals(this.name) && mylist.get(i).pass == this.pass) {
				x = 1;

				String passString = Integer.toString(pass);

				if (passString.length() == 3) {
					adminflag = 1;
					customerflag = 0;
					installerflag = 0;
					notfoundflag = 0;
					
					break;

				} else if (passString.length() == 4) {
					customerflag = 1;
					adminflag = 0;
					
					installerflag = 0;
					notfoundflag = 0;
					
					break;
				} else if (passString.length() == 5) {
					installerflag = 1;
					adminflag = 0;
					customerflag = 0;
				
					notfoundflag = 0;
					
					break;
				} else
				{
					notfoundflag = 1;
				adminflag = 0;
				customerflag = 0;
				installerflag = 0;
				
				break;
				}
				
			}
			 else
			 {
				notfoundflag = 1;
			adminflag = 0;
			customerflag = 0;
			installerflag = 0;
			
			 }
			

		}

	}
	
	public void authintication2() {

		for (int i = 0; i < mylist.size(); i++) {

			if (mylist.get(i).name.equals(this.name) && mylist.get(i).pass == this.pass && mylist.get(i).address.equals(this.address) && mylist.get(i).email.equals(this.email)) {
				x = 1;

				String passString = Integer.toString(pass);

				if (passString.length() == 3) {
					adminflag = 1;

				} else if (passString.length() == 4) {
					customerflag = 1;
				} else if (passString.length() == 5) {
					installerflag = 1;
				} else
					notfoundflag = 1;

			} else
				notfoundflag = 1;

		}

	}

	private static Scanner input1;

	
	
	public String getemail2() {
		
		
		 for (int i = 0; i < mylist.size(); i++)
		 {
			 if(mylist.get(i).getname().equals(this.name))
			 {
				 this.pass=mylist.get(i).getpass();
				 this.email=mylist.get(i).getemail();
				 this.address=mylist.get(i).getaddress();
			 }
		 }
		 
		
			
		return this.email;
	}
	
	

}
