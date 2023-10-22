package ArrayTasks;

public class ElementCheck {

	public int checkElement(int[] arr, int e) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == e) {
				return i;
			}
		}
		return -1;
	}

}
