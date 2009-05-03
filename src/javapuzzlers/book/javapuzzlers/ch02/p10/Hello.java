package book.javapuzzlers.ch02.p10;

public class Hello {

    public static void main(String[] args) {
//        Object a = "hello, ";
//        Object b = "world!";
        String a = "hello, ";
        Object b = "world!";
        int c = 999;
        a += b;
        a += c;
        System.out.println(a);
    }
}
