package qsp;

import java.util.Arrays;

class AddTwoArrays {

	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3 };
		int[] b = new int[] { 3, 2 };
		int max = a.length;
		if (b.length > a.length) {
			max = b.length;
		}
		int[] c = new int[max];
		for (int i = 0; i < max; i++) {
			if (a.length > i) {
				c[i] = c[i] + a[i];
			}
			if (b.length > i) {
				c[i] = c[i] + b[i];
			}

			System.out.print(c[i] + " ");
		}

	}
}
