/**
 * this code is copied and edited from Java Puzzlers
 */
package book.javapuzzlers.ch03.p18;

import java.io.UnsupportedEncodingException;

public class StringCheese02 {

	public static void main(String[] args) {
		byte[] bytes = new byte[256];
		for (int i = 0; i < 256; i++) {
			bytes[i] = (byte) i;
//			System.out.println(bytes[i]);
		}
		
//		String str = new String(bytes);
		System.out.println(java.nio.charset.Charset.defaultCharset().displayName());
		String str = null;
		try {
//			str = new String(bytes, "ISO-8859-1");
                        str = new String(bytes, "ISO-8859-2"); //get a wrong result
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(str.length());
		for (int i = 0, n = str.length(); i < n; i++)
			System.out.println((int) str.charAt(i) + " ");
	}
}