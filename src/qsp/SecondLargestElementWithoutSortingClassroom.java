package qsp;

public class SecondLargestElementWithoutSortingClassroom {

	public static void main(String[] args) {
		int arr[] = { 55, 11, 22, 55, 33, 44, 55, 22, 55 };

		// printing unsorted array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		int fmax = arr[0];
		int smax = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= fmax) {
				if (arr[i] != fmax) {
					smax = fmax;
				}
				fmax = arr[i];
			} else if (fmax == smax || arr[i] > smax) {
				smax = arr[i];
			}
		}
		System.out.println();
		System.out.println(smax);
	}

}
