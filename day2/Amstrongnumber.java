package week1.day2;

public class Amstrongnumber {
	public static void main(String[] args) {
		int n=153;
		int calculated=0,remainder;
	    int orginal=n;
		while(n>0) {
			remainder=n%10;
			n=n/10;
			calculated=calculated+remainder*remainder*remainder;
			
		}
		if(calculated==orginal) {
			System.out.println(orginal+" is an Amstrong Number");
		}
	}

}
