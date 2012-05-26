package book.javapuzzlers.ch03.p21;

import java.io.File;

/**
 * 
 * for: https://sites.google.com/site/iridiumsite/it/java/java-lang/book-java-puzzlers/puzzle-21-whats-my-class-take-2
 *
 */
public class MeToo {

	public static void main(String[] args) {
//		01. will throw exception
//		System.out.println(MeToo.class.getName().replaceAll("\\.",
//				File.separator)
//				+ ".class");
		
//		02. ok
		System.out.println(MeToo.class.getName().replace(".", File.separator)
				+ ".class");
		
//		03. ok
		System.out.println(MeToo.class.getName().replace('.',
				File.separatorChar)
				+ ".class");
	}

}
