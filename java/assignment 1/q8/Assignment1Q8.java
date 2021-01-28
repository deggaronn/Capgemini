package q8;

public class Assignment1Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47 };
		
		BubbleSort sort = new BubbleSort();
		sort.bubbleSort(arr);
		for (int element: sort.bubbleSort(arr)) {
            System.out.println(element);
        }
	}

}
