package q7;

public class SearchArray {
	public boolean searchArray(int[] arr, int toCheckValue) {
		for (int i = 0; i < arr.length; i++) {
			if (toCheckValue == arr[i]) {
				return true;
			}
		}
		return false;

	}

}
