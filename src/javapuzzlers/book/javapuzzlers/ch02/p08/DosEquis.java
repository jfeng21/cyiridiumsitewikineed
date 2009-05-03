package book.javapuzzlers.ch02.p08;

public class DosEquis {

    public static void main(String[] args) {
        char x = 'X';
        final int i = 0;
        System.out.print(true ? x : 0);
        System.out.print(false ? i : x);
    }
}
