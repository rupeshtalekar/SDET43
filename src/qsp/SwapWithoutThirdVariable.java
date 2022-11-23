package qsp;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {
		int var1 = 25;
		int var2 = 60;

		var1 = var1 + var2;
		var2 = var1 - var2;
		var1 = var1 - var2;
		System.out.println(var1);
		System.out.println(var2);
	}

}
