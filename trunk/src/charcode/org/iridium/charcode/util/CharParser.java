/**
 * 
 */
package org.iridium.charcode.util;

import java.io.UnsupportedEncodingException;

/**
 * @author caoyi
 * 
 */
public class CharParser {
	/**
	 * 
	 * @param str
	 *            待解码字串
	 * @param charSet
	 *            制定的编码方法, 目前在 UTF-8, UTF-16, BIG5, GB2312 下测试过, 但GB2312的编码和
	 *            Unicode 官站的编码不同, UTF-16 似乎有多余的内容, 待研究.
	 * @return 字串按照制定编码解码后的16进制输出
	 * @throws UnsupportedEncodingException
	 */
	public static String decode(String str, String charSet)
			throws UnsupportedEncodingException {
		StringBuffer sb = new StringBuffer();
		byte[] array = str.getBytes(charSet);
		for (byte c : array) {
			sb.append(Integer.toHexString(c & 0xFF));
		}
		return sb.toString();
	}
}
