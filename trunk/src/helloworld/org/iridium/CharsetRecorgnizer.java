package org.iridium;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class CharsetRecorgnizer {

	public String getCharset(File file) {
		StringBuffer sb = new StringBuffer();
		try {
			BufferedInputStream bis = new BufferedInputStream(
					new FileInputStream(file));
			for (int i = 0; i < 2; i++)
				sb.append(bis.read());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

	public String getCharset2(File file) throws IOException {
		FileInputStream in = new FileInputStream(file);
		// 指定读取文件时以UTF-8的格式读取
		BufferedReader br = new BufferedReader(new InputStreamReader(in,
				"UTF-8"));

		String line = br.readLine();
//		while (line != null) {
//			System.out.println(line);
//			line = br.readLine();
//		}
		return line;
	}
}