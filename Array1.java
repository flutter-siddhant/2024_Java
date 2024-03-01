package Array;

public class Array1 {
	public static void main(String args []) {
		
		int numbers [] = {98, 99, 93};
		
		System.out.println("Total number of the subjects" + numbers.length);
		
		for(int i=0;i<numbers.length;i++) {
			
			numbers[i] = numbers[i] + 1;
			System.out.println(numbers[i]);
		}
		
		for(int i=0;i<numbers.length;i++) {
			if(i==0 || i==1) {
				System.out.print(numbers[i]+ ",");
			}else
				System.out.print(numbers[i]);
		}
		
	}
	
}
