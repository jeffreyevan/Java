/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package replace;

/**
 *
 * @author jeffrey evan
 */
public class Replace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int first = 10;
        int second = 20;
        int third;
        //print
        System.out.println("first = "+first+" second = " +second);
        third = second;
        second = first;
        first = third;
        System.out.println("Replace the value first and second");
        System.out.println("first = "+first+" second = " +second);
    }
    
}
