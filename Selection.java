package ArrayTasks;

public class Selection {

	 int[] selectionSorting(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {    // 4,2,3,5,1
			int min = arr[i];
			int index = i ;;
			for (int j = i; j < arr.length; j++) {
				if (min > arr[j]) {
					min = arr[j];
					index = j;
				}
			}
				arr[index] = arr[i];
				arr[i] = min;
		}
		return arr;
	}
}
