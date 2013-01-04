package book.javapuzzlers.ch05.p39;

public class HelloGoodbye {
	public static void main(String[] args) {
		try {
			System.out.println("Hello world");
			System.exit(0);
		} finally {
			System.out.println("Goodbye world");
		}
	}
}
