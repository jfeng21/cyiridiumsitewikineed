package book.javapuzzlers.ch04.p26;

public class InTheLoop2 {

	public static final int END = Integer.MAX_VALUE;
	public static final int START = END - 2;

	public static void main(String[] args) {
		int count = 0;
		int i = START;
		do {
			count++;
			System.out.println(count);
		} while (i++ != Integer.MIN_VALUE);

	}
}
