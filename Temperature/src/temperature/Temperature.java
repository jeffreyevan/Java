/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperature;

import java.util.Scanner;

/**
 *
 * @author jeffrey evan
 */
public class Temperature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        System.out.println("Celcius to Fahrenheit 1");
        System.out.println("Fahrenheit to Celcius 2");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a == 1){
            double celcius = sc.nextDouble();
            double fahrenheit = 9.0 / 5.0 * celcius + 32.0;
            System.out.println("Fahrenheit = "+fahrenheit);
        } else if (a == 2){
            double fahrenheit = sc.nextDouble();
            double celcius = 5.0 / 9.0 * fahrenheit - (32.0 * (5.0 / 9.0));
            System.out.println("celcius = "+celcius);
        } else{
            System.out.println("Error");
        }
    }
}
