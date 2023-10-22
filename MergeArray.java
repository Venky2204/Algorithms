package ArrayTasks;

import java.util.Scanner;

public class MergeArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter 1st Array size");
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter Array elements for 1st Array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}

		System.out.println("Enter 2nd Array size");
		int brr[] = new int[scan.nextInt()];
		System.out.println("Enter Array elements for 2nd Array");
		for (int i = 0; i < brr.length; i++) {
			brr[i] = scan.nextInt();
		}

		Merge m = new Merge();
		int crr[] = m.mergeArrays(arr, brr);
		System.out.println("First Array Elements :");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Second Array Elements :");
		for (int i : brr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Merged Array Elements :");
		for (int i : crr) {
			System.out.print(i + " ");
		}
		scan.close();
	}

}
