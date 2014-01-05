package book.javapuzzlers.ch05.p40;

/*
 * Ref: http://www.iridiumcao.info/it/java/java-lang/book-java-puzzlers/puzzle-40-the-reluctant-constructor
 */
public class Reluctant1 {
//	private Reluctant1 internalInstance = new Reluctant1();

	public Reluctant1() throws Exception {
		throw new Exception("I'm not coming out");
	}

	public static void main(String[] args) {
		try {
			Reluctant1 b = new Reluctant1();
			System.out.println("Surprise!");
		} catch (Exception ex) {
			System.out.println("I told you so");
		}
	}
}