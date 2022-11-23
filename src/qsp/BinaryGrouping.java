package qsp;

public class BinaryGrouping {

	public static void main(String[] args) {
		int arr[] = { 0, 1, 0, 0, 1, 1, 0 };

		// printing unsorted array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		int m = arr.length - 1;
		int temp[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				temp[m] = arr[i];
				m--;
			}
		
		}

		System.out.println();
		// printing unsorted array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(temp[i] + " ");
		}

	}

}
