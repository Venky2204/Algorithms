package ArrayTasks;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of array");
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter Array Elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter element to be found");
		int element = scan.nextInt();
		Search s = new Search();
		
		
		if (s.binarySearch(arr, element) > 0 ) {
			System.out.println("Element is found in the array at position " + s.binarySearch(arr, element));
		} else {
			
			System.out.println("Element is not found in the array at any position");
			
		}
		scan.close();

	}

	
}
