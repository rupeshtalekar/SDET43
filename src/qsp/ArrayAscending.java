package qsp;

public class ArrayAscending {

	public static void main(String[] args) {
		int arr[]= {45,67,87,98,12,32,45,2,31,1,3,5,4};
		
		//printing unsorted array
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
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
		
		System.out.println();
		//printing sorted array
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		System.out.println("First min Element: "+arr[0]);
		System.out.println("First max Element: "+(arr[arr.length-1]));
		

	}

}
