package book.javapuzzlers.ch04.p29;

public class Reflexive {
	public static void main(String[] args) {
		System.out.println(Double.NaN == Double.NaN);
		System.out.println(Float.NaN == Float.NaN);

		long l = 4294967297L;
		float lf = l;
		double ld = l;
		System.out.println(lf);
		System.out.println(ld);
	}
}
