package accessoriseSteps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import accessoriseSteps.SignUpCustomer;

public class MainApp 
{//
	private static SignUpCustomer cus = new SignUpCustomer();
	private static report rep = new report();
	private static ProfileCustomer prof=new ProfileCustomer();
	private static Admin adm=new Admin();
	private static product pro = new product();
	private static installation inst = new installation();
	static ArrayList<SignUpCustomer> mylist;
	private static Scanner input;
	private static Scanner input1;
	private static Scanner input2;
	private static Scanner input3;
	static int fad = 0;
	static int fcs = 0;
	static int fin = 0;
	
	public static void main(String[] args) {
		cus.init();
		pro.initproduct();
		inst.initdate();
		adm.initcatagory();
		input = new Scanner(System.in);
		int flag = 1;

		while (flag == 1) 
		{
			System.out.println("***************** Car Accessories Company ****************\n");
			System.out.println("1. Sign Up for New Account. \n");
			System.out.println("2. Log In \n");

			int number = Integer.parseInt(input.nextLine());
			switch (number) {
			case 1: {
				int flag2 = 1;
				input1 = new Scanner(System.in);
				while (flag2 == 1) {
					System.out.println("1. As Admin: \n");
					System.out.println("2. As Customer: \n");
					System.out.println("3. As Installer: \n");
					System.out.println("4. Close \n");
					int number1 = Integer.parseInt(input1.nextLine());
					switch (number1) {
					case 1: {
						System.out.println("Please your Password from 3 digit only\n");
						fad = 1;
						cus.recordinformation();
						break;
					}
					case 2: {
						System.out.println("Please your Password from 4 digit only\n");
						fcs = 1;
						cus.recordinformation();
						break;
					}
					case 3: {
						System.out.println("Please your Password from 5 digit only\n");
						fin = 1;
						cus.recordinformation();
						break;

					}
					case 4: {
						flag2 = 0;
						break;
					}
					}
				}
				break;
			}

			case 2: {

				int n = cus.login();
				// incorrect log in
				while (n == 0) {
					input2 = new Scanner(System.in);
					int flag3 = 1;
					while (flag3 == 1)
					{
						System.out.println("1. Try Again: \n");
						System.out.println("2. Sign up: \n");
						System.out.println("3. Close \n");
						int number3 = Integer.parseInt(input2.nextLine());
						switch (number3) {
						case 1: 
						{
							n = cus.login();
							break;
						}
						case 2: 
						{
								int flag2 = 1;
								input1 = new Scanner(System.in);
								while (flag2 == 1) {
									System.out.println("1. As Admin: \n");
									System.out.println("2. As Customer: \n");
									System.out.println("3. As Installer: \n");
									System.out.println("4. Close \n");
									int number1 = Integer.parseInt(input1.nextLine());
									switch (number1) {
									case 1: {
										System.out.println("Please your Password from 3 digit only\n");
										fad = 1;
										cus.recordinformation();
										break;
									}
									case 2: {
										System.out.println("Please your Password from 4 digit only\n");
										fcs = 1;
										cus.recordinformation();
										break;
									}
									case 3: {
										System.out.println("Please your Password from 5 digit only\n");
										fin = 1;
										cus.recordinformation();
										break;

									}
									case 4: {
										flag2 = 0;
										break;
									}
									}
								}
								flag3=0;
								break;
							}

						case 3: {
							flag3 = 0;
							break;
						}

						}
						if(n!=0)
						{
							break;
						}
					}
				}
				
				
				// Admin
				 if (n == 1) {
					input3 = new Scanner(System.in);
					int flag4 = 1;
					while (flag4 == 1) {
						System.out.println("1. Products \n");
						System.out.println("2. User Accounts \n");
						System.out.println("3. Installation Appointment\n");
						System.out.println("4. Generate Report \n");
						System.out.println("5. Sign Out \n");
						int number4 = Integer.parseInt(input3.nextLine());
						switch (number4) {
						case 1: {
							
							adm.showcatagory();
							int option = Integer.parseInt(input3.nextLine());
							adm.choseoption(option);
							break;
							
						}
						case 2: {
							adm.showaccount();
							break;
						}

						case 3: {
							adm.showinstallation();
							break;
						}
						
						case 4: {
							rep.showreport();
							break;
						}
						case 5: {
							flag4 = 0;
							break;
						}

						}

					}
					break;
				}

				// Customers
				else if (n == 2) {
					input3 = new Scanner(System.in);
					int flag4 = 1;
					prof.setname(cus.getname());
					while (flag4 == 1) {
						System.out.println("1. Profile \n");
						System.out.println("2. Products \n");
						System.out.println("3. Make Order \n");
						System.out.println("4. History \n");
						System.out.println("5. Sign Out \n");
						int number4 = Integer.parseInt(input3.nextLine());
						
						switch (number4) {
						case 1: {
							System.out.println("\n\n If you want to edit your information choose its number :");
							
							 input3 = new Scanner(System.in);
							int flag11 = 1;
							while (flag11 == 1) {
								prof.getnamee();
								int number11 = Integer.parseInt(input3.nextLine());
								switch (number11) {
								case 1:
								{
									   System.out.println("Write the new Name :");
									  input3 = new Scanner(System.in);
									String name = input3.nextLine();
									prof.changename(name); 
									 System.out.println("sucess");
									break;
								}
								case 2:
								{
									  System.out.println("Write the current Passward :");
									   input3 = new Scanner(System.in);
									   int pass = Integer.parseInt(input3.nextLine());
									   prof.checkpass(pass);
									   System.out.println("Write the new Passward :");
									  input3 = new Scanner(System.in);
									   int passnew = Integer.parseInt(input3.nextLine());
									   prof.changepassward(passnew);
									break;
								}
								case 3:
								{
									
									  System.out.println("You can't edit your email.");
									  break;
								}
								case 4:
								{
									 System.out.println("Write the new Address :");
									   input3 = new Scanner(System.in);
									String add = input3.nextLine();
									prof.changeaddress(add);   
									break;
								}
								case 5:
								{
									flag11=0;
									break;
								}
								}
							}
							break;
						}
						case 2: {
							pro.setproductf(1);
							input3 = new Scanner(System.in);
							int flag5 = 1;
							while (flag5 == 1) {
								System.out.println("1. Interior \n");
								System.out.println("2. Exterior \n");
								System.out.println("3. Electronics \n");
								System.out.println("4. Search \n");
								System.out.println("5. Back \n");
								int number5 = Integer.parseInt(input3.nextLine());
								switch (number5) {
								case 1: {

									input3 = new Scanner(System.in);
									int flag6 = 1;
									while (flag6 == 1) {
										pro.printint();
										int number6 = Integer.parseInt(input3.nextLine());
										pro.printdetails(number6);
										System.out.println("1. Add to Order \n");
										System.out.println("2. Back \n");
										input3 = new Scanner(System.in);
										int number7 = Integer.parseInt(input3.nextLine());
										switch (number7) {
										case 1: {
											System.out.println("Enter The Quantity: \n");
											input3 = new Scanner(System.in);
											int number8 = Integer.parseInt(input3.nextLine());
											System.out.println("1. Add \n");
											System.out.println("2. Back \n");
											input3 = new Scanner(System.in);
											int number9 = Integer.parseInt(input3.nextLine());
											switch (number9) {
											case 1: {
												pro.addorder(number6, number8);
											}
											case 2: {
												break;
											}
											}
										}
										case 2: {
											flag6 = 0;
											break;
										}
										}
									}
									break;
								}
								case 2: {
									input3 = new Scanner(System.in);
									int flag6 = 1;
									while (flag6 == 1) {
										pro.printext();
										int number6 = Integer.parseInt(input3.nextLine());
										pro.printdetailsext(number6);
										System.out.println("1. Add to Order \n");
										System.out.println("2. Back \n");
										input3 = new Scanner(System.in);
										int number7 = Integer.parseInt(input3.nextLine());
										switch (number7) {
										case 1: {

										}
										case 2: {
											flag6 = 0;
											break;
										}
										}

									}

									break;

								}
								case 3: {
//electronic

									input3 = new Scanner(System.in);
									int flag7 = 1;
									while (flag7 == 1) {
										pro.printelec();
										int number8 = Integer.parseInt(input3.nextLine());
										pro.printelecdetails(number8);
										System.out.println("1. Add to Order \n");
										System.out.println("2. Back \n");
										input3 = new Scanner(System.in);
										int number9 = Integer.parseInt(input3.nextLine());

										switch (number9) {
										case 1: {

										}
										case 2: {
											flag7 = 0;
											break;
										}
										}

									}

									break;

								}
								case 4: {
									//search
									System.out.println("Please enter the name of the product you want to search for:");
								    String name = input3.nextLine();
								    int number6=pro.search(name);
									int flag6 = 1;
									while (flag6 == 1) {
										System.out.println("1. Add to Order \n");
										System.out.println("2. Back \n");
										input3 = new Scanner(System.in);
										int number7 = Integer.parseInt(input3.nextLine());
										switch (number7) {
										case 1: {
											System.out.println("Enter The Quantity: \n");
											input3 = new Scanner(System.in);
											int number8 = Integer.parseInt(input3.nextLine());
											System.out.println("1. Add \n");
											System.out.println("2. Back \n");
											input3 = new Scanner(System.in);
											int number9 = Integer.parseInt(input3.nextLine());
											switch (number9) {
											case 1: {
												pro.addorder(number6, number8);
											}
											case 2: {
												break;
											}

											}

										}
										case 2: {
											flag6 = 0;
											break;
										}
										}

									}
								    
								    
								    
								    
								    
									break;
								}
								case 5: {
									flag5 = 0;
									break;
								}

								}
							}
							break;

						}

						case 3: {
							System.out.println("order \n");
						
							inst.setemail(cus.getemail2());
							int flag7 = 1;
							while (flag7 == 1) {
								inst.printorder();
								System.out.println("1. Confirm Order \n");
								System.out.println("2. Back \n");
								input3 = new Scanner(System.in);
								int number9 = Integer.parseInt(input3.nextLine());

								switch (number9) {
								case 1: {
                                  
									inst.checkinst();
									flag7 = 0;
									break;
								}
								case 2: {
									flag7 = 0;
									break;
								}
								}

							}

							break;

						}
						case 4: {
							prof.setemail(cus.getemail2());
						
							prof.showhistory();
							break;

						}
						case 5: {
							flag4 = 0;
							break;
						}

						}

					}
					break;
				}

				// Installer
				else if (n == 3) {
					input3 = new Scanner(System.in);
					int flag4 = 1;
					while (flag4 == 1) {
						System.out.println("1. View installation requests \n");
						System.out.println("2. schedule appointments \n");
						System.out.println("3. Sign Out \n");
						int number4 = Integer.parseInt(input3.nextLine());
						switch (number4) {
						case 1: 
						{
							System.out.println("View installation requests \n");
							inst.showinstall();
							break;
						}
						case 2: 
						{
							System.out.println("schedule appointments \n");
							inst.printdate();
							input3 = new Scanner(System.in);
							int flag9 = 1;
							while (flag9 == 1) {
								System.out.println("1. Add Date \n");
								System.out.println("2. Remove Date \n");
								System.out.println("3. Back \n");
								int number8 = Integer.parseInt(input3.nextLine());
								switch (number8) {
								case 1 :
								{
									System.out.println("/nEnter the Date :/n");
									input = new Scanner(System.in);
									String newDate = input.nextLine();
									inst.AddDate(newDate);
									break;
								}
								case 2:
								{
									inst.RemoveDate();
									break;
								}
								case 3:
								{
									flag9=0;
									break;
								}
								
								}
							
							
						
						}
						}
						case 3: {
							flag4 = 0;
							break;
						}
						}
					}
					break;
				}
			}
			default:
			}
		}
	}
}
