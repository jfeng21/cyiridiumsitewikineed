package book.javapuzzlers.ch04.p24;

public class Others {

	public static void main(String[] args) {
		byte b = (byte) 0x90;

		System.out.println(Integer.toBinaryString((int) b));
		System.out.println(Integer.toBinaryString(0x90));
		System.out.println(Integer.toBinaryString(Byte.MIN_VALUE));
		System.out.println(0x90);
		System.out.println(Byte.MAX_VALUE);

		System.out.println(3 == 3 == false);
	}
}
