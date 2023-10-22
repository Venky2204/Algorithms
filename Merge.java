package ArrayTasks;

public class Merge {

	int[] mergeArrays(int[] arr, int[] brr) {
		int crr[] = new int[(arr.length + brr.length)];
		for (int i = 0; i < crr.length; i++) {
			if (i < arr.length) {
				crr[i] = arr[i];
			} else {
				crr[i] = brr[i - arr.length];
			}
		}
		return crr;
	}

}
