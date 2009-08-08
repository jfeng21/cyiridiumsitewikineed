package org.iridium;

import java.io.File;

import org.junit.Before;
import org.junit.Test;

public class CharsetRecorgnizerTest {
	private CharsetRecorgnizer cr;

	@Before
	public void setUp() throws Exception {
		cr = new CharsetRecorgnizer();
	}

	@Test
	public void testGetCharset() {
		System.out.println(cr.getCharset(new File(
				"C:/temp/charsets/a0001.txt")));
		System.out.println(cr.getCharset(new File(
				"C:/temp/charsets/ansi/HelloWorld.java")));
		System.out.println(cr.getCharset(new File(
				"C:/temp/charsets/ansi/HelloWorld.class")));
		System.out.println(cr.getCharset(new File(
				"C:/temp/charsets/utf-8/HelloWorld.java")));
		System.out.println(cr.getCharset(new File(
				"C:/temp/charsets/utf-8/HelloWorld.class")));
	}

}
