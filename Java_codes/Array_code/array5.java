package Array;

public class array5 {

	public static void main(String[] args) {
		
		int arr[] = {12,34,33,11};
		int num = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]< num) {
				num = arr[i];
			}
		}
		System.out.println(num);
	}
}
