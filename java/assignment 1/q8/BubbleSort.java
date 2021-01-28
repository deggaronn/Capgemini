package q8;

public class BubbleSort {
	public int[] bubbleSort(int arr[]) {
		int arrSize = arr.length;
		int i = 0;
		int j = 1;
		for (int p = 0; p < arrSize; p++) {
			while (j < arrSize) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					i++;
					j++;
				}
				i++;
				j++;

			}
			i=0;
			j=1;
		}
		return arr;

	}
}
