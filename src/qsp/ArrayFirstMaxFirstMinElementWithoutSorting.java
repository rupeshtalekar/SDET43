package qsp;

public class ArrayFirstMaxFirstMinElementWithoutSorting {

	public static void main(String[] args) {
		int arr[] = { 56, 32, 108, 7, 12 };

		// printing unsorted array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		// to find first max element
		int firstMax = arr[0];
		for (int j = 1; j < arr.length; j++) {
			if (arr[j] > firstMax) {
				firstMax = arr[j];
			}
		}
		System.out.println();
		System.out.println("First Maximum Element: " + firstMax);

		// to find first min element
		int firstMin = arr[0];
		for (int j = 1; j < arr.length; j++) {
			if (arr[j] < firstMin) {
				firstMin = arr[j];
			}
		}
		System.out.println();
		System.out.println("First Minimum Element: " + firstMin);

	}

}
