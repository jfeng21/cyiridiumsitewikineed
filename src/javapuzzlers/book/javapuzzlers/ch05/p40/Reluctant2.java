package book.javapuzzlers.ch05.p40;

/*
 * Ref: http://www.iridiumcao.info/it/java/java-lang/book-java-puzzlers/puzzle-40-the-reluctant-constructor
 */
public class Reluctant2 {
	private Reluctant2 internalInstance = new Reluctant2();

	public Reluctant2() {
	}

	public static void main(String[] args) {
		Reluctant2 b = new Reluctant2();
	}
}