package qsp;

public class AppendZeroesAtFirst {

	public static void main(String[] args) {
		int arr[] = { 2, 0, 1, 3, 0, 0 };

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		int temp[] = new int[arr.length];

		System.out.println();
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}

		int m=temp.length-1;
		for (int i = temp.length-1; i >= 0; i--) {
			if(arr[i]!=0) {
				temp[m]=arr[i];
				m--;
			}
		}
		
		System.out.println();
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]+" ");
		}

	}

}
