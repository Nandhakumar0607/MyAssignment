package myassignmeent.day1;

public class Fibonacci {

	public static void main(String[] args) {

		int n = 13, firstNum = 0, secNum = 1, sum;


		System.out.println("Fibonacci Series for " + n + " terms:");
		System.out.print(firstNum + "\n");
		for (int i = 1; i <= n; i++) {
			sum = firstNum + secNum;
			firstNum = secNum;
			secNum = sum;

			System.out.println(sum);

		}
	}

}
