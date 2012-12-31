package book.javapuzzlers.ch05.p36;

public class Indecisive {
	public static void main(String[] args) {
		System.out.println(decision());
	}

	static boolean decision() {
		try {
			return true;
		} finally {
			return false;
		}
	}
}