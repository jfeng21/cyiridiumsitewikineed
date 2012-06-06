package org.iridium;

import java.util.Calendar;

/*
 * 得到未来15分钟后的时间
 */
public class HelloWorld001 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MINUTE, 15);
		System.out.println(cal.getTime());
	}

}
