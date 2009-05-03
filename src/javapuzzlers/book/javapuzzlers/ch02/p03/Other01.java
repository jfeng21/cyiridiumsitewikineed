package book.javapuzzlers.ch02.p03;

public class Other01 {

	public static void main(String[] args) {
		int big = 1234567890;
		float approx = big;
		System.out.println(big - (int) approx);
		System.out.println(Integer.MIN_VALUE % 3);
	}
}
