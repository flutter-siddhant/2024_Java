package Array;

public class array4 {

	public static void main(String args []) {
		
		int count = 0;
		int numArr [] = {12,13,14,15,16};
		
		for(int i=0;i<numArr.length;i++) {
			
			if(numArr[i]%2==0) {
				count++;
			}
		}
		System.out.println(count);
	}
	
}
