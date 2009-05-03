package book.javapuzzlers.ch04.p27;

public class Shify {

	public static void main(String[] args) {
		int i = 0;
		while (-1 << i != 0) {
			System.out.println(Integer.toBinaryString(-1 >>> i));
			i++;
		}
		System.out.println(i);
	}
}
