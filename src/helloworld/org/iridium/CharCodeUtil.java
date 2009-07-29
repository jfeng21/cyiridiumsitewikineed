package org.iridium;

import java.io.UnsupportedEncodingException;

/**
 * 
 * @author caoyi
 * 
 */
public class CharCodeUtil {
	public static String decode(String str, String charSet)
			throws UnsupportedEncodingException {
		byte[] array = str.getBytes(charSet);
		System.out.println(array.length);
		for (byte c : array) {
			System.out.println(Integer.toHexString(c));
		}
		return null;
	}
}
