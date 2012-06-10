package org.iridium.algorithm.basic;

public class Fibonacci {
	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		for (int i = 1; i < 10; i++) {
			System.out.println("f(" + i + ") = " + f.fibonnaci(i));
		}
	}

	public int fibonnaci(int i) {
		if (i < 0)
			return 0;
		if (i == 1 || i == 2)
			return 1;
		return fibonnaci(i - 1) + fibonnaci(i - 2);
	}
}
