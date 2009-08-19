package book.javapuzzlers.ch03.p19;

/**
 * 
 * Ref: http://bit.ly/EGOhk
 * 
 */
public class Classifier {

	public static void main(String[] args) {
		System.out.println(classfiy('n') + classfiy('+') + classfiy('2'));
	}

	static String classfiy(char ch) {
		if ("0123456789".indexOf(ch) >= 0)
			return "NUMERAL ";

		if ("abcdefghijklmnopqrstuvwxyz".indexOf(ch) >= 0)
			return "LETTER ";

		// /*
		if ("+-*/".indexOf(ch) >= 0)
			return "OPERATOR";
		// */
		return "UNKNOWN ";
	}
}
