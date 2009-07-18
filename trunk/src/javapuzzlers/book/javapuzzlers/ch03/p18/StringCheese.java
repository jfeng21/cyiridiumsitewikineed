/**
 * this code is copied from Java Puzzlers
 * 
 * 这段代码，在不同设置的环境下，执行结果是不同的。
 * 
 * 参考：http://bit.ly/tGesn
 */
package book.javapuzzlers.ch03.p18;

public class StringCheese {

	public static void main(String[] args) {
		byte[] bytes = new byte[256];
		for (int i = 0; i < 256; i++)
			bytes[i] = (byte) i;
		String str = new String(bytes);
		for (int i = 0, n = str.length(); i < n; i++)
			System.out.println((int) str.charAt(i) + " ");
	}
}