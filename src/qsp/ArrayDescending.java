package qsp;

public class ArrayDescending {

	public static void main(String[] args) {
		int arr[] = { 56, 32, 8, 7, 12 };
		System.out.println(arr.length);
		// printing unsorted array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		// loop to sort array
		for (int i = arr.length-1; i >= 0; i--) {
			for (int j = i; j>=0; j--) {
				if (arr[i] > arr[j]) {
					
					arr[i]=arr[i]+arr[j];
					arr[j]=arr[i]-arr[j];
					arr[i]=arr[i]-arr[j];
				}
			}
		}
		System.out.println();
		// printing sorted array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
