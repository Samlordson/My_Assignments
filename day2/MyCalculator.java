package week1.day2;

public class MyCalculator {
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		int add1=cal.add(40, 50, 60);
		int sub2=cal.sub(45, 30);
		double mul3=cal.mul(35.56,43.43 );
		float divide4= cal.divide(10.345f,45.567f );
	    System.out.println(add1);
	    System.out.println(sub2);
	    System.out.println(mul3);
	    System.out.println(divide4);
	    
	    
		
	}

}
