package book.javapuzzlers.ch04.p26;

public class InTheLoop {

	public static final int END = Integer.MAX_VALUE;
	public static final int START = END - 2;

	public static void main(String[] args) {
		int count = 0;
		// The loop will not stop
		for (int i = START; i <= END; i++) {
			count++;
			System.out.println(count);
		}
	}
}
