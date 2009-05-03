package book.javapuzzlers.ch04.p31;

public class Other001 {

	public static void main(String[] args) {
		int i = 3;
		while (i != 0) {
			System.out.println("i >>>= " + i + ": "
					+ Integer.toBinaryString((i >>>= 1)));
		}
	}
}
