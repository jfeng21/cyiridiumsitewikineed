package book.javapuzzlers.ch05.p37;

interface Type1 {
	void f() throws CloneNotSupportedException;
}

interface Type2 {
	void f() throws InterruptedException;
}

interface Type3 extends Type1, Type2 {
}

public class Arcane3 implements Type3 {
	/*
	 * 这个方法的异常来自 Type1 和 Type2 两个接口，
	 * 抛出的异常类型取 CloneNotSupportedException 和 InterruptedException 
	 * 的交集，此交集为空，所以这里没有异常抛出。
	 */
	public void f() {
		System.out.println("Hello world");
	}

	public static void main(String[] args) {
		Type3 t3 = new Arcane3();
		t3.f();
	}
}