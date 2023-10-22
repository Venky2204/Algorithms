package ArrayTasks;

public class Search {
	 int binarySearch(int[] arr, int element) {
		int low = 0;
		int high = arr.length - 1;
		int mid;
		int position = -1;
		while (low <= high) {
			mid = (low + high) / 2;
			if (element == arr[mid]) {
				position = mid + 1;
				return position;
			} else if (element < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return position;
	}

}
