package ArrayTasks;

public class Insertion {

	static void insertionSorting(int[] arr) {//23,13,,4,34,43
		
		for (int i = 1; i < arr.length; i++) {
			int item = arr[i];
			int j = i - 1;
			while (arr[j] > item && j >= 0) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = item;
		}
	}

}
