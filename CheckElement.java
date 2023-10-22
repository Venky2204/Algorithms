package ArrayTasks;

import java.util.Scanner;

public class CheckElement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter Array Elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Array elements are :");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		int element = 66;
		ElementCheck eC = new ElementCheck();
		if (eC.checkElement(arr,element) > 0) {
			System.out.println("Element founded in the array at the position " + (eC.checkElement(arr,element) + 1));
		} else {
			System.out.println("Element not founded in the array at any position ");
		}

		scan.close();
	}

}
