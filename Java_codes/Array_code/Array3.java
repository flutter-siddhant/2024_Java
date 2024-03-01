package Array;
import java.util.Scanner;
public class Array3 {

	public static void main(String[] args) {
		int marks[] = new int [5];
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		for(int i=0;i<marks.length;i++) {
			
			System.out.println("Enter the marks");
			marks[i] = sc.nextInt();
		}
		for(int i=0;i<marks.length;i++) {
			
			System.out.print(marks[i]);
		}
		System.out.println();
		for(int i=0;i<marks.length;i++) {
			
			sum = sum + marks[i];
		}
		System.out.print("Sum of the marks is: " + sum);
		
	}

}
