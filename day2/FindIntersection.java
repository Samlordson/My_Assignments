package week1.day2;

public class FindIntersection {
	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		int[] arr = {1,2,8,4,9,7};
		
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(data[i]==arr[j]) {
					System.out.println(data[i]);
				}
		
			}
			
		}
		
		
	}

}
