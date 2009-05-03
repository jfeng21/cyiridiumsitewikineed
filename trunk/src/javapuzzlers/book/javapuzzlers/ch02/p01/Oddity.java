package book.javapuzzlers.ch02.p01;

public class Oddity {

    public static void main(String[] args) {
//        for (int i = -5; i <= 5; i++) {
//            System.out.println(i + " / 3 = " + (i / 3) + ", " + i + " % 3 = " + (i % 3));
//        }

        System.out.println(isOdd3(-5));
    }

    //负数会出错
    public static boolean isOdd(int i) {
        return i % 2 == 1;
    }

    //对负数有效，但效率不高
    public static boolean isOdd2(int i) {
        return i % 2 != 0;
    }

    //正确，且高效率
    public static boolean isOdd3(int i) {
        return (i & 1) != 0;
    }
}
