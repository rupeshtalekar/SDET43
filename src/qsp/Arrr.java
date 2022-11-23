package qsp;

public class Arrr {

	public static void main(String[] args) {
		int a[] = {1};
		int b[]= {5,6};
		
		for (int i = 0; i < a.length; i++) {
			if(i<b.length) {
				a[i]=a[i]+b[i];
				System.out.println(a[i]);
			}
			else {
				a[i]=a[i]+0;
				System.out.println(a[i]);
			}
			
		}
	}

}
