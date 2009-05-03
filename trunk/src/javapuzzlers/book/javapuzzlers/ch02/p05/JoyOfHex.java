package book.javapuzzlers.ch02.p05;

public class JoyOfHex {

	public static void main(String[] args) {
		System.out.println(Long.toHexString(0x100000000L + 0xcafebabe));
		System.out.println(Long.toHexString(0x100000000L + 0xcafebabeL));
		System.out.println(0xf + 010);
		System.out.println("0xcafebabe = " + Integer.toBinaryString(0xcafebabe)
				+ " =  " + 0xcafebabe);
		System.out.println("0xcafebabeL = " + Long.toBinaryString(0xcafebabeL)
				+ " = " + 0xcafebabeL);
		System.out.println("0xcafebabeL = "
				+ Long.toBinaryString((long) 0xcafebabe) + " = "
				+ (long) 0xcafebabe);
		System.out.println(0xF2345678);
		System.out.println(Integer.toOctalString(0xF2345678));
		System.out.println(Integer.toBinaryString(0xF2345678));
	}
}
