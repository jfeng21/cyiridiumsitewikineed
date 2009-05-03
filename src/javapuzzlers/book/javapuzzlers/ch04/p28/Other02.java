package book.javapuzzlers.ch04.p28;

public class Other02 {

	public static void main(String[] args) {
		double d = Double.POSITIVE_INFINITY;
		// double d = 1.0e40;
		while (d == d + 1) {
			System.out.println(d);
		}
	}
}
