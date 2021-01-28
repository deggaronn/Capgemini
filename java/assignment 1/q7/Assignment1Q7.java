package q7;

public class Assignment1Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47 };
		int valueToCheck = 19;

		SearchArray search = new SearchArray();
		search.searchArray(arr, valueToCheck);
		System.out.println(search.searchArray(arr, valueToCheck));
	}

}
