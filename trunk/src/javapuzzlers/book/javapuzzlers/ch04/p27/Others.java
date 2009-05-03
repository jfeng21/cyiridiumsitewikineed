package book.javapuzzlers.ch04.p27;

public class Others {

	public static void main(String[] args) {
		for (int i = 0; i < 33; i++) {
			System.out.println("-1 >> " + i + ": "
					+ Integer.toBinaryString(-1 >> i));
		}

		System.out.println();
		for (int i = 0; i < 33; i++) {
			System.out.println("-1 >>> " + i + ": "
					+ Integer.toBinaryString(-1 >>> i));
		}

		System.out.println();
		for (int i = 0; i < 33; i++) {
			System.out.println("-1 << " + i + ": "
					+ Integer.toBinaryString(-1 << i));
		}
	}
}
