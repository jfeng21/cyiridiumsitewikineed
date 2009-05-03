package book.javapuzzlers.ch03.p16;

public class LinePrinter {

    public static void main(String[] args) {
// Note: \u000A //is Unicode representation of linefeed(LF)
        char c = 0x000A;
        System.out.println("Start");
        System.out.println(c);
        System.out.println("End");
    }
}
