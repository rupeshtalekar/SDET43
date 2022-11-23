package qsp;

public class ArraySumOfFirstThreeMaxNum {

	public static void main(String[] args) {
		int arr[] = { 56, 32, 108, 7, 12 };

		// printing unsorted array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		//sorting array
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		//printing sorted array
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		//to find sum of first three max numbers
		int sum=0;
		for(int i=0;i<3;i++) {
			sum=sum+arr[i];
		}
		System.out.println("Sum of first three max numbers: "+sum);

		int mul=1;
		for(int i=0;i<3;i++) {
			mul=mul*arr[i];
		}
		System.out.println("Sum of first three max numbers: "+mul);

	}

}
