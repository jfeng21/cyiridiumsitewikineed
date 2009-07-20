package org.iridium;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CharsetRecorgnizer {

	public String getCharset(File file) {
		StringBuffer sb = new StringBuffer();
		try {
			BufferedInputStream bis = new BufferedInputStream(
					new FileInputStream(file));
			for (int i = 0; i < 3; i++)
				sb.append(bis.read());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
}