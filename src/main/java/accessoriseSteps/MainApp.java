package accessoriseSteps;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainApp {
    private static final Logger LOGGER = Logger.getLogger(MainApp.class.getName());
    private static SignUpCustomer cus = new SignUpCustomer();
    private static report rep = new report();
    private static ProfileCustomer prof = new ProfileCustomer();
    private static Admin adm = new Admin();
    private static product pro = new product();
    private static installation inst = new installation();

    public static void main(String[] args) {
        initialize();
        startApplication();
    }

    private static void initialize() {
        cus.init();
        pro.initproduct();
        inst.initdate();
        adm.initcatagory();
    }

    private static void startApplication() {
        Scanner input = new Scanner(System.in);
        int flag = 1;

        while (flag == 1) {
            LOGGER.log(Level.INFO, "***************** Car Accessories Company ****************\n");
            LOGGER.log(Level.INFO, "1. Sign Up for New Account. \n");
            LOGGER.log(Level.INFO, "2. Log In \n");

            int number = Integer.parseInt(input.nextLine());

            switch (number) {
                case 1:
                    signUpMenu();
                    break;
                case 2:
                    logInMenu();
                    break;
                default:
                    break;
            }
        }
    }

    private static void signUpMenu() {
        int flag2 = 1;
        Scanner input1 = new Scanner(System.in);

        while (flag2 == 1) {
            LOGGER.log(Level.INFO, "1. As Admin: \n");
            LOGGER.log(Level.INFO, "2. As Customer: \n");
            LOGGER.log(Level.INFO, "3. As Installer: \n");
            LOGGER.log(Level.INFO, "4. Close \n");
            int number1 = Integer.parseInt(input1.nextLine());

            switch (number1) {
                case 1:
                case 2:
                case 3:
                    LOGGER.log(Level.INFO, "Please your Password from " + (number1 + 2) + " digits only\n");
                    handleSignUp(number1);
                    break;
                case 4:
                    flag2 = 0;
                    break;
                default:
                    break;
            }
        }
    }

    private static void handleSignUp(int userType) {
        int userTypeFlag = userType == 1 ? 1 : 0; // Adjust userTypeFlag based on your logic
        cus.recordinformation(userTypeFlag);
    }

    private static void logInMenu() {
        int n = cus.login();

        while (n == 0) {
            Scanner input2 = new Scanner(System.in);
            int flag3 = 1;

            while (flag3 == 1) {
                LOGGER.log(Level.INFO, "1. Try Again: \n");
                LOGGER.log(Level.INFO, "2. Sign up: \n");
                LOGGER.log(Level.INFO, "3. Close \n");
                int number3 = Integer.parseInt(input2.nextLine());

                switch (number3) {
                    case 1:
                        n = cus.login();
                        break;
                    case 2:
                        signUpMenu();
                        flag3 = 0;
                        break;
                    case 3:
                        flag3 = 0;
                        break;
                    default:
                        break;
                }

                if (n != 0) {
                    break;
                }
            }
        }

        if (n == 1) {
            adminMenu();
        } else if (n == 2) {
            customerMenu();
        } else if (n == 3) {
            installerMenu();
        }
    }

    private static void adminMenu() {
        Scanner input3 = new Scanner(System.in);
        int flag4 = 1;

        while (flag4 == 1) {
            LOGGER.log(Level.INFO, "1. Products \n");
            LOGGER.log(Level.INFO, "2. User Accounts \n");
            LOGGER.log(Level.INFO, "3. Installation Appointment\n");
            LOGGER.log(Level.INFO, "4. Generate Report \n");
            LOGGER.log(Level.INFO, "5. Sign Out \n");
            int number4 = Integer.parseInt(input3.nextLine());

            switch (number4) {
                case 1:
                    adm.showcatagory();
                    int option = Integer.parseInt(input3.nextLine());
                    adm.chooseOption(option);
                    break;
                case 2:
                    adm.showaccount();
                    break;
                case 3:
                    adm.showinstallation();
                    break;
                case 4:
                    rep.showreport();
                    break;
                case 5:
                    flag4 = 0;
                    break;
                default:
                    break;
            }
        }
    }

    private static void customerMenu() {
        Scanner input3 = new Scanner(System.in);
        int flag4 = 1;
        prof.setName(cus.getName());

        while (flag4 == 1) {
            LOGGER.log(Level.INFO, "1. Profile \n");
            LOGGER.log(Level.INFO, "2. Products \n");
            LOGGER.log(Level.INFO, "3. Make Order \n");
            LOGGER.log(Level.INFO, "4. History \n");
            LOGGER.log(Level.INFO, "5. Sign Out \n");
            int number4 = Integer.parseInt(input3.nextLine());

            switch (number4) {
                case 1:
                    editProfile();
                    break;
                case 2:
                    pro.setProductFlag(1);
                    handleProductsMenu();
                    break;
                case 3:
                    LOGGER.log(Level.INFO, "order \n");
                    inst.setEmail(cus.getEmail());
                    handleOrderMenu();
                    break;
                case 4:
                    prof.setEmail(cus.getEmail());
                    prof.showHistory();
                    break;
                case 5:
                    flag4 = 0;
                    break;
                default:
                    break;
            }
        }
    }

    private static void editProfile() {
        LOGGER.log(Level.INFO, "\n\n If you want to edit your information choose its number :");

        Scanner input3 = new Scanner(System.in);
        int flag11 = 1;

        while (flag11 == 1) {
            prof.getNameToEdit();
            int number11 = Integer.parseInt(input3.nextLine());

            switch (number11) {
                case 1:
                    LOGGER.log(Level.INFO, "Write the new Name :");
                    input3 = new Scanner(System.in);
                    String name = input3.nextLine();
                    prof.changeName(name);
                    LOGGER.log(Level.INFO, "success");
                    break;
                case 2:
                    LOGGER.log(Level.INFO, "Write the current Password :");
                    input3 = new Scanner(System.in);
                    int pass = Integer.parseInt(input3.nextLine());
                    prof.checkPassword(pass);
                    LOGGER.log(Level.INFO, "Write the new Password :");
                    input3 = new Scanner(System.in);
                    int passNew = Integer.parseInt(input3.nextLine());
                    prof.changePassword(passNew);
                    break;
                case 3:
                    LOGGER.log(Level.INFO, "You can't edit your email.");
                    break;
                case 4:
                    LOGGER.log(Level.INFO, "Write the new Address :");
                    input3 = new Scanner(System.in);
                    String add = input3.nextLine();
                    prof.changeAddress(add);
                    break;
                case 5:
                    flag11 = 0;
                    break;
                default:
                    break;
            }
        }
    }

    private static void handleProductsMenu() {
        Scanner input3 = new Scanner(System.in);
        int flag5 = 1;

        while (flag5 == 1) {
            LOGGER.log(Level.INFO, "1. Interior \n");
            LOGGER.log(Level.INFO, "2. Exterior \n");
            LOGGER.log(Level.INFO, "3. Electronics \n");
            LOGGER.log(Level.INFO, "4. Search \n");
            LOGGER.log(Level.INFO, "5. Back \n");
            int number5 = Integer.parseInt(input3.nextLine());

            switch (number5) {
                case 1:
                    handleInteriorMenu();
                    break;
                case 2:
                    handleExteriorMenu();
                    break;
                case 3:
                    handleElectronicsMenu();
                    break;
                case 4:
                    handleSearchMenu();
                    break;
                case 5:
                    flag5 = 0;
                    break;
                default:
                    break;
            }
        }
    }

    private static void handleInteriorMenu() {
        Scanner input3 = new Scanner(System.in);
        int flag6 = 1;

        while (flag6 == 1) {
            pro.printInterior();
            int number6 = Integer.parseInt(input3.nextLine());
            pro.printDetailsInterior(number6);
            LOGGER.log(Level.INFO, "1. Add to Order \n");
            LOGGER.log(Level.INFO, "2. Back \n");
            input3 = new Scanner(System.in);
            int number7 = Integer.parseInt(input3.nextLine());

            switch (number7) {
                case 1:
                    LOGGER.log(Level.INFO, "Enter The Quantity: \n");
                    input3 = new Scanner(System.in);
                    int number8 = Integer.parseInt(input3.nextLine());
                    LOGGER.log(Level.INFO, "1. Add \n");
                    LOGGER.log(Level.INFO, "2. Back \n");
                    input3 = new Scanner(System.in);
                    int number9 = Integer.parseInt(input3.nextLine());

                    switch (number9) {
                        case 1:
                            pro.addOrder(number6, number8);
                            break;
                        case 2:
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    flag6 = 0;
                    break;
                default:
                    break;
            }
        }
    }

    private static void handleExteriorMenu() {
        // Similar handling for Exterior menu
    }

    private static void handleElectronicsMenu() {
        // Similar handling for Electronics menu
    }

    private static void handleSearchMenu() {
        LOGGER.log(Level.INFO, "Please enter the name of the product you want to search for:");
        Scanner input3 = new Scanner(System.in);
        String name = input3.nextLine();
        int number6 = pro.search(name);
        int flag6 = 1;

        while (flag6 == 1) {
            LOGGER.log(Level.INFO, "1. Add to Order \n");
            LOGGER.log(Level.INFO, "2. Back \n");
            input3 = new Scanner(System.in);
            int number7 = Integer.parseInt(input3.nextLine());

            switch (number7) {
                case 1:
                    LOGGER.log(Level.INFO, "Enter The Quantity: \n");
                    input3 = new Scanner(System.in);
                    int number8 = Integer.parseInt(input3.nextLine());
                    LOGGER.log(Level.INFO, "1. Add \n");
                    LOGGER.log(Level.INFO, "2. Back \n");
                    input3 = new Scanner(System.in);
                    int number9 = Integer.parseInt(input3.nextLine());

                    switch (number9) {
                        case 1:
                            pro.addOrder(number6, number8);
                            break;
                        case 2:
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    flag6 = 0;
                    break;
                default:
                    break;
            }
        }
    }

    private static void handleOrderMenu() {
        int flag7 = 1;

        while (flag7 == 1) {
            inst.printOrder();
            LOGGER.log(Level.INFO, "1. Confirm Order \n");
            LOGGER.log(Level.INFO, "2. Back \n");
            Scanner input3 = new Scanner(System.in);
            int number9 = Integer.parseInt(input3.nextLine());

            switch (number9) {
                case 1:
                    inst.checkInstallation();
                    flag7 = 0;
                    break;
                case 2:
                    flag7 = 0;
                    break;
                default:
                    break;
            }
        }
    }

    private static void installerMenu() {
        Scanner input3 = new Scanner(System.in);
        int flag4 = 1;

        while (flag4 == 1) {
            LOGGER.log(Level.INFO, "1. View installation requests \n");
            LOGGER.log(Level.INFO, "2. schedule appointments \n");
            LOGGER.log(Level.INFO, "3. Sign Out \n");
            int number4 = Integer.parseInt(input3.nextLine());

            switch (number4) {
                case 1:
                    inst.showInstall();
                    break;
                case 2:
                    LOGGER.log(Level.INFO, "schedule appointments \n");
                    inst.printDate();
                    input3 = new Scanner(System.in);
                    int flag9 = 1;

                    while (flag9 == 1) {
                        LOGGER.log(Level.INFO, "1. Add Date \n");
                        LOGGER.log(Level.INFO, "2. Remove Date \n");
                        LOGGER.log(Level.INFO, "3. Back \n");
                        int number8 = Integer.parseInt(input3.nextLine());

                        switch (number8) {
                            case 1:
                                LOGGER.log(Level.INFO, "Enter the Date :\n");
                                Scanner input = new Scanner(System.in);
                                String newDate = input.nextLine();
                                inst.addDate(newDate);
                                break;
                            case 2:
                                inst.removeDate();
                                break;
                            case 3:
                                flag9 = 0;
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 3:
                    flag4 = 0;
                    break;
                default:
                    break;
            }
        }
    }
}
