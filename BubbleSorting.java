package ArrayTasks;

import java.util.Scanner;

public class BubbleSorting {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array Length");
		int arr[] = new int[scan.nextInt()];
		
		System.out.println("Enter array Elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Array elements before sorting :");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		Bubble b= new Bubble();
		int sorttedArr[] = b.bubbleSorting(arr);
		System.out.println("Array elements After sorting :");
		for (int i : sorttedArr) {
			System.out.print(i+" ");
		}
		scan.close();
	}

}
