package qsp;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no");
		int n = sc.nextInt();
		String s[] = { "hi", "hello", "bye" };
		if (n % 5 == 0 && n % 3 == 0) {
			System.out.println(s[0] + s[1]);
		} else if (n % 3 == 0) {
			System.out.println(s[1]);
		} else if (n % 5 == 0) {
			System.out.println(s[0]);
		} else {
			System.out.println(s[2]);
		}

	}

}
