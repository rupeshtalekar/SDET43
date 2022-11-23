package qsp;

public class ThirdMinimumInAnArray {

	public static void main(String[] args) {
		int arr[] = { 34, 12, 65, 78, 98, 90, 125, 33, 65 };

		// printing array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

		// sorting array
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		// printing array
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		//to fetch the third minimum
		System.out.println();
		System.out.println("Third minimum element: "+arr[2]);

	}

}
