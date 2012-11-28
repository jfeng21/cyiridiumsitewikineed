package book.javapuzzlers.ch05.p37;

public class Arcane2 {
	public static void main(String[] args) {
		/*
		 * 这里不会报错，和 Arcane1 的说法矛盾了。
		 */
		try {
			// If you have nothing nice to say, say nothing
		} catch (Exception e) {
			System.out.println("This can't happen");
		}
	}
}