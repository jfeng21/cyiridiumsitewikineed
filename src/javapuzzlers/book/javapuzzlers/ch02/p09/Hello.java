package book.javapuzzlers.ch02.p09;

public class Hello {

    public static void main(String[] args) {
        short x = 0;
        int i = 123456;
//        x += i;
        x = (short) (x + i);
//        x = x + i;
        System.out.println(x);
    }
}
