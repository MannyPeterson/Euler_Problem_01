/*
 * Manny Peterson's Solution to Project Euler Problem #1
 * https://projecteuler.net/problem=1
 * 
 * Enjoy! :)
 * 
 */

public class Main {
	public static boolean isMultipleThreeOrFive(int n) {
		if (n < 3)
			return false;
		if (n % 3 == 0)
			return true;
		if (n % 5 == 0)
			return true;
		return false;
	}

	public static void main(String[] args) {
		int sum = 0, i = 0;
		for (i = 0; i < 1000; i++)
			if (Main.isMultipleThreeOrFive(i))
				sum += i;
		System.out.format("ANSWER = %d\n", sum);
	}
}
