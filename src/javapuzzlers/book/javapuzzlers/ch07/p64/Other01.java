package book.javapuzzlers.ch07.p64;

public class Other01 {

	public static void main(String[] args) {
		System.out.println(Math.abs(Integer.MIN_VALUE) == Integer.MIN_VALUE);
		for (int i = 0; i > -4; i--) {
			System.out.println(i + " % 3 = " + (i % 3));
		}
	}
}
