package org.iridium;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

public class CharCodeUtilTest {

	@Test
	public void testDecode() throws UnsupportedEncodingException {
		CharCodeUtil.decode("บร", "UTF-16");
	}

}
