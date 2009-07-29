package org.iridium;

/**
 * "好"字的编码可以在
 * http://bit.ly/xLVAv
 * 查到.
 * 
 * 为何会出现多余的内容?
 * http://bit.ly/kOmu9
 * 
 */
import java.io.UnsupportedEncodingException;

public class Hello001 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		Hello001.decode("好", "UTF-8");
		Hello001.decode("好", "UTF-16");
		Hello001.decode("好", "BIG5");
		Hello001.decode("好", "GB2312");
	}

	public static void decode(String str, String charSet)
			throws UnsupportedEncodingException {
		byte[] array = str.getBytes(charSet);
		System.out.println("CharSet: " + charSet);
		System.out.println("length: " + array.length);
		System.out.println("values: ");
		for (byte c : array) {
			System.out.println(Integer.toHexString(c & 0xFF) );
		}
	}

}
