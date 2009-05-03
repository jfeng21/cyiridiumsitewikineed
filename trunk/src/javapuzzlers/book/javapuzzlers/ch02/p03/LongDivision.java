package book.javapuzzlers.ch02.p03;

public class LongDivision {

	public static void main(String[] args) {
		final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000L;
		final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000L;
		System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);

	}

}
