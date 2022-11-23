package qsp;

public class ArraySecondMaxWithoutSorting {

	public static void main(String[] args) {
		int arr[] = { 108,56, 32, 108, 7, 12, 108 };

		// printing unsorted array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		// to find second max
		int fmax = arr[0];
		int sMax = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > fmax) {
				fmax = arr[i];
			}
			if ((arr[i] != fmax) && (arr[i] > sMax)) {
				sMax = arr[i];
			}
		}

		System.out.println();
		System.out.println("First Max: " + fmax);
//		int sMax = arr[0];
		for (int i = 0; i < arr.length; i++) {
//			if(arr[i]==fmax) {
//				continue;
//			}
//			if(arr[i]>sMax) {
//				sMax=arr[i];
//			}
//			if ((arr[i] != fmax) && (arr[i] > sMax)) {
//				sMax = arr[i];
//			}
		}
		System.out.println("Second Max: " + sMax);

	}

}
