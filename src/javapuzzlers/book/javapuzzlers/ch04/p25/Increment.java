package book.javapuzzlers.ch04.p25;

/**
 * 
 * for http://sites.google.com/site/iridiumsite/it/java/java-lang/book-java-
 * puzzlers/puzzle-25-inclement-increment
 */
public class Increment {

	public static void main(String[] args) {
		int j = 0;
		for (int i = 0; i < 100; i++) {
			j = j++;
		}
		System.out.println(j);
	}

}
