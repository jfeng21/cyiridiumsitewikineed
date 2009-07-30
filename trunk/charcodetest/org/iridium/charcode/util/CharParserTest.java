package org.iridium.charcode.util;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;

import org.junit.Before;
import org.junit.Test;

public class CharParserTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testDecode() throws UnsupportedEncodingException {
		//System.out.println(CharParser.decode("hello", "UTF-8"));
		assertEquals(CharParser.decode("好", "UTF-8").toUpperCase(), "E5A5BD");
//		assertEquals(CharParser.decode("好", "UTF-16").toUpperCase(), "597D");
		assertEquals(CharParser.decode("好", "BIG5").toUpperCase(), "A66E");
//		assertEquals(CharParser.decode("好", "GB2312").toUpperCase(), "2635");
		System.out.println(CharParser.decode("文", "GB2312").toUpperCase());
		System.out.println(CharParser.decode("文", "UTF-16").toUpperCase());
	}

}
