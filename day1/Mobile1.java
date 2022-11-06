package week1.day1;

public class Mobile1 {
	
	char mobileLogo='O';
	int modelNumber = 10;
	short noofmobilepiece=34;
	long mobileimeinumber=10111123456789L;
	boolean isdamaged=false;
    float mobilePrice=39999.99f;
    String mobileBrandName ="OnePlus";
	public static void main(String[] args) {
		
	Mobile1 myM=new Mobile1 ();
	     System.out.println(myM.mobileBrandName);
	     System.out.println(myM.mobileimeinumber);
	     System.out.println(myM.isdamaged);
	     System.out.println(myM.noofmobilepiece);
	     System.out.println(myM.mobileLogo);
	     System.out.println(myM.mobilePrice);

}

}