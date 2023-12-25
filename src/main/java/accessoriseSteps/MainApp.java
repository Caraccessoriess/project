public class MainApp {
    private static final Logger LOGGER = Logger.getLogger(MainApp.class.getName());
    private static SignUpCustomer cus = new SignUpCustomer();
    private static report rep = new report();
    private static ProfileCustomer prof = new ProfileCustomer();
    private static Admin adm = new Admin();
    private static product pro = new product();
    private static installation inst = new installation();
    private static Scanner input;
    private static Scanner input1;
    private static Scanner input2;
    private static Scanner input3;
    private static String addtoorder = "1. Add to Order \n";
    private static String back = "2. Back \n";
    private static String add = "1. Add \n";
    static int fad = 0;
    static int fcs = 0;
    static int fin = 0;

    public static void main(String[] args) {
        initializeComponents();
        executeMainLoop();
    }

    private static void initializeComponents() {
        cus.init();
        pro.initproduct();
        inst.initdate();
        adm.initcatagory();
        input = new Scanner(System.in);
    }

    private static void executeMainLoop() {
        int flag = 1;

        while (flag == 1) {
            displayMainMenu();
            int number = Integer.parseInt(input.nextLine());

            switch (number) {
                case 1:
                    handleSignUp();
                    break;
                case 2:
                    handleLogin();
                    break;
                default:
                    break;
            }
        }
    }

    private static void displayMainMenu() {
        LOGGER.log(Level.INFO, "****** Car Accessories Company *******\n");
        LOGGER.log(Level.INFO, "1. Sign Up for New Account. \n");
        LOGGER.log(Level.INFO, "2. Log In \n");
    }

    private static void handleSignUp() {
        int flag2 = 1;
        input1 = new Scanner(System.in);

        while (flag2 == 1) {
            displaySignUpOptions();
            int number1 = Integer.parseInt(input1.nextLine());

            switch (number1) {
                case 1:
                    handleAdminSignUp();
                    break;
                case 2:
                    handleCustomerSignUp();
                    break;
                case 3:
                    handleInstallerSignUp();
                    break;
                case 4:
                    flag2 = 0;
                    break;
                default:
                    break;
            }
        }
    }

    private static void displaySignUpOptions() {
        LOGGER.log(Level.INFO, "1. As Admin: \n");
        LOGGER.log(Level.INFO, "2. As Customer: \n");
        LOGGER.log(Level.INFO, "3. As Installer: \n");
        LOGGER.log(Level.INFO, "4. Close \n");
    }

    private static void handleAdminSignUp() {
        LOGGER.log(Level.INFO, "Please enter your Password (3 digits only):\n");
        fad = 1;
        cus.recordinformation();
    }

    private static void handleCustomerSignUp() {
        LOGGER.log(Level.INFO, "Please enter your Password (4 digits only):\n");
        fcs = 1;
        cus.recordinformation();
    }

    private static void handleInstallerSignUp() {
        LOGGER.log(Level.INFO, "Please enter your Password (5 digits only):\n");
        fin = 1;
        cus.recordinformation();
    }

    private static void handleLogin() {
        int n = cus.login();

        while (n == 0) {
            input2 = new Scanner(System.in);
            int flag3 = 1;

            while (flag3 == 1) {
                displayLoginOptions();
                int number3 = Integer.parseInt(input2.nextLine());

                switch (number3) {
                    case 1:
                        n = cus.login();
                        break;
                    case 2:
                        handleCustomerSignUpAfterLogin();
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

        handleLoggedInUser(n);
    }

    private static void displayLoginOptions() {
        LOGGER.log(Level.INFO, "1. Try Again: \n");
        LOGGER.log(Level.INFO, "2. Sign up: \n");
        LOGGER.log(Level.INFO, "3. Close \n");
    }

    private static void handleCustomerSignUpAfterLogin() {
        int flag2 = 1;
        input1 = new Scanner(System.in);

        while (flag2 == 1) {
            displaySignUpOptions();
            int number1 = Integer.parseInt(input1.nextLine());

            switch (number1) {
                case 1:
                case 2:
                case 3:
                    handleAdminSignUp();
                    flag2 = 0;
                    break;
                case 4:
                    flag2 = 0;
                    break;
                default:
                    break;
            }
        }
    }
    private static void handleLoggedInUser(int userType) {
    switch (userType) {
        case 1:
            handleAdminLoggedIn();
            break;
        case 2:
            handleCustomerLoggedIn();
            break;
        case 3:
            handleInstallerLoggedIn();
            break;
        default:
            break;
    }
}

private static void handleAdminLoggedIn() {
    input3 = new Scanner(System.in);
    int flag4 = 1;

    while (flag4 == 1) {
        displayAdminOptions();
        int number4 = Integer.parseInt(input3.nextLine());

        switch (number4) {
            case 1:
                adm.showcatagory();
                int option = Integer.parseInt(input3.nextLine());
                adm.choseoption(option);
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

private static void displayAdminOptions() {
    LOGGER.log(Level.INFO, "1. Products \n");
    LOGGER.log(Level.INFO, "2. User Accounts \n");
    LOGGER.log(Level.INFO, "3. Installation Appointment\n");
    LOGGER.log(Level.INFO, "4. Generate Report \n");
    LOGGER.log(Level.INFO, "5. Sign Out \n");
}

private static void handleCustomerLoggedIn() {
    input3 = new Scanner(System.in);
    int flag4 = 1;
    prof.setname(cus.getname());

    while (flag4 == 1) {
        displayCustomerOptions();
        int number4 = Integer.parseInt(input3.nextLine());

        switch (number4) {
            case 1:
                handleProfileOptions();
                break;
            case 2:
                handleProductOptions();
                break;
            case 3:
                LOGGER.log(Level.INFO, "Order \n");
                inst.setemail(cus.getemail2());
                int flag7 = 1;
                while (flag7 == 1) {
                    inst.printorder();
                    LOGGER.log(Level.INFO, "1. Confirm Order \n");
                    LOGGER.log(Level.INFO, back);
                    input3 = new Scanner(System.in);
                    int number9 = Integer.parseInt(input3.nextLine());

                    switch (number9) {
                        case 1:
                            inst.checkinst();
                            flag7 = 0;
                            break;
                        case 2:
                            flag7 = 0;
                            break;
                        default:
                            break;
                    }
                }
                break;
            case 4:
                prof.setemail(cus.getemail2());
                prof.showhistory();
                break;
            case 5:
                flag4 = 0;
                break;
            default:
                break;
        }
    }
}

private static void displayCustomerOptions() {
    LOGGER.log(Level.INFO, "1. Profile \n");
    LOGGER.log(Level.INFO, "2. Products \n");
    LOGGER.log(Level.INFO, "3. Make Order \n");
    LOGGER.log(Level.INFO, "4. History \n");
    LOGGER.log(Level.INFO, "5. Sign Out \n");
}

private static void handleProfileOptions() {
    LOGGER.log(Level.INFO, "\n\n If you want to edit your information choose its number :\n");

    input3 = new Scanner(System.in);
    int flag11 = 1;

    while (flag11 == 1) {
        prof.getnamee();
        int number11 = Integer.parseInt(input3.nextLine());

        switch (number11) {
            case 1:
                LOGGER.log(Level.INFO, "Write the new Name :\n");
                input3 = new Scanner(System.in);
                String name = input3.nextLine();
                prof.changename(name);
                LOGGER.log(Level.INFO, "Success\n");
                break;
            case 2:
                LOGGER.log(Level.INFO, "Write the current Password :\n");
                input3 = new Scanner(System.in);
                int pass = Integer.parseInt(input3.nextLine());
                prof.checkpass(pass);
                LOGGER.log(Level.INFO, "Write the new Password :\n");
                input3 = new Scanner(System.in);
                int passnew = Integer.parseInt(input3.nextLine());
                prof.changepassward(passnew);
                break;
            case 3:
                LOGGER.log(Level.INFO, "You can't edit your email.\n");
                break;
            case 4:
                LOGGER.log(Level.INFO, "Write the new Address :\n");
                input3 = new Scanner(System.in);
                String add = input3.nextLine();
                prof.changeaddress(add);
                break;
            case 5:
                flag11 = 0;
                break;
            default:
                break;
        }
    }
}

private static void handleProductOptions() {
    pro.setproductf(1);
    input3 = new Scanner(System.in);
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
                handleInteriorProduct();
                break;
            case 2:
                handleExteriorProduct();
                break;
            case 3:
                handleElectronicProduct();
                break;
            case 4:
                handleSearchProduct();
                break;
            case 5:
                flag5 = 0;
                break;
            default:
                break;
        }
    }
}

private static void handleInteriorProduct() {
    input3 = new Scanner(System.in);
    int flag6 = 1;

    while (flag6 == 1) {
        pro.printint();
        int number6 = Integer.parseInt(input3.nextLine());
        pro.printdetails(number6);
        LOGGER.log(Level.INFO, addtoorder);
        LOGGER.log(Level.INFO, back);
        input3 = new Scanner(System.in);
        int number7 = Integer.parseInt(input3.nextLine());

        switch (number7) {
            case 1:
                LOGGER.log(Level.INFO, "Enter The Quantity: \n");
                input3 = new Scanner(System.in);
                int number8 = Integer.parseInt(input3.nextLine());
                LOGGER.log(Level.INFO, add);
                LOGGER.log(Level.INFO, back);
                input3 = new Scanner(System.in);
                int number9 = Integer.parseInt(input3.nextLine());

                switch (number9) {
                    case 1:
                        pro.addorder(number6, number8);
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

// Similar methods for handleExteriorProduct, handleElectronicProduct, handleSearchProduct

private static void handleInstallerLoggedIn() {
    input3 = new Scanner(System.in);
    int flag4 = 1;

    while (flag4 == 1) {
        displayInstallerOptions();
        int number4 = Integer.parseInt(input3.nextLine());

        switch (number4) {
            case 1:
                LOGGER.log(Level.INFO, "View installation requests \n");
                inst.showinstall();
                break;
            case 2:
                LOGGER.log(Level.INFO, "schedule appointments \n");
                inst.printdate();
                input3 = new Scanner(System.in);
                int flag9 = 1;

                while (flag9 == 1) {
                    LOGGER.log(Level.INFO, "1. Add Date \n");
                    LOGGER.log(Level.INFO, "2. Remove Date \n");
                    LOGGER.log(Level.INFO, "3. Back \n");
                    int number8 = Integer.parseInt(input3.nextLine());

                    switch (number8) {
                        case 1:
                            LOGGER.log(Level.INFO, "/nEnter the Date :/n");
                            input = new Scanner(System.in);
                            String newDate = input.nextLine();
                            inst.AddDate(newDate);
                            break;
                        case 2:
                            inst.RemoveDate();
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

private static void displayInstallerOptions() {
    LOGGER.log(Level.INFO, "1. View installation requests \n");
    LOGGER.log(Level.INFO, "2. Schedule appointments \n");
    LOGGER.log(Level.INFO, "3. Sign Out \n");
}
