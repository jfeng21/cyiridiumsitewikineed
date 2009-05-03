package book.javapuzzlers.ch04.p33;

public class Puzzle33 {

	void hello(int i) {
		// while (i != 0 && i == -i) {
		//
		// }
		if (i != 0 && i == -i) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Puzzle33 p33 = new Puzzle33();
		p33.hello(Integer.MIN_VALUE);
		System.out.println(Integer.MIN_VALUE == -Integer.MIN_VALUE);
		System.out.println(-Integer.MIN_VALUE);

		System.out.println(~3);
		System.out.println(-5 >> 3);
		System.out.println(-0);

		System.out.println(Long.MIN_VALUE == -Long.MIN_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println(-Short.MIN_VALUE);

		System.out.println(Integer.MIN_VALUE == Integer.MAX_VALUE + 1);
	}
}
