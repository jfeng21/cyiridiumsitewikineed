package book.javapuzzlers.ch05.p37;

import java.io.IOException;

public class Arcane1 {

	public static void main(String[] args) {
		/*
		 * 这里会出现编译错误，因为 try 块中的语句不可能触发 IOException 
		 */
		try {
			System.out.println("Hello world");
			} catch(IOException e) {
			System.out.println("I've never seen println fail!");
		}
	}
}
