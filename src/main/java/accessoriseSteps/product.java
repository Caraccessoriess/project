package accessoriseSteps;

import java.util.ArrayList;
import java.util.List;

public class product {
	//
	private String name;
	private String descriptions;
	private String image;
	private int prices;
	private String installe;
	private int availability;
	private int quantity;
	
	private static MainApp mn = new MainApp();

	public product(String names, String descriptions,String image, int prices,String installe, int availability) 
	{
	
		this.name = names;
		this.descriptions = descriptions;
		this.image= image;
		this.prices= prices;
		this.installe=installe;
		this.availability=availability;
	}
	
	
	public product(String names,int prices ,String installe,int quantity,int availability) {
		
		this.name = names;
		this.prices= prices;
		this.installe=installe;
		this.quantity=quantity;
		this.availability=availability;
	}
	public product()
	{
		
	}
	
	public String getname() {
		return name;	
	}
	public void setname(String name) {
		this.name = name;		
	}
	
	public String getinstall() {
		return installe;	
	}
	public void setinstall(String installe) {
		this.installe = installe;		
	}
	
	public String getdescription() {
		return descriptions;	
	}
	public void setdescriptions(String descriptions) {
		this.descriptions = descriptions;		
	}
	public String getimage() {
		return image;	
	}
	public void setimage(String image) {
		this.image= image;		
	}
	public int getprices() {
		return prices;	
	}
	public void setprices(int prices) {
		this.prices = prices;		
	}
	public int getavailability() {
		return availability;	
	}
	public void setavailability(int availability) {
		this.availability = availability;		
	}
	
	public int getquant() {
		return quantity;	
	}
	public void setquant(int quant) {
		this.quantity = quant;		
	}
	
	private static int productf=0;
	private static int searchoption=0;
	private static int interf=0;
	private static int mirrorf=0;
	private static int extf=0;
	private static int ledf=0;
	private static int intele=0;
	private static int holderf=0;
	private static int fillf=0;
	private static int donef=0;
	private static int sucesssearchf=0;
	private static int doneshow=0;
	private static int doneshow2=0;
	private static int doneshow3=0;
	

	public int getdoneshow() {
		return doneshow;
		}

	

	public int getdoneshow2() {
		return doneshow2;
		}
	public int getdoneshow3() {
		return doneshow3;
		}

	
	
	public int getsucesssearch() {
		return sucesssearchf;
		}
	
	public void setint(int n) {
	this.interf=n;
	}
	
	public void setmirror(int m) {
		this.mirrorf=m;
	}
	
	public void setfillf(int n) {
		this.fillf=n;
		}
	
	public boolean getflag()
	{
		if( fillf ==1 && donef==1)
			return true;
		else return false;
		
	}
		
		public void setdonef(int m) {
			this.donef=m;
		}
		
	public void setext(int n) {
		this.extf=n;
		}
		
		public void setled(int m) {
			this.ledf=m;
		}
	
	private static final List<product> intprod = new ArrayList<product>();
	private static final List<product> extprod = new ArrayList<product>();
	private static final List<product> elecprod = new ArrayList<product>();
	private static final List<product> order = new ArrayList<product>();
	
	

	
	public static void initproduct() {
		intprod.add(new product("seat belt", "seat", "images/I/71yjddgs.jpg", 50,"no",5));
		intprod.add(new product("cover", "cover inside", "images/I/71ycvbnbdhCGS.jpg", 40,"no",11));
		intprod.add(new product("mirror", "mirror inside", "images/I/15fjddg.jpg",50,"yes",18));
		intprod.add(new product("led", "led inside", "images/I/71yvcbzmGS.jpg", 30,"yes",20));
		
		extprod.add(new product("Fender Flares", "Flares", "images/I/71ycq554fiCGS.jpg", 55,"no",9));
		extprod.add(new product("Grille Guarde", "Guarde", "images/I/71y15kduudCGS.jpg", 45,"yes",7));
		extprod.add(new product("Led", "Led car", "images/I/71yc45djuudGS.jpg", 80,"yes",6));
		extprod.add(new product("Side View Mirror", "Mirror", "images/I/71y02djhdS.jpg",30,"no",12));
		
		elecprod.add(new product("Stereo", "Stereo", "images/I/71ycv7666CGS.jpg", 20,"no",17));
		elecprod.add(new product("Parking sensor", "sensor", "images/I/71ycDBwiCGS.jpg", 70,"yes",19));
		elecprod.add(new product("Compact car charger", "charger", "images/I/71ycsoaoaGS.jpg", 30,"yes",13));
		elecprod.add(new product("Phone holder", "holder", "images/I/7112599S.jpg", 15,"no",20));
		
	}
	
	
	public static void printint()
	{
		for (int i = 0; i < intprod.size(); i++)
		{
			int x=i+1;
		System.out.println( x + ". " + intprod.get(i).name);
		}
		
	}
	
	public static void printext()
	{
		for (int i = 0; i < extprod.size(); i++)
		{
			int x=i+1;
		System.out.println( x + ". " + extprod.get(i).name);
		}
		
	}

	
	public static void printdetails(int n)
	{
		System.out.println("Name:" + intprod.get(n-1).name);
		System.out.println("Description:" + intprod.get(n-1).descriptions);
		System.out.println("Image:" + intprod.get(n-1).image);
		System.out.println("Price:" + intprod.get(n-1).prices + "$");
		if(intprod.get(n-1).availability > 0)
			System.out.println("Available");
		else
			System.out.println("Sold Out");	
		
		doneshow=1;
		
	}
	
	public static void printdetailsext(int n)
	{
		System.out.println("Name:" + extprod.get(n-1).name);
		System.out.println("Description:" + extprod.get(n-1).descriptions);
		System.out.println("Image:" + extprod.get(n-1).image);
		System.out.println("Price:" + extprod.get(n-1).prices + "$");
		if(extprod.get(n-1).availability > 0)
			System.out.println("Available");
		else
			System.out.println("Sold Out");	
		
		doneshow2=1;
	}
	public void setele(int i) {
		// TODO Auto-generated method stub
		this.intele=i;
		
	}
	public void setholder(int i) {
		// TODO Auto-generated method stub
		this.holderf=i;
		
	}

	public void printelec() {
		// TODO Auto-generated method stub
		for (int i = 0; i < elecprod.size(); i++)
		{
			int x=i+1;
		System.out.println( x + ". " + elecprod.get(i).name);
		}
		
	}
	public void printelecdetails(int n) {
		// TODO Auto-generated method stub
		System.out.println("Name:" + elecprod.get(n-1).name);
		System.out.println("Description:" + elecprod.get(n-1).descriptions);
		System.out.println("Image:" + elecprod.get(n-1).image);
		System.out.println("Price:" + elecprod.get(n-1).prices);
		if(elecprod.get(n-1).availability > 0)
			System.out.println("Available");
		else
			System.out.println("Sold Out");	
		
		doneshow3=1;
		
	}
	
	
	public void setproductf(int productf) {
		this.productf = productf;
	}

	public int getproductf() {
		return productf;
	}

	public void chooseint()
	{
		
		
	}
	
	public void addorder(int n,int w)
	{
		if(intprod.get(n-1).availability > 0)
		{
			 order.add(new product(intprod.get(n-1).name,intprod.get(n-1).prices,intprod.get(n-1).installe,w,intprod.get(n-1).availability));
		     System.out.println("\nSuccefully Add");
		     
		}
		else
			System.out.println("\n This Product is Sold Out");
	}
	
	public List<product> getorder() 
	{ 
		return order;
	}
	
	public List<product> getinterior() 
	{ 
		return intprod;
	}
	public List<product> getextrior() 
	{ 
		return extprod;
	}
	public List<product> getelect() 
	{ 
		return elecprod;
	}
	int ordpagef=0;
	int confirmf=0;
	int chcf=0;
	
	public void setordf(int n) {
		this.ordpagef=n;
		}
		
		public void setconf(int m) {
			this.confirmf=m;
		}
		
		public int getchcf()
		{
			return chcf;
		}
	
	public void checkinstalle()
	{
		
		for (int i = 0; i < order.size(); i++)
		{
			System.out.println(order.get(i).name);
			if(order.get(i).installe.equals("yes"))
			{
				chcf=1;
				break;
			}
			else chcf=0;
		}
	}

	public void checknoinstalle() {
		// TODO Auto-generated method stub
		for (int i = 0; i < order.size(); i++)
		{
			System.out.println(order.get(i).name);
			if(order.get(i).installe.equals("no"))
			{
				chcf=1;
				break;
			}
			else chcf=0;
		}
		
	}


	public int search(String name2)
	{
		int i ;
		for ( i = 0; i < intprod.size(); i++)
		{
			if(intprod.get(i).name.equals(name2))
			{
				System.out.println("Name:" + intprod.get(i).name);
				System.out.println("Description:" + intprod.get(i).descriptions);
				System.out.println("Image:" + intprod.get(i).image);
				System.out.println("Price:" + intprod.get(i).prices + "$");
				if(intprod.get(i).availability > 0)
					System.out.println("Available");
				else
					System.out.println("Sold Out");
				sucesssearchf=1;
				break;
			}
			
		}

		for ( i = 0; i < extprod.size(); i++)
		{
			
		}
		for ( i = 0; i < elecprod.size(); i++)
		{
			
		}
		if(sucesssearchf==0)
		{
			System.out.println("NOT FOUND");
		}
		
		return i;
	}


	public void setsearchoption(int i) {
		this.searchoption=i;
		
	}


	public int getfill() {
		// TODO Auto-generated method stub
		return fillf;
	}
	


	
	
	
	
	
	

}
