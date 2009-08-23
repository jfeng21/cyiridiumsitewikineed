package book.javapuzzlers.ch03.p20;

import java.util.regex.Pattern;

public class Me {

	public static void main(String[] args) {
		String path = Me.class.getName().replaceAll(".", "/");
		System.out.println(path + ".class");

		path = Me.class.getName().replace(".", "/");
		System.out.println(path + ".class");

		path = Me.class.getName().replace(Pattern.quote("."), "/");
		System.out.println(path + ".class");

		path = Me.class.getName().replaceAll(Pattern.quote("."), "/");
		System.out.println(path + ".class");
	}

}
