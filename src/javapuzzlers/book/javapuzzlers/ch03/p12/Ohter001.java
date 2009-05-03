/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package book.javapuzzlers.ch03.p12;

/**
 *
 * @author caoyi
 */
public class Ohter001 {

    public static void main(String[] args) {
        System.out.println(new int[]{1, 3, 2});
//        System.out.println(null);
        System.out.println((new int[3][4][5][6][7][8][9]).getClass().getName());
        System.out.println(new int[4].getClass().getName());

        Object numbers = new char[] {'1', '2', '3'};
        System.out.println(numbers);
    }
}
