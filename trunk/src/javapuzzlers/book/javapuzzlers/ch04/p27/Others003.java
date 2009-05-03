package book.javapuzzlers.ch04.p27;

public class Others003 {

	public static void main(String[] args) {
		System.out.println(-5 >>> 2);
		System.out.println(Integer.valueOf("00111111111111111111111111111110",
				2));
		for (int i = -60; i < 60; i++) {
			if ((-1 << i) != (-1 << (i % 32))) {
				System.out.println("@@");
			}
		}
	}
}
